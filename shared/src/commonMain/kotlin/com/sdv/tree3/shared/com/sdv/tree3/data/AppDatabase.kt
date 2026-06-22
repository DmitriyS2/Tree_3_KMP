package com.sdv.tree3.shared.com.sdv.tree3.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver

@Database(entities = [NodeEntity::class], version = 1) // Ваши Entity
abstract class AppDatabase : RoomDatabase() {
    abstract fun nodeDao(): NodeDao
}

// Ожидаем билдер от платформ
expect fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase>

// Общая функция, которая создает рабочую БД
fun createDatabase(): AppDatabase {
    return getDatabaseBuilder()
        .setDriver(BundledSQLiteDriver())
        .build()
}