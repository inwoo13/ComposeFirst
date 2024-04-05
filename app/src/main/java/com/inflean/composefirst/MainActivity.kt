package com.inflean.composefirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.inflean.composefirst.ui.theme.ComposeFirstTheme

// Image

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFirstTheme {
                MyImageTest2()
            }
        }
    }
}

@Composable
fun MyImageTest1(){
    Image(
        painter = painterResource(id = R.drawable.pen),
        contentDescription = "pen"
    )
}

@Composable
fun MyImageTest2(){ // 웹에 있는 이미지를 가져올거임
    AsyncImage(
        model = "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/612763581/1800",
        contentDescription = "펭귄사진",
        modifier = Modifier.fillMaxSize()
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeFirstTheme {
        MyImageTest2()
    }
}