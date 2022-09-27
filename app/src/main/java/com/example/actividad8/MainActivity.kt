package com.example.actividad8
// Made by Sofia Jimenez Martinez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import android.transition.Transition
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.FrameLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var product1 : TextView
    private lateinit var product2 : TextView
    private lateinit var product3 : TextView
    private lateinit var product4 : TextView
    private lateinit var product5 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)

        product1 = findViewById(R.id.product1)
        product2 = findViewById(R.id.product2)
        product3 = findViewById(R.id.product3)
        product4 = findViewById(R.id.product4)
        product5 = findViewById(R.id.product5)

        webView.webViewClient = WebViewClient()

        product1.setOnClickListener {
            webView.loadUrl("https://www.amazon.com/Oculus-Quest-Advanced-All-One-Virtual/dp/B099VMT8VZ/ref=lp_16225016011_1_1")
            webView.visibility = View.VISIBLE
        }

        product2.setOnClickListener {
            webView.loadUrl("https://www.amazon.com/Splatoon-3-Nintendo-Switch/dp/B09T5SJQGV/ref=lp_16225016011_1_2?th=1")
            webView.visibility = View.VISIBLE
        }

        product3.setOnClickListener {
            webView.loadUrl("https://www.amazon.com/Xbox-X/dp/B08H75RTZ8/ref=lp_16225016011_1_3")
            webView.visibility = View.VISIBLE
        }

        product4.setOnClickListener {
            webView.loadUrl("https://www.amazon.com/Nintendo-Switch-OLED-Model-White-Joy/dp/B098RKWHHZ/ref=lp_16225016011_1_4")
            webView.visibility = View.VISIBLE
        }

        product5.setOnClickListener {
            webView.loadUrl("https://www.amazon.com/Xbox-Core-Controller-Robot-White-one/dp/B08DF26MXW/ref=lp_16225016011_1_10")
            webView.visibility = View.VISIBLE
        }

        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
        webView.visibility = View.GONE
        webView.loadUrl("")
    }
}