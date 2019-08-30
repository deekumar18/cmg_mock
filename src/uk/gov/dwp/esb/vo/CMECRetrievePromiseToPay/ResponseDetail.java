
package uk.gov.dwp.esb.vo.CMECRetrievePromiseToPay;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseDetail {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("responseFrom")
    @Expose
    private String responseFrom;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponseFrom() {
        return responseFrom;
    }

    public void setResponseFrom(String responseFrom) {
        this.responseFrom = responseFrom;
    }

}
