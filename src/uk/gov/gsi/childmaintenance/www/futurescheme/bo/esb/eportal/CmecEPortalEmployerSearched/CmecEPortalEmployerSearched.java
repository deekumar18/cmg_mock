/**
 * CmecEPortalEmployerSearched.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmployerSearched;

public class CmecEPortalEmployerSearched  implements java.io.Serializable {
    private java.lang.String employerName;

    private java.lang.String employerId;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] employerAddress;

    public CmecEPortalEmployerSearched() {
    }

    public CmecEPortalEmployerSearched(
           java.lang.String employerName,
           java.lang.String employerId,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] employerAddress) {
           this.employerName = employerName;
           this.employerId = employerId;
           this.employerAddress = employerAddress;
    }


    /**
     * Gets the employerName value for this CmecEPortalEmployerSearched.
     * 
     * @return employerName
     */
    public java.lang.String getEmployerName() {
        return employerName;
    }


    /**
     * Sets the employerName value for this CmecEPortalEmployerSearched.
     * 
     * @param employerName
     */
    public void setEmployerName(java.lang.String employerName) {
        this.employerName = employerName;
    }


    /**
     * Gets the employerId value for this CmecEPortalEmployerSearched.
     * 
     * @return employerId
     */
    public java.lang.String getEmployerId() {
        return employerId;
    }


    /**
     * Sets the employerId value for this CmecEPortalEmployerSearched.
     * 
     * @param employerId
     */
    public void setEmployerId(java.lang.String employerId) {
        this.employerId = employerId;
    }


    /**
     * Gets the employerAddress value for this CmecEPortalEmployerSearched.
     * 
     * @return employerAddress
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] getEmployerAddress() {
        return employerAddress;
    }


    /**
     * Sets the employerAddress value for this CmecEPortalEmployerSearched.
     * 
     * @param employerAddress
     */
    public void setEmployerAddress(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] employerAddress) {
        this.employerAddress = employerAddress;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress getEmployerAddress(int i) {
        return this.employerAddress[i];
    }

    public void setEmployerAddress(int i, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress _value) {
        this.employerAddress[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalEmployerSearched)) return false;
        CmecEPortalEmployerSearched other = (CmecEPortalEmployerSearched) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employerName==null && other.getEmployerName()==null) || 
             (this.employerName!=null &&
              this.employerName.equals(other.getEmployerName()))) &&
            ((this.employerId==null && other.getEmployerId()==null) || 
             (this.employerId!=null &&
              this.employerId.equals(other.getEmployerId()))) &&
            ((this.employerAddress==null && other.getEmployerAddress()==null) || 
             (this.employerAddress!=null &&
              java.util.Arrays.equals(this.employerAddress, other.getEmployerAddress())));
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
        if (getEmployerName() != null) {
            _hashCode += getEmployerName().hashCode();
        }
        if (getEmployerId() != null) {
            _hashCode += getEmployerId().hashCode();
        }
        if (getEmployerAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployerAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployerAddress(), i);
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
        new org.apache.axis.description.TypeDesc(CmecEPortalEmployerSearched.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalEmployerSearched", "CmecEPortalEmployerSearched"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalAddress", "CmecEPortalAddress"));
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
