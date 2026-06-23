package com.sdv.tree3.shared.com.sdv.tree3.di

import com.sdv.tree3.shared.com.sdv.tree3.data.impl.db.AppDatabase
import com.sdv.tree3.shared.com.sdv.tree3.data.impl.db.createDatabase
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
internal class DbModule {

    @Single
    fun provideDatabase() = createDatabase()

    @Single
    fun provideNodeDao(database: AppDatabase) = database.nodeDao()
}