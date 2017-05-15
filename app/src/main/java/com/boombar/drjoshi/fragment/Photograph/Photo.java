package com.boombar.drjoshi.fragment.Photograph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.boombar.drjoshi.fragment.Dance.Justdance;
import com.boombar.drjoshi.fragment.Dance.ReverseGear;
import com.boombar.drjoshi.fragment.Dance.Thumak;
import com.boombar.drjoshi.fragment.Dramatics.Dramatheatre;
import com.boombar.drjoshi.fragment.Dramatics.DubbingMovie;
import com.boombar.drjoshi.fragment.Dramatics.Gmovie;
import com.boombar.drjoshi.fragment.Dramatics.Hallabol;
import com.boombar.drjoshi.fragment.Dramatics.Madads;
import com.boombar.drjoshi.fragment.Dramatics.StandUpComedy;
import com.boombar.drjoshi.fragment.Dramatics.VoiceofSilence;
import com.boombar.drjoshi.fragment.R;

public class Photo extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        listView = (ListView) findViewById(R.id.photolist);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Technical Pic of the Day",
                "Model Photography (In Indian traditional design)" ,
                "Life in the dark/ Silhouette"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.photolist, R.id.phototext, values);


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
                        Intent i =new Intent(Photo.this,Picofday.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 =new Intent(Photo.this,ModelPhotography.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 =new Intent(Photo.this,Lifeinthedark.class);
                        startActivity(i2);
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
