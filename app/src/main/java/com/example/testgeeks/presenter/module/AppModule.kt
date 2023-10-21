package com.example.testgeeks.presenter.module

import com.example.testgeeks.data.SportRepositoryMock
import com.example.testgeeks.domain.repository.RepositorySport
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideRepository():RepositorySport{
        return SportRepositoryMock()
    }
}