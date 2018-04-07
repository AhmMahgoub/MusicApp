package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ahm on 4/6/2018.
 */

public class TrackAdapter extends ArrayAdapter<Track> {

    private static final String LOG_TAG = TrackAdapter.class.getSimpleName();


    /**
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param Tracks A List of AndroidFlavor objects to display in a list
     */
    public TrackAdapter(Activity context, ArrayList<Track> Tracks) {

        super(context, 0, Tracks);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Track currentTrack = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID Track_name
        TextView TrackName =  listItemView.findViewById(R.id.Track_name);

        // Get the track name from the current track object and
        // set this text on the name TextView
        TrackName.setText(currentTrack.getmSongName());

        // Find the TextView in the list_item.xml layout with the ID Singer_name
        TextView SingerName =  listItemView.findViewById(R.id.Singer_name);

        // Get the Singer's name from the current track object and
        // set this text on the name TextView
        SingerName.setText(currentTrack.getmSinger());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView =  listItemView.findViewById(R.id.list_item_icon);

        // Get the image resource ID from the current Track object and
        // set the image to iconView
        iconView.setImageResource(currentTrack.getmImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;


    }
}
