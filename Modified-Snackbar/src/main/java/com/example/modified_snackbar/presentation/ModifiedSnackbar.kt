package com.example.modified_snackbar.presentation

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.modified_snackbar.util.ComposeModifiedSnackbarColor
import com.example.modified_snackbar.util.ComposeModifiedSnackbarPosition
import com.example.modified_snackbar.util.TestTag

@Composable
internal fun ModifiedSnackbar(
    message: String?,
    position: ComposeModifiedSnackbarPosition,
    containerColor: ComposeModifiedSnackbarColor,
    contentColor: ComposeModifiedSnackbarColor,
    verticalPadding: Dp,
    horizontalPadding: Dp,
    icon: ImageVector,
    withDismissAction: Boolean,
    onDismiss: (() -> Unit)? = null
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(
                fraction = when (position) {
                    is ComposeModifiedSnackbarPosition.Top -> 1f
                    is ComposeModifiedSnackbarPosition.Bottom -> 1f
                    is ComposeModifiedSnackbarPosition.Float -> 0.8f
                }
            )
            .background(
                color = containerColor.color,
                shape = when (position) {
                    is ComposeModifiedSnackbarPosition.Top -> RectangleShape
                    is ComposeModifiedSnackbarPosition.Bottom -> RectangleShape
                    is ComposeModifiedSnackbarPosition.Float -> RoundedCornerShape(8.dp)
                }
            )
            .padding(vertical = verticalPadding)
            .padding(horizontal = horizontalPadding)
            .animateContentSize()
            .testTag(TestTag.SNACKBAR),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .weight(4f),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Snackbar Icon",
                tint = contentColor.color,
                modifier = Modifier
                    .testTag(TestTag.SNACKBAR_ICON)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                modifier = Modifier
                    .testTag(TestTag.SNACKBAR_MESSAGE),
                text = message ?: "Unknown",
                color = contentColor.color,
                style = MaterialTheme.typography.bodyMedium,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
        if(withDismissAction){
            IconButton(
                onClick = { onDismiss?.invoke() },
                modifier = Modifier
                    .size(25.dp)
                    .testTag(TestTag.SNACKBAR_DISMISS)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Snackbar Dismiss Icon",
                    tint = contentColor.color
                )
            }
        }
    }
}