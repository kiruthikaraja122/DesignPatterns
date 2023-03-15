package compositeDesignPattern;

abstract class Account {
	public abstract float getbalance();

}

class DepositeAccount extends Account
{
private String accountNo;
private float accountBalance;

public DepositeAccount(String accountNo, float accountBalance) {
	super();
	this.accountNo= accountNo;
	this.accountBalance=accountBalance; 
}
	@Override
	public float getbalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}
	
}

class SavingAccount extends Account{
	private String accountNo;
	private float accountBalance;
	
	public SavingAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo= accountNo;
		this.accountBalance=accountBalance; 
	}
	
	

	@Override
	public float getbalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}
	
}