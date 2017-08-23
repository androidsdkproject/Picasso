package com.example.android1.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView=(ImageView) findViewById(R.id.downloadimage);

        Picasso.with(MainActivity.this)
                .load("https://www.androidtutorialpoint.com/wp-content/uploads/2016/10/ironman.jpg")
                .placeholder(android.R.drawable.ic_media_play)
                .error(android.R.drawable.stat_notify_error)
                .into(imageView);
    }
}
