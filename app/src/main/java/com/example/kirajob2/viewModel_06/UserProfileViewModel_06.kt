package com.example.kirajob2.viewModel_06

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.kirajob2.database_06.UserDatabase_06
import com.example.kirajob2.model_06.UserProfile_06
import com.example.kirajob2.repository_06.UserProfileRepository_06
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserProfileViewModel_06(application: Application) : AndroidViewModel(application) {
    private val repository: UserProfileRepository_06

    init {
        val userProfileDao = UserDatabase_06.getDatabase(application).userProfileDao()
        repository = UserProfileRepository_06(userProfileDao)
    }

    fun getUserProfiles(): LiveData<List<UserProfile_06>> {
        return repository.getUserProfiles()
    }

    fun insertUserProfile(userProfile: UserProfile_06) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(userProfile)
        }
    }

    fun updateUserProfile(userProfile: UserProfile_06) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.update(userProfile)
        }
    }

    fun deleteUserProfile(userProfile: UserProfile_06) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.delete(userProfile)
        }
    }
}