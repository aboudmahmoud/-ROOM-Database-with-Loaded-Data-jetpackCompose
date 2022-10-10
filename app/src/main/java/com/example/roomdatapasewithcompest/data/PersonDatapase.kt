package com.example.roomdatapasewithcompest.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Preson::class], version = 1, exportSchema = true)
abstract class PersonDatapase:RoomDatabase() {
    abstract fun personDao():PersonDao
}