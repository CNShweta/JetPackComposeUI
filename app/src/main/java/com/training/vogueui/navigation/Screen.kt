package com.training.vogueui.navigation

sealed class Screen(val route: String){
    object LatestShows: Screen("latest_shows")
    object Search: Screen("search")
    object FeaturedShows: Screen("featured_shows")
    object Profile: Screen("profile")
}

