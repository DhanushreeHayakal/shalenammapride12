package com.example.shalenammapride

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FacilityTourActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facility_tour)

        title = "Facility Tour"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}