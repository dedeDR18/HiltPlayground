package id.learn.android.hiltplayground.util

import id.learn.android.hiltplayground.data.source.local.entity.PostEntity
import id.learn.android.hiltplayground.data.source.remote.response.PostResponseItem
import id.learn.android.hiltplayground.domain.model.Post

object DataMapper {
    fun mapPostResponseToPostEntity(input: List<PostResponseItem>): List<PostEntity> {
        val listPost = ArrayList<PostEntity>()
        input.map { input ->
            val p = PostEntity(
                id = input.id,
                body = input.body,
                title = input.title,
                userId = input.userId
            )
            listPost.add(p)
        }
        return listPost
    }

    fun mapPostEntityToPostDomain(input: List<PostEntity>): List<Post> {
        val listPost = ArrayList<Post>()
        input.map { input ->
            val p = Post(
                id = input.id,
                body = input.body,
                title = input.title,
                userId = input.userId
            )
            listPost.add(p)
        }
        return listPost
    }
}