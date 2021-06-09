package id.learn.android.hiltplayground.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import id.learn.android.hiltplayground.data.source.local.entity.PostEntity

@Database(
    entities = [PostEntity::class],
    version = 1,
    exportSchema = false
)
abstract class JPHDatabase : RoomDatabase(){
    abstract fun jphdDao(): JPHDao
}