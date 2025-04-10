import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import fr.iutlan.tp8.ui.NavigationActions



@Composable
fun Screen3(year: Int, nav: NavigationActions) {
    Column {
        Text("Welcome to Screen 3")
        Text("Year: $year")
        Button(onClick = { nav.navigateBack() }) {
            Text("Back")
        }
    }
}
