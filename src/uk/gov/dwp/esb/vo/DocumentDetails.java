package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DocumentDetails {
	@SerializedName("fileType")
	@Expose
    private String fileType;

	@SerializedName("fileName")
	@Expose
    private String fileName;

	@SerializedName("editable")
	@Expose
    private String editable;

	@SerializedName("docLink")
	@Expose
    private String docLink;

	@SerializedName("createdBy")
	@Expose
    private String createdBy;

	@SerializedName("createdOn")
	@Expose
    private String createdOn;

	@SerializedName("modifiedBy")
	@Expose
    private String modifiedBy;

	@SerializedName("modifiedOn")
	@Expose
    private String modifiedOn;

	@SerializedName("fileContent")
	@Expose
    private String fileContent;

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getEditable() {
		return editable;
	}

	public void setEditable(String editable) {
		this.editable = editable;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getDocLink() {
		return docLink;
	}

	public void setDocLink(String docLink) {
		this.docLink = docLink;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
}

