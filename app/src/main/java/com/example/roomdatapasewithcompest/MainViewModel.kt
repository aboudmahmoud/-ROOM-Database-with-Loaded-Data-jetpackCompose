package com.example.roomdatapasewithcompest

import androidx.lifecycle.ViewModel
import com.example.roomdatapasewithcompest.data.PersonResportry
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
 class MainViewModel @Inject constructor(
    personResportry: PersonResportry
): ViewModel() {
val readAll=personResportry.readAll
}
