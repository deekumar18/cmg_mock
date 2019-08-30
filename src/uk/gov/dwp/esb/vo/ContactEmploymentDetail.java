
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContactEmploymentDetail {

    @SerializedName("employerName")
    @Expose
    private String employerName;
    @SerializedName("incomeType")
    @Expose
    private String incomeType;
    @SerializedName("specialEmploymentType")
    @Expose
    private String specialEmploymentType;
    @SerializedName("annualGrossIncome")
    @Expose
    private String annualGrossIncome;
    @SerializedName("annualIrregularIncome")
    @Expose
    private String annualIrregularIncome;
    @SerializedName("annualPensionContribution")
    @Expose
    private String annualPensionContribution;
    @SerializedName("foreignExchangeCosts")
    @Expose
    private String foreignExchangeCosts;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("faxNumber")
    @Expose
    private String faxNumber;
    @SerializedName("employerId")
    @Expose
    private String employerId;
    @SerializedName("modifiedFlag")
    @Expose
    private String modifiedFlag;
    @SerializedName("incomeId")
    @Expose
    private String incomeId;
    @SerializedName("employmentStartDate")
    @Expose
    private String employmentStartDate;
    @SerializedName("employmentEndDate")
    @Expose
    private String employmentEndDate;
    @SerializedName("workPhoneNumExtn")
    @Expose
    private String workPhoneNumExtn;
    @SerializedName("addressDetails")
    @Expose
    private AddressDetails addressDetails;

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public String getSpecialEmploymentType() {
        return specialEmploymentType;
    }

    public void setSpecialEmploymentType(String specialEmploymentType) {
        this.specialEmploymentType = specialEmploymentType;
    }

    public String getAnnualGrossIncome() {
        return annualGrossIncome;
    }

    public void setAnnualGrossIncome(String annualGrossIncome) {
        this.annualGrossIncome = annualGrossIncome;
    }

    public String getAnnualIrregularIncome() {
        return annualIrregularIncome;
    }

    public void setAnnualIrregularIncome(String annualIrregularIncome) {
        this.annualIrregularIncome = annualIrregularIncome;
    }

    public String getAnnualPensionContribution() {
        return annualPensionContribution;
    }

    public void setAnnualPensionContribution(String annualPensionContribution) {
        this.annualPensionContribution = annualPensionContribution;
    }

    public String getForeignExchangeCosts() {
        return foreignExchangeCosts;
    }

    public void setForeignExchangeCosts(String foreignExchangeCosts) {
        this.foreignExchangeCosts = foreignExchangeCosts;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmployerId() {
        return employerId;
    }

    public void setEmployerId(String employerId) {
        this.employerId = employerId;
    }

    public String getModifiedFlag() {
        return modifiedFlag;
    }

    public void setModifiedFlag(String modifiedFlag) {
        this.modifiedFlag = modifiedFlag;
    }

    public String getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(String incomeId) {
        this.incomeId = incomeId;
    }

    public String getEmploymentStartDate() {
        return employmentStartDate;
    }

    public void setEmploymentStartDate(String employmentStartDate) {
        this.employmentStartDate = employmentStartDate;
    }

    public String getEmploymentEndDate() {
        return employmentEndDate;
    }

    public void setEmploymentEndDate(String employmentEndDate) {
        this.employmentEndDate = employmentEndDate;
    }

    public String getWorkPhoneNumExtn() {
        return workPhoneNumExtn;
    }

    public void setWorkPhoneNumExtn(String workPhoneNumExtn) {
        this.workPhoneNumExtn = workPhoneNumExtn;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

}
