
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientContactHistory {

    @SerializedName("caseId")
    @Expose
    private String caseId;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("refId")
    @Expose
    private String refId;
    @SerializedName("dateOfCorrespondence")
    @Expose
    private String dateOfCorrespondence;
    @SerializedName("ltrTmplCode")
    @Expose
    private String ltrTmplCode;
    @SerializedName("typeOfCorrespondence")
    @Expose
    private String typeOfCorrespondence;
    @SerializedName("listOfDocuments")
    @Expose
    private List<ListOfDocument> listOfDocuments = null;
    @SerializedName("messageFlag")
    @Expose
    private String messageFlag;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("listOfEnclosures")
    @Expose
    private List<ListOfEnclosure> listOfEnclosures = null;
    @SerializedName("clientFacingName")
    @Expose
    private String clientFacingName;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getDateOfCorrespondence() {
        return dateOfCorrespondence;
    }

    public void setDateOfCorrespondence(String dateOfCorrespondence) {
        this.dateOfCorrespondence = dateOfCorrespondence;
    }

    public String getLtrTmplCode() {
        return ltrTmplCode;
    }

    public void setLtrTmplCode(String ltrTmplCode) {
        this.ltrTmplCode = ltrTmplCode;
    }

    public String getTypeOfCorrespondence() {
        return typeOfCorrespondence;
    }

    public void setTypeOfCorrespondence(String typeOfCorrespondence) {
        this.typeOfCorrespondence = typeOfCorrespondence;
    }

    public List<ListOfDocument> getListOfDocuments() {
        return listOfDocuments;
    }

    public void setListOfDocuments(List<ListOfDocument> listOfDocuments) {
        this.listOfDocuments = listOfDocuments;
    }

    public String getMessageFlag() {
        return messageFlag;
    }

    public void setMessageFlag(String messageFlag) {
        this.messageFlag = messageFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ListOfEnclosure> getListOfEnclosures() {
        return listOfEnclosures;
    }

    public void setListOfEnclosures(List<ListOfEnclosure> listOfEnclosures) {
        this.listOfEnclosures = listOfEnclosures;
    }

    public String getClientFacingName() {
        return clientFacingName;
    }

    public void setClientFacingName(String clientFacingName) {
        this.clientFacingName = clientFacingName;
    }

}
