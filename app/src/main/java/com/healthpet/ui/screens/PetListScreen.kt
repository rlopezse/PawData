package com.healthpet.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.TextField

@Composable
fun HealthPetScreen(modifier: Modifier, verticalArrangement: Arrangement.Vertical) {
    var pets by remember {
        mutableStateOf(
            listOf(
                Pet(1, "\uD83D\uDE3A Nori Nori", PetType.CAT, "Tabby")
            )
        )
    }

    val petnameState = rememberTextFieldState()

    LazyColumn(
        modifier = modifier,
        verticalArrangement = verticalArrangement,
    ) {
        items (pets) {
            pet -> PetCard(pet)
        }
    }

    TextField(
        state = petnameState,
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text("Cómo se llama tu mascota?") }
    )

    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = {
            pets = pets + Pet(3, ""+petnameState.text, PetType.DOG, "Pit")
        }
    ) {
        Text("+ Agregar mascota")
    }
}