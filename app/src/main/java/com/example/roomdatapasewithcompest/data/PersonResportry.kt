package com.example.roomdatapasewithcompest.data

import javax.inject.Inject

class PersonResportry @Inject constructor(
    private val personDao: PersonDao
) {
val readAll=personDao.readAll()
}