package com.retrofitsample

import com.retrofitsample.model.RetrofitSampleResponse
import retrofit2.Call
import retrofit2.http.POST

/**
 * Created by HP on 11-05-2018.
 */
interface RestApi {

    @POST("5af538ec5500002b287a54d3/")
    fun networkCall(): Call<List<RetrofitSampleResponse>>

}