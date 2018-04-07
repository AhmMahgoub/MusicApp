package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.musicapp.R;
import com.example.android.musicapp.Track;
import com.example.android.musicapp.TrackAdapter;

import java.util.ArrayList;

public class YourSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        ArrayList<Track> songs = new ArrayList<Track>();
        songs.add(new Track("Chandelier","Sia",R.drawable.iconss));
        songs.add(new Track("All Of Me","John Legend",R.drawable.iconss));
        songs.add(new Track("Sign of the Times","Harry Styles",R.drawable.iconss));
        songs.add(new Track("Green Light","Lorde",R.drawable.iconss));
        songs.add(new Track("Bad Liarr","Selena Gomez",R.drawable.iconss));
        songs.add(new Track("DNA","Kendrick Lamar",R.drawable.iconss));
        songs.add(new Track("Bodak Yellow","Cardi B",R.drawable.iconss));

        TrackAdapter tracks = new TrackAdapter(this,songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(tracks);
    }

}
