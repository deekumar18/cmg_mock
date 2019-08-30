
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CmecGetClientContactHistoryDetailsResponseVO {

    @SerializedName("_id")
    @Expose
    private Id id;
    @SerializedName("responseHeader")
    @Expose
    private ResponseHeader responseHeader;
    @SerializedName("SCIN")
    @Expose
    private String sCIN;
    @SerializedName("personID")
    @Expose
    private String personID;
    @SerializedName("clientContactHistory")
    @Expose
    private List<ClientContactHistory> clientContactHistory = null;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public String getSCIN() {
        return sCIN;
    }

    public void setSCIN(String sCIN) {
        this.sCIN = sCIN;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public List<ClientContactHistory> getClientContactHistory() {
        return clientContactHistory;
    }

    public void setClientContactHistory(List<ClientContactHistory> clientContactHistory) {
        this.clientContactHistory = clientContactHistory;
    }

}
