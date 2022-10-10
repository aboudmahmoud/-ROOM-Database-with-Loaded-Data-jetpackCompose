package com.example.roomdatapasewithcompest.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface PersonDao {
    @Query("SElECT * FROM preson")
    fun readAll(): Flow<List<Preson>>
}