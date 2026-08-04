package com.pawdata.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pawdata.services.http.callJson
import com.pawdata.theme.LightColorScheme
import com.pawdata.theme.bgColor
import com.pawdata.ui.screens.PawDataScreen

@Composable
fun PawDataApp(){
    MaterialTheme(colorScheme = LightColorScheme) {
        callJson()
        Column(
            modifier = Modifier.fillMaxSize().background(bgColor).padding(16.dp)
        ) {
            PawDataScreen(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            )
        }
    }
}