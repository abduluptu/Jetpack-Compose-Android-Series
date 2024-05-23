package com.soha.infotech.jetpackcomposeandroidseries.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun HideKeyboard() {
    val controller =
        LocalSoftwareKeyboardController.current
    Button(onClick = {
        controller?.hide()
    }) {
        Text(text = "Hide Keyboard")
    }
}
