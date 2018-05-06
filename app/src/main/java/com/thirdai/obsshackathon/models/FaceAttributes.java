
package com.thirdai.obsshackathon.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FaceAttributes {

    @SerializedName("age")
    @Expose
    public Double age;
    @SerializedName("gender")
    @Expose
    public String gender;
    @SerializedName("smile")
    @Expose
    public Double smile;
    @SerializedName("emotion")
    @Expose
    public Emotion emotion;
    @SerializedName("blur")
    @Expose
    public Blur blur;
    @SerializedName("exposure")
    @Expose
    public Exposure exposure;
    @SerializedName("noise")
    @Expose
    public Noise noise;

}
