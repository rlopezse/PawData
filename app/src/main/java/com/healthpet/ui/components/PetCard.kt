package com.healthpet.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.healthpet.models.Pet

@Composable
fun PetCard(pet: Pet){
    Card() {
        Box(modifier = Modifier.padding(16.dp).fillMaxWidth()) {
            Column {
                Text(pet.name)
                Text(pet.breed)
            }
        }
    }
}
