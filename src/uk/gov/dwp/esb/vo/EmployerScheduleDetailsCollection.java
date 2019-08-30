
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmployerScheduleDetailsCollection {

    @SerializedName("scheduleId")
    @Expose
    private String scheduleId;
    @SerializedName("fromDate")
    @Expose
    private String fromDate;
    @SerializedName("toDate")
    @Expose
    private String toDate;
    @SerializedName("targetAmount")
    @Expose
    private String targetAmount;
    @SerializedName("actualAmount")
    @Expose
    private String actualAmount;
    @SerializedName("overDraftAmount")
    @Expose
    private String overDraftAmount;
    @SerializedName("dueDate")
    @Expose
    private String dueDate;
    @SerializedName("scheduleDate")
    @Expose
    private String scheduleDate;
    @SerializedName("scheduleStatus")
    @Expose
    private String scheduleStatus;
    @SerializedName("reasonCode")
    @Expose
    private String reasonCode;

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
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

    public String getOverDraftAmount() {
        return overDraftAmount;
    }

    public void setOverDraftAmount(String overDraftAmount) {
        this.overDraftAmount = overDraftAmount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

}
