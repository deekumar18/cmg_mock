/**
 * CmecEPortalUpdCntctDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdCntctDetailsRequest;

public class CmecEPortalUpdCntctDetailsRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String caseNumber;

    private java.lang.String SCIN;

    private java.lang.String homePhoneNum;

    private java.lang.String workPhoneNum;

    private java.lang.String mobilePhoneNum;

    private java.lang.String email;

    private java.lang.String source;

    private java.lang.String workPhoneNumExtn;

    public CmecEPortalUpdCntctDetailsRequest() {
    }

    public CmecEPortalUpdCntctDetailsRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String caseNumber,
           java.lang.String SCIN,
           java.lang.String homePhoneNum,
           java.lang.String workPhoneNum,
           java.lang.String mobilePhoneNum,
           java.lang.String email,
           java.lang.String source,
           java.lang.String workPhoneNumExtn) {
           this.requestHeader = requestHeader;
           this.caseNumber = caseNumber;
           this.SCIN = SCIN;
           this.homePhoneNum = homePhoneNum;
           this.workPhoneNum = workPhoneNum;
           this.mobilePhoneNum = mobilePhoneNum;
           this.email = email;
           this.source = source;
           this.workPhoneNumExtn = workPhoneNumExtn;
    }


    /**
     * Gets the requestHeader value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the caseNumber value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @return caseNumber
     */
    public java.lang.String getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(java.lang.String caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the SCIN value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @return SCIN
     */
    public java.lang.String getSCIN() {
        return SCIN;
    }


    /**
     * Sets the SCIN value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @param SCIN
     */
    public void setSCIN(java.lang.String SCIN) {
        this.SCIN = SCIN;
    }


    /**
     * Gets the homePhoneNum value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @return homePhoneNum
     */
    public java.lang.String getHomePhoneNum() {
        return homePhoneNum;
    }


    /**
     * Sets the homePhoneNum value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @param homePhoneNum
     */
    public void setHomePhoneNum(java.lang.String homePhoneNum) {
        this.homePhoneNum = homePhoneNum;
    }


    /**
     * Gets the workPhoneNum value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @return workPhoneNum
     */
    public java.lang.String getWorkPhoneNum() {
        return workPhoneNum;
    }


    /**
     * Sets the workPhoneNum value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @param workPhoneNum
     */
    public void setWorkPhoneNum(java.lang.String workPhoneNum) {
        this.workPhoneNum = workPhoneNum;
    }


    /**
     * Gets the mobilePhoneNum value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @return mobilePhoneNum
     */
    public java.lang.String getMobilePhoneNum() {
        return mobilePhoneNum;
    }


    /**
     * Sets the mobilePhoneNum value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @param mobilePhoneNum
     */
    public void setMobilePhoneNum(java.lang.String mobilePhoneNum) {
        this.mobilePhoneNum = mobilePhoneNum;
    }


    /**
     * Gets the email value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the source value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the workPhoneNumExtn value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @return workPhoneNumExtn
     */
    public java.lang.String getWorkPhoneNumExtn() {
        return workPhoneNumExtn;
    }


    /**
     * Sets the workPhoneNumExtn value for this CmecEPortalUpdCntctDetailsRequest.
     * 
     * @param workPhoneNumExtn
     */
    public void setWorkPhoneNumExtn(java.lang.String workPhoneNumExtn) {
        this.workPhoneNumExtn = workPhoneNumExtn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalUpdCntctDetailsRequest)) return false;
        CmecEPortalUpdCntctDetailsRequest other = (CmecEPortalUpdCntctDetailsRequest) obj;
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
            ((this.homePhoneNum==null && other.getHomePhoneNum()==null) || 
             (this.homePhoneNum!=null &&
              this.homePhoneNum.equals(other.getHomePhoneNum()))) &&
            ((this.workPhoneNum==null && other.getWorkPhoneNum()==null) || 
             (this.workPhoneNum!=null &&
              this.workPhoneNum.equals(other.getWorkPhoneNum()))) &&
            ((this.mobilePhoneNum==null && other.getMobilePhoneNum()==null) || 
             (this.mobilePhoneNum!=null &&
              this.mobilePhoneNum.equals(other.getMobilePhoneNum()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.workPhoneNumExtn==null && other.getWorkPhoneNumExtn()==null) || 
             (this.workPhoneNumExtn!=null &&
              this.workPhoneNumExtn.equals(other.getWorkPhoneNumExtn())));
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
        if (getHomePhoneNum() != null) {
            _hashCode += getHomePhoneNum().hashCode();
        }
        if (getWorkPhoneNum() != null) {
            _hashCode += getWorkPhoneNum().hashCode();
        }
        if (getMobilePhoneNum() != null) {
            _hashCode += getMobilePhoneNum().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getWorkPhoneNumExtn() != null) {
            _hashCode += getWorkPhoneNumExtn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalUpdCntctDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdCntctDetailsRequest", "CmecEPortalUpdCntctDetailsRequest"));
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
        elemField.setFieldName("homePhoneNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HomePhoneNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPhoneNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkPhoneNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhoneNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MobilePhoneNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Email"));
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
        elemField.setFieldName("workPhoneNumExtn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkPhoneNumExtn"));
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
