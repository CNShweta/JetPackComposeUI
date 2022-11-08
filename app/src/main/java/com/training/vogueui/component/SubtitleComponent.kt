package com.training.vogueui.component

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.training.vogueui.ui.theme.VogueUITheme
import com.training.vogueui.ui.theme.subtitle

@Composable
fun SubtitleComponent(
    modifier: Modifier = Modifier,
    subtitle: String
) {
    Text(
        text = subtitle.uppercase(),
        style = MaterialTheme.typography.subtitle
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun SeasonNameComponentPreview() {
    VogueUITheme {
        SubtitleComponent(subtitle = "Resort 2023")
    }
}
