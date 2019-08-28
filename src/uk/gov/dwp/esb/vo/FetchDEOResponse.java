
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FetchDEOResponse {

    @SerializedName("employerAccountId")
    @Expose
    private String employerAccountId;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("dueDate")
    @Expose
    private String dueDate;
    @SerializedName("scheduleStatus")
    @Expose
    private String scheduleStatus;
    @SerializedName("scheduleId")
    @Expose
    private String scheduleId;
    @SerializedName("scheduleDate")
    @Expose
    private String scheduleDate;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("NRPScheduleDetailsCollection")
    @Expose
    private List<NRPScheduleDetailsCollection> nRPScheduleDetailsCollection = null;

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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
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

    public List<NRPScheduleDetailsCollection> getNRPScheduleDetailsCollection() {
        return nRPScheduleDetailsCollection;
    }

    public void setNRPScheduleDetailsCollection(List<NRPScheduleDetailsCollection> nRPScheduleDetailsCollection) {
        this.nRPScheduleDetailsCollection = nRPScheduleDetailsCollection;
    }

}
