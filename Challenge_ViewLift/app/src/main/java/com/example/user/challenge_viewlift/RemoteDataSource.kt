package com.example.user.challenge_viewlift

import android.util.Log
import org.simpleframework.xml.convert.AnnotationStrategy
import org.simpleframework.xml.core.Persister
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.jaxb.JaxbConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import retrofit2.http.GET

class RemoteDataSource {

    private val BASE_URL= "http://sample-firetv-web-app.s3-website-us-west-2.amazonaws.com/"
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(SimpleXmlConverterFactory.createNonStrict(Persister(AnnotationStrategy())))
//        .addConverterFactory(JaxbConverterFactory.create())
        .build()
    val service = retrofit.create(RemoteService::class.java)

    fun execute(callback: (Rss?) -> Unit){
        service.getResponse().enqueue(object: Callback<Rss>{
            override fun onFailure(call: Call<Rss>, t: Throwable) {
                Log.d(RemoteDataSource::class.java.simpleName, "onFailure: $t")
            }

            override fun onResponse(call: Call<Rss>, response: Response<Rss>) {
                callback.invoke(response.body())
            }
        })
    }
}

interface RemoteService{
    @GET("feed_firetv.xml")
    fun getResponse(): Call<Rss>
}