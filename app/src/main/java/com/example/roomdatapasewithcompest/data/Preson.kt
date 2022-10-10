package com.example.roomdatapasewithcompest.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="preson")
data class Preson (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val Name:String,
    val age:Int,
        )