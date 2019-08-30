package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseHeader {

@SerializedName("responseCode")
@Expose
private Integer responseCode;
@SerializedName("responseMessage")
@Expose
private String responseMessage;
@SerializedName("srNumber")
@Expose
private String srNumber;

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

public String getSrNumber() {
return srNumber;
}

public void setSrNumber(String srNumber) {
this.srNumber = srNumber;
}

}