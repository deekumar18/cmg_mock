/**
 * CmecEPortalUpdateMOPRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdateMOPRequest;

public class CmecEPortalUpdateMOPRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String SRAction;

    private java.lang.String SRArea;

    private java.lang.String SRSubArea;

    private java.lang.String source;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails finCorpAccntDtls;

    public CmecEPortalUpdateMOPRequest() {
    }

    public CmecEPortalUpdateMOPRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String SRAction,
           java.lang.String SRArea,
           java.lang.String SRSubArea,
           java.lang.String source,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails finCorpAccntDtls) {
           this.requestHeader = requestHeader;
           this.SRAction = SRAction;
           this.SRArea = SRArea;
           this.SRSubArea = SRSubArea;
           this.source = source;
           this.finCorpAccntDtls = finCorpAccntDtls;
    }


    /**
     * Gets the requestHeader value for this CmecEPortalUpdateMOPRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CmecEPortalUpdateMOPRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the SRAction value for this CmecEPortalUpdateMOPRequest.
     * 
     * @return SRAction
     */
    public java.lang.String getSRAction() {
        return SRAction;
    }


    /**
     * Sets the SRAction value for this CmecEPortalUpdateMOPRequest.
     * 
     * @param SRAction
     */
    public void setSRAction(java.lang.String SRAction) {
        this.SRAction = SRAction;
    }


    /**
     * Gets the SRArea value for this CmecEPortalUpdateMOPRequest.
     * 
     * @return SRArea
     */
    public java.lang.String getSRArea() {
        return SRArea;
    }


    /**
     * Sets the SRArea value for this CmecEPortalUpdateMOPRequest.
     * 
     * @param SRArea
     */
    public void setSRArea(java.lang.String SRArea) {
        this.SRArea = SRArea;
    }


    /**
     * Gets the SRSubArea value for this CmecEPortalUpdateMOPRequest.
     * 
     * @return SRSubArea
     */
    public java.lang.String getSRSubArea() {
        return SRSubArea;
    }


    /**
     * Sets the SRSubArea value for this CmecEPortalUpdateMOPRequest.
     * 
     * @param SRSubArea
     */
    public void setSRSubArea(java.lang.String SRSubArea) {
        this.SRSubArea = SRSubArea;
    }


    /**
     * Gets the source value for this CmecEPortalUpdateMOPRequest.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this CmecEPortalUpdateMOPRequest.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the finCorpAccntDtls value for this CmecEPortalUpdateMOPRequest.
     * 
     * @return finCorpAccntDtls
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails getFinCorpAccntDtls() {
        return finCorpAccntDtls;
    }


    /**
     * Sets the finCorpAccntDtls value for this CmecEPortalUpdateMOPRequest.
     * 
     * @param finCorpAccntDtls
     */
    public void setFinCorpAccntDtls(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails finCorpAccntDtls) {
        this.finCorpAccntDtls = finCorpAccntDtls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalUpdateMOPRequest)) return false;
        CmecEPortalUpdateMOPRequest other = (CmecEPortalUpdateMOPRequest) obj;
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
            ((this.SRAction==null && other.getSRAction()==null) || 
             (this.SRAction!=null &&
              this.SRAction.equals(other.getSRAction()))) &&
            ((this.SRArea==null && other.getSRArea()==null) || 
             (this.SRArea!=null &&
              this.SRArea.equals(other.getSRArea()))) &&
            ((this.SRSubArea==null && other.getSRSubArea()==null) || 
             (this.SRSubArea!=null &&
              this.SRSubArea.equals(other.getSRSubArea()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.finCorpAccntDtls==null && other.getFinCorpAccntDtls()==null) || 
             (this.finCorpAccntDtls!=null &&
              this.finCorpAccntDtls.equals(other.getFinCorpAccntDtls())));
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
        if (getSRAction() != null) {
            _hashCode += getSRAction().hashCode();
        }
        if (getSRArea() != null) {
            _hashCode += getSRArea().hashCode();
        }
        if (getSRSubArea() != null) {
            _hashCode += getSRSubArea().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getFinCorpAccntDtls() != null) {
            _hashCode += getFinCorpAccntDtls().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalUpdateMOPRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdateMOPRequest", "CmecEPortalUpdateMOPRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SRAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SRArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRSubArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SRSubArea"));
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
        elemField.setFieldName("finCorpAccntDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FinCorpAccntDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalFinCorpAccountDetails", "CmecEPortalFinCorpAccountDetails"));
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
