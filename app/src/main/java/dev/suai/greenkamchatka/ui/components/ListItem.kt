package dev.suai.greenkamchatka.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.suai.greenkamchatka.ui.theme.GreenKamchatkaTheme

@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    text: String = "",
    onClick: () -> Unit = {},
    icon: ImageVector? = null
) {
    Button(
        modifier = modifier.padding(3.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondary,
            contentColor = MaterialTheme.colorScheme.onSecondary
        ),
        shape = MaterialTheme.shapes.small,
    ) {
        Text(text = text)

        if (icon != null)
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = icon,
                contentDescription = null
            )
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ListItemPreview() {
    GreenKamchatkaTheme() {
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            repeat(20) {

                ListItem(Modifier.fillMaxWidth(0.7f), text = "Камчатка лучшая страна")
                ListItem(
                    Modifier.fillMaxWidth(0.7f),
                    text = "Камчатка лучшая страна",
                    icon = Icons.Rounded.Add
                )
            }
        }
    }
}