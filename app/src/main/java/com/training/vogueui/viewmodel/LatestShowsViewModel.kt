package com.training.vogueui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.training.vogueui.dummyresponse.getLatestShows
import com.training.vogueui.model.FashionShow
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LatestShowsViewModel constructor( private val dispatcher: CoroutineDispatcher= Dispatchers.IO): ViewModel() {

    private val _isLoading = MutableLiveData<Boolean>(false)
    val isLoading: LiveData<Boolean> = _isLoading

    private val _latestShows: MutableLiveData<ArrayList<FashionShow>> = MutableLiveData(ArrayList())
    val latestShows: LiveData<ArrayList<FashionShow>> = _latestShows

    fun loadFashionShows() {
        viewModelScope.launch(dispatcher) {
            _isLoading.postValue(true)
            delay(2000)
            _isLoading.postValue(false)
            _latestShows.postValue(getLatestShows())
        }
    }


}
