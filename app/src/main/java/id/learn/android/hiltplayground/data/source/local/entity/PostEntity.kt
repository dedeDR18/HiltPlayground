package id.learn.android.hiltplayground.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "postentities")
data class PostEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "body")
    val body: String,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "userId")
    val userId: Int
)