/**
 * CMECGetOnlineEmpStmtRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtRequest;

public class CMECGetOnlineEmpStmtRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String accountId;

    private java.lang.String listFromDate;

    private java.lang.String listToDate;

    public CMECGetOnlineEmpStmtRequest() {
    }

    public CMECGetOnlineEmpStmtRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String accountId,
           java.lang.String listFromDate,
           java.lang.String listToDate) {
           this.requestHeader = requestHeader;
           this.accountId = accountId;
           this.listFromDate = listFromDate;
           this.listToDate = listToDate;
    }


    /**
     * Gets the requestHeader value for this CMECGetOnlineEmpStmtRequest.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CMECGetOnlineEmpStmtRequest.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the accountId value for this CMECGetOnlineEmpStmtRequest.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this CMECGetOnlineEmpStmtRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the listFromDate value for this CMECGetOnlineEmpStmtRequest.
     * 
     * @return listFromDate
     */
    public java.lang.String getListFromDate() {
        return listFromDate;
    }


    /**
     * Sets the listFromDate value for this CMECGetOnlineEmpStmtRequest.
     * 
     * @param listFromDate
     */
    public void setListFromDate(java.lang.String listFromDate) {
        this.listFromDate = listFromDate;
    }


    /**
     * Gets the listToDate value for this CMECGetOnlineEmpStmtRequest.
     * 
     * @return listToDate
     */
    public java.lang.String getListToDate() {
        return listToDate;
    }


    /**
     * Sets the listToDate value for this CMECGetOnlineEmpStmtRequest.
     * 
     * @param listToDate
     */
    public void setListToDate(java.lang.String listToDate) {
        this.listToDate = listToDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMECGetOnlineEmpStmtRequest)) return false;
        CMECGetOnlineEmpStmtRequest other = (CMECGetOnlineEmpStmtRequest) obj;
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
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.listFromDate==null && other.getListFromDate()==null) || 
             (this.listFromDate!=null &&
              this.listFromDate.equals(other.getListFromDate()))) &&
            ((this.listToDate==null && other.getListToDate()==null) || 
             (this.listToDate!=null &&
              this.listToDate.equals(other.getListToDate())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getListFromDate() != null) {
            _hashCode += getListFromDate().hashCode();
        }
        if (getListToDate() != null) {
            _hashCode += getListToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMECGetOnlineEmpStmtRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/CMECGetOnlineEmpStmtRequest", "CMECGetOnlineEmpStmtRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listToDate"));
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
