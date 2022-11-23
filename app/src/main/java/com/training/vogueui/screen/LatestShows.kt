package com.training.vogueui.screen

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.training.vogueui.component.LatestShowsComponent
import com.training.vogueui.notificationservice.NotificationService
import com.training.vogueui.notificationservice.localNotificationService
import com.training.vogueui.viewmodel.LatestShowsViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LatestShows(
    navController: NavController,
    modifier: Modifier,
    latestShowsViewModel: LatestShowsViewModel = viewModel()
) {
    val latestShows = latestShowsViewModel.latestShows.observeAsState().value
    fun launch() {
        latestShowsViewModel.loadFashionShows()
    }
    launch()

    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        latestShows?.let {
            items(it) { show ->
                CompositionLocalProvider(localNotificationService provides NotificationService { brandName, seasonName ->
                    Log.d("Notification", "$brandName: $seasonName")
                }) {
                    LatestShowsComponent(
                        imageUrl = show.imageUrl,
                        brandName = show.brandName,
                        seasonName = show.seasonName,
                        onClick = { Log.d("clickevent", "clickevent") }
                    )
                }
            }
        }
    }
}
