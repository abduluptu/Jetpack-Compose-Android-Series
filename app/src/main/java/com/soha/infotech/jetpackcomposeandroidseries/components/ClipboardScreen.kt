package com.soha.infotech.jetpackcomposeandroidseries.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun ClipboardScreen() {
    val clipboardManager = LocalClipboardManager.current
    var text by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TextField(value = text, onValueChange ={
            text = it
        } )
        Button(onClick = {
            clipboardManager.setText(AnnotatedString("Soha Infotech"))
        }) {
            Text(text = "Copy")
        }
        Button(onClick = {
            clipboardManager.getText()?.text?.let {
                text = it
            }
        }) {
            Text(text = "Get")
        }
    }
}