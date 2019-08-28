
package uk.gov.dwp.esb.vo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetEmpStmtOutput {

    @SerializedName("responseHeader")
    @Expose
    private ResponseHeader responseHeader;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("listToDate")
    @Expose
    private String listToDate;
    @SerializedName("statementDate")
    @Expose
    private String statementDate;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("empStmtDetailsCollection")
    @Expose
    private List<EmpStmtDetailsCollection> empStmtDetailsCollection = null;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getListToDate() {
        return listToDate;
    }

    public void setListToDate(String listToDate) {
        this.listToDate = listToDate;
    }

    public String getStatementDate() {
        return statementDate;
    }

    public void setStatementDate(String statementDate) {
        this.statementDate = statementDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public List<EmpStmtDetailsCollection> getEmpStmtDetailsCollection() {
        return empStmtDetailsCollection;
    }

    public void setEmpStmtDetailsCollection(List<EmpStmtDetailsCollection> empStmtDetailsCollection) {
        this.empStmtDetailsCollection = empStmtDetailsCollection;
    }

}
