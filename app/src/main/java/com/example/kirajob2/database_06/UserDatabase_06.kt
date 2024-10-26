package com.example.kirajob2.database_06

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kirajob2.dao_06.UserProfileDao_06
import com.example.kirajob2.model_06.UserProfile_06

@Database(entities = [UserProfile_06::class], version = 1)
abstract class UserDatabase_06 : RoomDatabase() {
    abstract fun userProfileDao(): UserProfileDao_06

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase_06? = null

        fun getDatabase(context: Context): UserDatabase_06 {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase_06::class.java,
                    "user_profile_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}