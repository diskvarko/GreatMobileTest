package com.numbers.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        val viewModel: MainViewModel =
                ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        viewModel.getNews()

        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("Response", response.toString())
        })
    }
}
