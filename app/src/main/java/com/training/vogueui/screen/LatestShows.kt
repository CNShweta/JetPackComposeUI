package com.training.vogueui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.training.vogueui.component.LatestShowsComponent
import com.training.vogueui.ui.theme.RunwayWhite

@Composable
fun LatestShows(navController: NavController, modifier: Modifier){
    Box(modifier = modifier
        .fillMaxSize()
        .background(RunwayWhite), contentAlignment = Alignment.Center){
        LatestShowsComponent(
            imageUrl = "https://assets.vogue.com/photos/629e0a01363baa7e460ac736/master/w_2240,c_limit/00001-givenchy-resort-2023-credit-brand.jpg",
            brandName = "Givenchy",
            seasonName = "Resort 2023"
        )
    }
}
