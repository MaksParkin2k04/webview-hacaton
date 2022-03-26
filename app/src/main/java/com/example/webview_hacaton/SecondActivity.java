package com.example.webview_hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView nameText = findViewById(R.id.name);
        TextView descriptionText = findViewById(R.id.description);
        ImageView pictureView = findViewById(R.id.picture);
        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            String name = arguments.getString("name");
            nameText.setText(name);

            String description = arguments.getString("description");
            descriptionText.setText(description);

            int picture = arguments.getInt("cover");
            pictureView.setImageResource(picture);

        }
    }
}