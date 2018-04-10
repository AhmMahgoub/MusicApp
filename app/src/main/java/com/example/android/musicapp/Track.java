package com.example.android.musicapp;

/**
 * Created by Ahm on 4/6/2018.
 */

public class Track {

    // name of the track
    private String mSongName ;

    //name of the singer
    private String mSinger ;

    //name of the singer
    private int mImageResourceId ;
    /*
   * Create a new Track object.
   *
   * @param vName is the name of track
   * @param vSinger is the Name of ther Singer
   * @param image is drawable reference ID
   * */
    public Track(String vName, String vSinger,int imageResourceId )
    {
        mSongName = vName;
        mSinger = vSinger;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the track
     */
    public String getmSongName() {
        return mSongName;
    }

    /**
     * Get the name of the Singer
     */
    public String getmSinger() {
        return mSinger;
    }

    /**
     * Get the image resource ID
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
