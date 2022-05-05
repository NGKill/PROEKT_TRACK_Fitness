package com.example.camrad

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
//андроид рум
//библиотеки androidx.room.Entity
//import androidx.room.PrimaryKey
@Entity(tableName = "RUN_TABLE")
data class Start(
    var img: Bitmap? = null,
    var timestamp: Long = 0L,
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long = 0L,
    var caloriesBurned: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}