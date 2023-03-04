package com.excellence.compose.wanandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.excellence.compose.wanandroid.ui.theme.ComposeWanAndroidTheme
import com.excellence.compose.wanandroid.utils.TextPreViewParameterProvider

/**
 * https://weilu.blog.csdn.net/article/details/121457651?spm=1001.2014.3001.5502
 */
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
    AddClickText()
}

@Composable
fun AddClickText() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var text by remember {
            mutableStateOf("xxx")
        }

        Text(text = text,
            style = TextStyle(
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            ),
            modifier = Modifier
                .size(100.dp, 100.dp)
                .clickable {
                    text = "abc"
                })

    }
}

@Preview(
    showBackground = true,
    name = "default"
)
@Composable
fun DefaultPreview(@PreviewParameter(TextPreViewParameterProvider::class) name: String) {
    ComposeWanAndroidTheme {
        Greeting(name)
    }
}