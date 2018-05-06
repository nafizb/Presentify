
package com.thirdai.obsshackathon.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FaceDatum {

    @SerializedName("faceId")
    @Expose
    public String faceId;
    @SerializedName("faceAttributes")
    @Expose
    public FaceAttributes faceAttributes;

}
