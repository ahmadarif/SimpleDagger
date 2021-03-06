package com.ahmadarif.simpledagger.dagger.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.ahmadarif.simpledagger.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by ARIF on 13-Jun-17.
 */
@Module
class AppModule(val app: App) {

    @Provides
    @Singleton
    fun application() : Application = app

    @Provides
    @Singleton
    fun context() : Context = app.applicationContext

    @Provides
    @Singleton
    fun sharedPreferences(app: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(app)
    }

}