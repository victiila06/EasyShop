package pe.edu.upc.easyshop.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.upc.easyshop.features.auth.presentation.Login
import pe.edu.upc.easyshop.core.root.Main
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




@Preview
@Composable
fun AppNavigationPreview(){
    EasyShopTheme {
        AppNavigation()
    }
}
