package com.example.testgeeks.data

import com.example.testgeeks.R
import com.example.testgeeks.domain.model.HomeModel
import com.example.testgeeks.domain.repository.RepositorySport

class SportRepositoryMock:RepositorySport {
    override fun getClub(): List<HomeModel> {
        return listOf(
            HomeModel(
            R.drawable.img_chelsea, "Chelsea", "1905"
        ),
            HomeModel(
                R.drawable.img_arsenal, "Arsenal", "1900"
            ),
            HomeModel(
                R.drawable.img_lester, "Lester", "1950"
            ),
            HomeModel(
                R.drawable.img_liverpool, "Liverpool", "1920"
            ),
            HomeModel(
                R.drawable.img_man_city, "Man city", "1900"
            ),
            HomeModel(
                R.drawable.img_man_utd, "Man Utd", "1905"
            ),




            )
    }
}