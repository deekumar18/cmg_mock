
package uk.gov.dwp.esb.vo.CMECRetrievePromiseToPay;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("responseCode")
    @Expose
    private Integer responseCode;
    @SerializedName("responseMessage")
    @Expose
    private String responseMessage;
    @SerializedName("responseDetails")
    @Expose
    private List<ResponseDetail> responseDetails = null;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public List<ResponseDetail> getResponseDetails() {
        return responseDetails;
    }

    public void setResponseDetails(List<ResponseDetail> responseDetails) {
        this.responseDetails = responseDetails;
    }

}
