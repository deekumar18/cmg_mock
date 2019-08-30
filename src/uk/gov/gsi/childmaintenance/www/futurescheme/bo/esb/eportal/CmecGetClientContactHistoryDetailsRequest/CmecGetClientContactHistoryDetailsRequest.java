/**
 * CmecGetClientContactHistoryDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetClientContactHistoryDetailsRequest;

public class CmecGetClientContactHistoryDetailsRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String SCIN;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String historyStatus;

    private java.lang.String uptoImpactLevel;

    private java.lang.String correspondenceStatus;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.AttachmentTemplate.AttachmentTemplate[] includeAttachmentTemplate;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecContactHistoryType.CmecContactHistoryType[] historyType;

    public CmecGetClientContactHistoryDetailsRequest() {
    }

    public CmecGetClientContactHistoryDetailsRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String SCIN,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String historyStatus,
           java.lang.String uptoImpactLevel,
           java.lang.String correspondenceStatus,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.AttachmentTemplate.AttachmentTemplate[] includeAttachmentTemplate,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecContactHistoryType.CmecContactHistoryType[] historyType) {
           this.requestHeader = requestHeader;
           this.SCIN = SCIN;
           this.startDate = startDate;
           this.endDate = endDate;
           this.historyStatus = historyStatus;
           this.uptoImpactLevel = uptoImpactLevel;
           this.correspondenceStatus = correspondenceStatus;
           this.includeAttachmentTemplate = includeAttachmentTemplate;
           this.historyType = historyType;
    }


    /**
     * Gets the requestHeader value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the SCIN value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @return SCIN
     */
    public java.lang.String getSCIN() {
        return SCIN;
    }


    /**
     * Sets the SCIN value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @param SCIN
     */
    public void setSCIN(java.lang.String SCIN) {
        this.SCIN = SCIN;
    }


    /**
     * Gets the startDate value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the historyStatus value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @return historyStatus
     */
    public java.lang.String getHistoryStatus() {
        return historyStatus;
    }


    /**
     * Sets the historyStatus value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @param historyStatus
     */
    public void setHistoryStatus(java.lang.String historyStatus) {
        this.historyStatus = historyStatus;
    }


    /**
     * Gets the uptoImpactLevel value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @return uptoImpactLevel
     */
    public java.lang.String getUptoImpactLevel() {
        return uptoImpactLevel;
    }


    /**
     * Sets the uptoImpactLevel value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @param uptoImpactLevel
     */
    public void setUptoImpactLevel(java.lang.String uptoImpactLevel) {
        this.uptoImpactLevel = uptoImpactLevel;
    }


    /**
     * Gets the correspondenceStatus value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @return correspondenceStatus
     */
    public java.lang.String getCorrespondenceStatus() {
        return correspondenceStatus;
    }


    /**
     * Sets the correspondenceStatus value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @param correspondenceStatus
     */
    public void setCorrespondenceStatus(java.lang.String correspondenceStatus) {
        this.correspondenceStatus = correspondenceStatus;
    }


    /**
     * Gets the includeAttachmentTemplate value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @return includeAttachmentTemplate
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.AttachmentTemplate.AttachmentTemplate[] getIncludeAttachmentTemplate() {
        return includeAttachmentTemplate;
    }


    /**
     * Sets the includeAttachmentTemplate value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @param includeAttachmentTemplate
     */
    public void setIncludeAttachmentTemplate(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.AttachmentTemplate.AttachmentTemplate[] includeAttachmentTemplate) {
        this.includeAttachmentTemplate = includeAttachmentTemplate;
    }


    /**
     * Gets the historyType value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @return historyType
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecContactHistoryType.CmecContactHistoryType[] getHistoryType() {
        return historyType;
    }


    /**
     * Sets the historyType value for this CmecGetClientContactHistoryDetailsRequest.
     * 
     * @param historyType
     */
    public void setHistoryType(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecContactHistoryType.CmecContactHistoryType[] historyType) {
        this.historyType = historyType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecGetClientContactHistoryDetailsRequest)) return false;
        CmecGetClientContactHistoryDetailsRequest other = (CmecGetClientContactHistoryDetailsRequest) obj;
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
            ((this.SCIN==null && other.getSCIN()==null) || 
             (this.SCIN!=null &&
              this.SCIN.equals(other.getSCIN()))) &&
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
            ((this.includeAttachmentTemplate==null && other.getIncludeAttachmentTemplate()==null) || 
             (this.includeAttachmentTemplate!=null &&
              java.util.Arrays.equals(this.includeAttachmentTemplate, other.getIncludeAttachmentTemplate()))) &&
            ((this.historyType==null && other.getHistoryType()==null) || 
             (this.historyType!=null &&
              java.util.Arrays.equals(this.historyType, other.getHistoryType())));
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
        if (getSCIN() != null) {
            _hashCode += getSCIN().hashCode();
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
        if (getIncludeAttachmentTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeAttachmentTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeAttachmentTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecGetClientContactHistoryDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetClientContactHistoryDetailsRequest", "CmecGetClientContactHistoryDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCIN"));
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
        elemField.setFieldName("includeAttachmentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncludeAttachmentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/AttachmentTemplate", "AttachmentTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AttachmentTemplate"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HistoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecContactHistoryType", "CmecContactHistoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ContactHistoryType"));
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
