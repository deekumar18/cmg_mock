
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CMECInquireDEODetailsResponseVO {

    @SerializedName("responseHeader")
    @Expose
    private ResponseHeader responseHeader;
    @SerializedName("inquireDEOResponse")
    @Expose
    private InquireDEOResponse inquireDEOResponse;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public InquireDEOResponse getInquireDEOResponse() {
        return inquireDEOResponse;
    }

    public void setInquireDEOResponse(InquireDEOResponse inquireDEOResponse) {
        this.inquireDEOResponse = inquireDEOResponse;
    }

}
