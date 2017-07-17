package sg.edu.rp.c346.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<MovieDetail> movieList;
    CustomAdapter caMovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = (ListView)findViewById(R.id.movieList);
        movieList = new ArrayList<MovieDetail>();

        caMovieList = new CustomAdapter(this,R.layout.movie_detail_row,movieList);
        lvMovie.setAdapter(caMovieList);

        MovieDetail mv1 = new MovieDetail("War For the Planet","A 2017 sequel of the Planet of the Apes","Pierre Boulle", 2017);
        movieList.add(mv1);

        MovieDetail mv2 = new MovieDetail("King Kong","Movie about a giant ape","Merian C Cooper", 1930);
        movieList.add(mv2);


    }
}

