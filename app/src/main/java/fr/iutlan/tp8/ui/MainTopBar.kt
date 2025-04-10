package fr.iutlan.tp8.ui

import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home

import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(nav: NavigationActions) {
    TopAppBar(
        title = { Text("TP Navigation") },
        actions = {
            IconButton(onClick = { nav.navigateToHome() }) {
                Icon(Icons.Default.Home, contentDescription = "Home")
            }
        }
    )
}
