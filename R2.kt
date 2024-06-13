package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("2207020349周俊飞")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = name,
            modifier = modifier
                .width(133.dp)
                .fillMaxHeight()
                .background(color),
        contentAlignment = Alignment.Center
    ){
        Text(text = context)
    }
}
fun BoxDemo(color:Color,context:String){
    Box(modifier = Modifier)
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowRGB(){
    Row(){
        BoxDemo(Color,Red,"红色")
        BoxDemo(Color,Green,"绿色")
        BoxDemo(Color,Blue,"蓝色")

    }
}
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("2207020349周俊飞")
    }
}