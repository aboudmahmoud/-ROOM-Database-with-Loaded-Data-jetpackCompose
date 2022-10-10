package com.example.roomdatapasewithcompest.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomdatapasewithcompest.data.PersonDatapase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseMoudel {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context:Context
    )= Room.databaseBuilder(context,PersonDatapase::class.java,"my_database").createFromAsset("database/preson.db").build()

    @Singleton
    @Provides
    fun provideDao(database:PersonDatapase)=database.personDao()
}