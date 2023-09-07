package com.example.screenshotapp.UIcomponents

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OverlayButton(onClick: () -> Unit) {
    Button(
        onClick = { onClick },
        modifier = Modifier
            .padding(3.dp)
    ) {
        Text(text = "Screen Shot")
    }
}

@Preview
@Composable
fun PreviewOverlayButton() {
    Surface {
        OverlayButton {

        }
    }
}