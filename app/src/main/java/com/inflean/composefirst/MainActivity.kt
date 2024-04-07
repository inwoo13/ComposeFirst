package com.inflean.composefirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.inflean.composefirst.ui.theme.ComposeFirstTheme

// Row
// Column과 반대

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFirstTheme {
                RowTest()
            }
        }
    }
}

@Composable
fun RowTest() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
        horizontalArrangement = Arrangement.SpaceEvenly, // 가로로 동일한 간격
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "item1")
        Text(text = "item2")
        Text(text = "item3")
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeFirstTheme {
        RowTest()
    }
}