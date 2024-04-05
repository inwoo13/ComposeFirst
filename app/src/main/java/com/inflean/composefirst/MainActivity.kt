package com.inflean.composefirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.inflean.composefirst.ui.theme.ComposeFirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFirstTheme {
                SimpleCounterBtn()
            }
        }
    }
}

@Composable
fun SimpleCounterBtn() {

    var count by remember {
        mutableStateOf(0)
    }

    Button(onClick = { count++ }, modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Count : $count",
            fontSize = 50.sp
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeFirstTheme {
        SimpleCounterBtn()
    }
}