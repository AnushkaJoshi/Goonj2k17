package com.boombar.drjoshi.fragment.Music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.boombar.drjoshi.fragment.Photograph.Lifeinthedark;
import com.boombar.drjoshi.fragment.Photograph.ModelPhotography;
import com.boombar.drjoshi.fragment.Photograph.Picofday;
import com.boombar.drjoshi.fragment.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;import android.widget.ListView;
import android.widget.Toast;

public class Music extends AppCompatActivity {
    String countryList3[] = {"Lok Geet / Bhajan", "Rock/Qawwali", "Tarang(Instrumental)", "Self-composed", "Duet Song", "Hindi Solo","English Solo"};
    ListView simpleList1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        simpleList1 = (ListView)findViewById(R.id.simpleListView1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview_music, R.id.textView, countryList3);
        simpleList1.setAdapter(arrayAdapter);
        simpleList1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) simpleList1.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        " ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();
                switch (position){
                    case 0:
                        Intent i =new Intent(Music.this,LokGeet.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 =new Intent(Music.this,Rock.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 =new Intent(Music.this,Tarang.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 =new Intent(Music.this,Selfcomposed.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 =new Intent(Music.this,DuetSong.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 =new Intent(Music.this,HindiSolo.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 =new Intent(Music.this,EnglishSolo.class);
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
