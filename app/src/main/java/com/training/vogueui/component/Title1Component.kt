package com.training.vogueui.component

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.training.vogueui.ui.theme.VogueUITheme
import com.training.vogueui.ui.theme.label2

@Composable
fun Title1Component(
    modifier: Modifier = Modifier,
    title: String
) {
    Text(
        text = title.uppercase(),
        style = MaterialTheme.typography.label2
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun Title1ComponentPreview() {
    VogueUITheme {
        Title1Component(title = "Givenchy")
    }
}
