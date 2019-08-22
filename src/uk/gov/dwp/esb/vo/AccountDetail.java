
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountDetail {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("CMECAccountNumber")
    @Expose
    private String cMECAccountNumber;
    @SerializedName("CMECSortCode")
    @Expose
    private String cMECSortCode;
    @SerializedName("CMECRollNo")
    @Expose
    private String cMECRollNo;
    @SerializedName("accountType")
    @Expose
    private String accountType;
    @SerializedName("expirqationDate")
    @Expose
    private String expirqationDate;
    @SerializedName("methodOfPayment")
    @Expose
    private String methodOfPayment;
    @SerializedName("suspensionDate")
    @Expose
    private String suspensionDate;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("bwzAccountNumber")
    @Expose
    private String bwzAccountNumber;
    @SerializedName("bwzSortCode")
    @Expose
    private String bwzSortCode;
    @SerializedName("bwzRollNo")
    @Expose
    private String bwzRollNo;
    @SerializedName("MOPSequenceNumber")
    @Expose
    private String mOPSequenceNumber;
    @SerializedName("collectionDate")
    @Expose
    private String collectionDate;
    @SerializedName("bwzResponsesWrapper")
    @Expose
    private List<BwzResponsesWrapper> bwzResponsesWrapper = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCMECAccountNumber() {
        return cMECAccountNumber;
    }

    public void setCMECAccountNumber(String cMECAccountNumber) {
        this.cMECAccountNumber = cMECAccountNumber;
    }

    public String getCMECSortCode() {
        return cMECSortCode;
    }

    public void setCMECSortCode(String cMECSortCode) {
        this.cMECSortCode = cMECSortCode;
    }

    public String getCMECRollNo() {
        return cMECRollNo;
    }

    public void setCMECRollNo(String cMECRollNo) {
        this.cMECRollNo = cMECRollNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getExpirqationDate() {
        return expirqationDate;
    }

    public void setExpirqationDate(String expirqationDate) {
        this.expirqationDate = expirqationDate;
    }

    public String getMethodOfPayment() {
        return methodOfPayment;
    }

    public void setMethodOfPayment(String methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }

    public String getSuspensionDate() {
        return suspensionDate;
    }

    public void setSuspensionDate(String suspensionDate) {
        this.suspensionDate = suspensionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getBwzAccountNumber() {
        return bwzAccountNumber;
    }

    public void setBwzAccountNumber(String bwzAccountNumber) {
        this.bwzAccountNumber = bwzAccountNumber;
    }

    public String getBwzSortCode() {
        return bwzSortCode;
    }

    public void setBwzSortCode(String bwzSortCode) {
        this.bwzSortCode = bwzSortCode;
    }

    public String getBwzRollNo() {
        return bwzRollNo;
    }

    public void setBwzRollNo(String bwzRollNo) {
        this.bwzRollNo = bwzRollNo;
    }

    public String getMOPSequenceNumber() {
        return mOPSequenceNumber;
    }

    public void setMOPSequenceNumber(String mOPSequenceNumber) {
        this.mOPSequenceNumber = mOPSequenceNumber;
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate;
    }

    public List<BwzResponsesWrapper> getBwzResponsesWrapper() {
        return bwzResponsesWrapper;
    }

    public void setBwzResponsesWrapper(List<BwzResponsesWrapper> bwzResponsesWrapper) {
        this.bwzResponsesWrapper = bwzResponsesWrapper;
    }

}
