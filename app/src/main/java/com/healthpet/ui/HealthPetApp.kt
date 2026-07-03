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
import com.healthpet.models.Pet
import com.healthpet.models.PetType
import com.healthpet.ui.components.PetCard

@Composable
fun HealthPetApp(){
    Column(modifier = Modifier.fillMaxSize().background(White).padding(16.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        val pets = listOf<Pet>(
            Pet(1, "\uD83D\uDE3A Nori Nori", PetType.CAT, "Tabby"),
            Pet(2, "\uD83D\uDC36 Milonga Longa", PetType.DOG, "Pit")
        )

        pets.forEach {
            PetCard(it)
        }

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {}
            ) {
                Text("+ Agregar mascota")
            }
    }
}