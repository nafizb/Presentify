
package com.thirdai.obsshackathon.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Blur {

    @SerializedName("blurLevel")
    @Expose
    public String blurLevel;
    @SerializedName("value")
    @Expose
    public Double value;

}
