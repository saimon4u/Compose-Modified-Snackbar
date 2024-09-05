package com.example.modified_snackbar.presentation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.modified_snackbar.util.ComposeModifiedSnackbarColor
import com.example.modified_snackbar.util.ComposeModifiedSnackbarPosition
import com.example.modified_snackbar.util.ComposeModifiedSnackbarState
import com.example.modified_snackbar.util.ComposeModifierSnackbarDuration

@Composable
fun ComposeModifiedSnackbar(
    modifier: Modifier = Modifier,
    state: ComposeModifiedSnackbarState,
    position: ComposeModifiedSnackbarPosition = ComposeModifiedSnackbarPosition.Bottom,
    duration: ComposeModifierSnackbarDuration = ComposeModifierSnackbarDuration.SHORT,
    icon: ImageVector? = Icons.Default.Star,
    containerColor: ComposeModifiedSnackbarColor = ComposeModifiedSnackbarColor.CustomColor(Color.Gray),
    contentColor: ComposeModifiedSnackbarColor = ComposeModifiedSnackbarColor.TextWhite,
    enterAnimation: EnterTransition = expandVertically(
        animationSpec = tween(delayMillis = 300),
        expandFrom = when(position) {
            is ComposeModifiedSnackbarPosition.Top -> Alignment.Top
            is ComposeModifiedSnackbarPosition.Bottom -> Alignment.Bottom
            is ComposeModifiedSnackbarPosition.Float -> Alignment.CenterVertically
        }
    ),
    exitAnimation: ExitTransition = shrinkVertically(
        animationSpec = tween(delayMillis = 300),
        shrinkTowards =  when(position) {
            is ComposeModifiedSnackbarPosition.Top -> Alignment.Top
            is ComposeModifiedSnackbarPosition.Bottom -> Alignment.Bottom
            is ComposeModifiedSnackbarPosition.Float -> Alignment.CenterVertically
        }
    ),
    verticalPadding: Dp = 12.dp,
    horizontalPadding: Dp = 12.dp,
    withDismissAction: Boolean = false
) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        ComposeModifiedSnackbarComponent(
            state = state,
            duration =  duration,
            position = position,
            containerColor = containerColor,
            contentColor = contentColor,
            verticalPadding = verticalPadding,
            horizontalPadding = horizontalPadding,
            icon = icon,
            enterAnimation = enterAnimation,
            exitAnimation = exitAnimation,
            withDismissAction = withDismissAction
        )
    }
}
