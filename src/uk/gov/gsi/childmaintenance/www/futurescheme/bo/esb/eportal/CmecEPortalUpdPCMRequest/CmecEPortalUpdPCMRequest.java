/**
 * CmecEPortalUpdPCMRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMRequest;

public class CmecEPortalUpdPCMRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String caseNumber;

    private java.lang.String SCIN;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMRequest.CmecEPortalUpdPCMRequestContactPreference contactPreference;

    private java.lang.String languageSelection;

    private java.lang.String source;

    private java.lang.String SMSOptOutFlag;

    public CmecEPortalUpdPCMRequest() {
    }

    public CmecEPortalUpdPCMRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String caseNumber,
           java.lang.String SCIN,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMRequest.CmecEPortalUpdPCMRequestContactPreference contactPreference,
           java.lang.String languageSelection,
           java.lang.String source,
           java.lang.String SMSOptOutFlag) {
           this.requestHeader = requestHeader;
           this.caseNumber = caseNumber;
           this.SCIN = SCIN;
           this.contactPreference = contactPreference;
           this.languageSelection = languageSelection;
           this.source = source;
           this.SMSOptOutFlag = SMSOptOutFlag;
    }


    /**
     * Gets the requestHeader value for this CmecEPortalUpdPCMRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CmecEPortalUpdPCMRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the caseNumber value for this CmecEPortalUpdPCMRequest.
     * 
     * @return caseNumber
     */
    public java.lang.String getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this CmecEPortalUpdPCMRequest.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(java.lang.String caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the SCIN value for this CmecEPortalUpdPCMRequest.
     * 
     * @return SCIN
     */
    public java.lang.String getSCIN() {
        return SCIN;
    }


    /**
     * Sets the SCIN value for this CmecEPortalUpdPCMRequest.
     * 
     * @param SCIN
     */
    public void setSCIN(java.lang.String SCIN) {
        this.SCIN = SCIN;
    }


    /**
     * Gets the contactPreference value for this CmecEPortalUpdPCMRequest.
     * 
     * @return contactPreference
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMRequest.CmecEPortalUpdPCMRequestContactPreference getContactPreference() {
        return contactPreference;
    }


    /**
     * Sets the contactPreference value for this CmecEPortalUpdPCMRequest.
     * 
     * @param contactPreference
     */
    public void setContactPreference(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMRequest.CmecEPortalUpdPCMRequestContactPreference contactPreference) {
        this.contactPreference = contactPreference;
    }


    /**
     * Gets the languageSelection value for this CmecEPortalUpdPCMRequest.
     * 
     * @return languageSelection
     */
    public java.lang.String getLanguageSelection() {
        return languageSelection;
    }


    /**
     * Sets the languageSelection value for this CmecEPortalUpdPCMRequest.
     * 
     * @param languageSelection
     */
    public void setLanguageSelection(java.lang.String languageSelection) {
        this.languageSelection = languageSelection;
    }


    /**
     * Gets the source value for this CmecEPortalUpdPCMRequest.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this CmecEPortalUpdPCMRequest.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the SMSOptOutFlag value for this CmecEPortalUpdPCMRequest.
     * 
     * @return SMSOptOutFlag
     */
    public java.lang.String getSMSOptOutFlag() {
        return SMSOptOutFlag;
    }


    /**
     * Sets the SMSOptOutFlag value for this CmecEPortalUpdPCMRequest.
     * 
     * @param SMSOptOutFlag
     */
    public void setSMSOptOutFlag(java.lang.String SMSOptOutFlag) {
        this.SMSOptOutFlag = SMSOptOutFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalUpdPCMRequest)) return false;
        CmecEPortalUpdPCMRequest other = (CmecEPortalUpdPCMRequest) obj;
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
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.SCIN==null && other.getSCIN()==null) || 
             (this.SCIN!=null &&
              this.SCIN.equals(other.getSCIN()))) &&
            ((this.contactPreference==null && other.getContactPreference()==null) || 
             (this.contactPreference!=null &&
              this.contactPreference.equals(other.getContactPreference()))) &&
            ((this.languageSelection==null && other.getLanguageSelection()==null) || 
             (this.languageSelection!=null &&
              this.languageSelection.equals(other.getLanguageSelection()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.SMSOptOutFlag==null && other.getSMSOptOutFlag()==null) || 
             (this.SMSOptOutFlag!=null &&
              this.SMSOptOutFlag.equals(other.getSMSOptOutFlag())));
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
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getSCIN() != null) {
            _hashCode += getSCIN().hashCode();
        }
        if (getContactPreference() != null) {
            _hashCode += getContactPreference().hashCode();
        }
        if (getLanguageSelection() != null) {
            _hashCode += getLanguageSelection().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getSMSOptOutFlag() != null) {
            _hashCode += getSMSOptOutFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalUpdPCMRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdPCMRequest", "CmecEPortalUpdPCMRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseNumber"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdPCMRequest", ">CmecEPortalUpdPCMRequest>ContactPreference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LanguageSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSOptOutFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SMSOptOutFlag"));
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
