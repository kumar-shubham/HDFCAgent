package selenium_mvn_eclipse;

import java.util.ArrayList;
import java.util.List;

public class BankAccount extends Container {
	
	public BankAccount(){
		setTag(Container.TAG_BANK);
	}
	
	private String accountNumer = "";
	
	private String accountBalance = "";
	
	private List<BankTransaction> transactions = new ArrayList<BankTransaction>();
	
	public List<BankTransaction> getTransactions() {
		return transactions;
	}

	public void addTransaction(BankTransaction bt) {
		transactions.add(bt);
	}

	public String getAccountNumer() {
		return accountNumer;
	}

	public void setAccountNumer(String accountNumer) {
		this.accountNumer = accountNumer;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}


}
