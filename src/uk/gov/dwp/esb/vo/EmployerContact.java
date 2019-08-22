
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmployerContact {

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
    @SerializedName("cellularPhoneNum")
    @Expose
    private List<String> cellularPhoneNum = null;
    @SerializedName("homePhoneNum")
    @Expose
    private List<String> homePhoneNum = null;
    @SerializedName("workPhoneNum")
    @Expose
    private List<String> workPhoneNum = null;
    @SerializedName("contactPreference")
    @Expose
    private String contactPreference;
    @SerializedName("personID")
    @Expose
    private String personID;
    @SerializedName("SCIN")
    @Expose
    private String sCIN;
    @SerializedName("NINO")
    @Expose
    private String nINO;
    @SerializedName("languagePreference")
    @Expose
    private String languagePreference;
    @SerializedName("smsFlag")
    @Expose
    private String smsFlag;
    @SerializedName("workPhoneNumExtn")
    @Expose
    private List<String> workPhoneNumExtn = null;

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

    public List<String> getCellularPhoneNum() {
        return cellularPhoneNum;
    }

    public void setCellularPhoneNum(List<String> cellularPhoneNum) {
        this.cellularPhoneNum = cellularPhoneNum;
    }

    public List<String> getHomePhoneNum() {
        return homePhoneNum;
    }

    public void setHomePhoneNum(List<String> homePhoneNum) {
        this.homePhoneNum = homePhoneNum;
    }

    public List<String> getWorkPhoneNum() {
        return workPhoneNum;
    }

    public void setWorkPhoneNum(List<String> workPhoneNum) {
        this.workPhoneNum = workPhoneNum;
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

    public String getSCIN() {
        return sCIN;
    }

    public void setSCIN(String sCIN) {
        this.sCIN = sCIN;
    }

    public String getNINO() {
        return nINO;
    }

    public void setNINO(String nINO) {
        this.nINO = nINO;
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

    public List<String> getWorkPhoneNumExtn() {
        return workPhoneNumExtn;
    }

    public void setWorkPhoneNumExtn(List<String> workPhoneNumExtn) {
        this.workPhoneNumExtn = workPhoneNumExtn;
    }

}
