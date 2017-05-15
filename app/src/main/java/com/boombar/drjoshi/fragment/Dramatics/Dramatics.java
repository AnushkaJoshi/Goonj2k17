package com.boombar.drjoshi.fragment.Dramatics;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.Voice;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.boombar.drjoshi.fragment.Art.Face;
import com.boombar.drjoshi.fragment.Art.Portrait;
import com.boombar.drjoshi.fragment.Art.Poster;
import com.boombar.drjoshi.fragment.Art.Rangoli;
import com.boombar.drjoshi.fragment.Art.Sketching;
import com.boombar.drjoshi.fragment.Art.TPainting;
import com.boombar.drjoshi.fragment.Art.Wall;
import com.boombar.drjoshi.fragment.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Dramatics extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dramatics);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listView = (ListView) findViewById(R.id.dramalist);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Hallabol",
                "G-Movie" ,
                "Drama Thretre(Play)",
                "MAD -Ads",
                "Voice of Silence",
                "Stand Up Comedy",
                "Dubbing Movie"


        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.dramalist, R.id.dramatext, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        " ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
                switch (position){
                    case 0:
                        Intent i =new Intent(Dramatics.this,Hallabol.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 =new Intent(Dramatics.this,Gmovie.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 =new Intent(Dramatics.this,Dramatheatre.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 =new Intent(Dramatics.this,Madads.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 =new Intent(Dramatics.this,VoiceofSilence.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 =new Intent(Dramatics.this,StandUpComedy.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 =new Intent(Dramatics.this,DubbingMovie.class);
                        startActivity(i6);
                        break;
                }


            }

        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}