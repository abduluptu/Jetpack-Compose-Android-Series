package com.soha.infotech.jetpackcomposeandroidseries.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.greenColor

@Preview(showSystemUi = true)
@Composable
fun SliderMinimalExample() {
    var sliderPosition by remember { mutableStateOf(50f) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Slider(
            valueRange = 0f..100f,
            value = sliderPosition,
            onValueChange = {
                sliderPosition = it
            },
//            modifier = Modifier.width(100.dp)
            steps = 4,
            colors = SliderDefaults.colors(
                thumbColor = greenColor,
                activeTrackColor = greenColor,
                activeTickColor = Color.Black,
                inactiveTickColor = Color.Black,
                inactiveTrackColor = Color.LightGray,

                ),
            onValueChangeFinished = {
            }
        )
        Text(text = sliderPosition.toString())
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RangeSliderExample() {
    var sliderPosition
            by remember { mutableStateOf(10f..500f) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RangeSlider(
            value = sliderPosition,

            onValueChange = { range -> sliderPosition = range },
            valueRange = 0f..1000f,
            onValueChangeFinished = {
                // launch some business logic update with the state you hold
                // viewModel.updateSelectedSliderValue(sliderPosition)
            },
            colors = SliderDefaults.colors(
                thumbColor = greenColor,
                activeTrackColor = greenColor,
                activeTickColor = Color.Black,
                inactiveTickColor = Color.Black,
                inactiveTrackColor = Color.LightGray,

                ),
        )
        Text(text = sliderPosition.start.toString())
        Text(text = sliderPosition.endInclusive.toString())
    }
}