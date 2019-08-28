
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetEmpStmtResponseVO {

    @SerializedName("getEmpStmtOutput")
    @Expose
    private GetEmpStmtOutput getEmpStmtOutput;

    public GetEmpStmtOutput getGetEmpStmtOutput() {
        return getEmpStmtOutput;
    }

    public void setGetEmpStmtOutput(GetEmpStmtOutput getEmpStmtOutput) {
        this.getEmpStmtOutput = getEmpStmtOutput;
    }

}
