/**
 * Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.CmecSubmitBankValidationResponse;

public class Response  implements java.io.Serializable {
    private java.lang.String responseCode;

    private java.lang.String responseStatus;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail[] responseDetails;

    public Response() {
    }

    public Response(
           java.lang.String responseCode,
           java.lang.String responseStatus,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail[] responseDetails) {
           this.responseCode = responseCode;
           this.responseStatus = responseStatus;
           this.responseDetails = responseDetails;
    }


    /**
     * Gets the responseCode value for this Response.
     * 
     * @return responseCode
     */
    public java.lang.String getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this Response.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.String responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseStatus value for this Response.
     * 
     * @return responseStatus
     */
    public java.lang.String getResponseStatus() {
        return responseStatus;
    }


    /**
     * Sets the responseStatus value for this Response.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(java.lang.String responseStatus) {
        this.responseStatus = responseStatus;
    }


    /**
     * Gets the responseDetails value for this Response.
     * 
     * @return responseDetails
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail[] getResponseDetails() {
        return responseDetails;
    }


    /**
     * Sets the responseDetails value for this Response.
     * 
     * @param responseDetails
     */
    public void setResponseDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail[] responseDetails) {
        this.responseDetails = responseDetails;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail getResponseDetails(int i) {
        return this.responseDetails[i];
    }

    public void setResponseDetails(int i, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.payment.BankWizardResponseDetail.BankWizardResponseDetail _value) {
        this.responseDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Response)) return false;
        Response other = (Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseStatus==null && other.getResponseStatus()==null) || 
             (this.responseStatus!=null &&
              this.responseStatus.equals(other.getResponseStatus()))) &&
            ((this.responseDetails==null && other.getResponseDetails()==null) || 
             (this.responseDetails!=null &&
              java.util.Arrays.equals(this.responseDetails, other.getResponseDetails())));
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
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseStatus() != null) {
            _hashCode += getResponseStatus().hashCode();
        }
        if (getResponseDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseDetails(), i);
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
        new org.apache.axis.description.TypeDesc(Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/payment/CmecSubmitBankValidationResponse", "Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/payment/BankWizardResponseDetail", "BankWizardResponseDetail"));
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
