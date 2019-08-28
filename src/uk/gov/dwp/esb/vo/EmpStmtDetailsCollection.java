
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmpStmtDetailsCollection {

    @SerializedName("transactionDate")
    @Expose
    private String transactionDate;
    @SerializedName("transactionDescription")
    @Expose
    private String transactionDescription;
    @SerializedName("debitAmount")
    @Expose
    private String debitAmount;
    @SerializedName("creditAmount")
    @Expose
    private String creditAmount;
    @SerializedName("balance")
    @Expose
    private String balance;

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

}
