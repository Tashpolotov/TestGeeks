package com.example.testgeeks.presenter.viewmodel

import androidx.lifecycle.ViewModel
import com.example.testgeeks.domain.repository.RepositorySport
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SportViewModel @Inject constructor(val repositorySport: RepositorySport):ViewModel() {

    private val _sport = MutableStateFlow(SportState())
    val sport : StateFlow<SportState> = _sport.asStateFlow()

    fun loadHome(){
        val home = repositorySport.getClub()
        _sport.value = _sport.value.copy(home = home)
    }

}