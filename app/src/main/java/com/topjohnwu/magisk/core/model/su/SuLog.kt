package com.topjohnwu.magisk.core.model.su

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.topjohnwu.magisk.ktx.timeFormatTime
import com.topjohnwu.magisk.ktx.toTime

@Entity(tableName = "logs")
data class SuLog(
    val fromUid: Int,
    val toUid: Int,
    val fromPid: Int,
    val packageName: String,
    val appName: String,
    val command: String,
    val action: Boolean,
    val time: Long = -1
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
    @Ignore val timeString = time.toTime(timeFormatTime)
}
