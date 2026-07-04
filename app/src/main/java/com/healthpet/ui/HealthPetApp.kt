package com.healthpet.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.healthpet.theme.White
import com.healthpet.ui.screens.HealthPetScreen

@Composable
fun HealthPetApp(){
    Column(
        modifier = Modifier.fillMaxSize().background(White).padding(16.dp)
    ) {
        HealthPetScreen(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        )
    }
}