package com.example.testgeeks.presenter.viewmodel

import com.example.testgeeks.domain.model.HomeModel

data class SportState (
    val home:List<HomeModel> = emptyList()
        )