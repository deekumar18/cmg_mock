
package uk.gov.dwp.esb.vo.CMECRetrievePromiseToPay;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CmecRetrievePromiseToPaySchdResponseVO {

    @SerializedName("nrpAccountNumber")
    @Expose
    private String nrpAccountNumber;
    @SerializedName("response")
    @Expose
    private Response response;
    @SerializedName("promiseToPayScheduleDetailsCollection")
    @Expose
    private List<PromiseToPayScheduleDetailsCollection> promiseToPayScheduleDetailsCollection = null;

    public String getNrpAccountNumber() {
        return nrpAccountNumber;
    }

    public void setNrpAccountNumber(String nrpAccountNumber) {
        this.nrpAccountNumber = nrpAccountNumber;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public List<PromiseToPayScheduleDetailsCollection> getPromiseToPayScheduleDetailsCollection() {
        return promiseToPayScheduleDetailsCollection;
    }

    public void setPromiseToPayScheduleDetailsCollection(List<PromiseToPayScheduleDetailsCollection> promiseToPayScheduleDetailsCollection) {
        this.promiseToPayScheduleDetailsCollection = promiseToPayScheduleDetailsCollection;
    }

}
