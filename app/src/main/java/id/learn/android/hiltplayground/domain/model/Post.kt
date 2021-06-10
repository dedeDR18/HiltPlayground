package id.learn.android.hiltplayground.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Post(
    var body: String,
    val id: Int,
    val title: String,
    val userId: Int
) : Parcelable