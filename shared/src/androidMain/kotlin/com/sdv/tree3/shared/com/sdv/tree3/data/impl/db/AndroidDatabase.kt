package com.sdv.tree3.shared.com.sdv.tree3.data.impl.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import org.koin.mp.KoinPlatformTools

internal actual fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase> {
    // Безопасно достаем контекст, который был передан в startKoin { androidContext(...) }
    val appContext = KoinPlatformTools.defaultContext().get().get<Context>()

    val dbFile = appContext.getDatabasePath("tree_database.db")
    return Room.databaseBuilder<AppDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}