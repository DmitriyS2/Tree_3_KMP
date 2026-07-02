package com.sdv.tree3.shared.com.sdv.tree3.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

//fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
//    startKoin {
//        appDeclaration()
//        // Подключаем DataModule, который мы обсуждали ранее
//        modules(DbModule().defaultModule)
//    }
//}

//fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
//    startKoin {
//        appDeclaration()
//        modules(dbModule) // Передаем его без всяких генераторов KSP
//    }
//}