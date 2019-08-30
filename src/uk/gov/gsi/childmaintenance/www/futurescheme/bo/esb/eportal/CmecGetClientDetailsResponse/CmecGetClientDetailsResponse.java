/**
 * CmecGetClientDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientDetailsResponse;

public class CmecGetClientDetailsResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails clientDetails;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] clientAddress;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalHLSCaseDetails.CmecEPortalHLSCaseDetails[] cientHLSCaseDetails;

    public CmecGetClientDetailsResponse() {
    }

    public CmecGetClientDetailsResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails clientDetails,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] clientAddress,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalHLSCaseDetails.CmecEPortalHLSCaseDetails[] cientHLSCaseDetails) {
           this.responseHeader = responseHeader;
           this.clientDetails = clientDetails;
           this.clientAddress = clientAddress;
           this.cientHLSCaseDetails = cientHLSCaseDetails;
    }


    /**
     * Gets the responseHeader value for this CmecGetClientDetailsResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CmecGetClientDetailsResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the clientDetails value for this CmecGetClientDetailsResponse.
     * 
     * @return clientDetails
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails getClientDetails() {
        return clientDetails;
    }


    /**
     * Sets the clientDetails value for this CmecGetClientDetailsResponse.
     * 
     * @param clientDetails
     */
    public void setClientDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails clientDetails) {
        this.clientDetails = clientDetails;
    }


    /**
     * Gets the clientAddress value for this CmecGetClientDetailsResponse.
     * 
     * @return clientAddress
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] getClientAddress() {
        return clientAddress;
    }


    /**
     * Sets the clientAddress value for this CmecGetClientDetailsResponse.
     * 
     * @param clientAddress
     */
    public void setClientAddress(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] clientAddress) {
        this.clientAddress = clientAddress;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress getClientAddress(int i) {
        return this.clientAddress[i];
    }

    public void setClientAddress(int i, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress _value) {
        this.clientAddress[i] = _value;
    }


    /**
     * Gets the cientHLSCaseDetails value for this CmecGetClientDetailsResponse.
     * 
     * @return cientHLSCaseDetails
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalHLSCaseDetails.CmecEPortalHLSCaseDetails[] getCientHLSCaseDetails() {
        return cientHLSCaseDetails;
    }


    /**
     * Sets the cientHLSCaseDetails value for this CmecGetClientDetailsResponse.
     * 
     * @param cientHLSCaseDetails
     */
    public void setCientHLSCaseDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalHLSCaseDetails.CmecEPortalHLSCaseDetails[] cientHLSCaseDetails) {
        this.cientHLSCaseDetails = cientHLSCaseDetails;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalHLSCaseDetails.CmecEPortalHLSCaseDetails getCientHLSCaseDetails(int i) {
        return this.cientHLSCaseDetails[i];
    }

    public void setCientHLSCaseDetails(int i, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalHLSCaseDetails.CmecEPortalHLSCaseDetails _value) {
        this.cientHLSCaseDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecGetClientDetailsResponse)) return false;
        CmecGetClientDetailsResponse other = (CmecGetClientDetailsResponse) obj;
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
            ((this.clientDetails==null && other.getClientDetails()==null) || 
             (this.clientDetails!=null &&
              this.clientDetails.equals(other.getClientDetails()))) &&
            ((this.clientAddress==null && other.getClientAddress()==null) || 
             (this.clientAddress!=null &&
              java.util.Arrays.equals(this.clientAddress, other.getClientAddress()))) &&
            ((this.cientHLSCaseDetails==null && other.getCientHLSCaseDetails()==null) || 
             (this.cientHLSCaseDetails!=null &&
              java.util.Arrays.equals(this.cientHLSCaseDetails, other.getCientHLSCaseDetails())));
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
        if (getClientDetails() != null) {
            _hashCode += getClientDetails().hashCode();
        }
        if (getClientAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCientHLSCaseDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCientHLSCaseDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCientHLSCaseDetails(), i);
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
        new org.apache.axis.description.TypeDesc(CmecGetClientDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetClientDetailsResponse", "CmecGetClientDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalContactDetails", "CmecEPortalContactDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalAddress", "CmecEPortalAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cientHLSCaseDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CientHLSCaseDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalHLSCaseDetails", "CmecEPortalHLSCaseDetails"));
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
