package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BwzResponseHeader {

@SerializedName("responseCode")
@Expose
private String responseCode;
@SerializedName("responseStatus")
@Expose
private String responseStatus;
@SerializedName("responseDetails")
@Expose
private BwzResponsesWrapper responseDetails;

public String getResponseCode() {
return responseCode;
}

public void setResponseCode(String responseCode) {
this.responseCode = responseCode;
}

public String getResponseStatus() {
return responseStatus;
}

public void setResponseStatus(String responseStatus) {
this.responseStatus = responseStatus;
}

public BwzResponsesWrapper getBwzResponsesWrapper() {
return responseDetails;
}

public void setBwzResponsesWrapper(BwzResponsesWrapper responseDetails) {
this.responseDetails = responseDetails;
}

}