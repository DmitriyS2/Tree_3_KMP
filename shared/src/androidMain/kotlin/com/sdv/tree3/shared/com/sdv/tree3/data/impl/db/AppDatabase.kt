package com.sdv.tree3.shared.com.sdv.tree3.data.impl.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

lateinit var androidContext: Context

internal actual fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase> {
    val appContext = androidContext.applicationContext
    val dbFile = appContext.getDatabasePath("tree_database.db")
    return Room.databaseBuilder<AppDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}