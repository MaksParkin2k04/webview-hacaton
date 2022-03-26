package com.example.webview_hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Activity_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        WebView browser=findViewById(R.id.webBrowser);
        browser.loadUrl("https://metanit.com");
    }
}