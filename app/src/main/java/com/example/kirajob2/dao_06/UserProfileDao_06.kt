package com.example.kirajob2.dao_06

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.kirajob2.model_06.UserProfile_06

@Dao
interface UserProfileDao_06 {
    @Insert
    suspend fun insert(userProfile: UserProfile_06)

    @Update
    suspend fun update(userProfile: UserProfile_06)

    @Delete
    suspend fun delete(userProfile: UserProfile_06)

    @Query("SELECT * FROM user_profile")
    fun getAllUserProfiles(): LiveData<List<UserProfile_06>>
}