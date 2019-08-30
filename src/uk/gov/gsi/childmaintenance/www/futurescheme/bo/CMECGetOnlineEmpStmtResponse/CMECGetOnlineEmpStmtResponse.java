/**
 * CMECGetOnlineEmpStmtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtResponse;

public class CMECGetOnlineEmpStmtResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader;

    private java.lang.String accountId;

    private java.lang.String listToDate;

    private java.lang.String statementDate;

    private java.lang.String currencyCode;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.EmpStmtDetails.EmpStmtDetails[] empStmtDetailsCollection;

    public CMECGetOnlineEmpStmtResponse() {
    }

    public CMECGetOnlineEmpStmtResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader,
           java.lang.String accountId,
           java.lang.String listToDate,
           java.lang.String statementDate,
           java.lang.String currencyCode,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.EmpStmtDetails.EmpStmtDetails[] empStmtDetailsCollection) {
           this.responseHeader = responseHeader;
           this.accountId = accountId;
           this.listToDate = listToDate;
           this.statementDate = statementDate;
           this.currencyCode = currencyCode;
           this.empStmtDetailsCollection = empStmtDetailsCollection;
    }


    /**
     * Gets the responseHeader value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the accountId value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the listToDate value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @return listToDate
     */
    public java.lang.String getListToDate() {
        return listToDate;
    }


    /**
     * Sets the listToDate value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @param listToDate
     */
    public void setListToDate(java.lang.String listToDate) {
        this.listToDate = listToDate;
    }


    /**
     * Gets the statementDate value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @return statementDate
     */
    public java.lang.String getStatementDate() {
        return statementDate;
    }


    /**
     * Sets the statementDate value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @param statementDate
     */
    public void setStatementDate(java.lang.String statementDate) {
        this.statementDate = statementDate;
    }


    /**
     * Gets the currencyCode value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the empStmtDetailsCollection value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @return empStmtDetailsCollection
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.EmpStmtDetails.EmpStmtDetails[] getEmpStmtDetailsCollection() {
        return empStmtDetailsCollection;
    }


    /**
     * Sets the empStmtDetailsCollection value for this CMECGetOnlineEmpStmtResponse.
     * 
     * @param empStmtDetailsCollection
     */
    public void setEmpStmtDetailsCollection(uk.gov.gsi.childmaintenance.www.futurescheme.bo.EmpStmtDetails.EmpStmtDetails[] empStmtDetailsCollection) {
        this.empStmtDetailsCollection = empStmtDetailsCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMECGetOnlineEmpStmtResponse)) return false;
        CMECGetOnlineEmpStmtResponse other = (CMECGetOnlineEmpStmtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseHeader==null && other.getResponseHeader()==null) || 
             (this.responseHeader!=null &&
              this.responseHeader.equals(other.getResponseHeader()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.listToDate==null && other.getListToDate()==null) || 
             (this.listToDate!=null &&
              this.listToDate.equals(other.getListToDate()))) &&
            ((this.statementDate==null && other.getStatementDate()==null) || 
             (this.statementDate!=null &&
              this.statementDate.equals(other.getStatementDate()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.empStmtDetailsCollection==null && other.getEmpStmtDetailsCollection()==null) || 
             (this.empStmtDetailsCollection!=null &&
              java.util.Arrays.equals(this.empStmtDetailsCollection, other.getEmpStmtDetailsCollection())));
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
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getListToDate() != null) {
            _hashCode += getListToDate().hashCode();
        }
        if (getStatementDate() != null) {
            _hashCode += getStatementDate().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getEmpStmtDetailsCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpStmtDetailsCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpStmtDetailsCollection(), i);
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
        new org.apache.axis.description.TypeDesc(CMECGetOnlineEmpStmtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/CMECGetOnlineEmpStmtResponse", "CMECGetOnlineEmpStmtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
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
        elemField.setFieldName("listToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empStmtDetailsCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmpStmtDetailsCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/EmpStmtDetails", "EmpStmtDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "EmpStmtDetails"));
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
