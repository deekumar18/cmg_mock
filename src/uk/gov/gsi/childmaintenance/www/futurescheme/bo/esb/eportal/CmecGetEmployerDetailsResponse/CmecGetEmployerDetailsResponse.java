/**
 * CmecGetEmployerDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecGetEmployerDetailsResponse;

public class CmecGetEmployerDetailsResponse  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmployerDetails.CmecEPortalEmployerDetails employerDetails;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] employerAddress;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails[] employerContact;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails[] finCorpDetails;

    public CmecGetEmployerDetailsResponse() {
    }

    public CmecGetEmployerDetailsResponse(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmployerDetails.CmecEPortalEmployerDetails employerDetails,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] employerAddress,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails[] employerContact,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails[] finCorpDetails) {
           this.responseHeader = responseHeader;
           this.employerDetails = employerDetails;
           this.employerAddress = employerAddress;
           this.employerContact = employerContact;
           this.finCorpDetails = finCorpDetails;
    }


    /**
     * Gets the responseHeader value for this CmecGetEmployerDetailsResponse.
     * 
     * @return responseHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CmecGetEmployerDetailsResponse.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response responseHeader) {
        this.responseHeader = responseHeader;
    }


    /**
     * Gets the employerDetails value for this CmecGetEmployerDetailsResponse.
     * 
     * @return employerDetails
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmployerDetails.CmecEPortalEmployerDetails getEmployerDetails() {
        return employerDetails;
    }


    /**
     * Sets the employerDetails value for this CmecGetEmployerDetailsResponse.
     * 
     * @param employerDetails
     */
    public void setEmployerDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEmployerDetails.CmecEPortalEmployerDetails employerDetails) {
        this.employerDetails = employerDetails;
    }


    /**
     * Gets the employerAddress value for this CmecGetEmployerDetailsResponse.
     * 
     * @return employerAddress
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] getEmployerAddress() {
        return employerAddress;
    }


    /**
     * Sets the employerAddress value for this CmecGetEmployerDetailsResponse.
     * 
     * @param employerAddress
     */
    public void setEmployerAddress(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress[] employerAddress) {
        this.employerAddress = employerAddress;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress getEmployerAddress(int i) {
        return this.employerAddress[i];
    }

    public void setEmployerAddress(int i, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalAddress.CmecEPortalAddress _value) {
        this.employerAddress[i] = _value;
    }


    /**
     * Gets the employerContact value for this CmecGetEmployerDetailsResponse.
     * 
     * @return employerContact
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails[] getEmployerContact() {
        return employerContact;
    }


    /**
     * Sets the employerContact value for this CmecGetEmployerDetailsResponse.
     * 
     * @param employerContact
     */
    public void setEmployerContact(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails[] employerContact) {
        this.employerContact = employerContact;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails getEmployerContact(int i) {
        return this.employerContact[i];
    }

    public void setEmployerContact(int i, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalContactDetails.CmecEPortalContactDetails _value) {
        this.employerContact[i] = _value;
    }


    /**
     * Gets the finCorpDetails value for this CmecGetEmployerDetailsResponse.
     * 
     * @return finCorpDetails
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails[] getFinCorpDetails() {
        return finCorpDetails;
    }


    /**
     * Sets the finCorpDetails value for this CmecGetEmployerDetailsResponse.
     * 
     * @param finCorpDetails
     */
    public void setFinCorpDetails(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails[] finCorpDetails) {
        this.finCorpDetails = finCorpDetails;
    }

    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails getFinCorpDetails(int i) {
        return this.finCorpDetails[i];
    }

    public void setFinCorpDetails(int i, uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalFinCorpAccountDetails.CmecEPortalFinCorpAccountDetails _value) {
        this.finCorpDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecGetEmployerDetailsResponse)) return false;
        CmecGetEmployerDetailsResponse other = (CmecGetEmployerDetailsResponse) obj;
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
            ((this.employerDetails==null && other.getEmployerDetails()==null) || 
             (this.employerDetails!=null &&
              this.employerDetails.equals(other.getEmployerDetails()))) &&
            ((this.employerAddress==null && other.getEmployerAddress()==null) || 
             (this.employerAddress!=null &&
              java.util.Arrays.equals(this.employerAddress, other.getEmployerAddress()))) &&
            ((this.employerContact==null && other.getEmployerContact()==null) || 
             (this.employerContact!=null &&
              java.util.Arrays.equals(this.employerContact, other.getEmployerContact()))) &&
            ((this.finCorpDetails==null && other.getFinCorpDetails()==null) || 
             (this.finCorpDetails!=null &&
              java.util.Arrays.equals(this.finCorpDetails, other.getFinCorpDetails())));
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
        if (getEmployerDetails() != null) {
            _hashCode += getEmployerDetails().hashCode();
        }
        if (getEmployerAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployerAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployerAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployerContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployerContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployerContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFinCorpDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFinCorpDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFinCorpDetails(), i);
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
        new org.apache.axis.description.TypeDesc(CmecGetEmployerDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecGetEmployerDetailsResponse", "CmecGetEmployerDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/Response.xsd", "Response"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalEmployerDetails", "CmecEPortalEmployerDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalAddress", "CmecEPortalAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employerContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmployerContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalContactDetails", "CmecEPortalContactDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finCorpDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FinCorpDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalFinCorpAccountDetails", "CmecEPortalFinCorpAccountDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
