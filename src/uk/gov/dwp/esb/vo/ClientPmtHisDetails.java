package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientPmtHisDetails {

	@SerializedName("transactionDate")
	@Expose
	private String transactionDate;

	@SerializedName("debitAmt")
	@Expose
	private String debitAmt;

	@SerializedName("creditAmt")
	@Expose
	private String creditAmt;

	@SerializedName("description")
	@Expose
	private String description;

	@SerializedName("balance")
	@Expose
	private String balance;

	public ClientPmtHisDetails() {

	}

	public ClientPmtHisDetails(String transactionDate, String debitAmt, String creditAmt, String description, String balance) {
		this.transactionDate = transactionDate;
		this.debitAmt = debitAmt;
		this.creditAmt = creditAmt;
		this.description = description;
		this.balance = balance;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getDebitAmt() {
		return debitAmt;
	}

	public void setDebitAmt(String debitAmt) {
		this.debitAmt = debitAmt;
	}

	public String getCreditAmt() {
		return creditAmt;
	}

	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

}
