/**
 * GetAddressDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService;

public class GetAddressDetailsResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsResponse.GetAddressDetailsResponse getAddressDetailsOutput;

    public GetAddressDetailsResponse() {
    }

    public GetAddressDetailsResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsResponse.GetAddressDetailsResponse getAddressDetailsOutput) {
           this.getAddressDetailsOutput = getAddressDetailsOutput;
    }


    /**
     * Gets the getAddressDetailsOutput value for this GetAddressDetailsResponse.
     * 
     * @return getAddressDetailsOutput
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsResponse.GetAddressDetailsResponse getGetAddressDetailsOutput() {
        return getAddressDetailsOutput;
    }


    /**
     * Sets the getAddressDetailsOutput value for this GetAddressDetailsResponse.
     * 
     * @param getAddressDetailsOutput
     */
    public void setGetAddressDetailsOutput(uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsResponse.GetAddressDetailsResponse getAddressDetailsOutput) {
        this.getAddressDetailsOutput = getAddressDetailsOutput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAddressDetailsResponse)) return false;
        GetAddressDetailsResponse other = (GetAddressDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAddressDetailsOutput==null && other.getGetAddressDetailsOutput()==null) || 
             (this.getAddressDetailsOutput!=null &&
              this.getAddressDetailsOutput.equals(other.getGetAddressDetailsOutput())));
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
        if (getGetAddressDetailsOutput() != null) {
            _hashCode += getGetAddressDetailsOutput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAddressDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECAddressDetailsService", ">GetAddressDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAddressDetailsOutput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getAddressDetailsOutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/asbo/address/GetAddressDetailsResponse", "GetAddressDetailsResponse"));
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
