
package uk.gov.dwp.esb.vo.CMECRetrievePromiseToPay;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromiseToPayScheduleDetailsCollection {

    @SerializedName("refId")
    @Expose
    private String refId;
    @SerializedName("mopId")
    @Expose
    private String mopId;
    @SerializedName("mopType")
    @Expose
    private String mopType;
    @SerializedName("collectionDate")
    @Expose
    private String collectionDate;
    @SerializedName("amountDue")
    @Expose
    private String amountDue;
    @SerializedName("amountReceived")
    @Expose
    private String amountReceived;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("versionNumber")
    @Expose
    private String versionNumber;
    @SerializedName("negoAcceptFlag")
    @Expose
    private String negoAcceptFlag;
    @SerializedName("pwcAccountNumber")
    @Expose
    private String pwcAccountNumber;
    @SerializedName("serviceType")
    @Expose
    private String serviceType;

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getMopId() {
        return mopId;
    }

    public void setMopId(String mopId) {
        this.mopId = mopId;
    }

    public String getMopType() {
        return mopType;
    }

    public void setMopType(String mopType) {
        this.mopType = mopType;
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate;
    }

    public String getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(String amountDue) {
        this.amountDue = amountDue;
    }

    public String getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(String amountReceived) {
        this.amountReceived = amountReceived;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getNegoAcceptFlag() {
        return negoAcceptFlag;
    }

    public void setNegoAcceptFlag(String negoAcceptFlag) {
        this.negoAcceptFlag = negoAcceptFlag;
    }

    public String getPwcAccountNumber() {
        return pwcAccountNumber;
    }

    public void setPwcAccountNumber(String pwcAccountNumber) {
        this.pwcAccountNumber = pwcAccountNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

}
