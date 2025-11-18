package com.example.watertracker.layout

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultScaffold(
    content: @Composable (PaddingValues) -> Unit,
    onNavigateBack: (() -> Unit)? = null,
    onNavigateHistory: (() -> Unit)? = null,
    onDeleteAllMoods: (() -> Unit)? = null
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Water Tracker") },
                navigationIcon = {
                    if (onNavigateBack != null) {
                        IconButton(onClick = onNavigateBack) {

                        }
                    }
                },
                actions = {
                    if (onNavigateHistory != null) {
                        IconButton(onClick = onNavigateHistory) {

                        }
                    }
                    if (onDeleteAllMoods != null) {
                        IconButton(onClick = onDeleteAllMoods) {

                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF7BB6FF),
                    titleContentColor = Color.White
                )
            )
        },
        content = content
    )
}