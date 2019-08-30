/**
 * InqDEODiffDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffResponse;

public class InqDEODiffDetails  implements java.io.Serializable {
    private java.lang.String lastName;

    private java.lang.String firstName;

    private java.lang.String nrpNINO;

    private java.lang.String id;

    private java.lang.String oldNDR;

    private java.lang.String newNDR;

    public InqDEODiffDetails() {
    }

    public InqDEODiffDetails(
           java.lang.String lastName,
           java.lang.String firstName,
           java.lang.String nrpNINO,
           java.lang.String id,
           java.lang.String oldNDR,
           java.lang.String newNDR) {
           this.lastName = lastName;
           this.firstName = firstName;
           this.nrpNINO = nrpNINO;
           this.id = id;
           this.oldNDR = oldNDR;
           this.newNDR = newNDR;
    }


    /**
     * Gets the lastName value for this InqDEODiffDetails.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this InqDEODiffDetails.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the firstName value for this InqDEODiffDetails.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this InqDEODiffDetails.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the nrpNINO value for this InqDEODiffDetails.
     * 
     * @return nrpNINO
     */
    public java.lang.String getNrpNINO() {
        return nrpNINO;
    }


    /**
     * Sets the nrpNINO value for this InqDEODiffDetails.
     * 
     * @param nrpNINO
     */
    public void setNrpNINO(java.lang.String nrpNINO) {
        this.nrpNINO = nrpNINO;
    }


    /**
     * Gets the id value for this InqDEODiffDetails.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this InqDEODiffDetails.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the oldNDR value for this InqDEODiffDetails.
     * 
     * @return oldNDR
     */
    public java.lang.String getOldNDR() {
        return oldNDR;
    }


    /**
     * Sets the oldNDR value for this InqDEODiffDetails.
     * 
     * @param oldNDR
     */
    public void setOldNDR(java.lang.String oldNDR) {
        this.oldNDR = oldNDR;
    }


    /**
     * Gets the newNDR value for this InqDEODiffDetails.
     * 
     * @return newNDR
     */
    public java.lang.String getNewNDR() {
        return newNDR;
    }


    /**
     * Sets the newNDR value for this InqDEODiffDetails.
     * 
     * @param newNDR
     */
    public void setNewNDR(java.lang.String newNDR) {
        this.newNDR = newNDR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InqDEODiffDetails)) return false;
        InqDEODiffDetails other = (InqDEODiffDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.nrpNINO==null && other.getNrpNINO()==null) || 
             (this.nrpNINO!=null &&
              this.nrpNINO.equals(other.getNrpNINO()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.oldNDR==null && other.getOldNDR()==null) || 
             (this.oldNDR!=null &&
              this.oldNDR.equals(other.getOldNDR()))) &&
            ((this.newNDR==null && other.getNewNDR()==null) || 
             (this.newNDR!=null &&
              this.newNDR.equals(other.getNewNDR())));
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
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getNrpNINO() != null) {
            _hashCode += getNrpNINO().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOldNDR() != null) {
            _hashCode += getOldNDR().hashCode();
        }
        if (getNewNDR() != null) {
            _hashCode += getNewNDR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InqDEODiffDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECInqDEODiffResponse", "InqDEODiffDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrpNINO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nrpNINO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldNDR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldNDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newNDR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newNDR"));
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
