package com.example.user.myapplication

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class RemoteDataSource {

    val baseURl = "https://en.wikipedia.org/"
    val action = "query"
    val list = "search"
    var srsearch: String? = "Nelson Mendela"
    val format = "json"


    private fun createRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseURl)
            //.addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(ScalarsConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    }

    private fun getService(): RemoteService {
        return createRetrofit().create(RemoteService::class.java)
    }

    fun getResponse(srsearch: String): Observable<String> {
        return getService().getResponse(action, list, srsearch, format)
    }

    interface RemoteService {

        @GET("w/api.php")
        fun getResponse(
            @Query("action") action: String,
            @Query("list") list: String,
            @Query("srsearch") srsearch: String,
            @Query("format") format: String
        ): Observable<String>
    }
}

