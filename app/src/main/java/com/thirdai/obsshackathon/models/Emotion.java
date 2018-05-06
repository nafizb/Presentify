
package com.thirdai.obsshackathon.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Emotion {

    @SerializedName("anger")
    @Expose
    public Double anger;
    @SerializedName("contempt")
    @Expose
    public Double contempt;
    @SerializedName("disgust")
    @Expose
    public Double disgust;
    @SerializedName("fear")
    @Expose
    public Double fear;
    @SerializedName("happiness")
    @Expose
    public Double happiness;
    @SerializedName("neutral")
    @Expose
    public Double neutral;
    @SerializedName("sadness")
    @Expose
    public Double sadness;
    @SerializedName("surprise")
    @Expose
    public Double surprise;

}
