package com.thirdai.obsshackathon.network;

import com.thirdai.obsshackathon.models.FaceDatum;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Nafiz on 5/5/2018.
 */

public interface AzureService {
    @POST("detect")
    Call<List<FaceDatum>> getFaceData(@Query("returnFaceId") String returnFaceId,
                                      @Query("returnFaceLandmarks") String returnFaceLandmarks,
                                      @Query("returnFaceAttributes") String returnFaceAttributes,
                                      @Body RequestBody photo);

}
