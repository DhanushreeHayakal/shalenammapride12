package com.example.shalenammapride

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val btnEnglish = findViewById<Button>(R.id.btnEnglish)
        val btnKannada = findViewById<Button>(R.id.btnKannada)

        btnEnglish.setOnClickListener {

            setAppLanguage("en")

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnKannada.setOnClickListener {

            setAppLanguage("kn")

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun setAppLanguage(language: String) {

        val locale = Locale(language)
        Locale.setDefault(locale)

        val configuration = Configuration()
        configuration.setLocale(locale)

        baseContext.resources.updateConfiguration(
            configuration,
            baseContext.resources.displayMetrics
        )
    }
}