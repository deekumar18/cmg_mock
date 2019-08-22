/**
 * CmecRetrievePromiseToPaySchdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecRetrievePromiseToPaySchdResponse;

public class CmecRetrievePromiseToPaySchdResponse  implements java.io.Serializable {
    private java.lang.String nrpAccountNumber;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response response;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecCollectionSchdDetails.CmecPromiseToPaySchdDetails[] promiseToPayScheduleDetailsCollection;

    public CmecRetrievePromiseToPaySchdResponse() {
    }

    public CmecRetrievePromiseToPaySchdResponse(
           java.lang.String nrpAccountNumber,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response response,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecCollectionSchdDetails.CmecPromiseToPaySchdDetails[] promiseToPayScheduleDetailsCollection) {
           this.nrpAccountNumber = nrpAccountNumber;
           this.response = response;
           this.promiseToPayScheduleDetailsCollection = promiseToPayScheduleDetailsCollection;
    }


    /**
     * Gets the nrpAccountNumber value for this CmecRetrievePromiseToPaySchdResponse.
     * 
     * @return nrpAccountNumber
     */
    public java.lang.String getNrpAccountNumber() {
        return nrpAccountNumber;
    }


    /**
     * Sets the nrpAccountNumber value for this CmecRetrievePromiseToPaySchdResponse.
     * 
     * @param nrpAccountNumber
     */
    public void setNrpAccountNumber(java.lang.String nrpAccountNumber) {
        this.nrpAccountNumber = nrpAccountNumber;
    }


    /**
     * Gets the response value for this CmecRetrievePromiseToPaySchdResponse.
     * 
     * @return response
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CmecRetrievePromiseToPaySchdResponse.
     * 
     * @param response
     */
    public void setResponse(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response response) {
        this.response = response;
    }


    /**
     * Gets the promiseToPayScheduleDetailsCollection value for this CmecRetrievePromiseToPaySchdResponse.
     * 
     * @return promiseToPayScheduleDetailsCollection
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecCollectionSchdDetails.CmecPromiseToPaySchdDetails[] getPromiseToPayScheduleDetailsCollection() {
        return promiseToPayScheduleDetailsCollection;
    }


    /**
     * Sets the promiseToPayScheduleDetailsCollection value for this CmecRetrievePromiseToPaySchdResponse.
     * 
     * @param promiseToPayScheduleDetailsCollection
     */
    public void setPromiseToPayScheduleDetailsCollection(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.maintenance.CmecCollectionSchdDetails.CmecPromiseToPaySchdDetails[] promiseToPayScheduleDetailsCollection) {
        this.promiseToPayScheduleDetailsCollection = promiseToPayScheduleDetailsCollection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecRetrievePromiseToPaySchdResponse)) return false;
        CmecRetrievePromiseToPaySchdResponse other = (CmecRetrievePromiseToPaySchdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nrpAccountNumber==null && other.getNrpAccountNumber()==null) || 
             (this.nrpAccountNumber!=null &&
              this.nrpAccountNumber.equals(other.getNrpAccountNumber()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.promiseToPayScheduleDetailsCollection==null && other.getPromiseToPayScheduleDetailsCollection()==null) || 
             (this.promiseToPayScheduleDetailsCollection!=null &&
              java.util.Arrays.equals(this.promiseToPayScheduleDetailsCollection, other.getPromiseToPayScheduleDetailsCollection())));
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
        if (getNrpAccountNumber() != null) {
            _hashCode += getNrpAccountNumber().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getPromiseToPayScheduleDetailsCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromiseToPayScheduleDetailsCollection());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromiseToPayScheduleDetailsCollection(), i);
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
        new org.apache.axis.description.TypeDesc(CmecRetrievePromiseToPaySchdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/maintenance/CmecRetrievePromiseToPaySchdResponse", "CmecRetrievePromiseToPaySchdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrpAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nrpAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promiseToPayScheduleDetailsCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PromiseToPayScheduleDetailsCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/maintenance/CmecCollectionSchdDetails", "CmecPromiseToPaySchdDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CollectionScheduleDetails"));
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
