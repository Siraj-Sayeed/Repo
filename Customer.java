
public class Customer {
	
	private String customerName;
	private int age;
	
	public Customer(String cn, int a) {
		
		customerName = cn;
		age = a;
		
	}
	
	public Customer(Customer other) {
		
		customerName = other.customerName;
		age = other.age;
		
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public int getCustomerAge() {
		return age;
	}
	
	public String toString() {
		return customerName + " " + age;
	}

}
