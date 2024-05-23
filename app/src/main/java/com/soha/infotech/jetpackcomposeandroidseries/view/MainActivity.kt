package com.soha.infotech.jetpackcomposeandroidseries.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Switch
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.soha.infotech.jetpackcomposeandroidseries.components.AlertDialogScreen
import com.soha.infotech.jetpackcomposeandroidseries.components.BoxModifierScreen
import com.soha.infotech.jetpackcomposeandroidseries.components.ClipboardScreen
import com.soha.infotech.jetpackcomposeandroidseries.components.CustomDialogScreen
import com.soha.infotech.jetpackcomposeandroidseries.components.DecScreen
import com.soha.infotech.jetpackcomposeandroidseries.components.IncScreen
import com.soha.infotech.jetpackcomposeandroidseries.components.LoadingAnimation
import com.soha.infotech.jetpackcomposeandroidseries.components.StarAnimation
import com.soha.infotech.jetpackcomposeandroidseries.components.SurfaceScreen
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.JetpackComposeAndroidSeriesTheme
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.checkedThumbColor
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.checkedTrackColor
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.customBackgroundWithBorder
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.greenColor
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.uncheckedThumbColor
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.uncheckedTrackColor
import com.soha.infotech.jetpackcomposeandroidseries.util.viewModelFactory
import com.soha.infotech.jetpackcomposeandroidseries.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var darkTheme by remember { mutableStateOf(false) }

            JetpackComposeAndroidSeriesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->


                    var count by rememberSaveable { mutableStateOf(0) }

                    // without parameter
                    // val mainViewModel by viewModels<MainViewModel>()

                    // with parameter
                    /*val mainViewModel: MainViewModel = viewModel(
                        factory = viewModelFactory {
                            MainViewModel("Meet")
                        }
                    )
                    Row {
                        IncScreen(mainViewModel)
                        DecScreen(mainViewModel)
                    }*/

                    /*Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(
                                if (darkTheme) {
                                    Color.Black
                                } else {
                                    Color.Yellow
                                }
                            )
                    ) {

                        SurfaceScreen()
                        Switch(
                            modifier = Modifier.scale(1.5f),
                            checked = darkTheme, onCheckedChange = {
                                darkTheme = it
                            },
                            thumbContent = {
                                Icon(
                                    imageVector = if (darkTheme) Icons.Filled.Check else Icons.Filled.Close,
                                    tint = if (darkTheme) greenColor else Color.White,
                                    contentDescription = ""
                                )
                            },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = checkedThumbColor,
                                checkedTrackColor = checkedTrackColor,
                                uncheckedThumbColor = uncheckedThumbColor,
                                uncheckedTrackColor = uncheckedTrackColor,
                                uncheckedBorderColor = uncheckedThumbColor
                            )
                        )
                        Text(text = if (darkTheme) "On" else "OFF")

                    }*/


                    /* Column(
                         modifier = Modifier
                             .fillMaxSize()
                             .padding(innerPadding),
                         verticalArrangement = Arrangement.Center,
                         horizontalAlignment = Alignment.CenterHorizontally
                     ) {
                         BoxModifierScreen(
                             Modifier
                                 .fillMaxWidth()
                                 .weight(1f)
                                 .customBackgroundWithBorder(backGroundColor = Color.LightGray)

                         )
                         BoxModifierScreen(
                             Modifier
                                 .fillMaxWidth()
                                 .weight(1f)
                                 .customBackgroundWithBorder(
                                     isBorder = false,
                                     backGroundColor = Color.Yellow
                                 )
                         )

                         StarAnimation()
                         LoadingAnimation()
                     }*/

                    /*var isShowAlertDialog by remember { mutableStateOf(false) }
                    var isShowCustomDialog by remember { mutableStateOf(false) }

                    Column {
                        Button(onClick = {
                            isShowAlertDialog = true
                        }) {
                            Text(text = "Alert Dialog Show")
                        }
                        Button(onClick = {
                            isShowCustomDialog = true
                        }) {
                            Text(text = "Custom Dialog Show")
                        }
                    }

                    if (isShowAlertDialog) {
                        AlertDialogScreen(
                            onDismissRequest = {
                                isShowAlertDialog = false
                            },
                            onConfirmationRequest = {
                                isShowAlertDialog = false
                            }
                        )
                    } else if (isShowCustomDialog) {
                        CustomDialogScreen(
                            onDismissRequest = {
                                isShowCustomDialog = false
                            },
                            onConfirmationRequest = {
                                isShowCustomDialog = false
                            }
                        )
                    }*/

                    Column(modifier = Modifier.padding(innerPadding)) {
                        ClipboardScreen()
                    }

                }
            }
        }
    }
}
