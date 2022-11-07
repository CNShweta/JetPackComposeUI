package com.training.vogueui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import com.training.vogueui.ui.theme.VogueUITheme
import com.training.vogueui.util.loadImageUsingGlide

/**
 * ImageComponent is the Composable for all image instances
 *
 * @property imageUrl url of the image to be loaded into Image Composable
 * @property brandName brand name of fashion show
 * @property seasonName season name of fashion show
 * @property showFashionShowDetails boolean to indicate visibility of fashion show details
 */
@Composable
fun ImageComponent(
    modifier: Modifier = Modifier,
    imageUrl: String
) {
    val image = loadImageUsingGlide(imageUrl = imageUrl).value

    image?.let {
        Image(
            bitmap = it.asImageBitmap(),
            contentDescription = "placeholder",
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ImageComponentPreview() {
    VogueUITheme {
        ImageComponent(
            imageUrl = "https://assets.vogue.com/photos/629e0a01363baa7e460ac736/master/w_2240,c_limit/00001-givenchy-resort-2023-credit-brand.jpg"
        )
    }
}
