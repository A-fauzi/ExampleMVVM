package com.afauzi.examplemvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.afauzi.examplemvvm.R
import com.afauzi.examplemvvm.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Observe change in items
        viewModel.loadItems()
        viewModel.getItems().observe(this) {
            Log.d("MainActivity", it.toString())
        }
    }
}