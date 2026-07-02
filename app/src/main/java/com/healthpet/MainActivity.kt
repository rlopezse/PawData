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
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.healthpet.ui.theme.Pink40
import com.healthpet.ui.theme.Purple40
import com.healthpet.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Col(
                        "Hola",
                        modifier = Modifier
                            .weight(1f)
                            .background(Purple40)
                            .padding(8.dp)
                    )
                    Col(
                        "Chao",
                        modifier = Modifier
                            .weight(1f)
                            .background(Pink40)
                            .padding(8.dp)
                    )

                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Col(
                        "Left Col",
                        modifier = Modifier
                            .weight(1f)
                            .background(Pink40)
                            .padding(8.dp, 8.dp)
                    )
                    Col(
                        "Center Col",
                        modifier = Modifier
                            .weight(1f)
                            .background(Color.Blue)
                            .padding(8.dp, 8.dp)
                    )
                    Col(
                        "Right Col",
                        modifier = Modifier
                            .weight(1f)
                            .background(Color.Blue)
                            .padding(8.dp, 8.dp)
                    )
                }

                Column(
                    Modifier.weight(1f).fillMaxWidth().background(PurpleGrey40)
                ) {
                    Text(
                        text = "Body",
                        color = Color.White
                    )

                    Texto()
                }

                Row(modifier = Modifier.fillMaxWidth().background(Purple40).padding(8.dp)) {
                    Text(
                        text = "footer",
                        color = Color.White
                    )

                    Counter()
                }
            }
        }
    }

    @Composable
    fun Counter()
    {
        var count by remember {
            mutableIntStateOf(0)
        }

        Button(onClick = {
            count++
        }) {
            Text("Has hecho $count clics")

        }

        Text("Valor actual: $count")
    }

    @Composable
    fun Texto(){
        var texto by remember {
            mutableStateOf("")
        }

        TextField(
            value = texto,
            onValueChange = {
                texto = it
            },
            label = { Text("Ingresa tu texto") },
            modifier = Modifier.fillMaxWidth()

        )
    }

    @Composable
    fun Col(
        text: String = "ingresa tu texto",
        modifier: Modifier
    ){
        Column(
            modifier
        )
        {
            Text(
                text = text,
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }
}