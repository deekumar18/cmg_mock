/**
 * EmpStmtDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.bo.EmpStmtDetails;

public class EmpStmtDetails  implements java.io.Serializable {
    private java.lang.String transactionDate;

    private java.lang.String transactionDescription;

    private java.lang.String debitAmount;

    private java.lang.String creditAmount;

    private java.lang.String balance;

    public EmpStmtDetails() {
    }

    public EmpStmtDetails(
           java.lang.String transactionDate,
           java.lang.String transactionDescription,
           java.lang.String debitAmount,
           java.lang.String creditAmount,
           java.lang.String balance) {
           this.transactionDate = transactionDate;
           this.transactionDescription = transactionDescription;
           this.debitAmount = debitAmount;
           this.creditAmount = creditAmount;
           this.balance = balance;
    }


    /**
     * Gets the transactionDate value for this EmpStmtDetails.
     * 
     * @return transactionDate
     */
    public java.lang.String getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this EmpStmtDetails.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.lang.String transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transactionDescription value for this EmpStmtDetails.
     * 
     * @return transactionDescription
     */
    public java.lang.String getTransactionDescription() {
        return transactionDescription;
    }


    /**
     * Sets the transactionDescription value for this EmpStmtDetails.
     * 
     * @param transactionDescription
     */
    public void setTransactionDescription(java.lang.String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }


    /**
     * Gets the debitAmount value for this EmpStmtDetails.
     * 
     * @return debitAmount
     */
    public java.lang.String getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this EmpStmtDetails.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(java.lang.String debitAmount) {
        this.debitAmount = debitAmount;
    }


    /**
     * Gets the creditAmount value for this EmpStmtDetails.
     * 
     * @return creditAmount
     */
    public java.lang.String getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this EmpStmtDetails.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(java.lang.String creditAmount) {
        this.creditAmount = creditAmount;
    }


    /**
     * Gets the balance value for this EmpStmtDetails.
     * 
     * @return balance
     */
    public java.lang.String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this EmpStmtDetails.
     * 
     * @param balance
     */
    public void setBalance(java.lang.String balance) {
        this.balance = balance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmpStmtDetails)) return false;
        EmpStmtDetails other = (EmpStmtDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.transactionDescription==null && other.getTransactionDescription()==null) || 
             (this.transactionDescription!=null &&
              this.transactionDescription.equals(other.getTransactionDescription()))) &&
            ((this.debitAmount==null && other.getDebitAmount()==null) || 
             (this.debitAmount!=null &&
              this.debitAmount.equals(other.getDebitAmount()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              this.creditAmount.equals(other.getCreditAmount()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance())));
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
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getTransactionDescription() != null) {
            _hashCode += getTransactionDescription().hashCode();
        }
        if (getDebitAmount() != null) {
            _hashCode += getDebitAmount().hashCode();
        }
        if (getCreditAmount() != null) {
            _hashCode += getCreditAmount().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmpStmtDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.childmaintenance.gsi.gov.uk/futurescheme/bo/EmpStmtDetails", "EmpStmtDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
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
