/**
 * NRPScheduleDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse;

public class NRPScheduleDetails  implements java.io.Serializable {
    private java.lang.String lastName;

    private java.lang.String firstName;

    private java.lang.String nino;

    private java.lang.String targetAmount;

    private java.lang.String actualAmount;

    private java.lang.String reasonCode;

    private java.lang.String CSARefNum;

    private java.lang.String CSAIdentifier;

    private java.lang.String SCIN;

    public NRPScheduleDetails() {
    }

    public NRPScheduleDetails(
           java.lang.String lastName,
           java.lang.String firstName,
           java.lang.String nino,
           java.lang.String targetAmount,
           java.lang.String actualAmount,
           java.lang.String reasonCode,
           java.lang.String CSARefNum,
           java.lang.String CSAIdentifier,
           java.lang.String SCIN) {
           this.lastName = lastName;
           this.firstName = firstName;
           this.nino = nino;
           this.targetAmount = targetAmount;
           this.actualAmount = actualAmount;
           this.reasonCode = reasonCode;
           this.CSARefNum = CSARefNum;
           this.CSAIdentifier = CSAIdentifier;
           this.SCIN = SCIN;
    }


    /**
     * Gets the lastName value for this NRPScheduleDetails.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this NRPScheduleDetails.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the firstName value for this NRPScheduleDetails.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this NRPScheduleDetails.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the nino value for this NRPScheduleDetails.
     * 
     * @return nino
     */
    public java.lang.String getNino() {
        return nino;
    }


    /**
     * Sets the nino value for this NRPScheduleDetails.
     * 
     * @param nino
     */
    public void setNino(java.lang.String nino) {
        this.nino = nino;
    }


    /**
     * Gets the targetAmount value for this NRPScheduleDetails.
     * 
     * @return targetAmount
     */
    public java.lang.String getTargetAmount() {
        return targetAmount;
    }


    /**
     * Sets the targetAmount value for this NRPScheduleDetails.
     * 
     * @param targetAmount
     */
    public void setTargetAmount(java.lang.String targetAmount) {
        this.targetAmount = targetAmount;
    }


    /**
     * Gets the actualAmount value for this NRPScheduleDetails.
     * 
     * @return actualAmount
     */
    public java.lang.String getActualAmount() {
        return actualAmount;
    }


    /**
     * Sets the actualAmount value for this NRPScheduleDetails.
     * 
     * @param actualAmount
     */
    public void setActualAmount(java.lang.String actualAmount) {
        this.actualAmount = actualAmount;
    }


    /**
     * Gets the reasonCode value for this NRPScheduleDetails.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this NRPScheduleDetails.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the CSARefNum value for this NRPScheduleDetails.
     * 
     * @return CSARefNum
     */
    public java.lang.String getCSARefNum() {
        return CSARefNum;
    }


    /**
     * Sets the CSARefNum value for this NRPScheduleDetails.
     * 
     * @param CSARefNum
     */
    public void setCSARefNum(java.lang.String CSARefNum) {
        this.CSARefNum = CSARefNum;
    }


    /**
     * Gets the CSAIdentifier value for this NRPScheduleDetails.
     * 
     * @return CSAIdentifier
     */
    public java.lang.String getCSAIdentifier() {
        return CSAIdentifier;
    }


    /**
     * Sets the CSAIdentifier value for this NRPScheduleDetails.
     * 
     * @param CSAIdentifier
     */
    public void setCSAIdentifier(java.lang.String CSAIdentifier) {
        this.CSAIdentifier = CSAIdentifier;
    }


    /**
     * Gets the SCIN value for this NRPScheduleDetails.
     * 
     * @return SCIN
     */
    public java.lang.String getSCIN() {
        return SCIN;
    }


    /**
     * Sets the SCIN value for this NRPScheduleDetails.
     * 
     * @param SCIN
     */
    public void setSCIN(java.lang.String SCIN) {
        this.SCIN = SCIN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NRPScheduleDetails)) return false;
        NRPScheduleDetails other = (NRPScheduleDetails) obj;
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
            ((this.nino==null && other.getNino()==null) || 
             (this.nino!=null &&
              this.nino.equals(other.getNino()))) &&
            ((this.targetAmount==null && other.getTargetAmount()==null) || 
             (this.targetAmount!=null &&
              this.targetAmount.equals(other.getTargetAmount()))) &&
            ((this.actualAmount==null && other.getActualAmount()==null) || 
             (this.actualAmount!=null &&
              this.actualAmount.equals(other.getActualAmount()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.CSARefNum==null && other.getCSARefNum()==null) || 
             (this.CSARefNum!=null &&
              this.CSARefNum.equals(other.getCSARefNum()))) &&
            ((this.CSAIdentifier==null && other.getCSAIdentifier()==null) || 
             (this.CSAIdentifier!=null &&
              this.CSAIdentifier.equals(other.getCSAIdentifier()))) &&
            ((this.SCIN==null && other.getSCIN()==null) || 
             (this.SCIN!=null &&
              this.SCIN.equals(other.getSCIN())));
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
        if (getNino() != null) {
            _hashCode += getNino().hashCode();
        }
        if (getTargetAmount() != null) {
            _hashCode += getTargetAmount().hashCode();
        }
        if (getActualAmount() != null) {
            _hashCode += getActualAmount().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getCSARefNum() != null) {
            _hashCode += getCSARefNum().hashCode();
        }
        if (getCSAIdentifier() != null) {
            _hashCode += getCSAIdentifier().hashCode();
        }
        if (getSCIN() != null) {
            _hashCode += getSCIN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NRPScheduleDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECFetchDEODetailsResponse", "NRPScheduleDetails"));
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
        elemField.setFieldName("nino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSARefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSARefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSAIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CSAIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
