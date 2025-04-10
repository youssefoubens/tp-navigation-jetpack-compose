package fr.iutlan.tp8.ui

import Screen1
import Screen3
import Screen2
import android.annotation.SuppressLint

import androidx.compose.runtime.Composable



import androidx.compose.material3.Scaffold // ← if you're using material

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScaffold() {
    val navController = rememberNavController()
    val navigationActions = NavigationActions(navController)

    Scaffold(
        topBar = { MainTopBar(navigationActions) },
        bottomBar = { MainBottomBar(navigationActions) }
    ) {
        NavHost(navController = navController, startDestination = AppRouter.Home) {
            composable(AppRouter.Home) { HomeScreen(navigationActions) }
            composable(AppRouter.Screen1) { Screen1(navigationActions) }
            composable(AppRouter.Screen2) { Screen2(navigationActions) }
            composable("screen3/{year}") { backStackEntry ->
                val year = backStackEntry.arguments?.getString("year")?.toIntOrNull() ?: 0
                Screen3(year, navigationActions)
            }
        }
    }
}
