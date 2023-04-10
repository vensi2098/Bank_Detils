package com.example.bank_detils;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebVewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_vew);
        webview();

    }

    private void webview() {
        // Find the WebView by its unique ID
        WebView webView = findViewById(R.id.webView);

        // loading http://www.google.com url in the WebView.
        String url = getIntent().getExtras().getString("url");

        webView.loadUrl(url);

        // this will enable the javascript.
        webView.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.setWebViewClient(new WebViewClient());
    }
}