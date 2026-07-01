package com.healthpet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.healthpet.ui.theme.Pink40
import com.healthpet.ui.theme.Purple40

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .background(Purple40)
                            .padding(8.dp, 8.dp)
                    ) {
                        Text(
                            text = "Left Col",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .background(Color.Green)
                            .padding(8.dp, 8.dp)
                    ) {
                        Text(
                            text = "Right Col",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .background(Pink40)
                            .padding(8.dp, 8.dp)
                    ) {
                        Text(
                            text = "Left Col",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .background(Color.Blue)
                            .padding(8.dp, 8.dp)
                    ) {
                        Text(
                            text = "Center col",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .background(Color.Red)
                            .padding(8.dp, 8.dp)
                    ) {
                        Text(
                            text = "Right Col",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                }
                Column(Modifier.weight(1f)) {
                    Text("body")
                }
                Row(modifier = Modifier.fillMaxWidth().background(Purple40)) {
                    Text("footer")
                }
            }
        }
    }
}