package com.example.shalenammapride

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StudentStarsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_stars)

        title = "Student Stars"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}