package com.example.roomdatapasewithcompest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.roomdatapasewithcompest.ui.theme.RoomDatapaseWithCompestTheme
import com.example.roomdatapasewithcompest.ui.theme.Typography1
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  mainViewModel:MainViewModel by lazy {

            ViewModelProvider(this)[MainViewModel::class.java]
        }
        setContent {
            val result by mainViewModel.readAll.collectAsState(initial = emptyList())
            RoomDatapaseWithCompestTheme {

                Column(
                    modifier=Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if(result.isNotEmpty())
                    {
                        for(preson in result )
                        {
                            Text(text = preson.Name, fontSize = Typography1.bodyMedium.fontSize)
                        }
                    }else{
                        Text(text = "No Data In database", fontSize = Typography1.bodyMedium.fontSize)
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RoomDatapaseWithCompestTheme {
        Greeting("Android")
    }
}