package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.example.android.musicapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Set a click listener on that View
        TextView YourSongs =  findViewById(R.id.YourSongs);

        // The code in this method will be executed when yourSong category is clicked on.
        YourSongs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link YourSongs}
                Intent numbersIntent = new Intent(MainActivity.this, YourSongs.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Set a click listener on that View
        TextView Playlists =  findViewById(R.id.Playlists);

        // The code in this method will be executed when yourSong category is clicked on.
        Playlists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link YourSongs}
                Intent PlaylistsIntenet = new Intent(MainActivity.this, Playlists.class);

                // Start the new activity
                startActivity(PlaylistsIntenet);
            }
        });
        // Set a click listener on that View
        TextView Search =  findViewById(R.id.Search);

        // The code in this method will be executed when yourSong category is clicked on.
        Search.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link YourSongs}
                Intent SearchIntent = new Intent(MainActivity.this, Search.class);

                // Start the new activity
                startActivity(SearchIntent);
            }
        });
    }
}
