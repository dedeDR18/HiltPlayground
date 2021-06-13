package id.learn.android.hiltplayground.data

import android.annotation.SuppressLint
import android.util.Log
import id.learn.android.hiltplayground.data.source.local.room.JPHDatabase
import id.learn.android.hiltplayground.data.source.remote.network.ApiService
import id.learn.android.hiltplayground.data.source.remote.response.PostResponseItem
import id.learn.android.hiltplayground.domain.model.Post
import id.learn.android.hiltplayground.domain.repository.IRepository
import id.learn.android.hiltplayground.util.DataMapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(
    private val api: ApiService,
    private val database: JPHDatabase
) : IRepository {


//    @SuppressLint("CheckResult")
//    override fun getPost() {
//            //val resultData = PublishSubject.create<List<PostResponseItem>>()
//            val mCompositeDisposable = CompositeDisposable()
//
//            val client = api.getPost()
//
//             val response = client
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnSuccess{ listPost ->
//                    if (listPost.isNotEmpty()){
//                        val data = DataMapper.mapPostResponseToPostEntity(listPost)
//                        database.jphdDao().insertPost(data)
//                            .subscribeOn(Schedulers.io())
//                            .observeOn(AndroidSchedulers.mainThread())
//                            .subscribe()
//                    } else {
//                        Log.d("TAG","List Kosong")
//                    }
//
//                }
//                .doOnError {
//                    Log.d("TAG","Error while fetch data...")
//                }
//            mCompositeDisposable.add(response)
//
//
//    }

}