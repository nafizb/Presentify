
package com.thirdai.obsshackathon.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Noise {

    @SerializedName("noiseLevel")
    @Expose
    public String noiseLevel;
    @SerializedName("value")
    @Expose
    public Double value;

}
