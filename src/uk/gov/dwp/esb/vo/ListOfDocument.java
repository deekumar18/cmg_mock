
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfDocument {

    @SerializedName("docId")
    @Expose
    private String docId;
    @SerializedName("clientFacingName")
    @Expose
    private String clientFacingName;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("templateCode")
    @Expose
    private String templateCode;

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getClientFacingName() {
        return clientFacingName;
    }

    public void setClientFacingName(String clientFacingName) {
        this.clientFacingName = clientFacingName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

}
