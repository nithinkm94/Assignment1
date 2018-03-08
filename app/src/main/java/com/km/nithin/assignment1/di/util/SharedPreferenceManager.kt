package com.km.nithin.assignment1.util

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton


/**
 * Created by bineesh on 4/11/17.
 */
@Singleton
class SharedPreferenceManager  @Inject constructor(private var sharedPreferences: SharedPreferences) {
    fun saveText(value: String?, key: String) {
        sharedPreferences.edit()
                .putString(key, value)
                .apply()
    }

    fun saveInt(o: Int, key: String) {
        sharedPreferences.edit()
                .putInt(key, o)
                .apply()
    }
    fun saveBoolean(o: Boolean, key: String) {
        sharedPreferences.edit()
                .putBoolean(key, o)
                .apply()
    }
    fun getStringData(key: String): String? {
        return sharedPreferences.getString(key, null) ?: return null
    }
    fun getIntData(key: String): Int? {
        return sharedPreferences.getInt(key, 0)
    }

    fun getBooleanData(key: String): Boolean? {
        return sharedPreferences.getBoolean(key, false)
    }
    fun logout() {
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.commit()
    }

}