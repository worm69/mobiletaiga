package pt.dbmg.mobiletaiga.repository.api

import com.apollographql.apollo.ApolloClient
import okhttp3.OkHttpClient

private fun setupApollo(): ApolloClient {
    val BASE_URL = "https://graphql.anilist.co"
    val okHttp = OkHttpClient
            .Builder()
            .addInterceptor({ chain ->
                val original = chain.request()
                val builder = original.newBuilder().method(original.method(),
                        original.body())
//                builder.addHeader("Authorization"
//                        , "Bearer " + BuildConfig.AUTH_TOKEN)
                chain.proceed(builder.build())
            })
            .build()
    return ApolloClient.builder()
            .serverUrl(BASE_URL)
            .okHttpClient(okHttp)
            .build()
}