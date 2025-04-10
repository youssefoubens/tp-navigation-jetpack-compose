package fr.iutlan.tp8.ui


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(nav: NavigationActions) {
    Button(onClick = { nav.navigateToScreen1() }) {
        Text("Go to Screen 1")
    }
}
