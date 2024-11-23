
public class CheckingAccount extends BankAccount {
	
	private static final double fee = 0.15;
	
	CheckingAccount(String name, double amount) {
		
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
		
	}
	
	public boolean withdraw(double amount) {
		
		boolean completed = true;
		amount += fee;

		if (amount <= super.getBalance())
			super.setBalance(super.getBalance() - amount);
		
		else
			completed = false;
		
		return completed;
		
	}
	
	

}
