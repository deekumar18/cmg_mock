/**
 * CmecSubmitBankValidationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationRequest;

public class CmecSubmitBankValidationRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String userId;

    private java.lang.String paymentMethod;

    private java.lang.String sortCode;

    private java.lang.String accountNumber;

    private java.lang.String rollNumber;

    private java.lang.String id;

    public CmecSubmitBankValidationRequest() {
    }

    public CmecSubmitBankValidationRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String userId,
           java.lang.String paymentMethod,
           java.lang.String sortCode,
           java.lang.String accountNumber,
           java.lang.String rollNumber,
           java.lang.String id) {
           this.requestHeader = requestHeader;
           this.userId = userId;
           this.paymentMethod = paymentMethod;
           this.sortCode = sortCode;
           this.accountNumber = accountNumber;
           this.rollNumber = rollNumber;
           this.id = id;
    }


    /**
     * Gets the requestHeader value for this CmecSubmitBankValidationRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CmecSubmitBankValidationRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the userId value for this CmecSubmitBankValidationRequest.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this CmecSubmitBankValidationRequest.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the paymentMethod value for this CmecSubmitBankValidationRequest.
     * 
     * @return paymentMethod
     */
    public java.lang.String getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this CmecSubmitBankValidationRequest.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the sortCode value for this CmecSubmitBankValidationRequest.
     * 
     * @return sortCode
     */
    public java.lang.String getSortCode() {
        return sortCode;
    }


    /**
     * Sets the sortCode value for this CmecSubmitBankValidationRequest.
     * 
     * @param sortCode
     */
    public void setSortCode(java.lang.String sortCode) {
        this.sortCode = sortCode;
    }


    /**
     * Gets the accountNumber value for this CmecSubmitBankValidationRequest.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this CmecSubmitBankValidationRequest.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the rollNumber value for this CmecSubmitBankValidationRequest.
     * 
     * @return rollNumber
     */
    public java.lang.String getRollNumber() {
        return rollNumber;
    }


    /**
     * Sets the rollNumber value for this CmecSubmitBankValidationRequest.
     * 
     * @param rollNumber
     */
    public void setRollNumber(java.lang.String rollNumber) {
        this.rollNumber = rollNumber;
    }


    /**
     * Gets the id value for this CmecSubmitBankValidationRequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CmecSubmitBankValidationRequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecSubmitBankValidationRequest)) return false;
        CmecSubmitBankValidationRequest other = (CmecSubmitBankValidationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestHeader==null && other.getRequestHeader()==null) || 
             (this.requestHeader!=null &&
              this.requestHeader.equals(other.getRequestHeader()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.sortCode==null && other.getSortCode()==null) || 
             (this.sortCode!=null &&
              this.sortCode.equals(other.getSortCode()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.rollNumber==null && other.getRollNumber()==null) || 
             (this.rollNumber!=null &&
              this.rollNumber.equals(other.getRollNumber()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getSortCode() != null) {
            _hashCode += getSortCode().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getRollNumber() != null) {
            _hashCode += getRollNumber().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecSubmitBankValidationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/payment/CmecSubmitBankValidationRequest", "CmecSubmitBankValidationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rollNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
