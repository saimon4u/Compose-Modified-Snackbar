package com.example.composemodifiedsnackbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.modified_snackbar.presentation.ComposeModifiedSnackbar
import com.example.modified_snackbar.presentation.ComposeModifiedSnackbarError
import com.example.modified_snackbar.presentation.ComposeModifiedSnackbarSuccess
import com.example.modified_snackbar.presentation.rememberComposeModifiedSnackbarState
import com.example.modified_snackbar.util.ComposeModifiedSnackbarColor
import com.example.modified_snackbar.util.ComposeModifiedSnackbarPosition
import com.example.modified_snackbar.util.ComposeModifierSnackbarDuration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state = rememberComposeModifiedSnackbarState()
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Button(onClick = { state.showSnackbar("Snackbar") }) {
                    Text(text = "Show Snackbar")
                }
            }
            ComposeModifiedSnackbar(
                state = state,
                position = ComposeModifiedSnackbarPosition.Float,
                duration = ComposeModifierSnackbarDuration.INFINITE,
                containerColor = ComposeModifiedSnackbarColor.CustomColor(Color.Black),
                contentColor = ComposeModifiedSnackbarColor.TextWhite,
                withDismissAction = true
            )
        }
    }
}
