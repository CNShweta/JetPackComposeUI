package com.training.vogueui.notificationservice

import androidx.compose.runtime.compositionLocalOf

data class NotificationService(
    val notify: (Any?, Any?) -> Unit
)
val localNotificationService = compositionLocalOf { NotificationService{ _, _->} }
