/**
 * CmecEPortalAccountDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAccountDetails;

public class CmecEPortalAccountDetails  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String CMECAccountNumber;

    private java.lang.String CMECSortCode;

    private java.lang.String CMECRollNo;

    private java.lang.String accountType;

    private java.lang.String expirqationDate;

    private java.lang.String methodOfPayment;

    private java.lang.String suspensionDate;

    private java.lang.String status;

    private java.lang.String startDate;

    private java.lang.String bwzAccountNumber;

    private java.lang.String bwzSortCode;

    private java.lang.String bwzRollNo;

    private java.lang.String MOPSequenceNumber;

    private java.lang.String collectionDate;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail[] bwzResponsesWrapper;

    public CmecEPortalAccountDetails() {
    }

    public CmecEPortalAccountDetails(
           java.lang.String name,
           java.lang.String CMECAccountNumber,
           java.lang.String CMECSortCode,
           java.lang.String CMECRollNo,
           java.lang.String accountType,
           java.lang.String expirqationDate,
           java.lang.String methodOfPayment,
           java.lang.String suspensionDate,
           java.lang.String status,
           java.lang.String startDate,
           java.lang.String bwzAccountNumber,
           java.lang.String bwzSortCode,
           java.lang.String bwzRollNo,
           java.lang.String MOPSequenceNumber,
           java.lang.String collectionDate,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail[] bwzResponsesWrapper) {
           this.name = name;
           this.CMECAccountNumber = CMECAccountNumber;
           this.CMECSortCode = CMECSortCode;
           this.CMECRollNo = CMECRollNo;
           this.accountType = accountType;
           this.expirqationDate = expirqationDate;
           this.methodOfPayment = methodOfPayment;
           this.suspensionDate = suspensionDate;
           this.status = status;
           this.startDate = startDate;
           this.bwzAccountNumber = bwzAccountNumber;
           this.bwzSortCode = bwzSortCode;
           this.bwzRollNo = bwzRollNo;
           this.MOPSequenceNumber = MOPSequenceNumber;
           this.collectionDate = collectionDate;
           this.bwzResponsesWrapper = bwzResponsesWrapper;
    }


    /**
     * Gets the name value for this CmecEPortalAccountDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CmecEPortalAccountDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the CMECAccountNumber value for this CmecEPortalAccountDetails.
     * 
     * @return CMECAccountNumber
     */
    public java.lang.String getCMECAccountNumber() {
        return CMECAccountNumber;
    }


    /**
     * Sets the CMECAccountNumber value for this CmecEPortalAccountDetails.
     * 
     * @param CMECAccountNumber
     */
    public void setCMECAccountNumber(java.lang.String CMECAccountNumber) {
        this.CMECAccountNumber = CMECAccountNumber;
    }


    /**
     * Gets the CMECSortCode value for this CmecEPortalAccountDetails.
     * 
     * @return CMECSortCode
     */
    public java.lang.String getCMECSortCode() {
        return CMECSortCode;
    }


    /**
     * Sets the CMECSortCode value for this CmecEPortalAccountDetails.
     * 
     * @param CMECSortCode
     */
    public void setCMECSortCode(java.lang.String CMECSortCode) {
        this.CMECSortCode = CMECSortCode;
    }


    /**
     * Gets the CMECRollNo value for this CmecEPortalAccountDetails.
     * 
     * @return CMECRollNo
     */
    public java.lang.String getCMECRollNo() {
        return CMECRollNo;
    }


    /**
     * Sets the CMECRollNo value for this CmecEPortalAccountDetails.
     * 
     * @param CMECRollNo
     */
    public void setCMECRollNo(java.lang.String CMECRollNo) {
        this.CMECRollNo = CMECRollNo;
    }


    /**
     * Gets the accountType value for this CmecEPortalAccountDetails.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this CmecEPortalAccountDetails.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the expirqationDate value for this CmecEPortalAccountDetails.
     * 
     * @return expirqationDate
     */
    public java.lang.String getExpirqationDate() {
        return expirqationDate;
    }


    /**
     * Sets the expirqationDate value for this CmecEPortalAccountDetails.
     * 
     * @param expirqationDate
     */
    public void setExpirqationDate(java.lang.String expirqationDate) {
        this.expirqationDate = expirqationDate;
    }


    /**
     * Gets the methodOfPayment value for this CmecEPortalAccountDetails.
     * 
     * @return methodOfPayment
     */
    public java.lang.String getMethodOfPayment() {
        return methodOfPayment;
    }


    /**
     * Sets the methodOfPayment value for this CmecEPortalAccountDetails.
     * 
     * @param methodOfPayment
     */
    public void setMethodOfPayment(java.lang.String methodOfPayment) {
        this.methodOfPayment = methodOfPayment;
    }


    /**
     * Gets the suspensionDate value for this CmecEPortalAccountDetails.
     * 
     * @return suspensionDate
     */
    public java.lang.String getSuspensionDate() {
        return suspensionDate;
    }


    /**
     * Sets the suspensionDate value for this CmecEPortalAccountDetails.
     * 
     * @param suspensionDate
     */
    public void setSuspensionDate(java.lang.String suspensionDate) {
        this.suspensionDate = suspensionDate;
    }


    /**
     * Gets the status value for this CmecEPortalAccountDetails.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CmecEPortalAccountDetails.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the startDate value for this CmecEPortalAccountDetails.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CmecEPortalAccountDetails.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the bwzAccountNumber value for this CmecEPortalAccountDetails.
     * 
     * @return bwzAccountNumber
     */
    public java.lang.String getBwzAccountNumber() {
        return bwzAccountNumber;
    }


    /**
     * Sets the bwzAccountNumber value for this CmecEPortalAccountDetails.
     * 
     * @param bwzAccountNumber
     */
    public void setBwzAccountNumber(java.lang.String bwzAccountNumber) {
        this.bwzAccountNumber = bwzAccountNumber;
    }


    /**
     * Gets the bwzSortCode value for this CmecEPortalAccountDetails.
     * 
     * @return bwzSortCode
     */
    public java.lang.String getBwzSortCode() {
        return bwzSortCode;
    }


    /**
     * Sets the bwzSortCode value for this CmecEPortalAccountDetails.
     * 
     * @param bwzSortCode
     */
    public void setBwzSortCode(java.lang.String bwzSortCode) {
        this.bwzSortCode = bwzSortCode;
    }


    /**
     * Gets the bwzRollNo value for this CmecEPortalAccountDetails.
     * 
     * @return bwzRollNo
     */
    public java.lang.String getBwzRollNo() {
        return bwzRollNo;
    }


    /**
     * Sets the bwzRollNo value for this CmecEPortalAccountDetails.
     * 
     * @param bwzRollNo
     */
    public void setBwzRollNo(java.lang.String bwzRollNo) {
        this.bwzRollNo = bwzRollNo;
    }


    /**
     * Gets the MOPSequenceNumber value for this CmecEPortalAccountDetails.
     * 
     * @return MOPSequenceNumber
     */
    public java.lang.String getMOPSequenceNumber() {
        return MOPSequenceNumber;
    }


    /**
     * Sets the MOPSequenceNumber value for this CmecEPortalAccountDetails.
     * 
     * @param MOPSequenceNumber
     */
    public void setMOPSequenceNumber(java.lang.String MOPSequenceNumber) {
        this.MOPSequenceNumber = MOPSequenceNumber;
    }


    /**
     * Gets the collectionDate value for this CmecEPortalAccountDetails.
     * 
     * @return collectionDate
     */
    public java.lang.String getCollectionDate() {
        return collectionDate;
    }


    /**
     * Sets the collectionDate value for this CmecEPortalAccountDetails.
     * 
     * @param collectionDate
     */
    public void setCollectionDate(java.lang.String collectionDate) {
        this.collectionDate = collectionDate;
    }


    /**
     * Gets the bwzResponsesWrapper value for this CmecEPortalAccountDetails.
     * 
     * @return bwzResponsesWrapper
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail[] getBwzResponsesWrapper() {
        return bwzResponsesWrapper;
    }


    /**
     * Sets the bwzResponsesWrapper value for this CmecEPortalAccountDetails.
     * 
     * @param bwzResponsesWrapper
     */
    public void setBwzResponsesWrapper(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail[] bwzResponsesWrapper) {
        this.bwzResponsesWrapper = bwzResponsesWrapper;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalAccountDetails)) return false;
        CmecEPortalAccountDetails other = (CmecEPortalAccountDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.CMECAccountNumber==null && other.getCMECAccountNumber()==null) || 
             (this.CMECAccountNumber!=null &&
              this.CMECAccountNumber.equals(other.getCMECAccountNumber()))) &&
            ((this.CMECSortCode==null && other.getCMECSortCode()==null) || 
             (this.CMECSortCode!=null &&
              this.CMECSortCode.equals(other.getCMECSortCode()))) &&
            ((this.CMECRollNo==null && other.getCMECRollNo()==null) || 
             (this.CMECRollNo!=null &&
              this.CMECRollNo.equals(other.getCMECRollNo()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.expirqationDate==null && other.getExpirqationDate()==null) || 
             (this.expirqationDate!=null &&
              this.expirqationDate.equals(other.getExpirqationDate()))) &&
            ((this.methodOfPayment==null && other.getMethodOfPayment()==null) || 
             (this.methodOfPayment!=null &&
              this.methodOfPayment.equals(other.getMethodOfPayment()))) &&
            ((this.suspensionDate==null && other.getSuspensionDate()==null) || 
             (this.suspensionDate!=null &&
              this.suspensionDate.equals(other.getSuspensionDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.bwzAccountNumber==null && other.getBwzAccountNumber()==null) || 
             (this.bwzAccountNumber!=null &&
              this.bwzAccountNumber.equals(other.getBwzAccountNumber()))) &&
            ((this.bwzSortCode==null && other.getBwzSortCode()==null) || 
             (this.bwzSortCode!=null &&
              this.bwzSortCode.equals(other.getBwzSortCode()))) &&
            ((this.bwzRollNo==null && other.getBwzRollNo()==null) || 
             (this.bwzRollNo!=null &&
              this.bwzRollNo.equals(other.getBwzRollNo()))) &&
            ((this.MOPSequenceNumber==null && other.getMOPSequenceNumber()==null) || 
             (this.MOPSequenceNumber!=null &&
              this.MOPSequenceNumber.equals(other.getMOPSequenceNumber()))) &&
            ((this.collectionDate==null && other.getCollectionDate()==null) || 
             (this.collectionDate!=null &&
              this.collectionDate.equals(other.getCollectionDate()))) &&
            ((this.bwzResponsesWrapper==null && other.getBwzResponsesWrapper()==null) || 
             (this.bwzResponsesWrapper!=null &&
              java.util.Arrays.equals(this.bwzResponsesWrapper, other.getBwzResponsesWrapper())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCMECAccountNumber() != null) {
            _hashCode += getCMECAccountNumber().hashCode();
        }
        if (getCMECSortCode() != null) {
            _hashCode += getCMECSortCode().hashCode();
        }
        if (getCMECRollNo() != null) {
            _hashCode += getCMECRollNo().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getExpirqationDate() != null) {
            _hashCode += getExpirqationDate().hashCode();
        }
        if (getMethodOfPayment() != null) {
            _hashCode += getMethodOfPayment().hashCode();
        }
        if (getSuspensionDate() != null) {
            _hashCode += getSuspensionDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getBwzAccountNumber() != null) {
            _hashCode += getBwzAccountNumber().hashCode();
        }
        if (getBwzSortCode() != null) {
            _hashCode += getBwzSortCode().hashCode();
        }
        if (getBwzRollNo() != null) {
            _hashCode += getBwzRollNo().hashCode();
        }
        if (getMOPSequenceNumber() != null) {
            _hashCode += getMOPSequenceNumber().hashCode();
        }
        if (getCollectionDate() != null) {
            _hashCode += getCollectionDate().hashCode();
        }
        if (getBwzResponsesWrapper() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBwzResponsesWrapper());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBwzResponsesWrapper(), i);
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
        new org.apache.axis.description.TypeDesc(CmecEPortalAccountDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalAccountDetails", "CmecEPortalAccountDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECSortCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECSortCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CMECRollNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CMECRollNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirqationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpirqationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodOfPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MethodOfPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspensionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SuspensionDate"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bwzAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BwzAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bwzSortCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BwzSortCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bwzRollNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BwzRollNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOPSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MOPSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CollectionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bwzResponsesWrapper");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BwzResponsesWrapper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/payment/BankWizardResponseDetail", "BankWizardResponseDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "BWZResponseDetail"));
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
