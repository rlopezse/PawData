package com.pawdata.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pawdata.models.Pet
import com.pawdata.theme.neutral50

@Composable
fun PetCard(pet: Pet){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        border = BorderStroke(1.dp, neutral50)
    ) {
        Box(modifier = Modifier.padding(16.dp).fillMaxWidth()) {
            Column {
                Text(pet.name)
                Text(pet.breed)
            }
        }
    }
}
