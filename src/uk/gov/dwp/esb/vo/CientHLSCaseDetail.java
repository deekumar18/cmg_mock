package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CientHLSCaseDetail {

	@SerializedName("caseNum")
	@Expose
	private String caseNum;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("applicantType")
	@Expose
	private String applicantType;
	@SerializedName("caseId")
	@Expose
	private String caseId;
	@SerializedName("relationshiptype")
	@Expose
	private String relationshiptype;
	@SerializedName("anniversaryDate")
	@Expose
	private String anniversaryDate;
	@SerializedName("weeklyLiabilityAmount")
	@Expose
	private String weeklyLiabilityAmount;
	@SerializedName("monthlyLiabilityAmount")
	@Expose
	private String monthlyLiabilityAmount;
	@SerializedName("liabilityAmount")
	@Expose
	private String liabilityAmount;
	@SerializedName("annualLiabilityAmount")
	@Expose
	private String annualLiabilityAmount;
	@SerializedName("caseEffectiveDate")
	@Expose
	private String caseEffectiveDate;
	@SerializedName("initialDate")
	@Expose
	private String initialDate;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("subStatus")
	@Expose
	private String subStatus;
	@SerializedName("caseStage")
	@Expose
	private String caseStage;
	@SerializedName("cmecServiceType")
	@Expose
	private String cmecServiceType;
	@SerializedName("cmecAnnualARNrpCCAmt")
	@Expose
	private String cmecAnnualARNrpCCAmt;
	@SerializedName("cmecAnnualARPwcCCAmt")
	@Expose
	private String cmecAnnualARPwcCCAmt;
	@SerializedName("cmecFullAnnualNrpCCAmt")
	@Expose
	private String cmecFullAnnualNrpCCAmt;
	@SerializedName("cmecFullAnnualPwcCCAmt")
	@Expose
	private String cmecFullAnnualPwcCCAmt;
	@SerializedName("cmecWeeklyNrpCCAmt")
	@Expose
	private String cmecWeeklyNrpCCAmt;
	@SerializedName("cmecWeeklyPwcCCAmt")
	@Expose
	private String cmecWeeklyPwcCCAmt;
	@SerializedName("cmecNrpOgmCharge")
	@Expose
	private String cmecNrpOgmCharge;
	@SerializedName("cmecPwcCOgmCharge")
	@Expose
	private String cmecPwcCOgmCharge;
	@SerializedName("cmecNrpPmtFrequency")
	@Expose
	private String cmecNrpPmtFrequency;

	public String getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(String caseNum) {
		this.caseNum = caseNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getRelationshiptype() {
		return relationshiptype;
	}

	public void setRelationshiptype(String relationshiptype) {
		this.relationshiptype = relationshiptype;
	}

	public String getAnniversaryDate() {
		return anniversaryDate;
	}

	public void setAnniversaryDate(String anniversaryDate) {
		this.anniversaryDate = anniversaryDate;
	}

	public String getWeeklyLiabilityAmount() {
		return weeklyLiabilityAmount;
	}

	public void setWeeklyLiabilityAmount(String weeklyLiabilityAmount) {
		this.weeklyLiabilityAmount = weeklyLiabilityAmount;
	}

	public String getMonthlyLiabilityAmount() {
		return monthlyLiabilityAmount;
	}

	public void setMonthlyLiabilityAmount(String monthlyLiabilityAmount) {
		this.monthlyLiabilityAmount = monthlyLiabilityAmount;
	}

	public String getLiabilityAmount() {
		return liabilityAmount;
	}

	public void setLiabilityAmount(String liabilityAmount) {
		this.liabilityAmount = liabilityAmount;
	}

	public String getAnnualLiabilityAmount() {
		return annualLiabilityAmount;
	}

	public void setAnnualLiabilityAmount(String annualLiabilityAmount) {
		this.annualLiabilityAmount = annualLiabilityAmount;
	}

	public String getCaseEffectiveDate() {
		return caseEffectiveDate;
	}

	public void setCaseEffectiveDate(String caseEffectiveDate) {
		this.caseEffectiveDate = caseEffectiveDate;
	}

	public String getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubStatus() {
		return subStatus;
	}

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getCaseStage() {
		return caseStage;
	}

	public void setCaseStage(String caseStage) {
		this.caseStage = caseStage;
	}

	public String getCmecServiceType() {
		return cmecServiceType;
	}

	public void setCmecServiceType(String cmecServiceType) {
		this.cmecServiceType = cmecServiceType;
	}

	public String getCmecAnnualARNrpCCAmt() {
		return cmecAnnualARNrpCCAmt;
	}

	public void setCmecAnnualARNrpCCAmt(String cmecAnnualARNrpCCAmt) {
		this.cmecAnnualARNrpCCAmt = cmecAnnualARNrpCCAmt;
	}

	public String getCmecAnnualARPwcCCAmt() {
		return cmecAnnualARPwcCCAmt;
	}

	public void setCmecAnnualARPwcCCAmt(String cmecAnnualARPwcCCAmt) {
		this.cmecAnnualARPwcCCAmt = cmecAnnualARPwcCCAmt;
	}

	public String getCmecFullAnnualNrpCCAmt() {
		return cmecFullAnnualNrpCCAmt;
	}

	public void setCmecFullAnnualNrpCCAmt(String cmecFullAnnualNrpCCAmt) {
		this.cmecFullAnnualNrpCCAmt = cmecFullAnnualNrpCCAmt;
	}

	public String getCmecFullAnnualPwcCCAmt() {
		return cmecFullAnnualPwcCCAmt;
	}

	public void setCmecFullAnnualPwcCCAmt(String cmecFullAnnualPwcCCAmt) {
		this.cmecFullAnnualPwcCCAmt = cmecFullAnnualPwcCCAmt;
	}

	public String getCmecWeeklyNrpCCAmt() {
		return cmecWeeklyNrpCCAmt;
	}

	public void setCmecWeeklyNrpCCAmt(String cmecWeeklyNrpCCAmt) {
		this.cmecWeeklyNrpCCAmt = cmecWeeklyNrpCCAmt;
	}

	public String getCmecWeeklyPwcCCAmt() {
		return cmecWeeklyPwcCCAmt;
	}

	public void setCmecWeeklyPwcCCAmt(String cmecWeeklyPwcCCAmt) {
		this.cmecWeeklyPwcCCAmt = cmecWeeklyPwcCCAmt;
	}

	public String getCmecNrpOgmCharge() {
		return cmecNrpOgmCharge;
	}

	public void setCmecNrpOgmCharge(String cmecNrpOgmCharge) {
		this.cmecNrpOgmCharge = cmecNrpOgmCharge;
	}

	public String getCmecPwcCOgmCharge() {
		return cmecPwcCOgmCharge;
	}

	public void setCmecPwcCOgmCharge(String cmecPwcCOgmCharge) {
		this.cmecPwcCOgmCharge = cmecPwcCOgmCharge;
	}

	public String getCmecNrpPmtFrequency() {
		return cmecNrpPmtFrequency;
	}

	public void setCmecNrpPmtFrequency(String cmecNrpPmtFrequency) {
		this.cmecNrpPmtFrequency = cmecNrpPmtFrequency;
	}

}