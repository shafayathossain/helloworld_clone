package com.shafayat.helloworld.di.module

import com.shafayat.helloworld.data.main.MainRepository
import com.shafayat.helloworld.data.main.MainRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindMainRepository(repo: MainRepositoryImpl): MainRepository

}