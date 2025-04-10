package fr.iutlan.tp8.ui

import androidx.navigation.NavController


class NavigationActions(private val navController: NavController) {
    fun navigateToHome() = navController.navigate(AppRouter.Home)
    fun navigateToScreen1() = navController.navigate(AppRouter.Screen1)
    fun navigateToScreen2() = navController.navigate(AppRouter.Screen2)
    fun navigateToScreen3(year: Int) = navController.navigate(AppRouter.screen3Route(year))
    fun navigateBack() = navController.popBackStack()
}
