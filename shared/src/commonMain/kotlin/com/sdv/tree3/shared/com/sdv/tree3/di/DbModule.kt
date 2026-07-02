package com.sdv.tree3.shared.com.sdv.tree3.di

import com.sdv.tree3.shared.com.sdv.tree3.data.DatabaseApi
import com.sdv.tree3.shared.com.sdv.tree3.data.impl.DatabaseImpl
import com.sdv.tree3.shared.com.sdv.tree3.data.impl.dao.NodeDao
import com.sdv.tree3.shared.com.sdv.tree3.data.impl.db.AppDatabase
import com.sdv.tree3.shared.com.sdv.tree3.data.impl.db.createDatabase
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import org.koin.dsl.module


@Module
@ComponentScan("com.sdv.tree3.shared")
@Configuration
class SharedModule {

    @Single
    fun provideDatabase() = createDatabase()

    @Single
    fun provideNodeDao(database: AppDatabase) = database.nodeDao()
}
//val dbModule = module {
//    // Регистрируем базу данных как синглтон
//    single<AppDatabase> { createDatabase() }
//
//    // Достаем Dao из созданной выше базы данных
//    single<NodeDao> { get<AppDatabase>().nodeDao() }
//
//    // Регистрируем вашу реализацию интерфейса и внедряем в неё NodeDao
//    single<DatabaseApi> { DatabaseImpl(nodeDao = get()) }
//}