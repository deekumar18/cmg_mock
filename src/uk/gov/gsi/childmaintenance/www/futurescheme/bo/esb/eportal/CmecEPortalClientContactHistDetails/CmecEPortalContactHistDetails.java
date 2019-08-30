/**
 * CmecEPortalContactHistDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalClientContactHistDetails;

public class CmecEPortalContactHistDetails  implements java.io.Serializable {
    private java.lang.String caseId;

    private java.lang.String subject;

    private java.lang.String refId;

    private java.lang.String dateOfCorrespondence;

    private java.lang.String ltrTmplCode;

    private java.lang.String typeOfCorrespondence;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalDocumentDetails.CmecEPortalDocumentDetails[] listOfDocuments;

    private java.lang.String messageFlag;

    private java.lang.String description;

    private uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEnclosuresDetails.CmecEPortalEnclosuresDetails[] listOfEnclosures;

    private java.lang.String clientFacingName;

    public CmecEPortalContactHistDetails() {
    }

    public CmecEPortalContactHistDetails(
           java.lang.String caseId,
           java.lang.String subject,
           java.lang.String refId,
           java.lang.String dateOfCorrespondence,
           java.lang.String ltrTmplCode,
           java.lang.String typeOfCorrespondence,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalDocumentDetails.CmecEPortalDocumentDetails[] listOfDocuments,
           java.lang.String messageFlag,
           java.lang.String description,
           uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEnclosuresDetails.CmecEPortalEnclosuresDetails[] listOfEnclosures,
           java.lang.String clientFacingName) {
           this.caseId = caseId;
           this.subject = subject;
           this.refId = refId;
           this.dateOfCorrespondence = dateOfCorrespondence;
           this.ltrTmplCode = ltrTmplCode;
           this.typeOfCorrespondence = typeOfCorrespondence;
           this.listOfDocuments = listOfDocuments;
           this.messageFlag = messageFlag;
           this.description = description;
           this.listOfEnclosures = listOfEnclosures;
           this.clientFacingName = clientFacingName;
    }


    /**
     * Gets the caseId value for this CmecEPortalContactHistDetails.
     * 
     * @return caseId
     */
    public java.lang.String getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this CmecEPortalContactHistDetails.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.String caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the subject value for this CmecEPortalContactHistDetails.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this CmecEPortalContactHistDetails.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the refId value for this CmecEPortalContactHistDetails.
     * 
     * @return refId
     */
    public java.lang.String getRefId() {
        return refId;
    }


    /**
     * Sets the refId value for this CmecEPortalContactHistDetails.
     * 
     * @param refId
     */
    public void setRefId(java.lang.String refId) {
        this.refId = refId;
    }


    /**
     * Gets the dateOfCorrespondence value for this CmecEPortalContactHistDetails.
     * 
     * @return dateOfCorrespondence
     */
    public java.lang.String getDateOfCorrespondence() {
        return dateOfCorrespondence;
    }


    /**
     * Sets the dateOfCorrespondence value for this CmecEPortalContactHistDetails.
     * 
     * @param dateOfCorrespondence
     */
    public void setDateOfCorrespondence(java.lang.String dateOfCorrespondence) {
        this.dateOfCorrespondence = dateOfCorrespondence;
    }


    /**
     * Gets the ltrTmplCode value for this CmecEPortalContactHistDetails.
     * 
     * @return ltrTmplCode
     */
    public java.lang.String getLtrTmplCode() {
        return ltrTmplCode;
    }


    /**
     * Sets the ltrTmplCode value for this CmecEPortalContactHistDetails.
     * 
     * @param ltrTmplCode
     */
    public void setLtrTmplCode(java.lang.String ltrTmplCode) {
        this.ltrTmplCode = ltrTmplCode;
    }


    /**
     * Gets the typeOfCorrespondence value for this CmecEPortalContactHistDetails.
     * 
     * @return typeOfCorrespondence
     */
    public java.lang.String getTypeOfCorrespondence() {
        return typeOfCorrespondence;
    }


    /**
     * Sets the typeOfCorrespondence value for this CmecEPortalContactHistDetails.
     * 
     * @param typeOfCorrespondence
     */
    public void setTypeOfCorrespondence(java.lang.String typeOfCorrespondence) {
        this.typeOfCorrespondence = typeOfCorrespondence;
    }


    /**
     * Gets the listOfDocuments value for this CmecEPortalContactHistDetails.
     * 
     * @return listOfDocuments
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalDocumentDetails.CmecEPortalDocumentDetails[] getListOfDocuments() {
        return listOfDocuments;
    }


    /**
     * Sets the listOfDocuments value for this CmecEPortalContactHistDetails.
     * 
     * @param listOfDocuments
     */
    public void setListOfDocuments(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalDocumentDetails.CmecEPortalDocumentDetails[] listOfDocuments) {
        this.listOfDocuments = listOfDocuments;
    }


    /**
     * Gets the messageFlag value for this CmecEPortalContactHistDetails.
     * 
     * @return messageFlag
     */
    public java.lang.String getMessageFlag() {
        return messageFlag;
    }


    /**
     * Sets the messageFlag value for this CmecEPortalContactHistDetails.
     * 
     * @param messageFlag
     */
    public void setMessageFlag(java.lang.String messageFlag) {
        this.messageFlag = messageFlag;
    }


    /**
     * Gets the description value for this CmecEPortalContactHistDetails.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CmecEPortalContactHistDetails.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the listOfEnclosures value for this CmecEPortalContactHistDetails.
     * 
     * @return listOfEnclosures
     */
    public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEnclosuresDetails.CmecEPortalEnclosuresDetails[] getListOfEnclosures() {
        return listOfEnclosures;
    }


    /**
     * Sets the listOfEnclosures value for this CmecEPortalContactHistDetails.
     * 
     * @param listOfEnclosures
     */
    public void setListOfEnclosures(uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.eportal.CmecEPortalEnclosuresDetails.CmecEPortalEnclosuresDetails[] listOfEnclosures) {
        this.listOfEnclosures = listOfEnclosures;
    }


    /**
     * Gets the clientFacingName value for this CmecEPortalContactHistDetails.
     * 
     * @return clientFacingName
     */
    public java.lang.String getClientFacingName() {
        return clientFacingName;
    }


    /**
     * Sets the clientFacingName value for this CmecEPortalContactHistDetails.
     * 
     * @param clientFacingName
     */
    public void setClientFacingName(java.lang.String clientFacingName) {
        this.clientFacingName = clientFacingName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CmecEPortalContactHistDetails)) return false;
        CmecEPortalContactHistDetails other = (CmecEPortalContactHistDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caseId==null && other.getCaseId()==null) || 
             (this.caseId!=null &&
              this.caseId.equals(other.getCaseId()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.refId==null && other.getRefId()==null) || 
             (this.refId!=null &&
              this.refId.equals(other.getRefId()))) &&
            ((this.dateOfCorrespondence==null && other.getDateOfCorrespondence()==null) || 
             (this.dateOfCorrespondence!=null &&
              this.dateOfCorrespondence.equals(other.getDateOfCorrespondence()))) &&
            ((this.ltrTmplCode==null && other.getLtrTmplCode()==null) || 
             (this.ltrTmplCode!=null &&
              this.ltrTmplCode.equals(other.getLtrTmplCode()))) &&
            ((this.typeOfCorrespondence==null && other.getTypeOfCorrespondence()==null) || 
             (this.typeOfCorrespondence!=null &&
              this.typeOfCorrespondence.equals(other.getTypeOfCorrespondence()))) &&
            ((this.listOfDocuments==null && other.getListOfDocuments()==null) || 
             (this.listOfDocuments!=null &&
              java.util.Arrays.equals(this.listOfDocuments, other.getListOfDocuments()))) &&
            ((this.messageFlag==null && other.getMessageFlag()==null) || 
             (this.messageFlag!=null &&
              this.messageFlag.equals(other.getMessageFlag()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.listOfEnclosures==null && other.getListOfEnclosures()==null) || 
             (this.listOfEnclosures!=null &&
              java.util.Arrays.equals(this.listOfEnclosures, other.getListOfEnclosures()))) &&
            ((this.clientFacingName==null && other.getClientFacingName()==null) || 
             (this.clientFacingName!=null &&
              this.clientFacingName.equals(other.getClientFacingName())));
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
        if (getCaseId() != null) {
            _hashCode += getCaseId().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getRefId() != null) {
            _hashCode += getRefId().hashCode();
        }
        if (getDateOfCorrespondence() != null) {
            _hashCode += getDateOfCorrespondence().hashCode();
        }
        if (getLtrTmplCode() != null) {
            _hashCode += getLtrTmplCode().hashCode();
        }
        if (getTypeOfCorrespondence() != null) {
            _hashCode += getTypeOfCorrespondence().hashCode();
        }
        if (getListOfDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessageFlag() != null) {
            _hashCode += getMessageFlag().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getListOfEnclosures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfEnclosures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfEnclosures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientFacingName() != null) {
            _hashCode += getClientFacingName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CmecEPortalContactHistDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalClientContactHistDetails", "CmecEPortalContactHistDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RefId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfCorrespondence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateOfCorrespondence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ltrTmplCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LtrTmplCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfCorrespondence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TypeOfCorrespondence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListOfDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalDocumentDetails", "CmecEPortalDocumentDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Documents"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MessageFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfEnclosures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListOfEnclosures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/esb/eportal/CmecEPortalEnclosuresDetails", "CmecEPortalEnclosuresDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Enclosures"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientFacingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientFacingName"));
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
