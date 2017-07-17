package sg.edu.rp.c346.movielist;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by 16022596 on 17/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<MovieDetail> movieList;

    public CustomAdapter(Context context, int resources, ArrayList<MovieDetail> objects) {
        super(context, resources, objects);

        parent_context = context;
        layout_id = resources;
        movieList = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI Elements and assign to variables
        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewMovieTitle);
        TextView tvDesc = (TextView) rowView.findViewById(R.id.textViewMovieDesc);
        TextView tvAuthor = (TextView) rowView.findViewById(R.id.textViewMovieAuthor);
        TextView tvRelease = (TextView)rowView.findViewById(R.id.textViewMovieReleaseDate);

        // Obtain the to-do item based on the 'position'.
        MovieDetail currentItem = movieList.get(position);

        // Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getMovieName());
        tvDesc.setText(currentItem.getMovieDesc());
        tvAuthor.setText(currentItem.getMovieAuthor());
        tvRelease.setText(currentItem.getMovieReleaseString());


        //return the View corresponding to the data at the specified position.
        return rowView;
    }

}
