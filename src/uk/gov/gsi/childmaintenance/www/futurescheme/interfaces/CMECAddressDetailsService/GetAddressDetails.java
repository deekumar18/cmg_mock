/**
 * GetAddressDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECAddressDetailsService;

public class GetAddressDetails  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsRequest.GetAddressDetailsRequest getAddressDetailsInput;

    public GetAddressDetails() {
    }

    public GetAddressDetails(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsRequest.GetAddressDetailsRequest getAddressDetailsInput) {
           this.getAddressDetailsInput = getAddressDetailsInput;
    }


    /**
     * Gets the getAddressDetailsInput value for this GetAddressDetails.
     * 
     * @return getAddressDetailsInput
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsRequest.GetAddressDetailsRequest getGetAddressDetailsInput() {
        return getAddressDetailsInput;
    }


    /**
     * Sets the getAddressDetailsInput value for this GetAddressDetails.
     * 
     * @param getAddressDetailsInput
     */
    public void setGetAddressDetailsInput(uk.gov.gsi.childmaintenance.www.futurescheme.bo.asbo.address.GetAddressDetailsRequest.GetAddressDetailsRequest getAddressDetailsInput) {
        this.getAddressDetailsInput = getAddressDetailsInput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAddressDetails)) return false;
        GetAddressDetails other = (GetAddressDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAddressDetailsInput==null && other.getGetAddressDetailsInput()==null) || 
             (this.getAddressDetailsInput!=null &&
              this.getAddressDetailsInput.equals(other.getGetAddressDetailsInput())));
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
        if (getGetAddressDetailsInput() != null) {
            _hashCode += getGetAddressDetailsInput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAddressDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/interfaces/CMECAddressDetailsService", ">GetAddressDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAddressDetailsInput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getAddressDetailsInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/asbo/address/GetAddressDetailsRequest", "GetAddressDetailsRequest"));
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
