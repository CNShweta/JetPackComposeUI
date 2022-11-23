package com.training.vogueui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.training.vogueui.notificationservice.localNotificationService

@Composable
fun LatestShowsComponent(
    modifier: Modifier = Modifier,
    imageUrl: String,
    brandName: String,
    seasonName: String,
    onClick: () -> Unit
) {
    val ns = localNotificationService.current
    ConstraintLayout (modifier = Modifier.clickable(enabled = true, onClick = { ns.notify(brandName, seasonName) })) {
        val (placeholderImage, fashionShowDetail) = createRefs()

        ImageComponent(modifier = Modifier.clickable(enabled = true, onClick = onClick).constrainAs(placeholderImage) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            absoluteLeft.linkTo(parent.absoluteLeft)
        }, imageUrl = imageUrl)

        Box(
            Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        )
                    )
                )
                .fillMaxHeight(0.3F)
                .fillMaxWidth()
                .padding(8.dp)
                .constrainAs(fashionShowDetail) {
                    bottom.linkTo(parent.bottom)
                    absoluteLeft.linkTo(parent.absoluteLeft)
                },
            contentAlignment = Alignment.BottomStart,
        ) {
            Column(
                modifier = Modifier.padding(bottom = 4.dp)
            ) {
                Label2Component(title = brandName)
                Spacer(Modifier.height(4.dp))
                SubtitleComponent(subtitle = seasonName)
            }
        }
    }
}
