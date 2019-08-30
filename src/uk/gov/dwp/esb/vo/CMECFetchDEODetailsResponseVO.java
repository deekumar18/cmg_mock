
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CMECFetchDEODetailsResponseVO {

    @SerializedName("responseHeader")
    @Expose
    private ResponseHeader responseHeader;
    @SerializedName("fetchDEOResponse")
    @Expose
    private FetchDEOResponse fetchDEOResponse;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public FetchDEOResponse getFetchDEOResponse() {
        return fetchDEOResponse;
    }

    public void setFetchDEOResponse(FetchDEOResponse fetchDEOResponse) {
        this.fetchDEOResponse = fetchDEOResponse;
    }

}
