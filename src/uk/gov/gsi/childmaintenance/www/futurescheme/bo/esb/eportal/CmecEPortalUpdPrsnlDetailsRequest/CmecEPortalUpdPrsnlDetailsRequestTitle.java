/**
 * CmecEPortalUpdPrsnlDetailsRequestTitle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalUpdPrsnlDetailsRequest;

public class CmecEPortalUpdPrsnlDetailsRequestTitle implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CmecEPortalUpdPrsnlDetailsRequestTitle(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Miss";
    public static final java.lang.String _value2 = "Mr.";
    public static final java.lang.String _value3 = "Ms.";
    public static final java.lang.String _value4 = "Mrs.";
    public static final java.lang.String _value5 = "Rev.";
    public static final java.lang.String _value6 = "Dr.";
    public static final CmecEPortalUpdPrsnlDetailsRequestTitle value1 = new CmecEPortalUpdPrsnlDetailsRequestTitle(_value1);
    public static final CmecEPortalUpdPrsnlDetailsRequestTitle value2 = new CmecEPortalUpdPrsnlDetailsRequestTitle(_value2);
    public static final CmecEPortalUpdPrsnlDetailsRequestTitle value3 = new CmecEPortalUpdPrsnlDetailsRequestTitle(_value3);
    public static final CmecEPortalUpdPrsnlDetailsRequestTitle value4 = new CmecEPortalUpdPrsnlDetailsRequestTitle(_value4);
    public static final CmecEPortalUpdPrsnlDetailsRequestTitle value5 = new CmecEPortalUpdPrsnlDetailsRequestTitle(_value5);
    public static final CmecEPortalUpdPrsnlDetailsRequestTitle value6 = new CmecEPortalUpdPrsnlDetailsRequestTitle(_value6);
    public java.lang.String getValue() { return _value_;}
    public static CmecEPortalUpdPrsnlDetailsRequestTitle fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CmecEPortalUpdPrsnlDetailsRequestTitle enumeration = (CmecEPortalUpdPrsnlDetailsRequestTitle)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CmecEPortalUpdPrsnlDetailsRequestTitle fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CmecEPortalUpdPrsnlDetailsRequestTitle.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalUpdPrsnlDetailsRequest", ">CmecEPortalUpdPrsnlDetailsRequest>Title"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
