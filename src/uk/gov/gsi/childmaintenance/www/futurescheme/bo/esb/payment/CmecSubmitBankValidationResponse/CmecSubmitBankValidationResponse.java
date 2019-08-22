/**
 * CmecSubmitBankValidationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse;

public class CmecSubmitBankValidationResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.Response responseHeader;

    private java.lang.String responseSortCode;

    private java.lang.String responseAccountNumber;

    private java.lang.String responseRollNumber;

    private java.lang.String id;

    public CmecSubmitBankValidationResponse() {
    }

    public CmecSubmitBankValidationResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.Response responseHeader,
           java.lang.String responseSortCode,
           java.lang.String responseAccountNumber,
           java.lang.String responseRollNumber,
           java.lang.String id) {
           this.responseHeader = responseHeader;
           this.responseSortCode = responseSortCode;
           this.responseAccountNumber = responseAccountNumber;
           this.responseRollNumber = responseRollNumber;
           this.id = id;
    }


    /**
     * Gets the responseHeader value for this CmecSubmitBankValidationResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CmecSubmitBankValidationResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the responseSortCode value for this CmecSubmitBankValidationResponse.
     * 
     * @return responseSortCode
     */
    public java.lang.String getResponseSortCode() {
        return responseSortCode;
    }


    /**
     * Sets the responseSortCode value for this CmecSubmitBankValidationResponse.
     * 
     * @param responseSortCode
     */
    public void setResponseSortCode(java.lang.String responseSortCode) {
        this.responseSortCode = responseSortCode;
    }


    /**
     * Gets the responseAccountNumber value for this CmecSubmitBankValidationResponse.
     * 
     * @return responseAccountNumber
     */
    public java.lang.String getResponseAccountNumber() {
        return responseAccountNumber;
    }


    /**
     * Sets the responseAccountNumber value for this CmecSubmitBankValidationResponse.
     * 
     * @param responseAccountNumber
     */
    public void setResponseAccountNumber(java.lang.String responseAccountNumber) {
        this.responseAccountNumber = responseAccountNumber;
    }


    /**
     * Gets the responseRollNumber value for this CmecSubmitBankValidationResponse.
     * 
     * @return responseRollNumber
     */
    public java.lang.String getResponseRollNumber() {
        return responseRollNumber;
    }


    /**
     * Sets the responseRollNumber value for this CmecSubmitBankValidationResponse.
     * 
     * @param responseRollNumber
     */
    public void setResponseRollNumber(java.lang.String responseRollNumber) {
        this.responseRollNumber = responseRollNumber;
    }


    /**
     * Gets the id value for this CmecSubmitBankValidationResponse.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CmecSubmitBankValidationResponse.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecSubmitBankValidationResponse)) return false;
        CmecSubmitBankValidationResponse other = (CmecSubmitBankValidationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseHeader==null && other.getResponseHeader()==null) || 
             (this.responseHeader!=null &&
              this.responseHeader.equals(other.getResponseHeader()))) &&
            ((this.responseSortCode==null && other.getResponseSortCode()==null) || 
             (this.responseSortCode!=null &&
              this.responseSortCode.equals(other.getResponseSortCode()))) &&
            ((this.responseAccountNumber==null && other.getResponseAccountNumber()==null) || 
             (this.responseAccountNumber!=null &&
              this.responseAccountNumber.equals(other.getResponseAccountNumber()))) &&
            ((this.responseRollNumber==null && other.getResponseRollNumber()==null) || 
             (this.responseRollNumber!=null &&
              this.responseRollNumber.equals(other.getResponseRollNumber()))) &&
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
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getResponseSortCode() != null) {
            _hashCode += getResponseSortCode().hashCode();
        }
        if (getResponseAccountNumber() != null) {
            _hashCode += getResponseAccountNumber().hashCode();
        }
        if (getResponseRollNumber() != null) {
            _hashCode += getResponseRollNumber().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecSubmitBankValidationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/payment/CmecSubmitBankValidationResponse", "CmecSubmitBankValidationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/payment/CmecSubmitBankValidationResponse", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSortCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseSortCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseRollNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseRollNumber"));
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
