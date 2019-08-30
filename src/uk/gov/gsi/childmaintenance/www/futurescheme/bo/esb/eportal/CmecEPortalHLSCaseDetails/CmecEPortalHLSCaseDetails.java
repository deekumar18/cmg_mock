/**
 * CmecEPortalHLSCaseDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalHLSCaseDetails;

public class CmecEPortalHLSCaseDetails  implements java.io.Serializable {
    private java.lang.String caseNum;

    private java.lang.String name;

    private java.lang.String applicantType;

    private java.lang.String caseId;

    private java.lang.String relationshiptype;

    private java.lang.String anniversaryDate;

    private java.lang.String weeklyLiabilityAmount;

    private java.lang.String monthlyLiabilityAmount;

    private java.lang.String liabilityAmount;

    private java.lang.String annualLiabilityAmount;

    private java.lang.String caseEffectiveDate;

    private java.lang.String initialDate;

    private java.lang.String status;

    private java.lang.String subStatus;

    private java.lang.String caseStage;

    private java.lang.String CMECServiceType;

    private java.lang.String CMECAnnualARNrpCCAmt;

    private java.lang.String CMECAnnualARPwcCCAmt;

    private java.lang.String CMECFullAnnualNrpCCAmt;

    private java.lang.String CMECFullAnnualPwcCCAmt;

    private java.lang.String CMECWeeklyNrpCCAmt;

    private java.lang.String CMECWeeklyPwcCCAmt;

    private java.lang.String CMECNrpOgmCharge;

    private java.lang.String CMECPwcCOgmCharge;

    private java.lang.String CMECNrpPmtFrequency;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalCaseContactDetails.CmecEPortalCaseContactDetails[] caseContactDetails;

    public CmecEPortalHLSCaseDetails() {
    }

    public CmecEPortalHLSCaseDetails(
           java.lang.String caseNum,
           java.lang.String name,
           java.lang.String applicantType,
           java.lang.String caseId,
           java.lang.String relationshiptype,
           java.lang.String anniversaryDate,
           java.lang.String weeklyLiabilityAmount,
           java.lang.String monthlyLiabilityAmount,
           java.lang.String liabilityAmount,
           java.lang.String annualLiabilityAmount,
           java.lang.String caseEffectiveDate,
           java.lang.String initialDate,
           java.lang.String status,
           java.lang.String subStatus,
           java.lang.String caseStage,
           java.lang.String CMECServiceType,
           java.lang.String CMECAnnualARNrpCCAmt,
           java.lang.String CMECAnnualARPwcCCAmt,
           java.lang.String CMECFullAnnualNrpCCAmt,
           java.lang.String CMECFullAnnualPwcCCAmt,
           java.lang.String CMECWeeklyNrpCCAmt,
           java.lang.String CMECWeeklyPwcCCAmt,
           java.lang.String CMECNrpOgmCharge,
           java.lang.String CMECPwcCOgmCharge,
           java.lang.String CMECNrpPmtFrequency,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalCaseContactDetails.CmecEPortalCaseContactDetails[] caseContactDetails) {
           this.caseNum = caseNum;
           this.name = name;
           this.applicantType = applicantType;
           this.caseId = caseId;
           this.relationshiptype = relationshiptype;
           this.anniversaryDate = anniversaryDate;
           this.weeklyLiabilityAmount = weeklyLiabilityAmount;
           this.monthlyLiabilityAmount = monthlyLiabilityAmount;
           this.liabilityAmount = liabilityAmount;
           this.annualLiabilityAmount = annualLiabilityAmount;
           this.caseEffectiveDate = caseEffectiveDate;
           this.initialDate = initialDate;
           this.status = status;
           this.subStatus = subStatus;
           this.caseStage = caseStage;
           this.CMECServiceType = CMECServiceType;
           this.CMECAnnualARNrpCCAmt = CMECAnnualARNrpCCAmt;
           this.CMECAnnualARPwcCCAmt = CMECAnnualARPwcCCAmt;
           this.CMECFullAnnualNrpCCAmt = CMECFullAnnualNrpCCAmt;
           this.CMECFullAnnualPwcCCAmt = CMECFullAnnualPwcCCAmt;
           this.CMECWeeklyNrpCCAmt = CMECWeeklyNrpCCAmt;
           this.CMECWeeklyPwcCCAmt = CMECWeeklyPwcCCAmt;
           this.CMECNrpOgmCharge = CMECNrpOgmCharge;
           this.CMECPwcCOgmCharge = CMECPwcCOgmCharge;
           this.CMECNrpPmtFrequency = CMECNrpPmtFrequency;
           this.caseContactDetails = caseContactDetails;
    }


    /**
     * Gets the caseNum value for this CmecEPortalHLSCaseDetails.
     * 
     * @return caseNum
     */
    public java.lang.String getCaseNum() {
        return caseNum;
    }


    /**
     * Sets the caseNum value for this CmecEPortalHLSCaseDetails.
     * 
     * @param caseNum
     */
    public void setCaseNum(java.lang.String caseNum) {
        this.caseNum = caseNum;
    }


    /**
     * Gets the name value for this CmecEPortalHLSCaseDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CmecEPortalHLSCaseDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the applicantType value for this CmecEPortalHLSCaseDetails.
     * 
     * @return applicantType
     */
    public java.lang.String getApplicantType() {
        return applicantType;
    }


    /**
     * Sets the applicantType value for this CmecEPortalHLSCaseDetails.
     * 
     * @param applicantType
     */
    public void setApplicantType(java.lang.String applicantType) {
        this.applicantType = applicantType;
    }


    /**
     * Gets the caseId value for this CmecEPortalHLSCaseDetails.
     * 
     * @return caseId
     */
    public java.lang.String getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this CmecEPortalHLSCaseDetails.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.String caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the relationshiptype value for this CmecEPortalHLSCaseDetails.
     * 
     * @return relationshiptype
     */
    public java.lang.String getRelationshiptype() {
        return relationshiptype;
    }


    /**
     * Sets the relationshiptype value for this CmecEPortalHLSCaseDetails.
     * 
     * @param relationshiptype
     */
    public void setRelationshiptype(java.lang.String relationshiptype) {
        this.relationshiptype = relationshiptype;
    }


    /**
     * Gets the anniversaryDate value for this CmecEPortalHLSCaseDetails.
     * 
     * @return anniversaryDate
     */
    public java.lang.String getAnniversaryDate() {
        return anniversaryDate;
    }


    /**
     * Sets the anniversaryDate value for this CmecEPortalHLSCaseDetails.
     * 
     * @param anniversaryDate
     */
    public void setAnniversaryDate(java.lang.String anniversaryDate) {
        this.anniversaryDate = anniversaryDate;
    }


    /**
     * Gets the weeklyLiabilityAmount value for this CmecEPortalHLSCaseDetails.
     * 
     * @return weeklyLiabilityAmount
     */
    public java.lang.String getWeeklyLiabilityAmount() {
        return weeklyLiabilityAmount;
    }


    /**
     * Sets the weeklyLiabilityAmount value for this CmecEPortalHLSCaseDetails.
     * 
     * @param weeklyLiabilityAmount
     */
    public void setWeeklyLiabilityAmount(java.lang.String weeklyLiabilityAmount) {
        this.weeklyLiabilityAmount = weeklyLiabilityAmount;
    }


    /**
     * Gets the monthlyLiabilityAmount value for this CmecEPortalHLSCaseDetails.
     * 
     * @return monthlyLiabilityAmount
     */
    public java.lang.String getMonthlyLiabilityAmount() {
        return monthlyLiabilityAmount;
    }


    /**
     * Sets the monthlyLiabilityAmount value for this CmecEPortalHLSCaseDetails.
     * 
     * @param monthlyLiabilityAmount
     */
    public void setMonthlyLiabilityAmount(java.lang.String monthlyLiabilityAmount) {
        this.monthlyLiabilityAmount = monthlyLiabilityAmount;
    }


    /**
     * Gets the liabilityAmount value for this CmecEPortalHLSCaseDetails.
     * 
     * @return liabilityAmount
     */
    public java.lang.String getLiabilityAmount() {
        return liabilityAmount;
    }


    /**
     * Sets the liabilityAmount value for this CmecEPortalHLSCaseDetails.
     * 
     * @param liabilityAmount
     */
    public void setLiabilityAmount(java.lang.String liabilityAmount) {
        this.liabilityAmount = liabilityAmount;
    }


    /**
     * Gets the annualLiabilityAmount value for this CmecEPortalHLSCaseDetails.
     * 
     * @return annualLiabilityAmount
     */
    public java.lang.String getAnnualLiabilityAmount() {
        return annualLiabilityAmount;
    }


    /**
     * Sets the annualLiabilityAmount value for this CmecEPortalHLSCaseDetails.
     * 
     * @param annualLiabilityAmount
     */
    public void setAnnualLiabilityAmount(java.lang.String annualLiabilityAmount) {
        this.annualLiabilityAmount = annualLiabilityAmount;
    }


    /**
     * Gets the caseEffectiveDate value for this CmecEPortalHLSCaseDetails.
     * 
     * @return caseEffectiveDate
     */
    public java.lang.String getCaseEffectiveDate() {
        return caseEffectiveDate;
    }


    /**
     * Sets the caseEffectiveDate value for this CmecEPortalHLSCaseDetails.
     * 
     * @param caseEffectiveDate
     */
    public void setCaseEffectiveDate(java.lang.String caseEffectiveDate) {
        this.caseEffectiveDate = caseEffectiveDate;
    }


    /**
     * Gets the initialDate value for this CmecEPortalHLSCaseDetails.
     * 
     * @return initialDate
     */
    public java.lang.String getInitialDate() {
        return initialDate;
    }


    /**
     * Sets the initialDate value for this CmecEPortalHLSCaseDetails.
     * 
     * @param initialDate
     */
    public void setInitialDate(java.lang.String initialDate) {
        this.initialDate = initialDate;
    }


    /**
     * Gets the status value for this CmecEPortalHLSCaseDetails.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CmecEPortalHLSCaseDetails.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the subStatus value for this CmecEPortalHLSCaseDetails.
     * 
     * @return subStatus
     */
    public java.lang.String getSubStatus() {
        return subStatus;
    }


    /**
     * Sets the subStatus value for this CmecEPortalHLSCaseDetails.
     * 
     * @param subStatus
     */
    public void setSubStatus(java.lang.String subStatus) {
        this.subStatus = subStatus;
    }


    /**
     * Gets the caseStage value for this CmecEPortalHLSCaseDetails.
     * 
     * @return caseStage
     */
    public java.lang.String getCaseStage() {
        return caseStage;
    }


    /**
     * Sets the caseStage value for this CmecEPortalHLSCaseDetails.
     * 
     * @param caseStage
     */
    public void setCaseStage(java.lang.String caseStage) {
        this.caseStage = caseStage;
    }


    /**
     * Gets the CMECServiceType value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECServiceType
     */
    public java.lang.String getCMECServiceType() {
        return CMECServiceType;
    }


    /**
     * Sets the CMECServiceType value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECServiceType
     */
    public void setCMECServiceType(java.lang.String CMECServiceType) {
        this.CMECServiceType = CMECServiceType;
    }


    /**
     * Gets the CMECAnnualARNrpCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECAnnualARNrpCCAmt
     */
    public java.lang.String getCMECAnnualARNrpCCAmt() {
        return CMECAnnualARNrpCCAmt;
    }


    /**
     * Sets the CMECAnnualARNrpCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECAnnualARNrpCCAmt
     */
    public void setCMECAnnualARNrpCCAmt(java.lang.String CMECAnnualARNrpCCAmt) {
        this.CMECAnnualARNrpCCAmt = CMECAnnualARNrpCCAmt;
    }


    /**
     * Gets the CMECAnnualARPwcCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECAnnualARPwcCCAmt
     */
    public java.lang.String getCMECAnnualARPwcCCAmt() {
        return CMECAnnualARPwcCCAmt;
    }


    /**
     * Sets the CMECAnnualARPwcCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECAnnualARPwcCCAmt
     */
    public void setCMECAnnualARPwcCCAmt(java.lang.String CMECAnnualARPwcCCAmt) {
        this.CMECAnnualARPwcCCAmt = CMECAnnualARPwcCCAmt;
    }


    /**
     * Gets the CMECFullAnnualNrpCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECFullAnnualNrpCCAmt
     */
    public java.lang.String getCMECFullAnnualNrpCCAmt() {
        return CMECFullAnnualNrpCCAmt;
    }


    /**
     * Sets the CMECFullAnnualNrpCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECFullAnnualNrpCCAmt
     */
    public void setCMECFullAnnualNrpCCAmt(java.lang.String CMECFullAnnualNrpCCAmt) {
        this.CMECFullAnnualNrpCCAmt = CMECFullAnnualNrpCCAmt;
    }


    /**
     * Gets the CMECFullAnnualPwcCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECFullAnnualPwcCCAmt
     */
    public java.lang.String getCMECFullAnnualPwcCCAmt() {
        return CMECFullAnnualPwcCCAmt;
    }


    /**
     * Sets the CMECFullAnnualPwcCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECFullAnnualPwcCCAmt
     */
    public void setCMECFullAnnualPwcCCAmt(java.lang.String CMECFullAnnualPwcCCAmt) {
        this.CMECFullAnnualPwcCCAmt = CMECFullAnnualPwcCCAmt;
    }


    /**
     * Gets the CMECWeeklyNrpCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECWeeklyNrpCCAmt
     */
    public java.lang.String getCMECWeeklyNrpCCAmt() {
        return CMECWeeklyNrpCCAmt;
    }


    /**
     * Sets the CMECWeeklyNrpCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECWeeklyNrpCCAmt
     */
    public void setCMECWeeklyNrpCCAmt(java.lang.String CMECWeeklyNrpCCAmt) {
        this.CMECWeeklyNrpCCAmt = CMECWeeklyNrpCCAmt;
    }


    /**
     * Gets the CMECWeeklyPwcCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECWeeklyPwcCCAmt
     */
    public java.lang.String getCMECWeeklyPwcCCAmt() {
        return CMECWeeklyPwcCCAmt;
    }


    /**
     * Sets the CMECWeeklyPwcCCAmt value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECWeeklyPwcCCAmt
     */
    public void setCMECWeeklyPwcCCAmt(java.lang.String CMECWeeklyPwcCCAmt) {
        this.CMECWeeklyPwcCCAmt = CMECWeeklyPwcCCAmt;
    }


    /**
     * Gets the CMECNrpOgmCharge value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECNrpOgmCharge
     */
    public java.lang.String getCMECNrpOgmCharge() {
        return CMECNrpOgmCharge;
    }


    /**
     * Sets the CMECNrpOgmCharge value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECNrpOgmCharge
     */
    public void setCMECNrpOgmCharge(java.lang.String CMECNrpOgmCharge) {
        this.CMECNrpOgmCharge = CMECNrpOgmCharge;
    }


    /**
     * Gets the CMECPwcCOgmCharge value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECPwcCOgmCharge
     */
    public java.lang.String getCMECPwcCOgmCharge() {
        return CMECPwcCOgmCharge;
    }


    /**
     * Sets the CMECPwcCOgmCharge value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECPwcCOgmCharge
     */
    public void setCMECPwcCOgmCharge(java.lang.String CMECPwcCOgmCharge) {
        this.CMECPwcCOgmCharge = CMECPwcCOgmCharge;
    }


    /**
     * Gets the CMECNrpPmtFrequency value for this CmecEPortalHLSCaseDetails.
     * 
     * @return CMECNrpPmtFrequency
     */
    public java.lang.String getCMECNrpPmtFrequency() {
        return CMECNrpPmtFrequency;
    }


    /**
     * Sets the CMECNrpPmtFrequency value for this CmecEPortalHLSCaseDetails.
     * 
     * @param CMECNrpPmtFrequency
     */
    public void setCMECNrpPmtFrequency(java.lang.String CMECNrpPmtFrequency) {
        this.CMECNrpPmtFrequency = CMECNrpPmtFrequency;
    }


    /**
     * Gets the caseContactDetails value for this CmecEPortalHLSCaseDetails.
     * 
     * @return caseContactDetails
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalCaseContactDetails.CmecEPortalCaseContactDetails[] getCaseContactDetails() {
        return caseContactDetails;
    }


    /**
     * Sets the caseContactDetails value for this CmecEPortalHLSCaseDetails.
     * 
     * @param caseContactDetails
     */
    public void setCaseContactDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalCaseContactDetails.CmecEPortalCaseContactDetails[] caseContactDetails) {
        this.caseContactDetails = caseContactDetails;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalCaseContactDetails.CmecEPortalCaseContactDetails getCaseContactDetails(int i) {
        return this.caseContactDetails[i];
    }

    public void setCaseContactDetails(int i, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalCaseContactDetails.CmecEPortalCaseContactDetails _value) {
        this.caseContactDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalHLSCaseDetails)) return false;
        CmecEPortalHLSCaseDetails other = (CmecEPortalHLSCaseDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseNum==null && other.getCaseNum()==null) || 
             (this.caseNum!=null &&
              this.caseNum.equals(other.getCaseNum()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.applicantType==null && other.getApplicantType()==null) || 
             (this.applicantType!=null &&
              this.applicantType.equals(other.getApplicantType()))) &&
            ((this.caseId==null && other.getCaseId()==null) || 
             (this.caseId!=null &&
              this.caseId.equals(other.getCaseId()))) &&
            ((this.relationshiptype==null && other.getRelationshiptype()==null) || 
             (this.relationshiptype!=null &&
              this.relationshiptype.equals(other.getRelationshiptype()))) &&
            ((this.anniversaryDate==null && other.getAnniversaryDate()==null) || 
             (this.anniversaryDate!=null &&
              this.anniversaryDate.equals(other.getAnniversaryDate()))) &&
            ((this.weeklyLiabilityAmount==null && other.getWeeklyLiabilityAmount()==null) || 
             (this.weeklyLiabilityAmount!=null &&
              this.weeklyLiabilityAmount.equals(other.getWeeklyLiabilityAmount()))) &&
            ((this.monthlyLiabilityAmount==null && other.getMonthlyLiabilityAmount()==null) || 
             (this.monthlyLiabilityAmount!=null &&
              this.monthlyLiabilityAmount.equals(other.getMonthlyLiabilityAmount()))) &&
            ((this.liabilityAmount==null && other.getLiabilityAmount()==null) || 
             (this.liabilityAmount!=null &&
              this.liabilityAmount.equals(other.getLiabilityAmount()))) &&
            ((this.annualLiabilityAmount==null && other.getAnnualLiabilityAmount()==null) || 
             (this.annualLiabilityAmount!=null &&
              this.annualLiabilityAmount.equals(other.getAnnualLiabilityAmount()))) &&
            ((this.caseEffectiveDate==null && other.getCaseEffectiveDate()==null) || 
             (this.caseEffectiveDate!=null &&
              this.caseEffectiveDate.equals(other.getCaseEffectiveDate()))) &&
            ((this.initialDate==null && other.getInitialDate()==null) || 
             (this.initialDate!=null &&
              this.initialDate.equals(other.getInitialDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subStatus==null && other.getSubStatus()==null) || 
             (this.subStatus!=null &&
              this.subStatus.equals(other.getSubStatus()))) &&
            ((this.caseStage==null && other.getCaseStage()==null) || 
             (this.caseStage!=null &&
              this.caseStage.equals(other.getCaseStage()))) &&
            ((this.CMECServiceType==null && other.getCMECServiceType()==null) || 
             (this.CMECServiceType!=null &&
              this.CMECServiceType.equals(other.getCMECServiceType()))) &&
            ((this.CMECAnnualARNrpCCAmt==null && other.getCMECAnnualARNrpCCAmt()==null) || 
             (this.CMECAnnualARNrpCCAmt!=null &&
              this.CMECAnnualARNrpCCAmt.equals(other.getCMECAnnualARNrpCCAmt()))) &&
            ((this.CMECAnnualARPwcCCAmt==null && other.getCMECAnnualARPwcCCAmt()==null) || 
             (this.CMECAnnualARPwcCCAmt!=null &&
              this.CMECAnnualARPwcCCAmt.equals(other.getCMECAnnualARPwcCCAmt()))) &&
            ((this.CMECFullAnnualNrpCCAmt==null && other.getCMECFullAnnualNrpCCAmt()==null) || 
             (this.CMECFullAnnualNrpCCAmt!=null &&
              this.CMECFullAnnualNrpCCAmt.equals(other.getCMECFullAnnualNrpCCAmt()))) &&
            ((this.CMECFullAnnualPwcCCAmt==null && other.getCMECFullAnnualPwcCCAmt()==null) || 
             (this.CMECFullAnnualPwcCCAmt!=null &&
              this.CMECFullAnnualPwcCCAmt.equals(other.getCMECFullAnnualPwcCCAmt()))) &&
            ((this.CMECWeeklyNrpCCAmt==null && other.getCMECWeeklyNrpCCAmt()==null) || 
             (this.CMECWeeklyNrpCCAmt!=null &&
              this.CMECWeeklyNrpCCAmt.equals(other.getCMECWeeklyNrpCCAmt()))) &&
            ((this.CMECWeeklyPwcCCAmt==null && other.getCMECWeeklyPwcCCAmt()==null) || 
             (this.CMECWeeklyPwcCCAmt!=null &&
              this.CMECWeeklyPwcCCAmt.equals(other.getCMECWeeklyPwcCCAmt()))) &&
            ((this.CMECNrpOgmCharge==null && other.getCMECNrpOgmCharge()==null) || 
             (this.CMECNrpOgmCharge!=null &&
              this.CMECNrpOgmCharge.equals(other.getCMECNrpOgmCharge()))) &&
            ((this.CMECPwcCOgmCharge==null && other.getCMECPwcCOgmCharge()==null) || 
             (this.CMECPwcCOgmCharge!=null &&
              this.CMECPwcCOgmCharge.equals(other.getCMECPwcCOgmCharge()))) &&
            ((this.CMECNrpPmtFrequency==null && other.getCMECNrpPmtFrequency()==null) || 
             (this.CMECNrpPmtFrequency!=null &&
              this.CMECNrpPmtFrequency.equals(other.getCMECNrpPmtFrequency()))) &&
            ((this.caseContactDetails==null && other.getCaseContactDetails()==null) || 
             (this.caseContactDetails!=null &&
              java.util.Arrays.equals(this.caseContactDetails, other.getCaseContactDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCaseNum() != null) {
            _hashCode += getCaseNum().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getApplicantType() != null) {
            _hashCode += getApplicantType().hashCode();
        }
        if (getCaseId() != null) {
            _hashCode += getCaseId().hashCode();
        }
        if (getRelationshiptype() != null) {
            _hashCode += getRelationshiptype().hashCode();
        }
        if (getAnniversaryDate() != null) {
            _hashCode += getAnniversaryDate().hashCode();
        }
        if (getWeeklyLiabilityAmount() != null) {
            _hashCode += getWeeklyLiabilityAmount().hashCode();
        }
        if (getMonthlyLiabilityAmount() != null) {
            _hashCode += getMonthlyLiabilityAmount().hashCode();
        }
        if (getLiabilityAmount() != null) {
            _hashCode += getLiabilityAmount().hashCode();
        }
        if (getAnnualLiabilityAmount() != null) {
            _hashCode += getAnnualLiabilityAmount().hashCode();
        }
        if (getCaseEffectiveDate() != null) {
            _hashCode += getCaseEffectiveDate().hashCode();
        }
        if (getInitialDate() != null) {
            _hashCode += getInitialDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubStatus() != null) {
            _hashCode += getSubStatus().hashCode();
        }
        if (getCaseStage() != null) {
            _hashCode += getCaseStage().hashCode();
        }
        if (getCMECServiceType() != null) {
            _hashCode += getCMECServiceType().hashCode();
        }
        if (getCMECAnnualARNrpCCAmt() != null) {
            _hashCode += getCMECAnnualARNrpCCAmt().hashCode();
        }
        if (getCMECAnnualARPwcCCAmt() != null) {
            _hashCode += getCMECAnnualARPwcCCAmt().hashCode();
        }
        if (getCMECFullAnnualNrpCCAmt() != null) {
            _hashCode += getCMECFullAnnualNrpCCAmt().hashCode();
        }
        if (getCMECFullAnnualPwcCCAmt() != null) {
            _hashCode += getCMECFullAnnualPwcCCAmt().hashCode();
        }
        if (getCMECWeeklyNrpCCAmt() != null) {
            _hashCode += getCMECWeeklyNrpCCAmt().hashCode();
        }
        if (getCMECWeeklyPwcCCAmt() != null) {
            _hashCode += getCMECWeeklyPwcCCAmt().hashCode();
        }
        if (getCMECNrpOgmCharge() != null) {
            _hashCode += getCMECNrpOgmCharge().hashCode();
        }
        if (getCMECPwcCOgmCharge() != null) {
            _hashCode += getCMECPwcCOgmCharge().hashCode();
        }
        if (getCMECNrpPmtFrequency() != null) {
            _hashCode += getCMECNrpPmtFrequency().hashCode();
        }
        if (getCaseContactDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseContactDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseContactDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalHLSCaseDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalHLSCaseDetails", "CmecEPortalHLSCaseDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicantType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicantType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshiptype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Relationshiptype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anniversaryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AnniversaryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weeklyLiabilityAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WeeklyLiabilityAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyLiabilityAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MonthlyLiabilityAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilityAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LiabilityAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualLiabilityAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AnnualLiabilityAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InitialDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseStage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECServiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECAnnualARNrpCCAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECAnnualARNrpCCAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECAnnualARPwcCCAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECAnnualARPwcCCAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECFullAnnualNrpCCAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECFullAnnualNrpCCAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECFullAnnualPwcCCAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECFullAnnualPwcCCAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECWeeklyNrpCCAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECWeeklyNrpCCAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECWeeklyPwcCCAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECWeeklyPwcCCAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECNrpOgmCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECNrpOgmCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECPwcCOgmCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECPwcCOgmCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECNrpPmtFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECNrpPmtFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseContactDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseContactDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalCaseContactDetails", "CmecEPortalCaseContactDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
