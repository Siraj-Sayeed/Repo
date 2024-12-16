import java.util.ArrayList;
import java.math.*;

public class Order implements OrderInterface, Comparable {
	
	private int orderNum;
	private int totalItems;
	private int orderTime;
	private Day orderDay;
	private Customer customer;
	private ArrayList<Beverage> listOfBev;
	
	public Order(int ot, Day od, Customer c) {
		
		orderNum = random();
		totalItems = 0;
		orderTime = ot;
		orderDay = od;
		customer = c;
		listOfBev = new ArrayList<Beverage>();
		
		
	}

	public int random() {
		
		return (int)(Math.random()*90000+10000);
		
	}
	
	public boolean isWeekend() {
		
		if(orderDay == Day.SATURDAY || orderDay == Day.SUNDAY)
			return true;
		
		return false;
	}

	public Beverage getBeverage(int itemNo) {
		
		if(!listOfBev.isEmpty() || itemNo < listOfBev.size()-1) {
			return listOfBev.get(itemNo);
		}
	
		return null;
	}


	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		listOfBev.add(new Coffee(bevName, size, extraShot, extraSyrup));
		listOfBev.get(listOfBev.size()-1).setBevType(Type.COFFEE);
		totalItems++;
	}


	public void addNewBeverage(String bevName, Size size) {
		
	
		
		listOfBev.add(new Alcohol(bevName, size, isWeekend()));
		listOfBev.get(listOfBev.size()-1).setBevType(Type.ALCOHOL);
		totalItems++;
	}


	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		listOfBev.add(new Smoothie(bevName, size, numOfFruits, addProtein));
		listOfBev.get(listOfBev.size()-1).setBevType(Type.SMOOTHIE);
		totalItems++;
	}

	public double calcOrderTotal() {
		
		double toRet = 0;
		
		for(int i = 0; i < listOfBev.size(); i++) {
			toRet += listOfBev.get(i).calcPrice();
			
		}
		
		return toRet;
	}


	public int findNumOfBeveType(Type type) {
		
		int count = 0;
		
		for(int i = 0; i < listOfBev.size(); i++) {
			
			if(listOfBev.get(i).getType().equals(type))
				count++;
			
		}
	
		return count;
	}


	
	public int compareTo(Object o) {
		
		if(this.orderNum > ((Order)(o)).orderNum)
			return 1;
		
		else if(this.orderNum < ((Order)(o)).orderNum)
			return -1;
		
		return 0;
	}
	
	public Customer getCustomer() {
		return new Customer(customer);
	}
	
	public int getOrderNumber() {
		return orderNum;
	}
	
	public int getTotalItems() {
		return totalItems;
	}
	
	
	public static void main(String[] args) {
		
		Coffee cf = new Coffee("regular Coffee", Size.SMALL, false, false);
		Alcohol al = new Alcohol("Mohito", Size.SMALL, false);
		Smoothie sm1 = new Smoothie("Detox", Size.MEDIUM, 1, false);
		Smoothie sm2 = new Smoothie("Detox", Size.LARGE, 1, false);
		
		Order orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		
		orderOne.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		orderOne.addNewBeverage("Mohito", Size.SMALL);
		orderOne.addNewBeverage("Detox", Size.MEDIUM, 1, false);
		
		System.out.println(orderOne.getBeverage(0).calcPrice());
		System.out.println(orderOne.getBeverage(1).calcPrice());
		System.out.println(orderOne.getBeverage(2).calcPrice());
		
		System.out.println(orderOne.calcOrderTotal());
		
	}

}
