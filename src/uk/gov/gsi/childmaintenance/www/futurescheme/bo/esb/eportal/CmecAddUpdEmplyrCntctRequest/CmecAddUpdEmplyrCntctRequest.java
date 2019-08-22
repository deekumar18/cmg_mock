/**
 * CmecAddUpdEmplyrCntctRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecAddUpdEmplyrCntctRequest;

public class CmecAddUpdEmplyrCntctRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String ern;

    private java.lang.String rowId;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails employerContact;

    public CmecAddUpdEmplyrCntctRequest() {
    }

    public CmecAddUpdEmplyrCntctRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String ern,
           java.lang.String rowId,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails employerContact) {
           this.requestHeader = requestHeader;
           this.ern = ern;
           this.rowId = rowId;
           this.employerContact = employerContact;
    }


    /**
     * Gets the requestHeader value for this CmecAddUpdEmplyrCntctRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CmecAddUpdEmplyrCntctRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the ern value for this CmecAddUpdEmplyrCntctRequest.
     * 
     * @return ern
     */
    public java.lang.String getErn() {
        return ern;
    }


    /**
     * Sets the ern value for this CmecAddUpdEmplyrCntctRequest.
     * 
     * @param ern
     */
    public void setErn(java.lang.String ern) {
        this.ern = ern;
    }


    /**
     * Gets the rowId value for this CmecAddUpdEmplyrCntctRequest.
     * 
     * @return rowId
     */
    public java.lang.String getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this CmecAddUpdEmplyrCntctRequest.
     * 
     * @param rowId
     */
    public void setRowId(java.lang.String rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the employerContact value for this CmecAddUpdEmplyrCntctRequest.
     * 
     * @return employerContact
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails getEmployerContact() {
        return employerContact;
    }


    /**
     * Sets the employerContact value for this CmecAddUpdEmplyrCntctRequest.
     * 
     * @param employerContact
     */
    public void setEmployerContact(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails employerContact) {
        this.employerContact = employerContact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecAddUpdEmplyrCntctRequest)) return false;
        CmecAddUpdEmplyrCntctRequest other = (CmecAddUpdEmplyrCntctRequest) obj;
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
            ((this.ern==null && other.getErn()==null) || 
             (this.ern!=null &&
              this.ern.equals(other.getErn()))) &&
            ((this.rowId==null && other.getRowId()==null) || 
             (this.rowId!=null &&
              this.rowId.equals(other.getRowId()))) &&
            ((this.employerContact==null && other.getEmployerContact()==null) || 
             (this.employerContact!=null &&
              this.employerContact.equals(other.getEmployerContact())));
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
        if (getErn() != null) {
            _hashCode += getErn().hashCode();
        }
        if (getRowId() != null) {
            _hashCode += getRowId().hashCode();
        }
        if (getEmployerContact() != null) {
            _hashCode += getEmployerContact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecAddUpdEmplyrCntctRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecAddUpdEmplyrCntctRequest", "CmecAddUpdEmplyrCntctRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rowId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employerContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalContactDetails", "CmecEPortalContactDetails"));
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
