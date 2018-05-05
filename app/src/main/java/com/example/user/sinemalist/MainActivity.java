package com.example.user.sinemalist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayMovie=new ArrayList<>();
        arrayMovie.add("Операция Ы");
        arrayMovie.add("Терминатор");
        arrayMovie.add("Рембо");

        ArrayAdapter<String> adapter =new ArrayAdapter<>(this,
                R.layout.movie_list_item,
                R.id.textView,
                arrayMovie);

        ListView listMovies= (ListView) findViewById(R.id.listMovies);
        listMovies.setAdapter(adapter);

    }
}
