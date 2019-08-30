/**
 * GetEmpStmtRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService;

public class GetEmpStmtRequest  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtRequest.CMECGetOnlineEmpStmtRequest getEmpStmtInput;

    public GetEmpStmtRequest() {
    }

    public GetEmpStmtRequest(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtRequest.CMECGetOnlineEmpStmtRequest getEmpStmtInput) {
           this.getEmpStmtInput = getEmpStmtInput;
    }


    /**
     * Gets the getEmpStmtInput value for this GetEmpStmtRequest.
     * 
     * @return getEmpStmtInput
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtRequest.CMECGetOnlineEmpStmtRequest getGetEmpStmtInput() {
        return getEmpStmtInput;
    }


    /**
     * Sets the getEmpStmtInput value for this GetEmpStmtRequest.
     * 
     * @param getEmpStmtInput
     */
    public void setGetEmpStmtInput(uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtRequest.CMECGetOnlineEmpStmtRequest getEmpStmtInput) {
        this.getEmpStmtInput = getEmpStmtInput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEmpStmtRequest)) return false;
        GetEmpStmtRequest other = (GetEmpStmtRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEmpStmtInput==null && other.getGetEmpStmtInput()==null) || 
             (this.getEmpStmtInput!=null &&
              this.getEmpStmtInput.equals(other.getGetEmpStmtInput())));
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
        if (getGetEmpStmtInput() != null) {
            _hashCode += getGetEmpStmtInput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEmpStmtRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetOnlineEmpStmtService", ">getEmpStmtRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEmpStmtInput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getEmpStmtInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/CMECGetOnlineEmpStmtRequest", "CMECGetOnlineEmpStmtRequest"));
        elemField.setNillable(true);
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
