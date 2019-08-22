/**
 * FetchDEOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse;

public class FetchDEOResponse  implements java.io.Serializable {
    private java.lang.String employerAccountId;

    private java.lang.String action;

    private java.lang.String dueDate;

    private java.lang.String scheduleStatus;

    private java.lang.String scheduleId;

    private java.lang.String scheduleDate;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.NRPScheduleDetails[] NRPScheduleDetailsCollection;

    public FetchDEOResponse() {
    }

    public FetchDEOResponse(
           java.lang.String employerAccountId,
           java.lang.String action,
           java.lang.String dueDate,
           java.lang.String scheduleStatus,
           java.lang.String scheduleId,
           java.lang.String scheduleDate,
           java.lang.String startDate,
           java.lang.String endDate,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.NRPScheduleDetails[] NRPScheduleDetailsCollection) {
           this.employerAccountId = employerAccountId;
           this.action = action;
           this.dueDate = dueDate;
           this.scheduleStatus = scheduleStatus;
           this.scheduleId = scheduleId;
           this.scheduleDate = scheduleDate;
           this.startDate = startDate;
           this.endDate = endDate;
           this.NRPScheduleDetailsCollection = NRPScheduleDetailsCollection;
    }


    /**
     * Gets the employerAccountId value for this FetchDEOResponse.
     * 
     * @return employerAccountId
     */
    public java.lang.String getEmployerAccountId() {
        return employerAccountId;
    }


    /**
     * Sets the employerAccountId value for this FetchDEOResponse.
     * 
     * @param employerAccountId
     */
    public void setEmployerAccountId(java.lang.String employerAccountId) {
        this.employerAccountId = employerAccountId;
    }


    /**
     * Gets the action value for this FetchDEOResponse.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this FetchDEOResponse.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the dueDate value for this FetchDEOResponse.
     * 
     * @return dueDate
     */
    public java.lang.String getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this FetchDEOResponse.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the scheduleStatus value for this FetchDEOResponse.
     * 
     * @return scheduleStatus
     */
    public java.lang.String getScheduleStatus() {
        return scheduleStatus;
    }


    /**
     * Sets the scheduleStatus value for this FetchDEOResponse.
     * 
     * @param scheduleStatus
     */
    public void setScheduleStatus(java.lang.String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }


    /**
     * Gets the scheduleId value for this FetchDEOResponse.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this FetchDEOResponse.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }


    /**
     * Gets the scheduleDate value for this FetchDEOResponse.
     * 
     * @return scheduleDate
     */
    public java.lang.String getScheduleDate() {
        return scheduleDate;
    }


    /**
     * Sets the scheduleDate value for this FetchDEOResponse.
     * 
     * @param scheduleDate
     */
    public void setScheduleDate(java.lang.String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }


    /**
     * Gets the startDate value for this FetchDEOResponse.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this FetchDEOResponse.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this FetchDEOResponse.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this FetchDEOResponse.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the NRPScheduleDetailsCollection value for this FetchDEOResponse.
     * 
     * @return NRPScheduleDetailsCollection
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.NRPScheduleDetails[] getNRPScheduleDetailsCollection() {
        return NRPScheduleDetailsCollection;
    }


    /**
     * Sets the NRPScheduleDetailsCollection value for this FetchDEOResponse.
     * 
     * @param NRPScheduleDetailsCollection
     */
    public void setNRPScheduleDetailsCollection(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.NRPScheduleDetails[] NRPScheduleDetailsCollection) {
        this.NRPScheduleDetailsCollection = NRPScheduleDetailsCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchDEOResponse)) return false;
        FetchDEOResponse other = (FetchDEOResponse) obj;
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
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.scheduleStatus==null && other.getScheduleStatus()==null) || 
             (this.scheduleStatus!=null &&
              this.scheduleStatus.equals(other.getScheduleStatus()))) &&
            ((this.scheduleId==null && other.getScheduleId()==null) || 
             (this.scheduleId!=null &&
              this.scheduleId.equals(other.getScheduleId()))) &&
            ((this.scheduleDate==null && other.getScheduleDate()==null) || 
             (this.scheduleDate!=null &&
              this.scheduleDate.equals(other.getScheduleDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.NRPScheduleDetailsCollection==null && other.getNRPScheduleDetailsCollection()==null) || 
             (this.NRPScheduleDetailsCollection!=null &&
              java.util.Arrays.equals(this.NRPScheduleDetailsCollection, other.getNRPScheduleDetailsCollection())));
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
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getScheduleStatus() != null) {
            _hashCode += getScheduleStatus().hashCode();
        }
        if (getScheduleId() != null) {
            _hashCode += getScheduleId().hashCode();
        }
        if (getScheduleDate() != null) {
            _hashCode += getScheduleDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getNRPScheduleDetailsCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNRPScheduleDetailsCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNRPScheduleDetailsCollection(), i);
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
        new org.apache.axis.description.TypeDesc(FetchDEOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECFetchDEODetailsResponse", "FetchDEOResponse"));
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
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
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
        elemField.setFieldName("scheduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduleId"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NRPScheduleDetailsCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NRPScheduleDetailsCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECFetchDEODetailsResponse", "NRPScheduleDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "NRPScheduleDetails"));
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
