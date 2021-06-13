package id.learn.android.hiltplayground.data.source.remote.network

import id.learn.android.hiltplayground.data.source.remote.response.PostResponseItem
import io.reactivex.Flowable
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    fun getPost(): Single<List<PostResponseItem>>
}
