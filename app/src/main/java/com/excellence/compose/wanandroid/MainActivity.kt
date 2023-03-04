package com.excellence.compose.wanandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.excellence.compose.wanandroid.ui.theme.ComposeWanAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWanAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "Hello $name!")
        Text(text = "Hello World")
    }
}

@Preview(
    showBackground = true,
    name = "default"
)
@Composable
fun DefaultPreview() {
    ComposeWanAndroidTheme {
        Greeting("Android")
    }
}

@Preview(
    showBackground = true,
    name = "Nexus",
    device = Devices.NEXUS_10
)
@Composable
fun DefaultPreviewNexus() {
    ComposeWanAndroidTheme {
        Greeting(name = "Nexus")
    }
}

@Preview(
    showBackground = false,
    name = "TV",
    device = Devices.PIXEL_XL
)
@Composable
fun DefaultPreViewTV() {
    ComposeWanAndroidTheme {
        Greeting(name = "Pixel")
    }
}