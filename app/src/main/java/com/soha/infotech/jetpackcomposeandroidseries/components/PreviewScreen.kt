package com.soha.infotech.jetpackcomposeandroidseries.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.JetpackComposeAndroidSeriesTheme

@AllPreview
@Composable
fun PreviewScreen() {
    Button(onClick = { /*TODO*/ },
    ) {
        Text(text = "Soha Infotech")
    }
}
@Preview(
    showSystemUi = true,
    showBackground = true,wallpaper = Wallpapers.GREEN_DOMINATED_EXAMPLE,
    backgroundColor = 0xFFF3A813,
    device = "id:pixel_2"
)
@Composable()
fun DynamicColorScreen() {
    JetpackComposeAndroidSeriesTheme{
        PreviewScreen()
    }
}

@Preview(group = "element", fontScale = 2.5f)
@Composable
fun SquareComposablePreview() {
    Box(Modifier.background(Color.Yellow)) {
        Text("Hello World")
    }
}