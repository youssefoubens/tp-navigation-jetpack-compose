import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import fr.iutlan.tp8.ui.NavigationActions

@Composable
fun Screen1(nav: NavigationActions) {
    Button(onClick = { nav.navigateToScreen2() }) {
        Text("Go to Screen 2")
    }
}
