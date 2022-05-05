package com.example.camrad.rungapput.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.camrad.DBruning
import com.example.camrad.rungapput.other.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDB(@ApplicationContext app: Context)
    = Room.databaseBuilder(
        app, DBruning::class.java,
        RUNNING_DATABASE_NAME

    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: DBruning) = db.getRunDao()
}