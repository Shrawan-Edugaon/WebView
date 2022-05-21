package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    lateinit var mWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mWebView = findViewById(R.id.webView)
        mWebView.loadUrl("https://www.google.com/maps/@25.4148608,86.1072944,14z")
        val webSetting = mWebView.settings

        webSetting.javaScriptEnabled = true
        mWebView.webViewClient = WebViewClient()
    }

    override fun onBackPressed() {
            if (mWebView.canGoBack()) {
                mWebView.goBack()
            } else {
                super.onBackPressed()
            }
        }
    }
