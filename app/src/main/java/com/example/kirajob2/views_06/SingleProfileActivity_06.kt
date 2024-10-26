package com.example.kirajob2.views_06

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kirajob2.R
import com.example.kirajob2.model_06.UserProfile_06

class SingleProfileActivity_06 : AppCompatActivity() {
    private lateinit var userProfile: UserProfile_06
    private lateinit var nameText: TextView
    private lateinit var emailText: TextView
    private lateinit var dobText: TextView
    private lateinit var districtText: TextView
    private lateinit var mobileText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_profile06)
        userProfile = intent.getSerializableExtra("USER_PROFILE") as UserProfile_06

        nameText = findViewById(R.id.nameTextView)
        emailText = findViewById(R.id.emailTextView)
        dobText = findViewById(R.id.dobTextView)
        districtText = findViewById(R.id.districtTextView)
        mobileText = findViewById(R.id.mobileTextView)

        populateFields()
    }

    private fun populateFields() {
        nameText.text = userProfile.name
        emailText.text = userProfile.email
        dobText.text = userProfile.dob
        districtText.text = userProfile.district
        mobileText.text = userProfile.mobile
    }
}