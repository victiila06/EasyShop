package pe.edu.upc.easyshop.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.upc.easyshop.Login
import pe.edu.upc.easyshop.ui.theme.EasyShopTheme

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Route.Login.route) {
        composable (Route.Login.route){
            Login {
                navController.navigate(Route.Main.route)
            }
        }

        composable (Route.Main.route) {
            Main()
        }
    }
}

sealed class Route(val route: String) {
    object Login: Route(route = "login")
    object Main: Route(route = "main")
}


@Preview
@Composable
fun AppNavigationPreview(){
    EasyShopTheme {
        AppNavigation()
    }
}
