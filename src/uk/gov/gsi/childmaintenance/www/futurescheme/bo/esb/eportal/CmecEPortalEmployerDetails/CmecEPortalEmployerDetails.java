/**
 * CmecEPortalEmployerDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmployerDetails;

public class CmecEPortalEmployerDetails  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String employerRefNum;

    private java.lang.String employerID;

    private java.lang.String preferedCommunicationMethod;

    private java.lang.String armedForcesFlag;

    private java.lang.String emailAddress;

    private java.lang.String actionMode;

    public CmecEPortalEmployerDetails() {
    }

    public CmecEPortalEmployerDetails(
           java.lang.String name,
           java.lang.String employerRefNum,
           java.lang.String employerID,
           java.lang.String preferedCommunicationMethod,
           java.lang.String armedForcesFlag,
           java.lang.String emailAddress,
           java.lang.String actionMode) {
           this.name = name;
           this.employerRefNum = employerRefNum;
           this.employerID = employerID;
           this.preferedCommunicationMethod = preferedCommunicationMethod;
           this.armedForcesFlag = armedForcesFlag;
           this.emailAddress = emailAddress;
           this.actionMode = actionMode;
    }


    /**
     * Gets the name value for this CmecEPortalEmployerDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CmecEPortalEmployerDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the employerRefNum value for this CmecEPortalEmployerDetails.
     * 
     * @return employerRefNum
     */
    public java.lang.String getEmployerRefNum() {
        return employerRefNum;
    }


    /**
     * Sets the employerRefNum value for this CmecEPortalEmployerDetails.
     * 
     * @param employerRefNum
     */
    public void setEmployerRefNum(java.lang.String employerRefNum) {
        this.employerRefNum = employerRefNum;
    }


    /**
     * Gets the employerID value for this CmecEPortalEmployerDetails.
     * 
     * @return employerID
     */
    public java.lang.String getEmployerID() {
        return employerID;
    }


    /**
     * Sets the employerID value for this CmecEPortalEmployerDetails.
     * 
     * @param employerID
     */
    public void setEmployerID(java.lang.String employerID) {
        this.employerID = employerID;
    }


    /**
     * Gets the preferedCommunicationMethod value for this CmecEPortalEmployerDetails.
     * 
     * @return preferedCommunicationMethod
     */
    public java.lang.String getPreferedCommunicationMethod() {
        return preferedCommunicationMethod;
    }


    /**
     * Sets the preferedCommunicationMethod value for this CmecEPortalEmployerDetails.
     * 
     * @param preferedCommunicationMethod
     */
    public void setPreferedCommunicationMethod(java.lang.String preferedCommunicationMethod) {
        this.preferedCommunicationMethod = preferedCommunicationMethod;
    }


    /**
     * Gets the armedForcesFlag value for this CmecEPortalEmployerDetails.
     * 
     * @return armedForcesFlag
     */
    public java.lang.String getArmedForcesFlag() {
        return armedForcesFlag;
    }


    /**
     * Sets the armedForcesFlag value for this CmecEPortalEmployerDetails.
     * 
     * @param armedForcesFlag
     */
    public void setArmedForcesFlag(java.lang.String armedForcesFlag) {
        this.armedForcesFlag = armedForcesFlag;
    }


    /**
     * Gets the emailAddress value for this CmecEPortalEmployerDetails.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this CmecEPortalEmployerDetails.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the actionMode value for this CmecEPortalEmployerDetails.
     * 
     * @return actionMode
     */
    public java.lang.String getActionMode() {
        return actionMode;
    }


    /**
     * Sets the actionMode value for this CmecEPortalEmployerDetails.
     * 
     * @param actionMode
     */
    public void setActionMode(java.lang.String actionMode) {
        this.actionMode = actionMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalEmployerDetails)) return false;
        CmecEPortalEmployerDetails other = (CmecEPortalEmployerDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.employerRefNum==null && other.getEmployerRefNum()==null) || 
             (this.employerRefNum!=null &&
              this.employerRefNum.equals(other.getEmployerRefNum()))) &&
            ((this.employerID==null && other.getEmployerID()==null) || 
             (this.employerID!=null &&
              this.employerID.equals(other.getEmployerID()))) &&
            ((this.preferedCommunicationMethod==null && other.getPreferedCommunicationMethod()==null) || 
             (this.preferedCommunicationMethod!=null &&
              this.preferedCommunicationMethod.equals(other.getPreferedCommunicationMethod()))) &&
            ((this.armedForcesFlag==null && other.getArmedForcesFlag()==null) || 
             (this.armedForcesFlag!=null &&
              this.armedForcesFlag.equals(other.getArmedForcesFlag()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.actionMode==null && other.getActionMode()==null) || 
             (this.actionMode!=null &&
              this.actionMode.equals(other.getActionMode())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEmployerRefNum() != null) {
            _hashCode += getEmployerRefNum().hashCode();
        }
        if (getEmployerID() != null) {
            _hashCode += getEmployerID().hashCode();
        }
        if (getPreferedCommunicationMethod() != null) {
            _hashCode += getPreferedCommunicationMethod().hashCode();
        }
        if (getArmedForcesFlag() != null) {
            _hashCode += getArmedForcesFlag().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getActionMode() != null) {
            _hashCode += getActionMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalEmployerDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalEmployerDetails", "CmecEPortalEmployerDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerRefNum"));
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
        elemField.setFieldName("preferedCommunicationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreferedCommunicationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armedForcesFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArmedForcesFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActionMode"));
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
