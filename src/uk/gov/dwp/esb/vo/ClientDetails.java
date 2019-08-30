package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientDetails {

@SerializedName("primaryContactFlag")
@Expose
private String primaryContactFlag;
@SerializedName("emailAddress")
@Expose
private String emailAddress;
@SerializedName("firstName")
@Expose
private String firstName;
@SerializedName("lastName")
@Expose
private String lastName;
@SerializedName("referenceCode")
@Expose
private String referenceCode;
@SerializedName("middleName")
@Expose
private String middleName;
@SerializedName("birthDate")
@Expose
private String birthDate;
@SerializedName("jobRole")
@Expose
private String jobRole;
@SerializedName("gender")
@Expose
private String gender;
@SerializedName("title")
@Expose
private String title;
@SerializedName("contactPreference")
@Expose
private String contactPreference;
@SerializedName("personID")
@Expose
private String personID;
@SerializedName("scin")
@Expose
private String scin;
@SerializedName("nino")
@Expose
private String nino;
@SerializedName("languagePreference")
@Expose
private String languagePreference;
@SerializedName("smsFlag")
@Expose
private String smsFlag;

public String getPrimaryContactFlag() {
return primaryContactFlag;
}

public void setPrimaryContactFlag(String primaryContactFlag) {
this.primaryContactFlag = primaryContactFlag;
}

public String getEmailAddress() {
return emailAddress;
}

public void setEmailAddress(String emailAddress) {
this.emailAddress = emailAddress;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getReferenceCode() {
return referenceCode;
}

public void setReferenceCode(String referenceCode) {
this.referenceCode = referenceCode;
}

public String getMiddleName() {
return middleName;
}

public void setMiddleName(String middleName) {
this.middleName = middleName;
}

public String getBirthDate() {
return birthDate;
}

public void setBirthDate(String birthDate) {
this.birthDate = birthDate;
}

public String getJobRole() {
return jobRole;
}

public void setJobRole(String jobRole) {
this.jobRole = jobRole;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getContactPreference() {
return contactPreference;
}

public void setContactPreference(String contactPreference) {
this.contactPreference = contactPreference;
}

public String getPersonID() {
return personID;
}

public void setPersonID(String personID) {
this.personID = personID;
}

public String getScin() {
return scin;
}

public void setScin(String scin) {
this.scin = scin;
}

public String getNino() {
return nino;
}

public void setNino(String nino) {
this.nino = nino;
}

public String getLanguagePreference() {
return languagePreference;
}

public void setLanguagePreference(String languagePreference) {
this.languagePreference = languagePreference;
}

public String getSmsFlag() {
return smsFlag;
}

public void setSmsFlag(String smsFlag) {
this.smsFlag = smsFlag;
}

}