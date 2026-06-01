package com.example.shalenammapride

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mealButton = findViewById<Button>(R.id.btnMeal)
        val facilityButton = findViewById<Button>(R.id.btnFacility)
        val starsButton = findViewById<Button>(R.id.btnStars)
        val feedbackButton = findViewById<Button>(R.id.btnFeedback)

        mealButton.setOnClickListener {
            startActivity(Intent(this, DailyMealActivity::class.java))
        }

        facilityButton.setOnClickListener {
            startActivity(Intent(this, FacilityTourActivity::class.java))
        }

        starsButton.setOnClickListener {
            startActivity(Intent(this, StudentStarsActivity::class.java))
        }

        feedbackButton.setOnClickListener {
            startActivity(Intent(this, FeedbackActivity::class.java))
        }
    }
}