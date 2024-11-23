
public class SavingsAccount extends BankAccount {
	
	private final double rate = 0.00209;
	private int savingsNumber = 0;
	private String accountNumber;
	
	SavingsAccount(String name, double amount) {
		
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	SavingsAccount(SavingsAccount oldAccount, double amount) {
		
		super(oldAccount, amount);
		accountNumber = super.getAccountNumber() + "-" + (oldAccount.savingsNumber + 1);
		
	}
	
	public void postInterest() {
		
		super.setBalance(super.getBalance() + (super.getBalance()*rate));
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	

}
