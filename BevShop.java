import java.util.ArrayList;

public class BevShop implements BevShopInterface {
	
	private int numOfDrink;
	private ArrayList<Order> orders;
	
	public BevShop() {
		
		numOfDrink = 0;
		orders =  new ArrayList<Order>();
		
	}

	
	public boolean isValidTime(int time) {
		
		return time >= 8 && time <= 23;
	}

	
	public int getMaxNumOfFruits() {
		
		return BevShopInterface.MAX_FRUIT;
	}


	public int getMinAgeForAlcohol() {
		
		return BevShopInterface.MIN_AGE_FOR_ALCOHOL;
	}


	public boolean isMaxFruit(int numOfFruits) {
		
		return BevShopInterface.MAX_FRUIT == numOfFruits;
	}

	public int getMaxOrderForAlcohol() {
		
		return BevShopInterface.MAX_ORDER_FOR_ALCOHOL;
	}

	public boolean isEligibleForMore() {

		return orders.get(orders.size()-1).findNumOfBeveType(Type.ALCOHOL) < getMaxOrderForAlcohol();
	}


	public int getNumOfAlcoholDrink() {

		return orders.get(orders.size()-1).findNumOfBeveType(Type.ALCOHOL);
	}


	public boolean isValidAge(int age) {

		return age >= getMinAgeForAlcohol();
	}

	
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		
		if(isValidTime(time)) {
			orders.add(new Order(time, day, new Customer(customerName, customerAge)));
		}
		
	}

	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		
		orders.get(orders.size()-1).addNewBeverage(bevName, size, extraShot, extraSyrup);
	
	}

	public void processAlcoholOrder(String bevName, Size size) {
		
		orders.get(orders.size()-1).addNewBeverage(bevName, size);
		numOfDrink++;
		
		
	}

	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
	
		orders.get(orders.size()-1).addNewBeverage(bevName, size, numOfFruits, addProtein);
		
	}

	
	public int findOrder(int orderNo) {
		
		for(int i = 0; i < orders.size(); i++) {
			
			if(orders.get(i).getOrderNumber() == orderNo)
				return i;
			
		}
		
		return -1;
		
	}


	public double totalOrderPrice(int orderNo) {
		
		return orders.get(findOrder(orderNo)).calcOrderTotal();
	}

	
	public double totalMonthlySale() {
		
		double toRet = 0;
		
		for(int i = 0; i < orders.size(); i++) {
			toRet += orders.get(i).calcOrderTotal();
		}
		
		return toRet;
	}

	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}

	public Order getCurrentOrder() {
		
		return orders.get(orders.size()-1);
	}

	public Order getOrderAtIndex(int index) {
		
		return orders.get(index);
	}

	
	public void sortOrders() {
		
	     for (int i = 0; i < orders.size(); i++) {
	            // find position of smallest num between (i + 1)th element and last element
	            int pos = i;
	            for (int j = i; j < orders.size(); j++) {
	                if (orders.get(j).compareTo(orders.get(pos)) < 0)
	                    pos = j;
	            }
	            // Swap min (smallest num) to current position on array
	            Order min = orders.get(pos);
	            orders.set(pos, orders.get(i));
	            orders.set(i, min);
		
	     }
	     
	}
	
	public int getNumOfDrink() {
		return numOfDrink;
	}

}
