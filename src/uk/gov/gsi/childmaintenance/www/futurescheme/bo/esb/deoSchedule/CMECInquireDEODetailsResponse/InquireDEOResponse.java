/**
 * InquireDEOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse;

public class InquireDEOResponse  implements java.io.Serializable {
    private java.lang.String employerAccountId;

    private java.lang.String action;

    private java.lang.String fromDate;

    private java.lang.String toDate;

    private java.lang.String scheduleStatus;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.EmployerScheduleDetails[] employerScheduleDetailsCollection;

    public InquireDEOResponse() {
    }

    public InquireDEOResponse(
           java.lang.String employerAccountId,
           java.lang.String action,
           java.lang.String fromDate,
           java.lang.String toDate,
           java.lang.String scheduleStatus,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.EmployerScheduleDetails[] employerScheduleDetailsCollection) {
           this.employerAccountId = employerAccountId;
           this.action = action;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.scheduleStatus = scheduleStatus;
           this.employerScheduleDetailsCollection = employerScheduleDetailsCollection;
    }


    /**
     * Gets the employerAccountId value for this InquireDEOResponse.
     * 
     * @return employerAccountId
     */
    public java.lang.String getEmployerAccountId() {
        return employerAccountId;
    }


    /**
     * Sets the employerAccountId value for this InquireDEOResponse.
     * 
     * @param employerAccountId
     */
    public void setEmployerAccountId(java.lang.String employerAccountId) {
        this.employerAccountId = employerAccountId;
    }


    /**
     * Gets the action value for this InquireDEOResponse.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this InquireDEOResponse.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the fromDate value for this InquireDEOResponse.
     * 
     * @return fromDate
     */
    public java.lang.String getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this InquireDEOResponse.
     * 
     * @param fromDate
     */
    public void setFromDate(java.lang.String fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this InquireDEOResponse.
     * 
     * @return toDate
     */
    public java.lang.String getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this InquireDEOResponse.
     * 
     * @param toDate
     */
    public void setToDate(java.lang.String toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the scheduleStatus value for this InquireDEOResponse.
     * 
     * @return scheduleStatus
     */
    public java.lang.String getScheduleStatus() {
        return scheduleStatus;
    }


    /**
     * Sets the scheduleStatus value for this InquireDEOResponse.
     * 
     * @param scheduleStatus
     */
    public void setScheduleStatus(java.lang.String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }


    /**
     * Gets the employerScheduleDetailsCollection value for this InquireDEOResponse.
     * 
     * @return employerScheduleDetailsCollection
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.EmployerScheduleDetails[] getEmployerScheduleDetailsCollection() {
        return employerScheduleDetailsCollection;
    }


    /**
     * Sets the employerScheduleDetailsCollection value for this InquireDEOResponse.
     * 
     * @param employerScheduleDetailsCollection
     */
    public void setEmployerScheduleDetailsCollection(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.EmployerScheduleDetails[] employerScheduleDetailsCollection) {
        this.employerScheduleDetailsCollection = employerScheduleDetailsCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InquireDEOResponse)) return false;
        InquireDEOResponse other = (InquireDEOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employerAccountId==null && other.getEmployerAccountId()==null) || 
             (this.employerAccountId!=null &&
              this.employerAccountId.equals(other.getEmployerAccountId()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.scheduleStatus==null && other.getScheduleStatus()==null) || 
             (this.scheduleStatus!=null &&
              this.scheduleStatus.equals(other.getScheduleStatus()))) &&
            ((this.employerScheduleDetailsCollection==null && other.getEmployerScheduleDetailsCollection()==null) || 
             (this.employerScheduleDetailsCollection!=null &&
              java.util.Arrays.equals(this.employerScheduleDetailsCollection, other.getEmployerScheduleDetailsCollection())));
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
        if (getEmployerAccountId() != null) {
            _hashCode += getEmployerAccountId().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getScheduleStatus() != null) {
            _hashCode += getScheduleStatus().hashCode();
        }
        if (getEmployerScheduleDetailsCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployerScheduleDetailsCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployerScheduleDetailsCollection(), i);
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
        new org.apache.axis.description.TypeDesc(InquireDEOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECInquireDEODetailsResponse", "InquireDEOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employerAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
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
        elemField.setFieldName("scheduleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerScheduleDetailsCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerScheduleDetailsCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECInquireDEODetailsResponse", "EmployerScheduleDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EmployerScheduleDetails"));
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
