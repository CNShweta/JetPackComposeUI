package com.training.vogueui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.training.vogueui.screen.FeaturedShows
import com.training.vogueui.screen.LatestShows
import com.training.vogueui.screen.Profile
import com.training.vogueui.screen.Search

@Composable
fun Navigation(modifier: Modifier = Modifier, navController:NavHostController){
    NavHost(navController = navController, startDestination = Screen.LatestShows.route){
        composable(route = Screen.LatestShows.route){
            LatestShows(navController = navController, modifier = modifier)
        }
        composable(route = Screen.Search.route){
            Search(navController = navController, modifier = modifier)
        }
        composable(route = Screen.FeaturedShows.route){
            FeaturedShows(navController = navController, modifier = modifier)
        }
        composable(route = Screen.Profile.route){
            Profile(navController = navController, modifier = modifier)
        }
    }
}
