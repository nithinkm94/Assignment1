package com.km.nithin.assignment1.di.component

import android.content.Context
import com.km.nithin.assignment1.di.module.ApplicationModule
import com.km.nithin.assignment1.util.SharedPreferenceManager
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by Nithin.Kumar on 3/8/2018.
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun exposeRetrofit(): Retrofit
    fun exposeContext(): Context
    fun sharedPreferences(): SharedPreferenceManager
}