package com.soha.infotech.jetpackcomposeandroidseries.components

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.greenColor

@Preview(showSystemUi = true)
@Composable
fun RadioGroupScreen() {
    val optionList = listOf(
        "Male", "Female", "dawdwd", "Other"
    )

    var selectedIndex by remember {
        mutableStateOf(0)
    }
    val disableItemPos = listOf<Int>()
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .selectableGroup()
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        optionList.forEachIndexed { index, label ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .selectable(
                        selected = selectedIndex == index,
                        onClick = {
                            selectedIndex = index
                        },
                        role = Role.RadioButton,
                        enabled = index !in disableItemPos
                    )
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    modifier = Modifier.padding(end = 16.dp),
                    selected = selectedIndex == index,
                    onClick = null,
                    colors = RadioButtonDefaults.colors(
                        selectedColor = greenColor,
                        unselectedColor = Color.DarkGray,
                        disabledSelectedColor = Color.LightGray,
                        disabledUnselectedColor = Color.LightGray
                    ),
                    enabled = index !in disableItemPos
                )
                Icon(
                    modifier = Modifier.padding(end = 16.dp),
                    painter = painterResource(
                        id = if (selectedIndex == index) com.soha.infotech.jetpackcomposeandroidseries.R.drawable.check_circle
                        else com.soha.infotech.jetpackcomposeandroidseries.R.drawable.unchecked_circle
                    ), contentDescription = null,
                    tint =
                    if (index !in disableItemPos) {
                        if (selectedIndex == index) greenColor else Color.DarkGray
                    } else {
                        Color.LightGray
                    }
                )
                Text(
                    text = label,
                    color = if (index !in disableItemPos) Color.DarkGray else Color.LightGray
                )
            }
        }
        Button(
            onClick = {
                Toast.makeText(
                    context,
                    optionList[selectedIndex],
                    Toast.LENGTH_LONG
                ).show()
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Submit")
        }
    }
}