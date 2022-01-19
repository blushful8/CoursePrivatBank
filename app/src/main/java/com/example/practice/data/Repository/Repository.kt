package com.example.practice.data.Repository

import com.example.practice.data.api.RetrofitInstance
import com.example.practice.model.beznal.Beznal
import com.example.practice.model.beznal.BeznalItem
import com.example.practice.model.nal.Nal
import com.example.practice.model.nal.NalItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nal>{
        return RetrofitInstance.api.getNalMoney()
    }


    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoney()
    }
}