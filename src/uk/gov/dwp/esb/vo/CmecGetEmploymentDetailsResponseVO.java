
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CmecGetEmploymentDetailsResponseVO {

    @SerializedName("responseHeader")
    @Expose
    private ResponseHeader responseHeader;
    @SerializedName("SCIN")
    @Expose
    private String sCIN;
    @SerializedName("totalIncomeAmount")
    @Expose
    private String totalIncomeAmount;
    @SerializedName("currencyOfPayment")
    @Expose
    private String currencyOfPayment;
    @SerializedName("contactEmploymentDetails")
    @Expose
    private List<ContactEmploymentDetail> contactEmploymentDetails = null;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public String getSCIN() {
        return sCIN;
    }

    public void setSCIN(String sCIN) {
        this.sCIN = sCIN;
    }

    public String getTotalIncomeAmount() {
        return totalIncomeAmount;
    }

    public void setTotalIncomeAmount(String totalIncomeAmount) {
        this.totalIncomeAmount = totalIncomeAmount;
    }

    public String getCurrencyOfPayment() {
        return currencyOfPayment;
    }

    public void setCurrencyOfPayment(String currencyOfPayment) {
        this.currencyOfPayment = currencyOfPayment;
    }

    public List<ContactEmploymentDetail> getContactEmploymentDetails() {
        return contactEmploymentDetails;
    }

    public void setContactEmploymentDetails(List<ContactEmploymentDetail> contactEmploymentDetails) {
        this.contactEmploymentDetails = contactEmploymentDetails;
    }

}
