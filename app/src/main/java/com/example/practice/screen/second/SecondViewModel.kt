package com.example.practice.screen.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practice.data.Repository.Repository
import com.example.practice.model.beznal.Beznal
import com.example.practice.model.nal.Nal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel:ViewModel() {
    val repository = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repository.getBeznal()
        }
    }
}