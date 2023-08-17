package com.mohamed.data.repositeries

import android.content.Context
import com.mohamed.data.util.KEY_PREF_LANG
import com.mohamed.data.util.SHARED_PREFERENCES_FILE_NAME
import com.mohamed.domain.repositories.ISharedPrefrance
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AppPreferencesImp @Inject constructor(@ApplicationContext context: Context) :
    ISharedPrefrance {
    private val sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_FILE_NAME, 0)

    override fun getLang(): String {
        return sharedPref.getString(KEY_PREF_LANG, "en").toString()
    }

    override fun setLang(lang: String) {
        sharedPref.edit().also {
            it.putString(KEY_PREF_LANG, lang)
            it.apply()
        }
    }


}