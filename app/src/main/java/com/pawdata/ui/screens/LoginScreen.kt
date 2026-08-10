package com.pawdata.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.pawdata.theme.errorSemantic800
import com.pawdata.theme.neutral200
import com.pawdata.theme.neutral400
import com.pawdata.theme.neutral600
import com.pawdata.theme.primary400

fun validarFormulario() {
    println("validar forulario")
}

@Composable
fun LoginScreen() {
    var name by remember { mutableStateOf("") }
    var mail by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        Modifier.fillMaxSize()
    ) {
        Column(
            Modifier.weight(1f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                AsyncImage(
                    model = "https://pngimg.com/uploads/cat/cat_PNG115412.png",
                    contentDescription = "Translated description of the image",
                    modifier = Modifier.size(200.dp)
                )
                Text(
                    text = "¡Hola! Bienvenido",
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp,
                )
                Text(
                    textAlign = TextAlign.Center,
                    text = "Crear tu cuenta para ingresar :)",
                    fontSize = 14.sp,
                    color = neutral600
                )
            }

            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    state = rememberTextFieldState(initialText = ""),
                    label = { Text("Nombre") },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = primary400,     // Border color when focused
                        unfocusedBorderColor = neutral200,   // Border color when not focused
                        errorBorderColor = errorSemantic800,        // Border color when in error state
                        disabledBorderColor = neutral600 // Border color when disabled
                    )
                )

                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    state = rememberTextFieldState(initialText = ""),
                    label = { Text("Correo") },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = primary400,     // Border color when focused
                        unfocusedBorderColor = neutral200,   // Border color when not focused
                        errorBorderColor = errorSemantic800,        // Border color when in error state
                        disabledBorderColor = neutral600 // Border color when disabled
                    )
                )

                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    state = rememberTextFieldState(initialText = ""),
                    label = { Text("Contraseña") },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = primary400,     // Border color when focused
                        unfocusedBorderColor = neutral200,   // Border color when not focused
                        errorBorderColor = errorSemantic800,        // Border color when in error state
                        disabledBorderColor = neutral600 // Border color when disabled
                    )
                )
            }
        }
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    validarFormulario()
                }) {
                Text("Crear usuario")
            }
            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                color = neutral600,
                text = "Ya tengo una cuenta"
            )
        }
    }
}