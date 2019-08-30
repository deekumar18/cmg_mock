/**
 * CmecGetClientContactHistoryDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientContactHistoryDetailsResponse;

public class CmecGetClientContactHistoryDetailsResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader;

    private java.lang.String SCIN;

    private java.lang.String personID;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails[] clientContactHistory;

    public CmecGetClientContactHistoryDetailsResponse() {
    }

    public CmecGetClientContactHistoryDetailsResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader,
           java.lang.String SCIN,
           java.lang.String personID,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails[] clientContactHistory) {
           this.responseHeader = responseHeader;
           this.SCIN = SCIN;
           this.personID = personID;
           this.clientContactHistory = clientContactHistory;
    }


    /**
     * Gets the responseHeader value for this CmecGetClientContactHistoryDetailsResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CmecGetClientContactHistoryDetailsResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the SCIN value for this CmecGetClientContactHistoryDetailsResponse.
     * 
     * @return SCIN
     */
    public java.lang.String getSCIN() {
        return SCIN;
    }


    /**
     * Sets the SCIN value for this CmecGetClientContactHistoryDetailsResponse.
     * 
     * @param SCIN
     */
    public void setSCIN(java.lang.String SCIN) {
        this.SCIN = SCIN;
    }


    /**
     * Gets the personID value for this CmecGetClientContactHistoryDetailsResponse.
     * 
     * @return personID
     */
    public java.lang.String getPersonID() {
        return personID;
    }


    /**
     * Sets the personID value for this CmecGetClientContactHistoryDetailsResponse.
     * 
     * @param personID
     */
    public void setPersonID(java.lang.String personID) {
        this.personID = personID;
    }


    /**
     * Gets the clientContactHistory value for this CmecGetClientContactHistoryDetailsResponse.
     * 
     * @return clientContactHistory
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails[] getClientContactHistory() {
        return clientContactHistory;
    }


    /**
     * Sets the clientContactHistory value for this CmecGetClientContactHistoryDetailsResponse.
     * 
     * @param clientContactHistory
     */
    public void setClientContactHistory(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails.CmecEPortalContactHistDetails[] clientContactHistory) {
        this.clientContactHistory = clientContactHistory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecGetClientContactHistoryDetailsResponse)) return false;
        CmecGetClientContactHistoryDetailsResponse other = (CmecGetClientContactHistoryDetailsResponse) obj;
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
            ((this.SCIN==null && other.getSCIN()==null) || 
             (this.SCIN!=null &&
              this.SCIN.equals(other.getSCIN()))) &&
            ((this.personID==null && other.getPersonID()==null) || 
             (this.personID!=null &&
              this.personID.equals(other.getPersonID()))) &&
            ((this.clientContactHistory==null && other.getClientContactHistory()==null) || 
             (this.clientContactHistory!=null &&
              java.util.Arrays.equals(this.clientContactHistory, other.getClientContactHistory())));
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
        if (getSCIN() != null) {
            _hashCode += getSCIN().hashCode();
        }
        if (getPersonID() != null) {
            _hashCode += getPersonID().hashCode();
        }
        if (getClientContactHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientContactHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientContactHistory(), i);
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
        new org.apache.axis.description.TypeDesc(CmecGetClientContactHistoryDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetClientContactHistoryDetailsResponse", "CmecGetClientContactHistoryDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PersonID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientContactHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientContactHistory"));
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
