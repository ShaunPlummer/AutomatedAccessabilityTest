package com.washutechnologies.automatedaccessibilitytests

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Single activity for the application.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Replacement layout including fixes.
        // setContentView(R.layout.activity_main_b)
    }
}
