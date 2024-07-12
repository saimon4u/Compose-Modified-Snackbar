package com.example.modified_snackbar.util

sealed class ComposeModifiedSnackbarPosition {

    object Top: ComposeModifiedSnackbarPosition()

    object Bottom: ComposeModifiedSnackbarPosition()

    object Float: ComposeModifiedSnackbarPosition()
}