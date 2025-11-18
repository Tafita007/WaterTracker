package com.example.watertracker.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.watertracker.navigation.WaterTrackerHome

@Composable
fun HomeCard(modifier: Modifier = Modifier, onClickStartChat: () -> Unit = {}) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(16.dp),
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
            Text(
                text = "Welcome to WaterTracker",
                fontSize = 20.sp,
                style = MaterialTheme.typography.titleSmall,
                color = Color(0xFF3E3E3E)
            )
            Spacer(modifier = Modifier.height(32.dp))

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
            onClickStartChat = {}
        )
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    DefaultScaffold(
        onNavigateHistory = { navController.navigate(WaterTrackerHome) },
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
                        .padding(16.dp),
                    onClickStartChat = { navController.navigate(WaterTrackerHome) }
                )
            }
        }
    )

}