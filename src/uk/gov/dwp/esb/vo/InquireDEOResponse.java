
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InquireDEOResponse {

    @SerializedName("employerAccountId")
    @Expose
    private String employerAccountId;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("fromDate")
    @Expose
    private String fromDate;
    @SerializedName("toDate")
    @Expose
    private String toDate;
    @SerializedName("scheduleStatus")
    @Expose
    private String scheduleStatus;
    @SerializedName("employerScheduleDetailsCollection")
    @Expose
    private List<EmployerScheduleDetailsCollection> employerScheduleDetailsCollection = null;

    public String getEmployerAccountId() {
        return employerAccountId;
    }

    public void setEmployerAccountId(String employerAccountId) {
        this.employerAccountId = employerAccountId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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

    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public List<EmployerScheduleDetailsCollection> getEmployerScheduleDetailsCollection() {
        return employerScheduleDetailsCollection;
    }

    public void setEmployerScheduleDetailsCollection(List<EmployerScheduleDetailsCollection> employerScheduleDetailsCollection) {
        this.employerScheduleDetailsCollection = employerScheduleDetailsCollection;
    }

}
