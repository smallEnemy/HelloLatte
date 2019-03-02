package com.example.hellolatte.net;

import java.util.WeakHashMap;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by 57585 on 2019/2/23.
 */

public interface RestService {

    @GET
    Call<String> get(@Url String url, @QueryMap WeakHashMap<String,Object> params);

    @FormUrlEncoded
    @POST
    Call<String> post(@Url String url, @FieldMap WeakHashMap<String,Object> params);

    @POST
    Call<String> postRaw(@Url String url, @Body RequestBody requestBody);

    @FormUrlEncoded
    @PUT
    Call<String> put(@Url String url,@FieldMap WeakHashMap<String,Object> params);

    @PUT
    Call<String> putRaw(@Url String url,@Body RequestBody body);

    @DELETE
    Call<String> delete(@Url String url,@QueryMap WeakHashMap<String,Object> params);

    Call<ResponseBody> download(@Url String url,@QueryMap WeakHashMap<String,Object> params);

    @Multipart
    @POST
    Call<String> upload(@Url String url, @Part MultipartBody.Part file);

}
