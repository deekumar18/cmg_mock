/**
 * InqDEODiffResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffResponse;

public class InqDEODiffResponse  implements java.io.Serializable {
    private java.lang.String accNum;

    private java.lang.String frmDt;

    private java.lang.String toDt;

    private java.lang.String scheduleId;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffResponse.InqDEODiffDetails[] inqDEODiffDetailsCollection;

    public InqDEODiffResponse() {
    }

    public InqDEODiffResponse(
           java.lang.String accNum,
           java.lang.String frmDt,
           java.lang.String toDt,
           java.lang.String scheduleId,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffResponse.InqDEODiffDetails[] inqDEODiffDetailsCollection) {
           this.accNum = accNum;
           this.frmDt = frmDt;
           this.toDt = toDt;
           this.scheduleId = scheduleId;
           this.inqDEODiffDetailsCollection = inqDEODiffDetailsCollection;
    }


    /**
     * Gets the accNum value for this InqDEODiffResponse.
     * 
     * @return accNum
     */
    public java.lang.String getAccNum() {
        return accNum;
    }


    /**
     * Sets the accNum value for this InqDEODiffResponse.
     * 
     * @param accNum
     */
    public void setAccNum(java.lang.String accNum) {
        this.accNum = accNum;
    }


    /**
     * Gets the frmDt value for this InqDEODiffResponse.
     * 
     * @return frmDt
     */
    public java.lang.String getFrmDt() {
        return frmDt;
    }


    /**
     * Sets the frmDt value for this InqDEODiffResponse.
     * 
     * @param frmDt
     */
    public void setFrmDt(java.lang.String frmDt) {
        this.frmDt = frmDt;
    }


    /**
     * Gets the toDt value for this InqDEODiffResponse.
     * 
     * @return toDt
     */
    public java.lang.String getToDt() {
        return toDt;
    }


    /**
     * Sets the toDt value for this InqDEODiffResponse.
     * 
     * @param toDt
     */
    public void setToDt(java.lang.String toDt) {
        this.toDt = toDt;
    }


    /**
     * Gets the scheduleId value for this InqDEODiffResponse.
     * 
     * @return scheduleId
     */
    public java.lang.String getScheduleId() {
        return scheduleId;
    }


    /**
     * Sets the scheduleId value for this InqDEODiffResponse.
     * 
     * @param scheduleId
     */
    public void setScheduleId(java.lang.String scheduleId) {
        this.scheduleId = scheduleId;
    }


    /**
     * Gets the inqDEODiffDetailsCollection value for this InqDEODiffResponse.
     * 
     * @return inqDEODiffDetailsCollection
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffResponse.InqDEODiffDetails[] getInqDEODiffDetailsCollection() {
        return inqDEODiffDetailsCollection;
    }


    /**
     * Sets the inqDEODiffDetailsCollection value for this InqDEODiffResponse.
     * 
     * @param inqDEODiffDetailsCollection
     */
    public void setInqDEODiffDetailsCollection(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffResponse.InqDEODiffDetails[] inqDEODiffDetailsCollection) {
        this.inqDEODiffDetailsCollection = inqDEODiffDetailsCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InqDEODiffResponse)) return false;
        InqDEODiffResponse other = (InqDEODiffResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accNum==null && other.getAccNum()==null) || 
             (this.accNum!=null &&
              this.accNum.equals(other.getAccNum()))) &&
            ((this.frmDt==null && other.getFrmDt()==null) || 
             (this.frmDt!=null &&
              this.frmDt.equals(other.getFrmDt()))) &&
            ((this.toDt==null && other.getToDt()==null) || 
             (this.toDt!=null &&
              this.toDt.equals(other.getToDt()))) &&
            ((this.scheduleId==null && other.getScheduleId()==null) || 
             (this.scheduleId!=null &&
              this.scheduleId.equals(other.getScheduleId()))) &&
            ((this.inqDEODiffDetailsCollection==null && other.getInqDEODiffDetailsCollection()==null) || 
             (this.inqDEODiffDetailsCollection!=null &&
              java.util.Arrays.equals(this.inqDEODiffDetailsCollection, other.getInqDEODiffDetailsCollection())));
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
        if (getAccNum() != null) {
            _hashCode += getAccNum().hashCode();
        }
        if (getFrmDt() != null) {
            _hashCode += getFrmDt().hashCode();
        }
        if (getToDt() != null) {
            _hashCode += getToDt().hashCode();
        }
        if (getScheduleId() != null) {
            _hashCode += getScheduleId().hashCode();
        }
        if (getInqDEODiffDetailsCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInqDEODiffDetailsCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInqDEODiffDetailsCollection(), i);
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
        new org.apache.axis.description.TypeDesc(InqDEODiffResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECInqDEODiffResponse", "InqDEODiffResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frmDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frmDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toDt"));
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
        elemField.setFieldName("inqDEODiffDetailsCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InqDEODiffDetailsCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECInqDEODiffResponse", "InqDEODiffDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "InqDEODiffDetails"));
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
