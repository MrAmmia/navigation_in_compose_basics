package net.thebookofcode.www.navigationcomposeplayground.navigation.nav_graph

import androidx.navigation.*
import androidx.navigation.compose.composable
import net.thebookofcode.www.navigationcomposeplayground.navigation.Screen
import net.thebookofcode.www.navigationcomposeplayground.screens.DetailScreen
import net.thebookofcode.www.navigationcomposeplayground.screens.HomeScreen
import net.thebookofcode.www.navigationcomposeplayground.util.DETAIL_ARGUMENT_KEY
import net.thebookofcode.www.navigationcomposeplayground.util.DETAIL_ARGUMENT_KEY2
import net.thebookofcode.www.navigationcomposeplayground.util.HOME_ROUTE

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                    //nullable = true
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                })

        ) {
            // Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            // Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailScreen(navController)
        }
    }
}