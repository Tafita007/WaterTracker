package com.example.watertracker.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.watertracker.screens.HomeScreen
import com.example.watertracker.screens.add.AddInTakeScreen
import com.example.watertracker.screens.history.HistoryScreen

@kotlinx.serialization.Serializable
object WaterTrackerHome

@kotlinx.serialization.Serializable
object WaterTrackerHistory

@kotlinx.serialization.Serializable
object WaterTrackerAddInTake

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = WaterTrackerHome
    ) {
        composable<WaterTrackerHome> {
            HomeScreen(navController = navController)
        }

        composable<WaterTrackerHistory> {
            HistoryScreen(navController = navController)
        }

        composable<WaterTrackerAddInTake> {
            AddInTakeScreen(navController = navController)
        }

    }
}