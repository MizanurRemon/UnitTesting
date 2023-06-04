package com.readapp.unittesting

import android.os.Bundle
import android.provider.SyncStateContract.Helpers
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.readapp.unittesting.Utils.Helper
import com.readapp.unittesting.ui.theme.UnitTestingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitTestingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "${Helper.validatePassword("").toString()}")

    Log.d("dataxx", "Greeting: ${Helper.badData().size.toString()}")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UnitTestingTheme {
        Greeting("Android")
    }
}