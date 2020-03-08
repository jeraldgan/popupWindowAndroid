package com.example.myapplication

import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val sharedPref = applicationContext.getSharedPreferences("acceptTnc", 0);
        if (!(sharedPref.getBoolean("AcceptTnC", false))){
            startActivity(Intent(this, PopupActivity::class.java))
        }
    }


}
