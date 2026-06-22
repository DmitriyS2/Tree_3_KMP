package com.sdv.tree3.shared.com.sdv.tree3.data.impl.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.sdv.tree3.shared.com.sdv.tree3.data.impl.dao.NodeDao
import com.sdv.tree3.shared.com.sdv.tree3.data.impl.entity.NodeEntity

@Database(
    entities = [NodeEntity::class],
    version = 1,
    exportSchema = false
)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun nodeDao(): NodeDao
}

// Ожидаем билдер от платформ
internal expect fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase>

// Общая функция, которая создает рабочую БД
internal fun createDatabase(): AppDatabase {
    return getDatabaseBuilder()
        .setDriver(BundledSQLiteDriver())
        .build()
}