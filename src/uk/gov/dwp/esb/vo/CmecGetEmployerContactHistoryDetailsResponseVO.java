
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CmecGetEmployerContactHistoryDetailsResponseVO {

    @SerializedName("responseHeader")
    @Expose
    private ResponseHeader responseHeader;
    @SerializedName("ERN")
    @Expose
    private String eRN;
    @SerializedName("employerID")
    @Expose
    private String employerID;
    @SerializedName("employerContactHistory")
    @Expose
    private List<EmployerContactHistory> employerContactHistory = null;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public String getERN() {
        return eRN;
    }

    public void setERN(String eRN) {
        this.eRN = eRN;
    }

    public String getEmployerID() {
        return employerID;
    }

    public void setEmployerID(String employerID) {
        this.employerID = employerID;
    }

    public List<EmployerContactHistory> getEmployerContactHistory() {
        return employerContactHistory;
    }

    public void setEmployerContactHistory(List<EmployerContactHistory> employerContactHistory) {
        this.employerContactHistory = employerContactHistory;
    }

}
