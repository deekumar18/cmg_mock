/**
 * CmecGetEmploymentDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmploymentDetailsResponse;

public class CmecGetEmploymentDetailsResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader;

    private java.lang.String totalIncomeAmount;

    private java.lang.String currencyOfPayment;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmploymentDetails.CmecEPortalEmploymentDetails[] contactEmploymentDetails;

    public CmecGetEmploymentDetailsResponse() {
    }

    public CmecGetEmploymentDetailsResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader,
           java.lang.String totalIncomeAmount,
           java.lang.String currencyOfPayment,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmploymentDetails.CmecEPortalEmploymentDetails[] contactEmploymentDetails) {
           this.responseHeader = responseHeader;
           this.totalIncomeAmount = totalIncomeAmount;
           this.currencyOfPayment = currencyOfPayment;
           this.contactEmploymentDetails = contactEmploymentDetails;
    }


    /**
     * Gets the responseHeader value for this CmecGetEmploymentDetailsResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CmecGetEmploymentDetailsResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the totalIncomeAmount value for this CmecGetEmploymentDetailsResponse.
     * 
     * @return totalIncomeAmount
     */
    public java.lang.String getTotalIncomeAmount() {
        return totalIncomeAmount;
    }


    /**
     * Sets the totalIncomeAmount value for this CmecGetEmploymentDetailsResponse.
     * 
     * @param totalIncomeAmount
     */
    public void setTotalIncomeAmount(java.lang.String totalIncomeAmount) {
        this.totalIncomeAmount = totalIncomeAmount;
    }


    /**
     * Gets the currencyOfPayment value for this CmecGetEmploymentDetailsResponse.
     * 
     * @return currencyOfPayment
     */
    public java.lang.String getCurrencyOfPayment() {
        return currencyOfPayment;
    }


    /**
     * Sets the currencyOfPayment value for this CmecGetEmploymentDetailsResponse.
     * 
     * @param currencyOfPayment
     */
    public void setCurrencyOfPayment(java.lang.String currencyOfPayment) {
        this.currencyOfPayment = currencyOfPayment;
    }


    /**
     * Gets the contactEmploymentDetails value for this CmecGetEmploymentDetailsResponse.
     * 
     * @return contactEmploymentDetails
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmploymentDetails.CmecEPortalEmploymentDetails[] getContactEmploymentDetails() {
        return contactEmploymentDetails;
    }


    /**
     * Sets the contactEmploymentDetails value for this CmecGetEmploymentDetailsResponse.
     * 
     * @param contactEmploymentDetails
     */
    public void setContactEmploymentDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmploymentDetails.CmecEPortalEmploymentDetails[] contactEmploymentDetails) {
        this.contactEmploymentDetails = contactEmploymentDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecGetEmploymentDetailsResponse)) return false;
        CmecGetEmploymentDetailsResponse other = (CmecGetEmploymentDetailsResponse) obj;
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
            ((this.totalIncomeAmount==null && other.getTotalIncomeAmount()==null) || 
             (this.totalIncomeAmount!=null &&
              this.totalIncomeAmount.equals(other.getTotalIncomeAmount()))) &&
            ((this.currencyOfPayment==null && other.getCurrencyOfPayment()==null) || 
             (this.currencyOfPayment!=null &&
              this.currencyOfPayment.equals(other.getCurrencyOfPayment()))) &&
            ((this.contactEmploymentDetails==null && other.getContactEmploymentDetails()==null) || 
             (this.contactEmploymentDetails!=null &&
              java.util.Arrays.equals(this.contactEmploymentDetails, other.getContactEmploymentDetails())));
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
        if (getTotalIncomeAmount() != null) {
            _hashCode += getTotalIncomeAmount().hashCode();
        }
        if (getCurrencyOfPayment() != null) {
            _hashCode += getCurrencyOfPayment().hashCode();
        }
        if (getContactEmploymentDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactEmploymentDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactEmploymentDetails(), i);
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
        new org.apache.axis.description.TypeDesc(CmecGetEmploymentDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmploymentDetailsResponse", "CmecGetEmploymentDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalIncomeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalIncomeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyOfPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrencyOfPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactEmploymentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactEmploymentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalEmploymentDetails", "CmecEPortalEmploymentDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EmploymentDetails"));
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
