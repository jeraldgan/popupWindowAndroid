package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity

class PopupActivity : AppCompatActivity() {

    lateinit var popupWindow: PopupWindow

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.popup_window)

        val webView = findViewById<WebView>(R.id.webView)
        webView.setWebViewClient(WebViewClient())
        webView.loadUrl("http://www.google.com")

        val acceptButton = findViewById<Button>(R.id.acceptButton)

        acceptButton.setOnClickListener(View.OnClickListener {
            val sharedPref = applicationContext.getSharedPreferences("acceptTnc", 0)
            val editor = sharedPref.edit()
            editor.putBoolean("AcceptTnC", true)
            editor.commit()
            finish()
        })

    }
}