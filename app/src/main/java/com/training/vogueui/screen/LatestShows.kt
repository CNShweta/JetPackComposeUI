package com.training.vogueui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.training.vogueui.ui.theme.RunwayWhite
import com.training.vogueui.viewmodel.LatestShowsViewModel

@Composable
fun LatestShows(
    navController: NavController,
    modifier: Modifier,
    latestShowsViewModel: LatestShowsViewModel = viewModel()
){
    val fashionShows = latestShowsViewModel.latestShows.observeAsState()
    fun launch() {
        latestShowsViewModel.loadFashionShows()
    }
    launch()
    LazyColumn{
        fashionShows.value?.let { list ->
            items(list.size){
                Box(modifier = modifier
                    .fillMaxSize()
                    .background(RunwayWhite), contentAlignment = Alignment.Center){
                    Text(text = "Latest Shows")
                }
            }
        }
    }

}
