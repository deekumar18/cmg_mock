
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NRPScheduleDetailsCollection {

    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("nino")
    @Expose
    private String nino;
    @SerializedName("targetAmount")
    @Expose
    private String targetAmount;
    @SerializedName("actualAmount")
    @Expose
    private String actualAmount;
    @SerializedName("reasonCode")
    @Expose
    private String reasonCode;
    @SerializedName("CSARefNum")
    @Expose
    private String cSARefNum;
    @SerializedName("CSAIdentifier")
    @Expose
    private String cSAIdentifier;
    @SerializedName("SCIN")
    @Expose
    private String sCIN;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNino() {
        return nino;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public String getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(String targetAmount) {
        this.targetAmount = targetAmount;
    }

    public String getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(String actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getCSARefNum() {
        return cSARefNum;
    }

    public void setCSARefNum(String cSARefNum) {
        this.cSARefNum = cSARefNum;
    }

    public String getCSAIdentifier() {
        return cSAIdentifier;
    }

    public void setCSAIdentifier(String cSAIdentifier) {
        this.cSAIdentifier = cSAIdentifier;
    }

    public String getSCIN() {
        return sCIN;
    }

    public void setSCIN(String sCIN) {
        this.sCIN = sCIN;
    }

}
