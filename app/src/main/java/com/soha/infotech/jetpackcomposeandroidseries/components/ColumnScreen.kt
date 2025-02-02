package com.soha.infotech.jetpackcomposeandroidseries.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun ColumnScreen() {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello World",
            modifier = Modifier
                .background(Color.LightGray)
                .border(2.dp, Color.Black),
            fontSize = 20.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .background(Color.Magenta)
                .border(2.dp, Color.Black),
            fontSize = 20.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .background(Color.Yellow)
                .border(2.dp, Color.Black),
            fontSize = 20.sp
        )
        Text(
            text = "Hello World",
            modifier = Modifier
                .background(Color.Green)
                .border(2.dp, Color.Black),
            fontSize = 20.sp
        )
    }
}