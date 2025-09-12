package org.artemissoftware.athenalink.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navDeepLink
import androidx.navigation.toRoute
import org.artemissoftware.athenalink.screens.DetailScreen
import org.artemissoftware.athenalink.screens.ListScreen

@Composable
fun NavRoot() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Route.List
    ) {
        composable<Route.List> {
            ListScreen(
                navigateToDetail = { navController.navigate(Route.Detail(it)) }
            )
        }
        composable<Route.Detail>(
            deepLinks = listOf(
                navDeepLink {
                    this.uriPattern = DeepLinkUriPattern.DETAIL_PATTERN_1
                },
                navDeepLink {
                    this.uriPattern = DeepLinkUriPattern.DETAIL_PATTERN_2
                },
            )
        ) { backStackEntry ->
            val route = backStackEntry.toRoute<Route.Detail>()
            DetailScreen(id = route.id)
        }
    }
}
