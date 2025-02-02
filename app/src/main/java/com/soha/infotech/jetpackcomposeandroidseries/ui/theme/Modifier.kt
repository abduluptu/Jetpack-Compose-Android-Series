package com.soha.infotech.jetpackcomposeandroidseries.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

fun Modifier.customBackgroundWithBorder(
    isBorder: Boolean = true,
    borderColor: Color = Color.Black,
    backGroundColor: Color = Color.White,

    ): Modifier = then(
    Modifier
        .padding(10.dp)
        .then(
            if (isBorder) {
                Modifier.border(2.dp, borderColor, RoundedCornerShape(10))
            } else {
                Modifier
            }
        )
        .clip(RoundedCornerShape(10))
        .background(backGroundColor)
)