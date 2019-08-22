/**
 * GetEmpStmtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECGetOnlineEmpStmtService;

public class GetEmpStmtResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtResponse.CMECGetOnlineEmpStmtResponse getEmpStmtOutput;

    public GetEmpStmtResponse() {
    }

    public GetEmpStmtResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtResponse.CMECGetOnlineEmpStmtResponse getEmpStmtOutput) {
           this.getEmpStmtOutput = getEmpStmtOutput;
    }


    /**
     * Gets the getEmpStmtOutput value for this GetEmpStmtResponse.
     * 
     * @return getEmpStmtOutput
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtResponse.CMECGetOnlineEmpStmtResponse getGetEmpStmtOutput() {
        return getEmpStmtOutput;
    }


    /**
     * Sets the getEmpStmtOutput value for this GetEmpStmtResponse.
     * 
     * @param getEmpStmtOutput
     */
    public void setGetEmpStmtOutput(uk.gov.gsi.childmaintenance.www.futurescheme.bo.CMECGetOnlineEmpStmtResponse.CMECGetOnlineEmpStmtResponse getEmpStmtOutput) {
        this.getEmpStmtOutput = getEmpStmtOutput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEmpStmtResponse)) return false;
        GetEmpStmtResponse other = (GetEmpStmtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEmpStmtOutput==null && other.getGetEmpStmtOutput()==null) || 
             (this.getEmpStmtOutput!=null &&
              this.getEmpStmtOutput.equals(other.getGetEmpStmtOutput())));
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
        if (getGetEmpStmtOutput() != null) {
            _hashCode += getGetEmpStmtOutput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEmpStmtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECGetOnlineEmpStmtService", ">getEmpStmtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEmpStmtOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getEmpStmtOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/CMECGetOnlineEmpStmtResponse", "CMECGetOnlineEmpStmtResponse"));
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
