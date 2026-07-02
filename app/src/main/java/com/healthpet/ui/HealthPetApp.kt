package com.healthpet.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.healthpet.theme.Gray_100
import com.healthpet.theme.White

@Composable
fun HealthPetApp(){
    Column(modifier = Modifier.fillMaxSize().background(Gray_100)) {
        Column(modifier = Modifier.background(color = White).padding(8.dp)) {
            Text("Email")
        }
    }
}