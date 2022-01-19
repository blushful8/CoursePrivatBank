package com.example.practice.screen.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practice.data.Repository.Repository
import com.example.practice.model.nal.Nal
import com.example.practice.model.nal.NalItem
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel:ViewModel() {
val repository = Repository()
    val myMoneyList: MutableLiveData<Response<Nal>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repository.getNal()
        }
    }
}