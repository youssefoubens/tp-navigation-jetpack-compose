package fr.iutlan.tp8.ui


import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MainBottomBar(nav: NavigationActions) {
    BottomAppBar {
        Button(onClick = { nav.navigateToHome() }) {
            Text("Home")
        }
        Button(onClick = { nav.navigateToScreen2() }) {
            Text("Screen 2")
        }
    }
}

