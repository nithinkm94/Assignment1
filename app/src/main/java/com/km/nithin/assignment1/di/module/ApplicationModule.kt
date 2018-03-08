package com.km.nithin.assignment1.di.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.km.nithin.assignment1.util.SharedPreferenceManager
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by Nithin.Kumar on 3/8/2018.
 */
@Module
class ApplicationModule(var context: Context , var baseUrl: String) {
    @Singleton
    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {

        return GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    @Named("ok-1")
    fun provideOkHttpClient1(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .build()
    }

    @Singleton
    @Provides
    @Named("ok-2")
    fun provideOkHttpClient2(): OkHttpClient {

        return OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build()
    }

    @Singleton
    @Provides
    fun provideRxJavaCallAdapterFactory(): RxJava2CallAdapterFactory {
        return RxJava2CallAdapterFactory.create()
    }

    @Singleton
    @Provides
    fun provideRetrofit(@Named("ok-1") client: OkHttpClient , converterFactory: GsonConverterFactory , adapterFactory: RxJava2CallAdapterFactory): Retrofit {
        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(adapterFactory)
                .client(client)
                .build()
    }

    @Provides
    @Singleton
    fun provideContext(): Context {
        return context
    }


    @Singleton
    @Provides
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Singleton
    @Provides
    fun provideObjectManager(sharedPreferences: SharedPreferences): SharedPreferenceManager {
        return SharedPreferenceManager(sharedPreferences)
    }

}