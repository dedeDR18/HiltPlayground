package id.learn.android.hiltplayground.domain.usecase

import id.learn.android.hiltplayground.domain.model.Post

interface Usecase {
    fun doGetPost(): List<Post>
}