package com.mobatia.naisapp.constants

import android.content.Context

class PreferenceManager {
    companion object{

        private val PREFSNAME = "NAS"

        fun setIsFirstLaunch(context: Context, result: Boolean) {
            val prefs = context.getSharedPreferences(
                PREFSNAME, Context.MODE_PRIVATE
            )
            val editor = prefs.edit()
            editor.putBoolean("is_first_launch", result)
            editor.commit()
        }

        fun getIsFirstLaunch(context: Context): Boolean {
            val prefs = context.getSharedPreferences(
                PREFSNAME, Context.MODE_PRIVATE)
            return prefs.getBoolean("is_first_launch", true)
        }

        fun setaccesstoken(context: Context, id: String?) {
            val prefs = context.getSharedPreferences(
                PREFSNAME, Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putString("access_token", id)
            editor.apply()
        }

        fun getaccesstoken(context: Context): String? {
            val prefs = context.getSharedPreferences(
                PREFSNAME, Context.MODE_PRIVATE)
            return prefs.getString("access_token", "")
        }
    }
}