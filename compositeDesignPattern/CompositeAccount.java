package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends Account{
	private float totalBalance;
	private List<Account> accountList = new ArrayList<Account>();

	

	@Override
	public float getbalance() {
		totalBalance = 0;
		 for (Account f: accountList) {
			 totalBalance = totalBalance + f.getbalance();
		 }
		 return totalBalance;
	}
	
	public void addAccount(Account acc) {
		accountList.add(acc);
	}
	public void removeAccount(Account acc) {
		accountList.add(acc);
	}
}
