
package com.thirdai.obsshackathon.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exposure {

    @SerializedName("exposureLevel")
    @Expose
    public String exposureLevel;
    @SerializedName("value")
    @Expose
    public Double value;

}
