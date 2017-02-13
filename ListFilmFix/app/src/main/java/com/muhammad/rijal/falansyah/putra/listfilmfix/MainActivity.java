package com.muhammad.rijal.falansyah.putra.listfilmfix;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<Movie> adapter;
    ListView listView;

    private ArrayList<Movie> movies = new ArrayList<>();

    private void initMovies(){
        movies.add(new Movie("The Thor","Film tentang Thor", 7.5, 2009));
        movies.add(new Movie("Harry Potter","Film tentang Harry Potter", 6, 2010));
        movies.add(new Movie("Inception","Film tentang Inception", 8.4, 2012));
        movies.add(new Movie("Wolf of wallstreet","Film tentang Wolf of wallstreet", 7, 2012));
        movies.add(new Movie("Django Unchained","Film tentang Django Unchained", 8.5, 2006));
        movies.add(new Movie("Captain America","Film tentang Captain America", 7.8, 2010));
        movies.add(new Movie("Doctor Strange","Film tentang Doctor Strange", 8.4, 2016));
        movies.add(new Movie("X-men Apocalypse","Film tentang X-men Apocalypse", 7.6, 2016));
        movies.add(new Movie("Shutter Island","Film tentang Shutter Island", 8.2, 2015));
        movies.add(new Movie("The Avanger","Film tentang The Avanger", 7.9, 2014));
        movies.add(new Movie("Fantastic Beast & where to find them","Film tentang Fantastic Beast & where to find them", 8.3, 2016));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMovies();
        adapter = new ArrayAdapter<Movie>(this, android.R.layout.simple_list_item_1, movies);
        listView = (ListView) findViewById(R.id.list_film);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie selectedMovie = movies.get(position);

                Intent intent = new Intent(getBaseContext(),DetailActivity.class);
                intent.putExtra("com.muhammad.rijal.falansyah.putra.listfilm", selectedMovie);
                startActivity(intent);
            }
        });
    }
    public void tambah(View view)
    {
        Intent intent=new Intent(this,Tambah.class);
        startActivityForResult(intent,1);
    }
    protected void onActivityResult(int requestCode,int resultCode, Intent data)
    {
        if(requestCode==1)
        {
            if(resultCode== Activity.RESULT_OK)
            {
                Movie newmovie= (Movie) data.getSerializableExtra("filmlist.result");
                movies.add(newmovie);
                adapter.notifyDataSetChanged();
            }
        }
    }
}
