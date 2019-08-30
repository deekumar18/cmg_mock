package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientAddress {

@SerializedName("addressLine1")
@Expose
private String addressLine1;
@SerializedName("addressLine2")
@Expose
private String addressLine2;
@SerializedName("addressLine3")
@Expose
private String addressLine3;
@SerializedName("addressLine4")
@Expose
private String addressLine4;
@SerializedName("addressLine5")
@Expose
private String addressLine5;
@SerializedName("county")
@Expose
private String county;
@SerializedName("country")
@Expose
private String country;
@SerializedName("addressType")
@Expose
private String addressType;
@SerializedName("postCode")
@Expose
private String postCode;
@SerializedName("isPrimary")
@Expose
private String isPrimary;
@SerializedName("addressID")
@Expose
private String addressID;
@SerializedName("state")
@Expose
private String state;
@SerializedName("city")
@Expose
private String city;
@SerializedName("addressSource")
@Expose
private String addressSource;
@SerializedName("deliveryPointSuffix")
@Expose
private String deliveryPointSuffix;
@SerializedName("startDate")
@Expose
private String startDate;
@SerializedName("endDate")
@Expose
private String endDate;
@SerializedName("location")
@Expose
private String location;

public String getAddressLine1() {
return addressLine1;
}

public void setAddressLine1(String addressLine1) {
this.addressLine1 = addressLine1;
}

public String getAddressLine2() {
return addressLine2;
}

public void setAddressLine2(String addressLine2) {
this.addressLine2 = addressLine2;
}

public String getAddressLine3() {
return addressLine3;
}

public void setAddressLine3(String addressLine3) {
this.addressLine3 = addressLine3;
}

public String getAddressLine4() {
return addressLine4;
}

public void setAddressLine4(String addressLine4) {
this.addressLine4 = addressLine4;
}

public String getAddressLine5() {
return addressLine5;
}

public void setAddressLine5(String addressLine5) {
this.addressLine5 = addressLine5;
}

public String getCounty() {
return county;
}

public void setCounty(String county) {
this.county = county;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public String getAddressType() {
return addressType;
}

public void setAddressType(String addressType) {
this.addressType = addressType;
}

public String getPostCode() {
return postCode;
}

public void setPostCode(String postCode) {
this.postCode = postCode;
}

public String getIsPrimary() {
return isPrimary;
}

public void setIsPrimary(String isPrimary) {
this.isPrimary = isPrimary;
}

public String getAddressID() {
return addressID;
}

public void setAddressID(String addressID) {
this.addressID = addressID;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getAddressSource() {
return addressSource;
}

public void setAddressSource(String addressSource) {
this.addressSource = addressSource;
}

public String getDeliveryPointSuffix() {
return deliveryPointSuffix;
}

public void setDeliveryPointSuffix(String deliveryPointSuffix) {
this.deliveryPointSuffix = deliveryPointSuffix;
}

public String getStartDate() {
return startDate;
}

public void setStartDate(String startDate) {
this.startDate = startDate;
}

public String getEndDate() {
return endDate;
}

public void setEndDate(String endDate) {
this.endDate = endDate;
}

public String getLocation() {
return location;
}

public void setLocation(String location) {
this.location = location;
}

}