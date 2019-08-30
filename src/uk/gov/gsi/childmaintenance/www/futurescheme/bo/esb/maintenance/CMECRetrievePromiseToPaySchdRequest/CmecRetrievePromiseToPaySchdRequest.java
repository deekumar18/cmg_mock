/**
 * CmecRetrievePromiseToPaySchdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CMECRetrievePromiseToPaySchdRequest;

public class CmecRetrievePromiseToPaySchdRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String nrpAccountNumber;

    private java.lang.String refId;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String mopType;

    private java.lang.String mopId;

    private java.lang.String status;

    private java.lang.String versionNumber;

    private java.lang.String pwcAccountNumber;

    private java.lang.String serviceType;

    public CmecRetrievePromiseToPaySchdRequest() {
    }

    public CmecRetrievePromiseToPaySchdRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String nrpAccountNumber,
           java.lang.String refId,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String mopType,
           java.lang.String mopId,
           java.lang.String status,
           java.lang.String versionNumber,
           java.lang.String pwcAccountNumber,
           java.lang.String serviceType) {
           this.requestHeader = requestHeader;
           this.nrpAccountNumber = nrpAccountNumber;
           this.refId = refId;
           this.startDate = startDate;
           this.endDate = endDate;
           this.mopType = mopType;
           this.mopId = mopId;
           this.status = status;
           this.versionNumber = versionNumber;
           this.pwcAccountNumber = pwcAccountNumber;
           this.serviceType = serviceType;
    }


    /**
     * Gets the requestHeader value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the nrpAccountNumber value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return nrpAccountNumber
     */
    public java.lang.String getNrpAccountNumber() {
        return nrpAccountNumber;
    }


    /**
     * Sets the nrpAccountNumber value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param nrpAccountNumber
     */
    public void setNrpAccountNumber(java.lang.String nrpAccountNumber) {
        this.nrpAccountNumber = nrpAccountNumber;
    }


    /**
     * Gets the refId value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return refId
     */
    public java.lang.String getRefId() {
        return refId;
    }


    /**
     * Sets the refId value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param refId
     */
    public void setRefId(java.lang.String refId) {
        this.refId = refId;
    }


    /**
     * Gets the startDate value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the mopType value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return mopType
     */
    public java.lang.String getMopType() {
        return mopType;
    }


    /**
     * Sets the mopType value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param mopType
     */
    public void setMopType(java.lang.String mopType) {
        this.mopType = mopType;
    }


    /**
     * Gets the mopId value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return mopId
     */
    public java.lang.String getMopId() {
        return mopId;
    }


    /**
     * Sets the mopId value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param mopId
     */
    public void setMopId(java.lang.String mopId) {
        this.mopId = mopId;
    }


    /**
     * Gets the status value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the versionNumber value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return versionNumber
     */
    public java.lang.String getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.String versionNumber) {
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the pwcAccountNumber value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return pwcAccountNumber
     */
    public java.lang.String getPwcAccountNumber() {
        return pwcAccountNumber;
    }


    /**
     * Sets the pwcAccountNumber value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param pwcAccountNumber
     */
    public void setPwcAccountNumber(java.lang.String pwcAccountNumber) {
        this.pwcAccountNumber = pwcAccountNumber;
    }


    /**
     * Gets the serviceType value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this CmecRetrievePromiseToPaySchdRequest.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecRetrievePromiseToPaySchdRequest)) return false;
        CmecRetrievePromiseToPaySchdRequest other = (CmecRetrievePromiseToPaySchdRequest) obj;
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
            ((this.nrpAccountNumber==null && other.getNrpAccountNumber()==null) || 
             (this.nrpAccountNumber!=null &&
              this.nrpAccountNumber.equals(other.getNrpAccountNumber()))) &&
            ((this.refId==null && other.getRefId()==null) || 
             (this.refId!=null &&
              this.refId.equals(other.getRefId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.mopType==null && other.getMopType()==null) || 
             (this.mopType!=null &&
              this.mopType.equals(other.getMopType()))) &&
            ((this.mopId==null && other.getMopId()==null) || 
             (this.mopId!=null &&
              this.mopId.equals(other.getMopId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber()))) &&
            ((this.pwcAccountNumber==null && other.getPwcAccountNumber()==null) || 
             (this.pwcAccountNumber!=null &&
              this.pwcAccountNumber.equals(other.getPwcAccountNumber()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType())));
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
        if (getNrpAccountNumber() != null) {
            _hashCode += getNrpAccountNumber().hashCode();
        }
        if (getRefId() != null) {
            _hashCode += getRefId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getMopType() != null) {
            _hashCode += getMopType().hashCode();
        }
        if (getMopId() != null) {
            _hashCode += getMopId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        if (getPwcAccountNumber() != null) {
            _hashCode += getPwcAccountNumber().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecRetrievePromiseToPaySchdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/maintenance/CMECRetrievePromiseToPaySchdRequest", "CmecRetrievePromiseToPaySchdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrpAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nrpAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refId"));
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
        elemField.setFieldName("mopType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mopType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mopId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mopId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwcAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwcAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceType"));
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
