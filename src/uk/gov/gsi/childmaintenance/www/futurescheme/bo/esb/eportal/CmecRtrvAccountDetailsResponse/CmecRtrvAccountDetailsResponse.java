/**
 * CmecRtrvAccountDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecRtrvAccountDetailsResponse;

public class CmecRtrvAccountDetailsResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails[] finCorpAccntDtls;

    public CmecRtrvAccountDetailsResponse() {
    }

    public CmecRtrvAccountDetailsResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails[] finCorpAccntDtls) {
           this.responseHeader = responseHeader;
           this.finCorpAccntDtls = finCorpAccntDtls;
    }


    /**
     * Gets the responseHeader value for this CmecRtrvAccountDetailsResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CmecRtrvAccountDetailsResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the finCorpAccntDtls value for this CmecRtrvAccountDetailsResponse.
     * 
     * @return finCorpAccntDtls
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails[] getFinCorpAccntDtls() {
        return finCorpAccntDtls;
    }


    /**
     * Sets the finCorpAccntDtls value for this CmecRtrvAccountDetailsResponse.
     * 
     * @param finCorpAccntDtls
     */
    public void setFinCorpAccntDtls(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails[] finCorpAccntDtls) {
        this.finCorpAccntDtls = finCorpAccntDtls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecRtrvAccountDetailsResponse)) return false;
        CmecRtrvAccountDetailsResponse other = (CmecRtrvAccountDetailsResponse) obj;
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
            ((this.finCorpAccntDtls==null && other.getFinCorpAccntDtls()==null) || 
             (this.finCorpAccntDtls!=null &&
              java.util.Arrays.equals(this.finCorpAccntDtls, other.getFinCorpAccntDtls())));
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
        if (getFinCorpAccntDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinCorpAccntDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinCorpAccntDtls(), i);
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
        new org.apache.axis.description.TypeDesc(CmecRtrvAccountDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecRtrvAccountDetailsResponse", "CmecRtrvAccountDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finCorpAccntDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FinCorpAccntDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalFinCorpAccountDetails", "CmecEPortalFinCorpAccountDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "FinCorpAccntDtls"));
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
