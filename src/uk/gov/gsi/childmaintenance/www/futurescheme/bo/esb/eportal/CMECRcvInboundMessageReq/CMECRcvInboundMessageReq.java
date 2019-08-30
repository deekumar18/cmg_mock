/**
 * CMECRcvInboundMessageReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CMECRcvInboundMessageReq;

public class CMECRcvInboundMessageReq  implements java.io.Serializable {
    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader;

    private java.lang.String SCIN;

    private java.lang.String ERN;

    private java.lang.String date;

    private java.lang.String subjectLine;

    private java.lang.String caseNumber;

    private java.lang.String messageText;

    private java.lang.String location;

    public CMECRcvInboundMessageReq() {
    }

    public CMECRcvInboundMessageReq(
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader,
           java.lang.String SCIN,
           java.lang.String ERN,
           java.lang.String date,
           java.lang.String subjectLine,
           java.lang.String caseNumber,
           java.lang.String messageText,
           java.lang.String location) {
           this.requestHeader = requestHeader;
           this.SCIN = SCIN;
           this.ERN = ERN;
           this.date = date;
           this.subjectLine = subjectLine;
           this.caseNumber = caseNumber;
           this.messageText = messageText;
           this.location = location;
    }


    /**
     * Gets the requestHeader value for this CMECRcvInboundMessageReq.
     * 
     * @return requestHeader
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader getRequestHeader() {
        return requestHeader;
    }


    /**
     * Sets the requestHeader value for this CMECRcvInboundMessageReq.
     * 
     * @param requestHeader
     */
    public void setRequestHeader(uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.CMECHeader_xsd.CMECHeader requestHeader) {
        this.requestHeader = requestHeader;
    }


    /**
     * Gets the SCIN value for this CMECRcvInboundMessageReq.
     * 
     * @return SCIN
     */
    public java.lang.String getSCIN() {
        return SCIN;
    }


    /**
     * Sets the SCIN value for this CMECRcvInboundMessageReq.
     * 
     * @param SCIN
     */
    public void setSCIN(java.lang.String SCIN) {
        this.SCIN = SCIN;
    }


    /**
     * Gets the ERN value for this CMECRcvInboundMessageReq.
     * 
     * @return ERN
     */
    public java.lang.String getERN() {
        return ERN;
    }


    /**
     * Sets the ERN value for this CMECRcvInboundMessageReq.
     * 
     * @param ERN
     */
    public void setERN(java.lang.String ERN) {
        this.ERN = ERN;
    }


    /**
     * Gets the date value for this CMECRcvInboundMessageReq.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this CMECRcvInboundMessageReq.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the subjectLine value for this CMECRcvInboundMessageReq.
     * 
     * @return subjectLine
     */
    public java.lang.String getSubjectLine() {
        return subjectLine;
    }


    /**
     * Sets the subjectLine value for this CMECRcvInboundMessageReq.
     * 
     * @param subjectLine
     */
    public void setSubjectLine(java.lang.String subjectLine) {
        this.subjectLine = subjectLine;
    }


    /**
     * Gets the caseNumber value for this CMECRcvInboundMessageReq.
     * 
     * @return caseNumber
     */
    public java.lang.String getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this CMECRcvInboundMessageReq.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(java.lang.String caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the messageText value for this CMECRcvInboundMessageReq.
     * 
     * @return messageText
     */
    public java.lang.String getMessageText() {
        return messageText;
    }


    /**
     * Sets the messageText value for this CMECRcvInboundMessageReq.
     * 
     * @param messageText
     */
    public void setMessageText(java.lang.String messageText) {
        this.messageText = messageText;
    }


    /**
     * Gets the location value for this CMECRcvInboundMessageReq.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CMECRcvInboundMessageReq.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CMECRcvInboundMessageReq)) return false;
        CMECRcvInboundMessageReq other = (CMECRcvInboundMessageReq) obj;
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
            ((this.SCIN==null && other.getSCIN()==null) || 
             (this.SCIN!=null &&
              this.SCIN.equals(other.getSCIN()))) &&
            ((this.ERN==null && other.getERN()==null) || 
             (this.ERN!=null &&
              this.ERN.equals(other.getERN()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.subjectLine==null && other.getSubjectLine()==null) || 
             (this.subjectLine!=null &&
              this.subjectLine.equals(other.getSubjectLine()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.messageText==null && other.getMessageText()==null) || 
             (this.messageText!=null &&
              this.messageText.equals(other.getMessageText()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getSCIN() != null) {
            _hashCode += getSCIN().hashCode();
        }
        if (getERN() != null) {
            _hashCode += getERN().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getSubjectLine() != null) {
            _hashCode += getSubjectLine().hashCode();
        }
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getMessageText() != null) {
            _hashCode += getMessageText().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CMECRcvInboundMessageReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CMECRcvInboundMessageReq", "CMECRcvInboundMessageReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/common/CMECHeader.xsd", "CMECHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ERN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubjectLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Location"));
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
