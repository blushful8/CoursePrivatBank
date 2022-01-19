package com.example.practice.data.api

import com.example.practice.model.beznal.Beznal
import com.example.practice.model.nal.Nal
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoney(): Response<Nal>
    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoney(): Response<Beznal>
}