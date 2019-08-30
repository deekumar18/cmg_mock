/**
 * EmployerScheduleDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse;

public class EmployerScheduleDetails  implements java.io.Serializable {
    private java.lang.String scheduleId;

    private java.lang.String fromDate;

    private java.lang.String toDate;

    private java.lang.String targetAmount;

    private java.lang.String actualAmount;

    private java.lang.String overDraftAmount;

    private java.lang.String dueDate;

    private java.lang.String scheduleDate;

    private java.lang.String scheduleStatus;

    private java.lang.String reasonCode;

    public EmployerScheduleDetails() {
    }

    public EmployerScheduleDetails(
           java.lang.String scheduleId,
           java.lang.String fromDate,
           java.lang.String toDate,
           java.lang.String targetAmount,
           java.lang.String actualAmount,
           java.lang.String overDraftAmount,
           java.lang.String dueDate,
           java.lang.String scheduleDate,
           java.lang.String scheduleStatus,
           java.lang.String reasonCode) {
           this.scheduleId = scheduleId;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.targetAmount = targetAmount;
           this.actualAmount = actualAmount;
           this.overDraftAmount = overDraftAmount;
           this.dueDate = dueDate;
           this.scheduleDate = scheduleDate;
           this.scheduleStatus = scheduleStatus;
           this.reasonCode = reasonCode;
    }


    /**
     * Gets the scheduleId value for this EmployerScheduleDetails.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this EmployerScheduleDetails.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }


    /**
     * Gets the fromDate value for this EmployerScheduleDetails.
     * 
     * @return fromDate
     */
    public java.lang.String getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this EmployerScheduleDetails.
     * 
     * @param fromDate
     */
    public void setFromDate(java.lang.String fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this EmployerScheduleDetails.
     * 
     * @return toDate
     */
    public java.lang.String getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this EmployerScheduleDetails.
     * 
     * @param toDate
     */
    public void setToDate(java.lang.String toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the targetAmount value for this EmployerScheduleDetails.
     * 
     * @return targetAmount
     */
    public java.lang.String getTargetAmount() {
        return targetAmount;
    }


    /**
     * Sets the targetAmount value for this EmployerScheduleDetails.
     * 
     * @param targetAmount
     */
    public void setTargetAmount(java.lang.String targetAmount) {
        this.targetAmount = targetAmount;
    }


    /**
     * Gets the actualAmount value for this EmployerScheduleDetails.
     * 
     * @return actualAmount
     */
    public java.lang.String getActualAmount() {
        return actualAmount;
    }


    /**
     * Sets the actualAmount value for this EmployerScheduleDetails.
     * 
     * @param actualAmount
     */
    public void setActualAmount(java.lang.String actualAmount) {
        this.actualAmount = actualAmount;
    }


    /**
     * Gets the overDraftAmount value for this EmployerScheduleDetails.
     * 
     * @return overDraftAmount
     */
    public java.lang.String getOverDraftAmount() {
        return overDraftAmount;
    }


    /**
     * Sets the overDraftAmount value for this EmployerScheduleDetails.
     * 
     * @param overDraftAmount
     */
    public void setOverDraftAmount(java.lang.String overDraftAmount) {
        this.overDraftAmount = overDraftAmount;
    }


    /**
     * Gets the dueDate value for this EmployerScheduleDetails.
     * 
     * @return dueDate
     */
    public java.lang.String getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this EmployerScheduleDetails.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the scheduleDate value for this EmployerScheduleDetails.
     * 
     * @return scheduleDate
     */
    public java.lang.String getScheduleDate() {
        return scheduleDate;
    }


    /**
     * Sets the scheduleDate value for this EmployerScheduleDetails.
     * 
     * @param scheduleDate
     */
    public void setScheduleDate(java.lang.String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }


    /**
     * Gets the scheduleStatus value for this EmployerScheduleDetails.
     * 
     * @return scheduleStatus
     */
    public java.lang.String getScheduleStatus() {
        return scheduleStatus;
    }


    /**
     * Sets the scheduleStatus value for this EmployerScheduleDetails.
     * 
     * @param scheduleStatus
     */
    public void setScheduleStatus(java.lang.String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }


    /**
     * Gets the reasonCode value for this EmployerScheduleDetails.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this EmployerScheduleDetails.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployerScheduleDetails)) return false;
        EmployerScheduleDetails other = (EmployerScheduleDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduleId==null && other.getScheduleId()==null) || 
             (this.scheduleId!=null &&
              this.scheduleId.equals(other.getScheduleId()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.targetAmount==null && other.getTargetAmount()==null) || 
             (this.targetAmount!=null &&
              this.targetAmount.equals(other.getTargetAmount()))) &&
            ((this.actualAmount==null && other.getActualAmount()==null) || 
             (this.actualAmount!=null &&
              this.actualAmount.equals(other.getActualAmount()))) &&
            ((this.overDraftAmount==null && other.getOverDraftAmount()==null) || 
             (this.overDraftAmount!=null &&
              this.overDraftAmount.equals(other.getOverDraftAmount()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.scheduleDate==null && other.getScheduleDate()==null) || 
             (this.scheduleDate!=null &&
              this.scheduleDate.equals(other.getScheduleDate()))) &&
            ((this.scheduleStatus==null && other.getScheduleStatus()==null) || 
             (this.scheduleStatus!=null &&
              this.scheduleStatus.equals(other.getScheduleStatus()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode())));
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
        if (getScheduleId() != null) {
            _hashCode += getScheduleId().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getTargetAmount() != null) {
            _hashCode += getTargetAmount().hashCode();
        }
        if (getActualAmount() != null) {
            _hashCode += getActualAmount().hashCode();
        }
        if (getOverDraftAmount() != null) {
            _hashCode += getOverDraftAmount().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getScheduleDate() != null) {
            _hashCode += getScheduleDate().hashCode();
        }
        if (getScheduleStatus() != null) {
            _hashCode += getScheduleStatus().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployerScheduleDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECInquireDEODetailsResponse", "EmployerScheduleDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDate"));
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
        elemField.setFieldName("overDraftAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overDraftAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleStatus"));
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
