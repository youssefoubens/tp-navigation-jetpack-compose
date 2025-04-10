package fr.iutlan.tp8.ui

object AppRouter {
    const val Home = "home"
    const val Screen1 = "screen1"
    const val Screen2 = "screen2"
    const val Screen3 = "screen3/{year}"

    fun screen3Route(year: Int) = "screen3/$year"
}
