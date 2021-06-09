package id.learn.android.hiltplayground.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import id.learn.android.hiltplayground.data.source.local.room.JPHDao
import id.learn.android.hiltplayground.data.source.local.room.JPHDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): JPHDatabase = Room.databaseBuilder(
        context,
        JPHDatabase::class.java,
        "JPHDatabase.db"
    )
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    fun provideDao(database: JPHDatabase): JPHDao = database.jphdDao()
}