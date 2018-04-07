package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        ArrayList<Track> Albums = new ArrayList<Track>();
        Albums.add(new Track("Sia","7 Songs",R.drawable.mutiscreens));
        Albums.add(new Track("John Legend","9 Songs",R.drawable.mutiscreens));
        Albums.add(new Track("Harry Styles","12 Songs",R.drawable.mutiscreens));
        Albums.add(new Track("Lorde","5 Songs",R.drawable.mutiscreens));
        Albums.add(new Track("Selena Gomez","8 Songs",R.drawable.mutiscreens));
        Albums.add(new Track("Kendrick Lamar","7 Songs",R.drawable.mutiscreens));
        Albums.add(new Track("Cardi B","5 Songs",R.drawable.mutiscreens));

        TrackAdapter Album = new TrackAdapter(this,Albums);

        GridView gridView= findViewById(R.id.Album);

        gridView.setAdapter(Album);
    }
}
