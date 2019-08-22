/**
 * CmecEPortalDocumentDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalDocumentDetails;

public class CmecEPortalDocumentDetails  implements java.io.Serializable {
    private java.lang.String docId;

    private java.lang.String clientFacingName;

    private java.lang.String language;

    private java.lang.String templateCode;

    public CmecEPortalDocumentDetails() {
    }

    public CmecEPortalDocumentDetails(
           java.lang.String docId,
           java.lang.String clientFacingName,
           java.lang.String language,
           java.lang.String templateCode) {
           this.docId = docId;
           this.clientFacingName = clientFacingName;
           this.language = language;
           this.templateCode = templateCode;
    }


    /**
     * Gets the docId value for this CmecEPortalDocumentDetails.
     * 
     * @return docId
     */
    public java.lang.String getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this CmecEPortalDocumentDetails.
     * 
     * @param docId
     */
    public void setDocId(java.lang.String docId) {
        this.docId = docId;
    }


    /**
     * Gets the clientFacingName value for this CmecEPortalDocumentDetails.
     * 
     * @return clientFacingName
     */
    public java.lang.String getClientFacingName() {
        return clientFacingName;
    }


    /**
     * Sets the clientFacingName value for this CmecEPortalDocumentDetails.
     * 
     * @param clientFacingName
     */
    public void setClientFacingName(java.lang.String clientFacingName) {
        this.clientFacingName = clientFacingName;
    }


    /**
     * Gets the language value for this CmecEPortalDocumentDetails.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this CmecEPortalDocumentDetails.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the templateCode value for this CmecEPortalDocumentDetails.
     * 
     * @return templateCode
     */
    public java.lang.String getTemplateCode() {
        return templateCode;
    }


    /**
     * Sets the templateCode value for this CmecEPortalDocumentDetails.
     * 
     * @param templateCode
     */
    public void setTemplateCode(java.lang.String templateCode) {
        this.templateCode = templateCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalDocumentDetails)) return false;
        CmecEPortalDocumentDetails other = (CmecEPortalDocumentDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docId==null && other.getDocId()==null) || 
             (this.docId!=null &&
              this.docId.equals(other.getDocId()))) &&
            ((this.clientFacingName==null && other.getClientFacingName()==null) || 
             (this.clientFacingName!=null &&
              this.clientFacingName.equals(other.getClientFacingName()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.templateCode==null && other.getTemplateCode()==null) || 
             (this.templateCode!=null &&
              this.templateCode.equals(other.getTemplateCode())));
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
        if (getDocId() != null) {
            _hashCode += getDocId().hashCode();
        }
        if (getClientFacingName() != null) {
            _hashCode += getClientFacingName().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getTemplateCode() != null) {
            _hashCode += getTemplateCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalDocumentDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalDocumentDetails", "CmecEPortalDocumentDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientFacingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientFacingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TemplateCode"));
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
