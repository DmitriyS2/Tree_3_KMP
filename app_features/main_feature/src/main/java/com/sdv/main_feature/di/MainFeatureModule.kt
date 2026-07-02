package com.sdv.main_feature.di

//import dagger.Module
//import dagger.Module
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Module

//@Module
//@InstallIn(SingletonComponent::class)
//internal interface RepositoryModule {
//
//    @Binds
//    @Singleton
//    fun bindsMainRepository(impl: MainRepositoryImpl): MainRepository
//}
@Module
@ComponentScan("com.sdv.tree3.app_features.main_feature")
@Configuration
class MainFeatureModule

