
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmployerDetails {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("employerRefNum")
    @Expose
    private String employerRefNum;
    @SerializedName("employerID")
    @Expose
    private String employerID;
    @SerializedName("preferedCommunicationMethod")
    @Expose
    private String preferedCommunicationMethod;
    @SerializedName("armedForcesFlag")
    @Expose
    private String armedForcesFlag;
    @SerializedName("emailAddress")
    @Expose
    private String emailAddress;
    @SerializedName("actionMode")
    @Expose
    private String actionMode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployerRefNum() {
        return employerRefNum;
    }

    public void setEmployerRefNum(String employerRefNum) {
        this.employerRefNum = employerRefNum;
    }

    public String getEmployerID() {
        return employerID;
    }

    public void setEmployerID(String employerID) {
        this.employerID = employerID;
    }

    public String getPreferedCommunicationMethod() {
        return preferedCommunicationMethod;
    }

    public void setPreferedCommunicationMethod(String preferedCommunicationMethod) {
        this.preferedCommunicationMethod = preferedCommunicationMethod;
    }

    public String getArmedForcesFlag() {
        return armedForcesFlag;
    }

    public void setArmedForcesFlag(String armedForcesFlag) {
        this.armedForcesFlag = armedForcesFlag;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getActionMode() {
        return actionMode;
    }

    public void setActionMode(String actionMode) {
        this.actionMode = actionMode;
    }

}
