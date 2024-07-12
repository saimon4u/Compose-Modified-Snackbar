package com.example.modified_snackbar.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.modified_snackbar.util.ComposeModifiedSnackbarState

@Composable
fun rememberComposeModifiedSnackbarState(): ComposeModifiedSnackbarState {
    return remember { ComposeModifiedSnackbarState() }
}