package com.pawdata.ui
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.pawdata.theme.LightColorScheme
import com.pawdata.ui.screens.LoginScreen

@Composable
fun PawDataApp(){
    MaterialTheme(colorScheme = LightColorScheme) {
        LoginScreen()
    }
}