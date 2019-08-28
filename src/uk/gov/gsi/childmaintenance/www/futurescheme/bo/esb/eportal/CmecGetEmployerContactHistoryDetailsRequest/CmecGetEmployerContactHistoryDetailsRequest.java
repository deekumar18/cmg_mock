/**
 * CmecGetEmployerContactHistoryDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerContactHistoryDetailsRequest;

public class CmecGetEmployerContactHistoryDetailsRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String ERN;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String historyStatus;

    private java.lang.String uptoImpactLevel;

    private java.lang.String correspondenceStatus;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecContactHistoryType.CmecContactHistoryType[] historyType;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.AttachmentTemplate.AttachmentTemplate[] excludeAttachmentTemplate;

    public CmecGetEmployerContactHistoryDetailsRequest() {
    }

    public CmecGetEmployerContactHistoryDetailsRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String ERN,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String historyStatus,
           java.lang.String uptoImpactLevel,
           java.lang.String correspondenceStatus,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecContactHistoryType.CmecContactHistoryType[] historyType,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.AttachmentTemplate.AttachmentTemplate[] excludeAttachmentTemplate) {
           this.requestHeader = requestHeader;
           this.ERN = ERN;
           this.startDate = startDate;
           this.endDate = endDate;
           this.historyStatus = historyStatus;
           this.uptoImpactLevel = uptoImpactLevel;
           this.correspondenceStatus = correspondenceStatus;
           this.historyType = historyType;
           this.excludeAttachmentTemplate = excludeAttachmentTemplate;
    }


    /**
     * Gets the requestHeader value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the ERN value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @return ERN
     */
    public java.lang.String getERN() {
        return ERN;
    }


    /**
     * Sets the ERN value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @param ERN
     */
    public void setERN(java.lang.String ERN) {
        this.ERN = ERN;
    }


    /**
     * Gets the startDate value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the historyStatus value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @return historyStatus
     */
    public java.lang.String getHistoryStatus() {
        return historyStatus;
    }


    /**
     * Sets the historyStatus value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @param historyStatus
     */
    public void setHistoryStatus(java.lang.String historyStatus) {
        this.historyStatus = historyStatus;
    }


    /**
     * Gets the uptoImpactLevel value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @return uptoImpactLevel
     */
    public java.lang.String getUptoImpactLevel() {
        return uptoImpactLevel;
    }


    /**
     * Sets the uptoImpactLevel value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @param uptoImpactLevel
     */
    public void setUptoImpactLevel(java.lang.String uptoImpactLevel) {
        this.uptoImpactLevel = uptoImpactLevel;
    }


    /**
     * Gets the correspondenceStatus value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @return correspondenceStatus
     */
    public java.lang.String getCorrespondenceStatus() {
        return correspondenceStatus;
    }


    /**
     * Sets the correspondenceStatus value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @param correspondenceStatus
     */
    public void setCorrespondenceStatus(java.lang.String correspondenceStatus) {
        this.correspondenceStatus = correspondenceStatus;
    }


    /**
     * Gets the historyType value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @return historyType
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecContactHistoryType.CmecContactHistoryType[] getHistoryType() {
        return historyType;
    }


    /**
     * Sets the historyType value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @param historyType
     */
    public void setHistoryType(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecContactHistoryType.CmecContactHistoryType[] historyType) {
        this.historyType = historyType;
    }


    /**
     * Gets the excludeAttachmentTemplate value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @return excludeAttachmentTemplate
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.AttachmentTemplate.AttachmentTemplate[] getExcludeAttachmentTemplate() {
        return excludeAttachmentTemplate;
    }


    /**
     * Sets the excludeAttachmentTemplate value for this CmecGetEmployerContactHistoryDetailsRequest.
     * 
     * @param excludeAttachmentTemplate
     */
    public void setExcludeAttachmentTemplate(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.AttachmentTemplate.AttachmentTemplate[] excludeAttachmentTemplate) {
        this.excludeAttachmentTemplate = excludeAttachmentTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecGetEmployerContactHistoryDetailsRequest)) return false;
        CmecGetEmployerContactHistoryDetailsRequest other = (CmecGetEmployerContactHistoryDetailsRequest) obj;
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
            ((this.ERN==null && other.getERN()==null) || 
             (this.ERN!=null &&
              this.ERN.equals(other.getERN()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.historyStatus==null && other.getHistoryStatus()==null) || 
             (this.historyStatus!=null &&
              this.historyStatus.equals(other.getHistoryStatus()))) &&
            ((this.uptoImpactLevel==null && other.getUptoImpactLevel()==null) || 
             (this.uptoImpactLevel!=null &&
              this.uptoImpactLevel.equals(other.getUptoImpactLevel()))) &&
            ((this.correspondenceStatus==null && other.getCorrespondenceStatus()==null) || 
             (this.correspondenceStatus!=null &&
              this.correspondenceStatus.equals(other.getCorrespondenceStatus()))) &&
            ((this.historyType==null && other.getHistoryType()==null) || 
             (this.historyType!=null &&
              java.util.Arrays.equals(this.historyType, other.getHistoryType()))) &&
            ((this.excludeAttachmentTemplate==null && other.getExcludeAttachmentTemplate()==null) || 
             (this.excludeAttachmentTemplate!=null &&
              java.util.Arrays.equals(this.excludeAttachmentTemplate, other.getExcludeAttachmentTemplate())));
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
        if (getERN() != null) {
            _hashCode += getERN().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getHistoryStatus() != null) {
            _hashCode += getHistoryStatus().hashCode();
        }
        if (getUptoImpactLevel() != null) {
            _hashCode += getUptoImpactLevel().hashCode();
        }
        if (getCorrespondenceStatus() != null) {
            _hashCode += getCorrespondenceStatus().hashCode();
        }
        if (getHistoryType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoryType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoryType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeAttachmentTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeAttachmentTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeAttachmentTemplate(), i);
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
        new org.apache.axis.description.TypeDesc(CmecGetEmployerContactHistoryDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmployerContactHistoryDetailsRequest", "CmecGetEmployerContactHistoryDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HistoryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uptoImpactLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uptoImpactLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correspondenceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CorrespondenceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HistoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecContactHistoryType", "CmecContactHistoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ContactHistoryType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeAttachmentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExcludeAttachmentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/AttachmentTemplate", "AttachmentTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AttachmentTemplate"));
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
