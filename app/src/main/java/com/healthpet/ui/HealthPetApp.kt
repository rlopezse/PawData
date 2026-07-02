package com.healthpet.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.healthpet.models.Pet
import com.healthpet.models.PetType
import com.healthpet.theme.Gray_100
import com.healthpet.theme.White

@Composable
fun HealthPetApp(){
    Column(modifier = Modifier.fillMaxSize().background(Gray_100)) {
        Column(modifier = Modifier.background(color = White).padding(8.dp)) {
            val Nori = Pet(1, "\uD83D\uDC31 Nori", PetType.CAT, "Tabby")
            val Mila = Pet(2, "\uD83D\uDC36 Mila", PetType.DOG, "Pitbul")
            Text(Nori.name + "\n" +Nori.breed)
            Text(Mila.name + "\n" +Mila.breed)
            Button(
                onClick = {

                }
            ) {
                Text("+ Agregar mascota")
            }
        }
    }
}