package com.example.webview_hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        WebView browser=findViewById(R.id.webBrowser);
        WebSettings webSettings = browser.getSettings();
        webSettings.setJavaScriptEnabled(true);

        browser.setWebViewClient(new WebViewClient(){

        });

        Bundle arguments = getIntent().getExtras();

        String url = arguments.getString("url");

        browser.loadUrl(url);


    }

}