package com.example.webview_hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView nameText = findViewById(R.id.name);
        TextView descriptionText = findViewById(R.id.description);
        ImageView pictureView = findViewById(R.id.picture);
        TextView dataText = findViewById(R.id.data);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        Button viewButton = findViewById(R.id.buttonView);


        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            String name = arguments.getString("name");
            nameText.setText(name);

            String description = arguments.getString("description");
            descriptionText.setText(description);

            int picture = arguments.getInt("cover");
            pictureView.setImageResource(picture);

            String data = arguments.getString("data");
            dataText.setText(data);

            float rating = arguments.getFloat("rating");
            ratingBar.setRating(rating);

            String url = arguments.getString("url");
            viewButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent intent = new Intent(SecondActivity.this, Activity_View.class);
                    intent.putExtra("url", url);
                    startActivity(intent);
                }
            });
        }
    }
}