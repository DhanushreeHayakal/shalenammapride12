package com.example.shalenammapride

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DailyMealActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_meal)

        title = "Daily Meals"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}