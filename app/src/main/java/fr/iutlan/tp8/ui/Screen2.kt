import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import fr.iutlan.tp8.ui.NavigationActions



@Composable
fun Screen2(nav: NavigationActions) {
    Button(onClick = { nav.navigateToScreen3(2025) }) {
        Text("Go to Screen 3 (2025)")
    }
}
