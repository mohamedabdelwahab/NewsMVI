package com.mohamed.data.network

import com.mohamed.data.util.API_KEY
import com.mohamed.domain.repositories.ISharedPrefrance
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HeaderInterceptor @Inject constructor(val iSharedPrefrance: ISharedPrefrance) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val requestBuilder = original.newBuilder()
        requestBuilder.addHeader("Content-Type", "application/json")
        requestBuilder.addHeader("Accept", "application/json")
        requestBuilder.addHeader("X-Api-Key", API_KEY)
        requestBuilder.addHeader("language", iSharedPrefrance.getLang())
        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}