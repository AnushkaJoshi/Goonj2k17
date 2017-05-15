package com.boombar.drjoshi.fragment.Litrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.boombar.drjoshi.fragment.Music.DuetSong;
import com.boombar.drjoshi.fragment.Music.EnglishSolo;
import com.boombar.drjoshi.fragment.Music.HindiSolo;
import com.boombar.drjoshi.fragment.Music.LokGeet;
import com.boombar.drjoshi.fragment.Music.Rock;
import com.boombar.drjoshi.fragment.Music.Selfcomposed;
import com.boombar.drjoshi.fragment.Music.Tarang;
import com.boombar.drjoshi.fragment.R;

public class Litrary extends AppCompatActivity {
    String countryList3[] = {"Debate", "Extempore", "Group Discussion", "Just A Minute (JAM)", "Poem writing", "Elocution","Quiz","What’s the good word?","Buisness Plan","Satya Sthapit Karein"};
    ListView simpleList1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_litrary);
        simpleList1 = (ListView)findViewById(R.id.litrary);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.litrarylist, R.id.litView, countryList3);
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
                        Intent i =new Intent(Litrary.this,Debate.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 =new Intent(Litrary.this,Extempore.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 =new Intent(Litrary.this,GroupDiscussion.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 =new Intent(Litrary.this,JAM.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 =new Intent(Litrary.this,Poemwriting.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 =new Intent(Litrary.this,Elocution.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 =new Intent(Litrary.this,Quiz.class);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 =new Intent(Litrary.this,BuisnessPlan.class);
                        startActivity(i7);
                        break;
                    case 8:
                        Intent i8 =new Intent(Litrary.this,Satya.class);
                        startActivity(i8);
                        break;

                }


            }

        });
    }
    }

