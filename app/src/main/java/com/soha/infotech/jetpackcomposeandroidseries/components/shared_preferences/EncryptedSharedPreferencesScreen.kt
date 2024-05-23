package com.soha.infotech.jetpackcomposeandroidseries.components.shared_preferences

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.soha.infotech.jetpackcomposeandroidseries.common.EncryptedSharePreferenceManager

@Composable
fun EncryptedSharedPreferencesScreen() {
    val context = LocalContext.current
    val encryptedSharePreferenceManager = remember {
        EncryptedSharePreferenceManager(context)
    }
    var nameState by remember { mutableStateOf("") }
    var ageState by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(
            value = nameState,
            onValueChange = { nameState = it },
            label = { Text("Enter Name") }
        )
        TextField(
            value = ageState,
            onValueChange = { ageState = it },
            label = { Text("Enter Age") }
        )
        Button(onClick = {
            encryptedSharePreferenceManager.name = nameState
            encryptedSharePreferenceManager.age = ageState.toIntOrNull() ?: 0
        }) {
            Text(text = "Set")
        }
        Button(onClick = {
            nameState = encryptedSharePreferenceManager.name
            ageState = encryptedSharePreferenceManager.age.toString()
        }) {
            Text(text = "Get")
        }
        Button(onClick = {
            nameState = ""
            ageState = ""

//            encryptedSharePreferenceManager.name = ""
//            encryptedSharePreferenceManager.age = 0
//
            encryptedSharePreferenceManager.clear()
        }) {
            Text(text = "Clear")
        }
    }
}