package com.ansa.native160421080

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.OnBackInvokedDispatcher

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // a new comment
        // test buat percobaan baru: we need implement login features
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}