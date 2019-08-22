/**
 * CmecEPortalCaseContactDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalCaseContactDetails;

public class CmecEPortalCaseContactDetails  implements java.io.Serializable {
    private java.lang.String contactFirstName;

    private java.lang.String contactLastName;

    private java.lang.String contactCaseRelation;

    private java.lang.String contactId;

    private java.lang.String contactBANCSAccNum;

    private java.lang.String contactGender;

    private java.lang.String contactSCIN;

    private java.lang.String parentage;

    private java.lang.String birthDate;

    public CmecEPortalCaseContactDetails() {
    }

    public CmecEPortalCaseContactDetails(
           java.lang.String contactFirstName,
           java.lang.String contactLastName,
           java.lang.String contactCaseRelation,
           java.lang.String contactId,
           java.lang.String contactBANCSAccNum,
           java.lang.String contactGender,
           java.lang.String contactSCIN,
           java.lang.String parentage,
           java.lang.String birthDate) {
           this.contactFirstName = contactFirstName;
           this.contactLastName = contactLastName;
           this.contactCaseRelation = contactCaseRelation;
           this.contactId = contactId;
           this.contactBANCSAccNum = contactBANCSAccNum;
           this.contactGender = contactGender;
           this.contactSCIN = contactSCIN;
           this.parentage = parentage;
           this.birthDate = birthDate;
    }


    /**
     * Gets the contactFirstName value for this CmecEPortalCaseContactDetails.
     * 
     * @return contactFirstName
     */
    public java.lang.String getContactFirstName() {
        return contactFirstName;
    }


    /**
     * Sets the contactFirstName value for this CmecEPortalCaseContactDetails.
     * 
     * @param contactFirstName
     */
    public void setContactFirstName(java.lang.String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }


    /**
     * Gets the contactLastName value for this CmecEPortalCaseContactDetails.
     * 
     * @return contactLastName
     */
    public java.lang.String getContactLastName() {
        return contactLastName;
    }


    /**
     * Sets the contactLastName value for this CmecEPortalCaseContactDetails.
     * 
     * @param contactLastName
     */
    public void setContactLastName(java.lang.String contactLastName) {
        this.contactLastName = contactLastName;
    }


    /**
     * Gets the contactCaseRelation value for this CmecEPortalCaseContactDetails.
     * 
     * @return contactCaseRelation
     */
    public java.lang.String getContactCaseRelation() {
        return contactCaseRelation;
    }


    /**
     * Sets the contactCaseRelation value for this CmecEPortalCaseContactDetails.
     * 
     * @param contactCaseRelation
     */
    public void setContactCaseRelation(java.lang.String contactCaseRelation) {
        this.contactCaseRelation = contactCaseRelation;
    }


    /**
     * Gets the contactId value for this CmecEPortalCaseContactDetails.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this CmecEPortalCaseContactDetails.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the contactBANCSAccNum value for this CmecEPortalCaseContactDetails.
     * 
     * @return contactBANCSAccNum
     */
    public java.lang.String getContactBANCSAccNum() {
        return contactBANCSAccNum;
    }


    /**
     * Sets the contactBANCSAccNum value for this CmecEPortalCaseContactDetails.
     * 
     * @param contactBANCSAccNum
     */
    public void setContactBANCSAccNum(java.lang.String contactBANCSAccNum) {
        this.contactBANCSAccNum = contactBANCSAccNum;
    }


    /**
     * Gets the contactGender value for this CmecEPortalCaseContactDetails.
     * 
     * @return contactGender
     */
    public java.lang.String getContactGender() {
        return contactGender;
    }


    /**
     * Sets the contactGender value for this CmecEPortalCaseContactDetails.
     * 
     * @param contactGender
     */
    public void setContactGender(java.lang.String contactGender) {
        this.contactGender = contactGender;
    }


    /**
     * Gets the contactSCIN value for this CmecEPortalCaseContactDetails.
     * 
     * @return contactSCIN
     */
    public java.lang.String getContactSCIN() {
        return contactSCIN;
    }


    /**
     * Sets the contactSCIN value for this CmecEPortalCaseContactDetails.
     * 
     * @param contactSCIN
     */
    public void setContactSCIN(java.lang.String contactSCIN) {
        this.contactSCIN = contactSCIN;
    }


    /**
     * Gets the parentage value for this CmecEPortalCaseContactDetails.
     * 
     * @return parentage
     */
    public java.lang.String getParentage() {
        return parentage;
    }


    /**
     * Sets the parentage value for this CmecEPortalCaseContactDetails.
     * 
     * @param parentage
     */
    public void setParentage(java.lang.String parentage) {
        this.parentage = parentage;
    }


    /**
     * Gets the birthDate value for this CmecEPortalCaseContactDetails.
     * 
     * @return birthDate
     */
    public java.lang.String getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this CmecEPortalCaseContactDetails.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.lang.String birthDate) {
        this.birthDate = birthDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalCaseContactDetails)) return false;
        CmecEPortalCaseContactDetails other = (CmecEPortalCaseContactDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactFirstName==null && other.getContactFirstName()==null) || 
             (this.contactFirstName!=null &&
              this.contactFirstName.equals(other.getContactFirstName()))) &&
            ((this.contactLastName==null && other.getContactLastName()==null) || 
             (this.contactLastName!=null &&
              this.contactLastName.equals(other.getContactLastName()))) &&
            ((this.contactCaseRelation==null && other.getContactCaseRelation()==null) || 
             (this.contactCaseRelation!=null &&
              this.contactCaseRelation.equals(other.getContactCaseRelation()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.contactBANCSAccNum==null && other.getContactBANCSAccNum()==null) || 
             (this.contactBANCSAccNum!=null &&
              this.contactBANCSAccNum.equals(other.getContactBANCSAccNum()))) &&
            ((this.contactGender==null && other.getContactGender()==null) || 
             (this.contactGender!=null &&
              this.contactGender.equals(other.getContactGender()))) &&
            ((this.contactSCIN==null && other.getContactSCIN()==null) || 
             (this.contactSCIN!=null &&
              this.contactSCIN.equals(other.getContactSCIN()))) &&
            ((this.parentage==null && other.getParentage()==null) || 
             (this.parentage!=null &&
              this.parentage.equals(other.getParentage()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate())));
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
        if (getContactFirstName() != null) {
            _hashCode += getContactFirstName().hashCode();
        }
        if (getContactLastName() != null) {
            _hashCode += getContactLastName().hashCode();
        }
        if (getContactCaseRelation() != null) {
            _hashCode += getContactCaseRelation().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getContactBANCSAccNum() != null) {
            _hashCode += getContactBANCSAccNum().hashCode();
        }
        if (getContactGender() != null) {
            _hashCode += getContactGender().hashCode();
        }
        if (getContactSCIN() != null) {
            _hashCode += getContactSCIN().hashCode();
        }
        if (getParentage() != null) {
            _hashCode += getParentage().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalCaseContactDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalCaseContactDetails", "CmecEPortalCaseContactDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactCaseRelation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactCaseRelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactBANCSAccNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactBANCSAccNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactGender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactGender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactSCIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactSCIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BirthDate"));
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
