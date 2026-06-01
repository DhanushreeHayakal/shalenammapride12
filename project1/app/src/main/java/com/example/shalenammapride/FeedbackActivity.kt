package com.example.shalenammapride

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        val name = findViewById<EditText>(R.id.etName)
        val feedback = findViewById<EditText>(R.id.etFeedback)
        val submit = findViewById<Button>(R.id.btnSubmit)

        submit.setOnClickListener {

            val parentName = name.text.toString()
            val parentFeedback = feedback.text.toString()

            if (parentName.isEmpty() || parentFeedback.isEmpty()) {

                Toast.makeText(
                    this,
                    "Please fill all fields",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "Feedback Submitted Successfully",
                    Toast.LENGTH_LONG
                ).show()

                name.text.clear()
                feedback.text.clear()
            }
        }
    }
}