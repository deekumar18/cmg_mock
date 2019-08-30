/**
 * AttachmentTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.AttachmentTemplate;

public class AttachmentTemplate  implements java.io.Serializable {
    private java.lang.String attachmentTemplateCode;

    public AttachmentTemplate() {
    }

    public AttachmentTemplate(
           java.lang.String attachmentTemplateCode) {
           this.attachmentTemplateCode = attachmentTemplateCode;
    }


    /**
     * Gets the attachmentTemplateCode value for this AttachmentTemplate.
     * 
     * @return attachmentTemplateCode
     */
    public java.lang.String getAttachmentTemplateCode() {
        return attachmentTemplateCode;
    }


    /**
     * Sets the attachmentTemplateCode value for this AttachmentTemplate.
     * 
     * @param attachmentTemplateCode
     */
    public void setAttachmentTemplateCode(java.lang.String attachmentTemplateCode) {
        this.attachmentTemplateCode = attachmentTemplateCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachmentTemplate)) return false;
        AttachmentTemplate other = (AttachmentTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachmentTemplateCode==null && other.getAttachmentTemplateCode()==null) || 
             (this.attachmentTemplateCode!=null &&
              this.attachmentTemplateCode.equals(other.getAttachmentTemplateCode())));
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
        if (getAttachmentTemplateCode() != null) {
            _hashCode += getAttachmentTemplateCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttachmentTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/AttachmentTemplate", "AttachmentTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentTemplateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttachmentTemplateCode"));
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
