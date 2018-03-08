package com.km.nithin.assignment1.application

import android.app.Application
import com.km.nithin.assignment1.di.component.ApplicationComponent
import com.km.nithin.assignment1.di.component.DaggerApplicationComponent
import com.km.nithin.assignment1.di.module.ApplicationModule

/**
 * Created by Nithin.Kumar on 3/8/2018.
 */
class TestApplication : Application() {

    private val mApplicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this, "https://"))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        initializeApplicationComponent()
    }


    private fun initializeApplicationComponent() {

    }

    fun getApplicationComponent(): ApplicationComponent? {
        return mApplicationComponent
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}