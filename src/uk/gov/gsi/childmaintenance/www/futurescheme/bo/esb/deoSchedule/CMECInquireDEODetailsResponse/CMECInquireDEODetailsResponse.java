/**
 * CMECInquireDEODetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse;

public class CMECInquireDEODetailsResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.InquireDEOResponse inquireDEOResponse;

    public CMECInquireDEODetailsResponse() {
    }

    public CMECInquireDEODetailsResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.InquireDEOResponse inquireDEOResponse) {
           this.responseHeader = responseHeader;
           this.inquireDEOResponse = inquireDEOResponse;
    }


    /**
     * Gets the responseHeader value for this CMECInquireDEODetailsResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CMECInquireDEODetailsResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the inquireDEOResponse value for this CMECInquireDEODetailsResponse.
     * 
     * @return inquireDEOResponse
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.InquireDEOResponse getInquireDEOResponse() {
        return inquireDEOResponse;
    }


    /**
     * Sets the inquireDEOResponse value for this CMECInquireDEODetailsResponse.
     * 
     * @param inquireDEOResponse
     */
    public void setInquireDEOResponse(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.InquireDEOResponse inquireDEOResponse) {
        this.inquireDEOResponse = inquireDEOResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMECInquireDEODetailsResponse)) return false;
        CMECInquireDEODetailsResponse other = (CMECInquireDEODetailsResponse) obj;
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
            ((this.inquireDEOResponse==null && other.getInquireDEOResponse()==null) || 
             (this.inquireDEOResponse!=null &&
              this.inquireDEOResponse.equals(other.getInquireDEOResponse())));
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
        if (getInquireDEOResponse() != null) {
            _hashCode += getInquireDEOResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMECInquireDEODetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECInquireDEODetailsResponse", "CMECInquireDEODetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquireDEOResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InquireDEOResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECInquireDEODetailsResponse", "InquireDEOResponse"));
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
