package com.example.kirajob2.repository_06

import androidx.lifecycle.LiveData
import com.example.kirajob2.dao_06.UserProfileDao_06
import com.example.kirajob2.model_06.UserProfile_06

class UserProfileRepository_06(private val userProfileDao: UserProfileDao_06) {
    fun getUserProfiles(): LiveData<List<UserProfile_06>> {
        return userProfileDao.getAllUserProfiles()
    }

    suspend fun insert(userProfile: UserProfile_06) {
        userProfileDao.insert(userProfile)
    }

    suspend fun update(userProfile: UserProfile_06) {
        userProfileDao.update(userProfile)
    }

    suspend fun delete(userProfile: UserProfile_06) {
        userProfileDao.delete(userProfile)
    }
}