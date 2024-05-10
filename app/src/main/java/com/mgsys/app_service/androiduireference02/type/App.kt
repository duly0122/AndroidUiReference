package com.mgsys.app_service.androiduireference02.type

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
val DateTimeDisplayFormat = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm")

class App {
    val Name = "AndroidUiReference02"
    val version = "1.0"
}