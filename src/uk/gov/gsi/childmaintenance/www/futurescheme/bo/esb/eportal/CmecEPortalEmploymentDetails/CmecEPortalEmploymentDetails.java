/**
 * CmecEPortalEmploymentDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmploymentDetails;

public class CmecEPortalEmploymentDetails  implements java.io.Serializable {
    private java.lang.String employerName;

    private java.lang.String incomeType;

    private java.lang.String specialEmploymentType;

    private java.lang.String annualGrossIncome;

    private java.lang.String annualIrregularIncome;

    private java.lang.String annualPensionContribution;

    private java.lang.String foreignExchangeCosts;

    private java.lang.String phoneNumber;

    private java.lang.String faxNumber;

    private java.lang.String employerId;

    private java.lang.String modifiedFlag;

    private java.lang.String incomeId;

    private java.lang.String employmentStartDate;

    private java.lang.String employmentEndDate;

    private java.lang.String workPhoneNumExtn;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress addressDetails;

    public CmecEPortalEmploymentDetails() {
    }

    public CmecEPortalEmploymentDetails(
           java.lang.String employerName,
           java.lang.String incomeType,
           java.lang.String specialEmploymentType,
           java.lang.String annualGrossIncome,
           java.lang.String annualIrregularIncome,
           java.lang.String annualPensionContribution,
           java.lang.String foreignExchangeCosts,
           java.lang.String phoneNumber,
           java.lang.String faxNumber,
           java.lang.String employerId,
           java.lang.String modifiedFlag,
           java.lang.String incomeId,
           java.lang.String employmentStartDate,
           java.lang.String employmentEndDate,
           java.lang.String workPhoneNumExtn,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress addressDetails) {
           this.employerName = employerName;
           this.incomeType = incomeType;
           this.specialEmploymentType = specialEmploymentType;
           this.annualGrossIncome = annualGrossIncome;
           this.annualIrregularIncome = annualIrregularIncome;
           this.annualPensionContribution = annualPensionContribution;
           this.foreignExchangeCosts = foreignExchangeCosts;
           this.phoneNumber = phoneNumber;
           this.faxNumber = faxNumber;
           this.employerId = employerId;
           this.modifiedFlag = modifiedFlag;
           this.incomeId = incomeId;
           this.employmentStartDate = employmentStartDate;
           this.employmentEndDate = employmentEndDate;
           this.workPhoneNumExtn = workPhoneNumExtn;
           this.addressDetails = addressDetails;
    }


    /**
     * Gets the employerName value for this CmecEPortalEmploymentDetails.
     * 
     * @return employerName
     */
    public java.lang.String getEmployerName() {
        return employerName;
    }


    /**
     * Sets the employerName value for this CmecEPortalEmploymentDetails.
     * 
     * @param employerName
     */
    public void setEmployerName(java.lang.String employerName) {
        this.employerName = employerName;
    }


    /**
     * Gets the incomeType value for this CmecEPortalEmploymentDetails.
     * 
     * @return incomeType
     */
    public java.lang.String getIncomeType() {
        return incomeType;
    }


    /**
     * Sets the incomeType value for this CmecEPortalEmploymentDetails.
     * 
     * @param incomeType
     */
    public void setIncomeType(java.lang.String incomeType) {
        this.incomeType = incomeType;
    }


    /**
     * Gets the specialEmploymentType value for this CmecEPortalEmploymentDetails.
     * 
     * @return specialEmploymentType
     */
    public java.lang.String getSpecialEmploymentType() {
        return specialEmploymentType;
    }


    /**
     * Sets the specialEmploymentType value for this CmecEPortalEmploymentDetails.
     * 
     * @param specialEmploymentType
     */
    public void setSpecialEmploymentType(java.lang.String specialEmploymentType) {
        this.specialEmploymentType = specialEmploymentType;
    }


    /**
     * Gets the annualGrossIncome value for this CmecEPortalEmploymentDetails.
     * 
     * @return annualGrossIncome
     */
    public java.lang.String getAnnualGrossIncome() {
        return annualGrossIncome;
    }


    /**
     * Sets the annualGrossIncome value for this CmecEPortalEmploymentDetails.
     * 
     * @param annualGrossIncome
     */
    public void setAnnualGrossIncome(java.lang.String annualGrossIncome) {
        this.annualGrossIncome = annualGrossIncome;
    }


    /**
     * Gets the annualIrregularIncome value for this CmecEPortalEmploymentDetails.
     * 
     * @return annualIrregularIncome
     */
    public java.lang.String getAnnualIrregularIncome() {
        return annualIrregularIncome;
    }


    /**
     * Sets the annualIrregularIncome value for this CmecEPortalEmploymentDetails.
     * 
     * @param annualIrregularIncome
     */
    public void setAnnualIrregularIncome(java.lang.String annualIrregularIncome) {
        this.annualIrregularIncome = annualIrregularIncome;
    }


    /**
     * Gets the annualPensionContribution value for this CmecEPortalEmploymentDetails.
     * 
     * @return annualPensionContribution
     */
    public java.lang.String getAnnualPensionContribution() {
        return annualPensionContribution;
    }


    /**
     * Sets the annualPensionContribution value for this CmecEPortalEmploymentDetails.
     * 
     * @param annualPensionContribution
     */
    public void setAnnualPensionContribution(java.lang.String annualPensionContribution) {
        this.annualPensionContribution = annualPensionContribution;
    }


    /**
     * Gets the foreignExchangeCosts value for this CmecEPortalEmploymentDetails.
     * 
     * @return foreignExchangeCosts
     */
    public java.lang.String getForeignExchangeCosts() {
        return foreignExchangeCosts;
    }


    /**
     * Sets the foreignExchangeCosts value for this CmecEPortalEmploymentDetails.
     * 
     * @param foreignExchangeCosts
     */
    public void setForeignExchangeCosts(java.lang.String foreignExchangeCosts) {
        this.foreignExchangeCosts = foreignExchangeCosts;
    }


    /**
     * Gets the phoneNumber value for this CmecEPortalEmploymentDetails.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CmecEPortalEmploymentDetails.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the faxNumber value for this CmecEPortalEmploymentDetails.
     * 
     * @return faxNumber
     */
    public java.lang.String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this CmecEPortalEmploymentDetails.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the employerId value for this CmecEPortalEmploymentDetails.
     * 
     * @return employerId
     */
    public java.lang.String getEmployerId() {
        return employerId;
    }


    /**
     * Sets the employerId value for this CmecEPortalEmploymentDetails.
     * 
     * @param employerId
     */
    public void setEmployerId(java.lang.String employerId) {
        this.employerId = employerId;
    }


    /**
     * Gets the modifiedFlag value for this CmecEPortalEmploymentDetails.
     * 
     * @return modifiedFlag
     */
    public java.lang.String getModifiedFlag() {
        return modifiedFlag;
    }


    /**
     * Sets the modifiedFlag value for this CmecEPortalEmploymentDetails.
     * 
     * @param modifiedFlag
     */
    public void setModifiedFlag(java.lang.String modifiedFlag) {
        this.modifiedFlag = modifiedFlag;
    }


    /**
     * Gets the incomeId value for this CmecEPortalEmploymentDetails.
     * 
     * @return incomeId
     */
    public java.lang.String getIncomeId() {
        return incomeId;
    }


    /**
     * Sets the incomeId value for this CmecEPortalEmploymentDetails.
     * 
     * @param incomeId
     */
    public void setIncomeId(java.lang.String incomeId) {
        this.incomeId = incomeId;
    }


    /**
     * Gets the employmentStartDate value for this CmecEPortalEmploymentDetails.
     * 
     * @return employmentStartDate
     */
    public java.lang.String getEmploymentStartDate() {
        return employmentStartDate;
    }


    /**
     * Sets the employmentStartDate value for this CmecEPortalEmploymentDetails.
     * 
     * @param employmentStartDate
     */
    public void setEmploymentStartDate(java.lang.String employmentStartDate) {
        this.employmentStartDate = employmentStartDate;
    }


    /**
     * Gets the employmentEndDate value for this CmecEPortalEmploymentDetails.
     * 
     * @return employmentEndDate
     */
    public java.lang.String getEmploymentEndDate() {
        return employmentEndDate;
    }


    /**
     * Sets the employmentEndDate value for this CmecEPortalEmploymentDetails.
     * 
     * @param employmentEndDate
     */
    public void setEmploymentEndDate(java.lang.String employmentEndDate) {
        this.employmentEndDate = employmentEndDate;
    }


    /**
     * Gets the workPhoneNumExtn value for this CmecEPortalEmploymentDetails.
     * 
     * @return workPhoneNumExtn
     */
    public java.lang.String getWorkPhoneNumExtn() {
        return workPhoneNumExtn;
    }


    /**
     * Sets the workPhoneNumExtn value for this CmecEPortalEmploymentDetails.
     * 
     * @param workPhoneNumExtn
     */
    public void setWorkPhoneNumExtn(java.lang.String workPhoneNumExtn) {
        this.workPhoneNumExtn = workPhoneNumExtn;
    }


    /**
     * Gets the addressDetails value for this CmecEPortalEmploymentDetails.
     * 
     * @return addressDetails
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress getAddressDetails() {
        return addressDetails;
    }


    /**
     * Sets the addressDetails value for this CmecEPortalEmploymentDetails.
     * 
     * @param addressDetails
     */
    public void setAddressDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress addressDetails) {
        this.addressDetails = addressDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalEmploymentDetails)) return false;
        CmecEPortalEmploymentDetails other = (CmecEPortalEmploymentDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employerName==null && other.getEmployerName()==null) || 
             (this.employerName!=null &&
              this.employerName.equals(other.getEmployerName()))) &&
            ((this.incomeType==null && other.getIncomeType()==null) || 
             (this.incomeType!=null &&
              this.incomeType.equals(other.getIncomeType()))) &&
            ((this.specialEmploymentType==null && other.getSpecialEmploymentType()==null) || 
             (this.specialEmploymentType!=null &&
              this.specialEmploymentType.equals(other.getSpecialEmploymentType()))) &&
            ((this.annualGrossIncome==null && other.getAnnualGrossIncome()==null) || 
             (this.annualGrossIncome!=null &&
              this.annualGrossIncome.equals(other.getAnnualGrossIncome()))) &&
            ((this.annualIrregularIncome==null && other.getAnnualIrregularIncome()==null) || 
             (this.annualIrregularIncome!=null &&
              this.annualIrregularIncome.equals(other.getAnnualIrregularIncome()))) &&
            ((this.annualPensionContribution==null && other.getAnnualPensionContribution()==null) || 
             (this.annualPensionContribution!=null &&
              this.annualPensionContribution.equals(other.getAnnualPensionContribution()))) &&
            ((this.foreignExchangeCosts==null && other.getForeignExchangeCosts()==null) || 
             (this.foreignExchangeCosts!=null &&
              this.foreignExchangeCosts.equals(other.getForeignExchangeCosts()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.faxNumber==null && other.getFaxNumber()==null) || 
             (this.faxNumber!=null &&
              this.faxNumber.equals(other.getFaxNumber()))) &&
            ((this.employerId==null && other.getEmployerId()==null) || 
             (this.employerId!=null &&
              this.employerId.equals(other.getEmployerId()))) &&
            ((this.modifiedFlag==null && other.getModifiedFlag()==null) || 
             (this.modifiedFlag!=null &&
              this.modifiedFlag.equals(other.getModifiedFlag()))) &&
            ((this.incomeId==null && other.getIncomeId()==null) || 
             (this.incomeId!=null &&
              this.incomeId.equals(other.getIncomeId()))) &&
            ((this.employmentStartDate==null && other.getEmploymentStartDate()==null) || 
             (this.employmentStartDate!=null &&
              this.employmentStartDate.equals(other.getEmploymentStartDate()))) &&
            ((this.employmentEndDate==null && other.getEmploymentEndDate()==null) || 
             (this.employmentEndDate!=null &&
              this.employmentEndDate.equals(other.getEmploymentEndDate()))) &&
            ((this.workPhoneNumExtn==null && other.getWorkPhoneNumExtn()==null) || 
             (this.workPhoneNumExtn!=null &&
              this.workPhoneNumExtn.equals(other.getWorkPhoneNumExtn()))) &&
            ((this.addressDetails==null && other.getAddressDetails()==null) || 
             (this.addressDetails!=null &&
              this.addressDetails.equals(other.getAddressDetails())));
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
        if (getEmployerName() != null) {
            _hashCode += getEmployerName().hashCode();
        }
        if (getIncomeType() != null) {
            _hashCode += getIncomeType().hashCode();
        }
        if (getSpecialEmploymentType() != null) {
            _hashCode += getSpecialEmploymentType().hashCode();
        }
        if (getAnnualGrossIncome() != null) {
            _hashCode += getAnnualGrossIncome().hashCode();
        }
        if (getAnnualIrregularIncome() != null) {
            _hashCode += getAnnualIrregularIncome().hashCode();
        }
        if (getAnnualPensionContribution() != null) {
            _hashCode += getAnnualPensionContribution().hashCode();
        }
        if (getForeignExchangeCosts() != null) {
            _hashCode += getForeignExchangeCosts().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getFaxNumber() != null) {
            _hashCode += getFaxNumber().hashCode();
        }
        if (getEmployerId() != null) {
            _hashCode += getEmployerId().hashCode();
        }
        if (getModifiedFlag() != null) {
            _hashCode += getModifiedFlag().hashCode();
        }
        if (getIncomeId() != null) {
            _hashCode += getIncomeId().hashCode();
        }
        if (getEmploymentStartDate() != null) {
            _hashCode += getEmploymentStartDate().hashCode();
        }
        if (getEmploymentEndDate() != null) {
            _hashCode += getEmploymentEndDate().hashCode();
        }
        if (getWorkPhoneNumExtn() != null) {
            _hashCode += getWorkPhoneNumExtn().hashCode();
        }
        if (getAddressDetails() != null) {
            _hashCode += getAddressDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalEmploymentDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalEmploymentDetails", "CmecEPortalEmploymentDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncomeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialEmploymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SpecialEmploymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualGrossIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AnnualGrossIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualIrregularIncome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AnnualIrregularIncome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualPensionContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AnnualPensionContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignExchangeCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ForeignExchangeCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FaxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ModifiedFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncomeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employmentStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmploymentStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employmentEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmploymentEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhoneNumExtn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkPhoneNumExtn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalAddress", "CmecEPortalAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
