package com.example.watertracker.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.watertracker.layout.DefaultScaffold
import com.example.watertracker.ui.theme.WaterTrackerTheme

@Composable
fun HomeCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(550.dp)
            .padding(16.dp)
            .offset(y = -230.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(9.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF1F1F1))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Circular Progress Indicator with text inside
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                // Circle Progress Indicator
                CircularProgressIndicator(
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.Center),
                    color = Color(0xFF7BB6FF),
                    strokeWidth = 10.dp,
                    progress = 0.5f // You can update the progress here
                )

                // Text in the circle
                Column(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "0ml",
                        fontSize = 50.sp,
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "sur "+"200ml",
                        fontSize = 18.sp,
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.DarkGray
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "0%",
                        fontSize = 18.sp,
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.LightGray
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeCardPreview() {
    WaterTrackerTheme {
        HomeCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
        )
    }
}

@Composable
fun SaisieCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(780.dp)
            .padding(16.dp)
            .offset(y = 70.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(9.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF1F1F1))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween // pour distribuer l'espace entre les éléments
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start // Aligner à gauche
            ) {
                Text(
                    text = "Ajouter de l'eau",
                    fontSize = 20.sp,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.Black
                )
            }

            // Section des boutons pour les quantités d'eau
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp) // Espacement entre les lignes
            ) {
                // Première ligne de boutons (100ml, 200ml, 250ml)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // Espacement égal entre les boutons
                ) {
                    Button(onClick = { }) {
                        Text(text = "+ 100ml")
                    }
                    Button(onClick = { }) {
                        Text(text = "+ 200ml")
                    }
                    Button(onClick = { }) {
                        Text(text = "+ 250ml")
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(onClick = { }) {
                        Text(text = "+ 300ml")
                    }
                    Button(onClick = { }) {
                        Text(text = "+ 500ml")
                    }
                    Button(onClick = { }) {
                        Text(text = "+ 1000ml")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SaisieCardPreview() {
    WaterTrackerTheme {
        SaisieCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
        )
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    DefaultScaffold(
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                HomeCard(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .fillMaxWidth()
                        .height(300.dp)
                        .padding(16.dp)
                )

                SaisieCard(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .fillMaxWidth()
                        .height(300.dp)
                        .padding(16.dp)
                )
            }
        }
    )
}
