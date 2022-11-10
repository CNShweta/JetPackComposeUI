package com.training.vogueui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.training.vogueui.ui.theme.RunwayWhite

@Composable
fun FeaturedShows(navController: NavController, modifier: Modifier){
    var textFieldState by remember {
        mutableStateOf("Loading........")
    }
    Box(modifier = modifier
        .fillMaxSize()
        .background(RunwayWhite), contentAlignment = Alignment.Center){
        Column(modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
           Button(onClick = { textFieldState = "Loaded" }) {
               Text(text = "Click")
           }
            Text(text = textFieldState)
        }
    }
}
