/**
 * CmecEPortalUpdPCMRequestContactPreference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPCMRequest;

public class CmecEPortalUpdPCMRequestContactPreference implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CmecEPortalUpdPCMRequestContactPreference(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Letter";
    public static final java.lang.String _value2 = "Telephone";
    public static final java.lang.String _value3 = "Self Service";
    public static final CmecEPortalUpdPCMRequestContactPreference value1 = new CmecEPortalUpdPCMRequestContactPreference(_value1);
    public static final CmecEPortalUpdPCMRequestContactPreference value2 = new CmecEPortalUpdPCMRequestContactPreference(_value2);
    public static final CmecEPortalUpdPCMRequestContactPreference value3 = new CmecEPortalUpdPCMRequestContactPreference(_value3);
    public java.lang.String getValue() { return _value_;}
    public static CmecEPortalUpdPCMRequestContactPreference fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CmecEPortalUpdPCMRequestContactPreference enumeration = (CmecEPortalUpdPCMRequestContactPreference)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CmecEPortalUpdPCMRequestContactPreference fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalUpdPCMRequestContactPreference.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdPCMRequest", ">CmecEPortalUpdPCMRequest>ContactPreference"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
