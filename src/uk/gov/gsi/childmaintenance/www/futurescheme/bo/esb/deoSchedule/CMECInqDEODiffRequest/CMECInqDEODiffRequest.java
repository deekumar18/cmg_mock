/**
 * CMECInqDEODiffRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInqDEODiffRequest;

public class CMECInqDEODiffRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String accNum;

    private java.lang.String frmDt;

    private java.lang.String toDt;

    private java.lang.String schdId;

    public CMECInqDEODiffRequest() {
    }

    public CMECInqDEODiffRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String accNum,
           java.lang.String frmDt,
           java.lang.String toDt,
           java.lang.String schdId) {
           this.requestHeader = requestHeader;
           this.accNum = accNum;
           this.frmDt = frmDt;
           this.toDt = toDt;
           this.schdId = schdId;
    }


    /**
     * Gets the requestHeader value for this CMECInqDEODiffRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CMECInqDEODiffRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the accNum value for this CMECInqDEODiffRequest.
     * 
     * @return accNum
     */
    public java.lang.String getAccNum() {
        return accNum;
    }


    /**
     * Sets the accNum value for this CMECInqDEODiffRequest.
     * 
     * @param accNum
     */
    public void setAccNum(java.lang.String accNum) {
        this.accNum = accNum;
    }


    /**
     * Gets the frmDt value for this CMECInqDEODiffRequest.
     * 
     * @return frmDt
     */
    public java.lang.String getFrmDt() {
        return frmDt;
    }


    /**
     * Sets the frmDt value for this CMECInqDEODiffRequest.
     * 
     * @param frmDt
     */
    public void setFrmDt(java.lang.String frmDt) {
        this.frmDt = frmDt;
    }


    /**
     * Gets the toDt value for this CMECInqDEODiffRequest.
     * 
     * @return toDt
     */
    public java.lang.String getToDt() {
        return toDt;
    }


    /**
     * Sets the toDt value for this CMECInqDEODiffRequest.
     * 
     * @param toDt
     */
    public void setToDt(java.lang.String toDt) {
        this.toDt = toDt;
    }


    /**
     * Gets the schdId value for this CMECInqDEODiffRequest.
     * 
     * @return schdId
     */
    public java.lang.String getSchdId() {
        return schdId;
    }


    /**
     * Sets the schdId value for this CMECInqDEODiffRequest.
     * 
     * @param schdId
     */
    public void setSchdId(java.lang.String schdId) {
        this.schdId = schdId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMECInqDEODiffRequest)) return false;
        CMECInqDEODiffRequest other = (CMECInqDEODiffRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestHeader==null && other.getRequestHeader()==null) || 
             (this.requestHeader!=null &&
              this.requestHeader.equals(other.getRequestHeader()))) &&
            ((this.accNum==null && other.getAccNum()==null) || 
             (this.accNum!=null &&
              this.accNum.equals(other.getAccNum()))) &&
            ((this.frmDt==null && other.getFrmDt()==null) || 
             (this.frmDt!=null &&
              this.frmDt.equals(other.getFrmDt()))) &&
            ((this.toDt==null && other.getToDt()==null) || 
             (this.toDt!=null &&
              this.toDt.equals(other.getToDt()))) &&
            ((this.schdId==null && other.getSchdId()==null) || 
             (this.schdId!=null &&
              this.schdId.equals(other.getSchdId())));
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
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getAccNum() != null) {
            _hashCode += getAccNum().hashCode();
        }
        if (getFrmDt() != null) {
            _hashCode += getFrmDt().hashCode();
        }
        if (getToDt() != null) {
            _hashCode += getToDt().hashCode();
        }
        if (getSchdId() != null) {
            _hashCode += getSchdId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMECInqDEODiffRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/deoSchedule/CMECInqDEODiffRequest", "CMECInqDEODiffRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frmDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FrmDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ToDt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schdId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SchdId"));
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
