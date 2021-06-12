package id.learn.android.hiltplayground.data

import id.learn.android.hiltplayground.data.source.local.room.JPHDatabase
import id.learn.android.hiltplayground.data.source.remote.network.ApiService
import id.learn.android.hiltplayground.data.source.remote.response.PostResponseItem
import id.learn.android.hiltplayground.domain.model.Post
import id.learn.android.hiltplayground.domain.repository.IRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(
    private val api: ApiService,
    private val database: JPHDatabase
) : IRepository {

    override fun getPost(): List<Post> {
            val resultData = PublishSubject.create<List<PostResponseItem>>()

            val client = api.getPost()

            client
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .take(1)
                .subscribe({ response ->
                    val data = response
                    resultData.onNext(if (data.isNotEmpty()) )
                })
    }

}