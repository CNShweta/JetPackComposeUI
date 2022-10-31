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

@Composable
fun Search(navController: NavController, modifier: Modifier){
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color.Magenta), contentAlignment = Alignment.Center){
        Text(text = "Search")
    }
}
