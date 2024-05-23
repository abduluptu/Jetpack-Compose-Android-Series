package com.soha.infotech.jetpackcomposeandroidseries.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soha.infotech.jetpackcomposeandroidseries.models.Student
import com.soha.infotech.jetpackcomposeandroidseries.ui.theme.greenColor
import java.util.UUID

@Preview(showSystemUi = true)
@Composable
fun LazyScreen() {
    val studentList = mutableListOf(
        Student(UUID.randomUUID().toString(), "Soha Infotech", 21, "male"),
        Student(UUID.randomUUID().toString(), "Abdul", 20, "male"),
        Student(UUID.randomUUID().toString(), "Soha", 21, "female"),
        Student(UUID.randomUUID().toString(), "Anam", 23, "male"),
        Student(UUID.randomUUID().toString(), "Umama", 26, "male"),
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
//            .verticalScroll(rememberScrollState())
    ) {
        LazyRowScreen()
        LazyColumnScreen()
    }
}

@Composable
fun LazyColumnScreen() {
    val studentList = mutableListOf(
        Student(UUID.randomUUID().toString(), "Soha Infotech", 21, "male"),
        Student(UUID.randomUUID().toString(), "Abdul", 20, "male"),
        Student(UUID.randomUUID().toString(), "Soha", 21, "female"),
        Student(UUID.randomUUID().toString(), "Anam", 23, "male"),
        Student(UUID.randomUUID().toString(), "Umama", 26, "male"),
    )
    val studentList1 = mutableListOf(
        Student(UUID.randomUUID().toString(), "Soha Infotech", 21, "male"),
        Student(UUID.randomUUID().toString(), "Abdul", 20, "male"),
        Student(UUID.randomUUID().toString(), "Soha", 21, "female"),
        Student(UUID.randomUUID().toString(), "Anam", 23, "male"),
        Student(UUID.randomUUID().toString(), "Umama", 26, "male"),
    )
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(10.dp)
    ) {
        item {
            studentList.forEachIndexed { index, student ->
                Text(text = "$student")
            }
        }
        item {
            OutlinedCard(
                colors = CardDefaults.cardColors(
                    containerColor = greenColor
                ),
                border = BorderStroke(2.dp, Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
            ) {
                Text(
                    text = "First Item",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    textAlign = TextAlign.Center
                )
            }
        }

        items(5) { index ->
            OutlinedCard(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Yellow
                ),
                border = BorderStroke(2.dp, Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
            ) {
                Text(
                    text = "Item: $index",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    textAlign = TextAlign.Center
                )
            }
        }
        item {
            OutlinedCard(
                colors = CardDefaults.cardColors(
                    containerColor = greenColor
                ),
                border = BorderStroke(2.dp, Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
            ) {
                Text(
                    text = "End Item",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    textAlign = TextAlign.Center
                )
            }
        }
        items(studentList.size,
            key = { index ->
                studentList[index].id
            }
        ) { index ->
            OutlinedCard(
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(2.dp, Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
            ) {
                Text(
                    text = "${studentList[index].name}",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    textAlign = TextAlign.Center
                )
            }
        }
        itemsIndexed(studentList1,
            key = { index, student ->
                student.id
            }
        ) { index, student ->
            OutlinedCard(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Red
                ),
                border = BorderStroke(2.dp, Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
            ) {
                Text(
                    text = "${student.name}",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun LazyRowScreen() {
    val studentList = mutableListOf(
        Student(UUID.randomUUID().toString(), "Soha Infotech", 21, "male"),
        Student(UUID.randomUUID().toString(), "Abdul Khalid", 20, "male"),
        Student(UUID.randomUUID().toString(), "Soha", 21, "female"),
        Student(UUID.randomUUID().toString(), "Anam", 21, "female"),
        Student(UUID.randomUUID().toString(), "Iqra", 23, "male"),
        Student(UUID.randomUUID().toString(), "Umama", 26, "male"),
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(10.dp)
    ) {
        itemsIndexed(studentList,
            key = { index, student ->
                student.id
            }
        ) { index, student ->
            OutlinedCard(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Red
                ),
                border = BorderStroke(2.dp, Color.Black),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(8.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
            ) {
                Text(
                    text = "${student.name}",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize()
                        .padding(10.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
