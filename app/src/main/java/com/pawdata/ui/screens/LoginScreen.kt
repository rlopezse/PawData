package com.pawdata.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun LoginScreen() {
    Column(
        Modifier.fillMaxSize()
    ) {
        Column(
            Modifier.weight(1f)
        ) {
            Column(
            ) {
                AsyncImage(
                    model = "https://pngimg.com/uploads/cat/cat_PNG115412.png",
                    contentDescription = "Translated description of the image",
                    modifier = Modifier.size(200.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Hola! bienvenido a PawData"
                )
                Text(
                    text= "Para ingresar ingresa tu correo y contrasena"
                )
            }
            Row(
                Modifier.fillMaxWidth()
            ) {
                Text("Correo")
            }
            Row(
                Modifier.fillMaxWidth()
            ) {
                Text("Contrasena")
                Text("Olvidaste tu contrasena?")
            }
        }
        Column(
            Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    println("hola desde botton")
                }) {
                Text("ingresar")
            }
            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = "Ya tengo una cuenta"
            )
        }
    }
}