package com.afauzi.examplemvvm.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.afauzi.examplemvvm.models.Item

class MainViewModel: ViewModel() {
    private val items = MutableLiveData<List<Item>>()

    fun loadItems() {
        //load items from repository, database, network or any other source
        items.value = listOf(Item(1, "Akhmad Fauzi", "Android Developer"))
    }

    fun getItems(): LiveData<List<Item>> {
        return items
    }
}