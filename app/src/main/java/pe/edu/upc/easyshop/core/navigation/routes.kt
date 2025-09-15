package pe.edu.upc.easyshop.core.navigation

sealed class Route(val route: String) {
    object Login: Route(route = "login")
    object Main: Route(route = "main")
}