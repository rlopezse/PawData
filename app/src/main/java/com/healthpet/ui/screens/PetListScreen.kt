package com.healthpet.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.healthpet.models.Pet
import com.healthpet.models.PetType
import com.healthpet.ui.components.PetCard

@Composable
fun HealthPetScreen(modifier: Modifier, verticalArrangement: Arrangement.Vertical) {
    var pets by remember {
        mutableStateOf(
            listOf(
                Pet(1, "\uD83D\uDE3A Nori Nori", PetType.CAT, "Tabby"),
                Pet(2, "\uD83D\uDC36 Milonga", PetType.DOG, "Pit")
            )
        )
    }
    Column(
        modifier,
        verticalArrangement
    ) {
        pets.forEach {
            PetCard(it)
        }
    }
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = {
            pets = pets + Pet(3, "\uD83D\uDC36 Anto", PetType.DOG, "Pit")
        }
    ) {
        Text("+ Agregar mascota")
    }
}