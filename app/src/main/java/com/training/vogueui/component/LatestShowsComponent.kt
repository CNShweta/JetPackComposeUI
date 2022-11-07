package com.training.vogueui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.training.vogueui.ui.theme.VogueUITheme

@Composable
fun LatestShowsComponent(
    modifier: Modifier = Modifier,
    imageUrl: String,
    brandName: String,
    seasonName: String
) {
    ConstraintLayout {
        val (placeholderImage, fashionShowDetail) = createRefs()

        ImageComponent(modifier = Modifier.constrainAs(placeholderImage) {
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
                TitleComponent(title = brandName)
                Spacer(Modifier.height(4.dp))
                SubtitleComponent(subtitle = seasonName)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LatestShowsComponentPreview() {
    VogueUITheme {
        LatestShowsComponent(
            imageUrl = "https://assets.vogue.com/photos/629e0a01363baa7e460ac736/master/w_2240,c_limit/00001-givenchy-resort-2023-credit-brand.jpg",
            brandName = "Givenchy",
            seasonName = "Resort 2023"
        )
    }
}
