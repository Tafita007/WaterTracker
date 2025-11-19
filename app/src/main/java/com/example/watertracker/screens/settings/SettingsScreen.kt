package com.example.watertracker.screens.settings

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

@Composable
fun SettingsCard(modifier: Modifier = Modifier) {
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
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7BB6FF)),
                contentPadding = PaddingValues(vertical = 16.dp)
            ) {
                Text(
                    text = "Tap",
                    fontSize = 16.sp,
                    color = Color.White,
                    style = MaterialTheme.typography.labelLarge
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsCardPreview() {
    WaterTrackerTheme {
        SettingsCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )
    }
}

@Composable
fun SettingsScreen(navController: NavController) {
    DefaultScaffold(
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                SettingsCard(
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