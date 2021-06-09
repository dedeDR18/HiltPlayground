package id.learn.android.hiltplayground.data.source.local.room

import androidx.room.*
import id.learn.android.hiltplayground.data.source.local.entity.PostEntity

@Dao
interface JPHDao{
    @Query("SELECT * FROM postentities")
    fun getPost(): List<PostEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPost(listPost: List<PostEntity>)

    @Query("DELETE FROM postentities")
    fun deleteAllPost()
}