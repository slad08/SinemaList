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

    /*    ArrayList<String> arrayMovie=new ArrayList<>();
        arrayMovie.add("Операция Ы");
        arrayMovie.add("Терминатор");
        arrayMovie.add("Рембо");


        ArrayAdapter<String> adapter =new ArrayAdapter<>(this,
                R.layout.movie_list_item,
                R.id.textView,
                arrayMovie);
*/

    Movie[] movies = new Movie[]{
            new Movie("Jurassic World: Fallen Kingdom",
            "It’s been four years since theme park and luxury resort Jurassic World was destroyed","J.A. Bayona",584),
            new Movie("The First Purge","Behind every tradition lies a revolution.",
            "Gerard McMurray",342),
            new Movie("Johnny English Strikes Again","JOHNNY ENGLISH STRIKES AGAIN is the third installment of the Johnny English comedy series, with Rowan Atkinson returning as the much loved accidental secret agent.",
            "David Kerr",965),
            new Movie("Skyscraper","Global icon Dwayne Johnson leads the cast of Legendary's Skyscraper as former FBI Hostage Rescue Team leader and U.S",
            "Rawson Marshall Thurber",845)};

        ListView listMovies= (ListView) findViewById(R.id.listMovies);
//        listMovies.setAdapter(adapter);

    }
}
