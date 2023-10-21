package com.example.testgeeks.domain.repository

import com.example.testgeeks.domain.model.HomeModel

interface RepositorySport {

    fun getClub():List<HomeModel>

}