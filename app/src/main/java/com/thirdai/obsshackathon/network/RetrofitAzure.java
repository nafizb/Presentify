package com.thirdai.obsshackathon.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Nafiz on 5/5/2018.
 */

public class RetrofitAzure {

    private static RetrofitAzure sRetrofitAzure;

    public static RetrofitAzure getInstance() {
        if (sRetrofitAzure != null) return sRetrofitAzure;
        sRetrofitAzure = new RetrofitAzure();
        return sRetrofitAzure;
    }

    public Retrofit retrofit;

    RetrofitAzure() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();


                        request = request.newBuilder()
                                .header("Ocp-Apim-Subscription-Key", "13f1a5fc39454aba8a249db1fa13b4c3")
                                .header("Content-Type", "application/octet-stream")
                                .removeHeader("Pragma")
                                .build();


                        okhttp3.Response response = chain.proceed(request);
                        //response.cacheResponse();
                        // Customize or return the response
                        return response;
                    }
                })
                //.cache(cache)

                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl("https://westeurope.api.cognitive.microsoft.com/face/v1.0/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public AzureService getApiService () {
        return retrofit.create(AzureService.class);
    }
}
