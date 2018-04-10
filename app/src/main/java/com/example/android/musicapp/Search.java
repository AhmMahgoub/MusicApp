package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Set a click listener on that View
        Button PlayNow =  findViewById(R.id.SearchButton);

        // The code in this method will be executed when playnow button is clicked on.
        PlayNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent PlayNowIntent = new Intent(Search.this, MainActivity.class);

                // Start the new activity
                startActivity(PlayNowIntent);
            }
        });
    }
}
