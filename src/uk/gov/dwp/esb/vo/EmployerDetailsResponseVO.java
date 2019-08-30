
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmployerDetailsResponseVO {

    @SerializedName("responseHeader")
    @Expose
    private ResponseHeader responseHeader;
    @SerializedName("employerDetails")
    @Expose
    private EmployerDetails employerDetails;
    @SerializedName("employerAddress")
    @Expose
    private List<EmployerAddress> employerAddress = null;
    @SerializedName("employerContact")
    @Expose
    private List<EmployerContact> employerContact = null;
    @SerializedName("finCorpDetails")
    @Expose
    private List<FinCorpDetail> finCorpDetails = null;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public EmployerDetails getEmployerDetails() {
        return employerDetails;
    }

    public void setEmployerDetails(EmployerDetails employerDetails) {
        this.employerDetails = employerDetails;
    }

    public List<EmployerAddress> getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(List<EmployerAddress> employerAddress) {
        this.employerAddress = employerAddress;
    }

    public List<EmployerContact> getEmployerContact() {
        return employerContact;
    }

    public void setEmployerContact(List<EmployerContact> employerContact) {
        this.employerContact = employerContact;
    }

    public List<FinCorpDetail> getFinCorpDetails() {
        return finCorpDetails;
    }

    public void setFinCorpDetails(List<FinCorpDetail> finCorpDetails) {
        this.finCorpDetails = finCorpDetails;
    }

}
