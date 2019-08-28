/**
 * CmecGetEmploymentDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmploymentDetailsRequest;

public class CmecGetEmploymentDetailsRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String SCIN;

    private java.lang.String contactId;

    public CmecGetEmploymentDetailsRequest() {
    }

    public CmecGetEmploymentDetailsRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String SCIN,
           java.lang.String contactId) {
           this.requestHeader = requestHeader;
           this.SCIN = SCIN;
           this.contactId = contactId;
    }


    /**
     * Gets the requestHeader value for this CmecGetEmploymentDetailsRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CmecGetEmploymentDetailsRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the SCIN value for this CmecGetEmploymentDetailsRequest.
     * 
     * @return SCIN
     */
    public java.lang.String getSCIN() {
        return SCIN;
    }


    /**
     * Sets the SCIN value for this CmecGetEmploymentDetailsRequest.
     * 
     * @param SCIN
     */
    public void setSCIN(java.lang.String SCIN) {
        this.SCIN = SCIN;
    }


    /**
     * Gets the contactId value for this CmecGetEmploymentDetailsRequest.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this CmecGetEmploymentDetailsRequest.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecGetEmploymentDetailsRequest)) return false;
        CmecGetEmploymentDetailsRequest other = (CmecGetEmploymentDetailsRequest) obj;
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
            ((this.SCIN==null && other.getSCIN()==null) || 
             (this.SCIN!=null &&
              this.SCIN.equals(other.getSCIN()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId())));
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
        if (getSCIN() != null) {
            _hashCode += getSCIN().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecGetEmploymentDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmploymentDetailsRequest", "CmecGetEmploymentDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactId"));
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
