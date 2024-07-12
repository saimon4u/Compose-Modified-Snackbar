package com.example.modified_snackbar.util

import androidx.compose.ui.graphics.Color

sealed class ComposeModifiedSnackbarColor(val color: Color){
    data object SUCCESS: ComposeModifiedSnackbarColor(Color(0xFF19B661))
    data object ERROR: ComposeModifiedSnackbarColor(Color(0xFFE8503A))
    data object TextWhite: ComposeModifiedSnackbarColor(Color(0xFFEEEEEE))
    data class CustomColor(val customColor: Color): ComposeModifiedSnackbarColor(customColor)
}