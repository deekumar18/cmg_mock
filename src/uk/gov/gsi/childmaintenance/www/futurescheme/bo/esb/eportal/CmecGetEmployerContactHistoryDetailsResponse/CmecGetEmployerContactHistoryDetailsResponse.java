/**
 * CmecGetEmployerContactHistoryDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerContactHistoryDetailsResponse;

public class CmecGetEmployerContactHistoryDetailsResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader;

    private java.lang.String ERN;

    private java.lang.String employerID;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails[] employerContactHistory;

    public CmecGetEmployerContactHistoryDetailsResponse() {
    }

    public CmecGetEmployerContactHistoryDetailsResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader,
           java.lang.String ERN,
           java.lang.String employerID,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails[] employerContactHistory) {
           this.responseHeader = responseHeader;
           this.ERN = ERN;
           this.employerID = employerID;
           this.employerContactHistory = employerContactHistory;
    }


    /**
     * Gets the responseHeader value for this CmecGetEmployerContactHistoryDetailsResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CmecGetEmployerContactHistoryDetailsResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the ERN value for this CmecGetEmployerContactHistoryDetailsResponse.
     * 
     * @return ERN
     */
    public java.lang.String getERN() {
        return ERN;
    }


    /**
     * Sets the ERN value for this CmecGetEmployerContactHistoryDetailsResponse.
     * 
     * @param ERN
     */
    public void setERN(java.lang.String ERN) {
        this.ERN = ERN;
    }


    /**
     * Gets the employerID value for this CmecGetEmployerContactHistoryDetailsResponse.
     * 
     * @return employerID
     */
    public java.lang.String getEmployerID() {
        return employerID;
    }


    /**
     * Sets the employerID value for this CmecGetEmployerContactHistoryDetailsResponse.
     * 
     * @param employerID
     */
    public void setEmployerID(java.lang.String employerID) {
        this.employerID = employerID;
    }


    /**
     * Gets the employerContactHistory value for this CmecGetEmployerContactHistoryDetailsResponse.
     * 
     * @return employerContactHistory
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails[] getEmployerContactHistory() {
        return employerContactHistory;
    }


    /**
     * Sets the employerContactHistory value for this CmecGetEmployerContactHistoryDetailsResponse.
     * 
     * @param employerContactHistory
     */
    public void setEmployerContactHistory(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails[] employerContactHistory) {
        this.employerContactHistory = employerContactHistory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecGetEmployerContactHistoryDetailsResponse)) return false;
        CmecGetEmployerContactHistoryDetailsResponse other = (CmecGetEmployerContactHistoryDetailsResponse) obj;
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
            ((this.ERN==null && other.getERN()==null) || 
             (this.ERN!=null &&
              this.ERN.equals(other.getERN()))) &&
            ((this.employerID==null && other.getEmployerID()==null) || 
             (this.employerID!=null &&
              this.employerID.equals(other.getEmployerID()))) &&
            ((this.employerContactHistory==null && other.getEmployerContactHistory()==null) || 
             (this.employerContactHistory!=null &&
              java.util.Arrays.equals(this.employerContactHistory, other.getEmployerContactHistory())));
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
        if (getERN() != null) {
            _hashCode += getERN().hashCode();
        }
        if (getEmployerID() != null) {
            _hashCode += getEmployerID().hashCode();
        }
        if (getEmployerContactHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployerContactHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployerContactHistory(), i);
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
        new org.apache.axis.description.TypeDesc(CmecGetEmployerContactHistoryDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmployerContactHistoryDetailsResponse", "CmecGetEmployerContactHistoryDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerContactHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerContactHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalClientContactHistDetails", "CmecEPortalContactHistDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CmecContactHistoryDetails"));
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
