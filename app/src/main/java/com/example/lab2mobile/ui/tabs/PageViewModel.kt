package com.example.lab2mobile.ui.tabs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = _index.map {
        "Hello world from section: ${it + 1}"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}