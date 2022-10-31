package com.training.vogueui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.training.vogueui.R

sealed class NavItem(
    @StringRes val title:Int,
    @DrawableRes val icon: Int,
    val navRoute: String
){
    object LatestShows: NavItem(R.string.latest_shows, R.drawable.ic_dot, Screen.LatestShows.route)
    object Search: NavItem(R.string.search, R.drawable.ic_dot, Screen.Search.route)
    object FeaturedShows: NavItem(R.string.featured_shows, R.drawable.ic_dot, Screen.FeaturedShows.route)
    object Profile: NavItem(R.string.profile, R.drawable.ic_dot, Screen.Profile.route)
}
