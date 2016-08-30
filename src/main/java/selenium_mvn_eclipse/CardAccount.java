package selenium_mvn_eclipse;

import java.util.ArrayList;
import java.util.List;

public class CardAccount extends Container {
	
	public CardAccount(){
		setTag(Container.TAG_CARD);
	}

	private String  cardNumber = "";
	private String totalLimit = "";
	private String billDate = "";
	private String dueDate = "";
	private String amountDue = "";
	private String minAmountDue = "";
	private String AccountName = "";
	private String availableCredit = "";
	private String lastStatementBalance = "";
	
	private List<CardTransaction> transactions = new ArrayList<CardTransaction>();
	
	public List<CardTransaction> getTransactions() {
		return transactions;
	}
	public void addTransaction(CardTransaction ct) {
		transactions.add(ct);
	}
	public String getLastStatementBalance() {
		return lastStatementBalance;
	}
	public void setLastStatementBalance(String lastStatementBalance) {
		this.lastStatementBalance = lastStatementBalance;
	}
	public String getAvailableCredit() {
		return availableCredit;
	}
	public void setAvailableCredit(String availableCredit) {
		this.availableCredit = availableCredit;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getTotalLimit() {
		return totalLimit;
	}
	public void setTotalLimit(String totalLimit) {
		this.totalLimit = totalLimit;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(String amountDue) {
		this.amountDue = amountDue;
	}
	public String getMinAmountDue() {
		return minAmountDue;
	}
	public void setMinAmountDue(String minAmountDue) {
		this.minAmountDue = minAmountDue;
	}
	
	
}
