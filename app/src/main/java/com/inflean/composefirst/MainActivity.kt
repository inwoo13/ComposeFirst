package com.inflean.composefirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.inflean.composefirst.ui.theme.ComposeFirstTheme

// column -> 세로로 줄 세워서 배치
// spacer / divider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeFirstTheme {
                ColumnTest1()
            }
        }
    }
}

@Composable
fun ColumnTest1() {
    Column(
        modifier = Modifier.padding(30.dp)  // 컬럼 자체의 padding
    ) {
        Text(
            text = "안녕하세요1",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.padding(30.dp))  // 간격 두기
        Divider(    // 구분선
            thickness = 4.dp,
            color = Color.Blue
        )
        Text(
            text = "반갑습니다1",
            fontSize = 30.sp
        )
        Text(
            text = "반갑습니다2",
            fontSize = 30.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeFirstTheme {
        ColumnTest1()
    }
}