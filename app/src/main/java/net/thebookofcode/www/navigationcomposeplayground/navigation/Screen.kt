package net.thebookofcode.www.navigationcomposeplayground.navigation

import net.thebookofcode.www.navigationcomposeplayground.util.*

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    // Compulsorily required arguments
    /*object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}"){
        fun passId(id:Int):String{
            // return "detail_screen/$id"
            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
        }

        fun passNameAndId(
            id: Int,
            name: String
        ):String{
            return "detail_screen/$id/$name"
        }
    }*/

    // Optional arguments
    object Detail : Screen(
        route =
        "detail_screen?$DETAIL_ARGUMENT_KEY={$DETAIL_ARGUMENT_KEY}&$DETAIL_ARGUMENT_KEY2={$DETAIL_ARGUMENT_KEY2}"
    ) {

        fun passNameAndId(
            id: Int = 0,
            name: String = "Haleemah"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }
    }

    object Signup : Screen(route = "sign_up_screen")

    object Login : Screen(route = "login_screen")
}
