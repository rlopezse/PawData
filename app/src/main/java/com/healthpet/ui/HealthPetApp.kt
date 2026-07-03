package com.healthpet.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.healthpet.theme.White
import com.healthpet.ui.components.PetCard

@Composable
fun HealthPetApp(){
    Column(modifier = Modifier.fillMaxSize().background(White).padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
            PetCard(
                1,
                "\uD83D\uDE3A Nori Nori",
                "Tabby",
            )
            PetCard(
                2,
                "\uD83D\uDE3A Bru",
                "Negro",
            )

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {}
            ) {
                Text("+ Agregar mascota")
            }
    }
}