
package uk.gov.dwp.esb.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListOfEnclosure {

    @SerializedName("enclosureDocId")
    @Expose
    private String enclosureDocId;

    public String getEnclosureDocId() {
        return enclosureDocId;
    }

    public void setEnclosureDocId(String enclosureDocId) {
        this.enclosureDocId = enclosureDocId;
    }

}
