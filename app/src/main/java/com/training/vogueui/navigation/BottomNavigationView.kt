package com.training.vogueui.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationView(navController: NavController){
    val navItems = listOf(NavItem.LatestShows, NavItem.Search, NavItem.FeaturedShows, NavItem.Profile)
    BottomNavigation(backgroundColor = Color.Black) {
        navItems.forEach { item ->
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination?.route

            BottomMenuItem(
                item,
                currentDestination == item.navRoute,
                Color.White,
                Color.White,
                Color.White.copy(0.4f)
            ) {
                navController.navigate(item.navRoute) {
                    // Pop up to the start destination of the graph to
                    // avoid building up a large stack of destinations
                    // on the back stack as users select items
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }

           /* BottomNavigationItem(
                selected = currentDestination == item.navRoute,
                icon = { Icon(painter = painterResource(id = item.icon), contentDescription = "") },
                label = { Text(text = stringResource(id = item.title))},
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                onClick = { navController.navigate(item.navRoute){
                    // Pop up to the start destination of the graph to
                    // avoid building up a large stack of destinations
                    // on the back stack as users select items
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop= true
                    restoreState = true
                } })*/
        }
    }
}

@Composable
fun BottomMenuItem(
    item: NavItem,
    isSelected: Boolean = false,
    activeHighlightColor: Color = Color.White,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = Color.White.copy(0.4f),
    onItemClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(start = 10.dp,end= 10.dp).clickable {
            onItemClick()
        }
    ) {
        Text(
            text = stringResource(item.title),
            color = if(isSelected) activeTextColor else inactiveTextColor,
            modifier = Modifier.padding(top = 10.dp)
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .background(Color.Transparent)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = item.icon),
                contentDescription = stringResource(item.title),
                tint = if (isSelected) activeTextColor else inactiveTextColor,
                modifier = Modifier.size(10.dp)
            )
        }
    }
}
