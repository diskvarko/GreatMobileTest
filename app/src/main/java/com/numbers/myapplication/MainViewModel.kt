package com.numbers.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository) :ViewModel() {

    val myResponse: MutableLiveData<List<Post>> = MutableLiveData()

    fun getNews(){
        viewModelScope.launch {
            val response: List<Post> = repository.getNews()
            myResponse.value = response
        }
    }
}