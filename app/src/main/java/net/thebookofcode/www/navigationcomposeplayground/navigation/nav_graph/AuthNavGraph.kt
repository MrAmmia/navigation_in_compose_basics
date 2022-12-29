package net.thebookofcode.www.navigationcomposeplayground.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import net.thebookofcode.www.navigationcomposeplayground.navigation.Screen
import net.thebookofcode.www.navigationcomposeplayground.screens.LoginScreen
import net.thebookofcode.www.navigationcomposeplayground.screens.SignupScreen
import net.thebookofcode.www.navigationcomposeplayground.util.AUTHENTICATION_ROUTE


fun NavGraphBuilder.authNavGraph(
    navController:NavHostController
) {
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ) {
        composable(
            route = Screen.Signup.route
        ) {
            SignupScreen(navController = navController)
        }

        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
    }
}