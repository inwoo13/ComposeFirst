package com.inflean.composefirst

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage
import com.inflean.composefirst.ui.theme.ComposeFirstTheme

// Surface

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFirstTheme {
                MySurface2()
            }
        }
    }
}

@Composable
fun MySurface1() {

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        color = Color.Red,
        shape = RoundedCornerShape(20.dp),
        shadowElevation = 20.dp
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Green
            )
        ) {
            Text(text = "클릭해보세요")
        }
    }

}

@Composable
fun MySurface2() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray,
        border = BorderStroke(2.dp, Color.Red),
        contentColor = Color.Blue
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Surface(
                modifier = Modifier.size(200.dp),
                color = Color.Red
            ) {
                Text(text = "This is Jetpack Compose")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "This is Jetpack Compose Ex"
            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeFirstTheme {
        MySurface2()
    }
}