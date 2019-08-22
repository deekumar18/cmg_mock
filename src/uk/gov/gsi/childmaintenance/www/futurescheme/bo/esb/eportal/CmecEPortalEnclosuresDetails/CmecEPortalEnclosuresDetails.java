/**
 * CmecEPortalEnclosuresDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEnclosuresDetails;

public class CmecEPortalEnclosuresDetails  implements java.io.Serializable {
    private java.lang.String enclosureDocId;

    public CmecEPortalEnclosuresDetails() {
    }

    public CmecEPortalEnclosuresDetails(
           java.lang.String enclosureDocId) {
           this.enclosureDocId = enclosureDocId;
    }


    /**
     * Gets the enclosureDocId value for this CmecEPortalEnclosuresDetails.
     * 
     * @return enclosureDocId
     */
    public java.lang.String getEnclosureDocId() {
        return enclosureDocId;
    }


    /**
     * Sets the enclosureDocId value for this CmecEPortalEnclosuresDetails.
     * 
     * @param enclosureDocId
     */
    public void setEnclosureDocId(java.lang.String enclosureDocId) {
        this.enclosureDocId = enclosureDocId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalEnclosuresDetails)) return false;
        CmecEPortalEnclosuresDetails other = (CmecEPortalEnclosuresDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enclosureDocId==null && other.getEnclosureDocId()==null) || 
             (this.enclosureDocId!=null &&
              this.enclosureDocId.equals(other.getEnclosureDocId())));
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
        if (getEnclosureDocId() != null) {
            _hashCode += getEnclosureDocId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalEnclosuresDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalEnclosuresDetails", "CmecEPortalEnclosuresDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enclosureDocId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EnclosureDocId"));
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
