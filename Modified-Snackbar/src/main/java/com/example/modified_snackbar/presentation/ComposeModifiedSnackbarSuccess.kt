package com.example.modified_snackbar.presentation

import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.modified_snackbar.util.ComposeModifiedSnackbarColor
import com.example.modified_snackbar.util.ComposeModifiedSnackbarPosition
import com.example.modified_snackbar.util.ComposeModifiedSnackbarState
import com.example.modified_snackbar.util.ComposeModifierSnackbarDuration

@Composable
fun ComposeModifiedSnackbarSuccess(
    modifier: Modifier = Modifier,
    state: ComposeModifiedSnackbarState,
    position: ComposeModifiedSnackbarPosition = ComposeModifiedSnackbarPosition.Top,
    duration: ComposeModifierSnackbarDuration = ComposeModifierSnackbarDuration.SHORT,
    withDismissAction: Boolean = false
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        ComposeModifiedSnackbarComponent(
            state = state,
            duration = duration,
            position = position,
            containerColor = ComposeModifiedSnackbarColor.SUCCESS,
            contentColor = ComposeModifiedSnackbarColor.TextWhite,
            verticalPadding = 12.dp,
            horizontalPadding = 12.dp,
            icon = Icons.Default.Check,
            enterAnimation = expandVertically(
                animationSpec = tween(delayMillis = 300),
                expandFrom = when(position) {
                    is ComposeModifiedSnackbarPosition.Top -> Alignment.Top
                    is ComposeModifiedSnackbarPosition.Bottom -> Alignment.Bottom
                    is ComposeModifiedSnackbarPosition.Float -> Alignment.CenterVertically
                }
            ),
            exitAnimation = shrinkVertically(
                animationSpec = tween(delayMillis = 300),
                shrinkTowards =  when(position) {
                    is ComposeModifiedSnackbarPosition.Top -> Alignment.Top
                    is ComposeModifiedSnackbarPosition.Bottom -> Alignment.Bottom
                    is ComposeModifiedSnackbarPosition.Float -> Alignment.CenterVertically
                }
            ),
            withDismissAction = withDismissAction
        )
    }
}


