package com.inflean.composefirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.inflean.composefirst.ui.theme.ComposeFirstTheme

// Box
// 적당히 레이아웃 항목을 겹쳐서 내가 원하는 위치에 배치할 수 있음

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFirstTheme {
                BoxExample()
            }
        }
    }
}

@Composable
fun BoxExample(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
    ){
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Blue)
                .padding(16.dp)
                .align(Alignment.TopStart)
        ){
            Text(text = "왼쪽 위")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Green)
                .padding(16.dp)
                .align(Alignment.TopCenter)
        ){
            Text(text = "중앙 위")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Gray)
                .padding(16.dp)
                .align(Alignment.TopEnd)
        ){
            Text(text = "오른쪽 위")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeFirstTheme {
        BoxExample()
    }
}