package com.sdv.tree3.app

import android.app.Application
import com.sdv.common.log.LoggerWrapper.registerLogger
import com.sdv.common.log.file.FileLogs
import com.sdv.common.log.instance.Logger
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.core.annotation.KoinApplication
import org.koin.core.context.startKoin
import timber.log.Timber
import timber.log.Timber.DebugTree
import javax.inject.Inject

//@HiltAndroidApp
@KoinApplication
class Tree3KMPApplication : Application() {

//    @JvmField
//    @Inject
//    var fileLogs: FileLogs? = null

//    @JvmField
//    @Inject
//    var logger: Logger? = null

    override fun onCreate() {
        super.onCreate()
   //     setupLogger()
//        Timber.plant(DebugTree(), fileLogs)
//        fileLogs?.deleteOldLogs()

        startKoin {
            androidContext(this@Tree3KMPApplication)
        }
    }

    private fun setupLogger() {
  //      registerLogger(logger)
    }
}