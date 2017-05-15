package com.boombar.drjoshi.fragment.Art;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.boombar.drjoshi.fragment.Dance.Dhamaal;
import com.boombar.drjoshi.fragment.Dance.Footloose;
import com.boombar.drjoshi.fragment.Dance.Justdance;
import com.boombar.drjoshi.fragment.Dance.NachBaliye;
import com.boombar.drjoshi.fragment.Dance.Nritya;
import com.boombar.drjoshi.fragment.Dance.ReverseGear;
import com.boombar.drjoshi.fragment.Dance.Thumak;
import com.boombar.drjoshi.fragment.R;

public class Art extends AppCompatActivity {
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.artlist);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Wall Painting ",
                "Face Painting" ,
                "Rangoli",
                "Sketching",
                "Poster Making",
                "Portrait",
                "T-shirt Painting",
                "Collage",
                "Clay art",
                "Tattoo making",
                "Mehandi designing",
                "Puppet show"


        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.artlist, R.id.arttext, values);


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
                        Intent i =new Intent(Art.this,Wall.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 =new Intent(Art.this,Face.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 =new Intent(Art.this,Rangoli.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 =new Intent(Art.this,Sketching.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 =new Intent(Art.this,Poster.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 =new Intent(Art.this,Portrait.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 =new Intent(Art.this,TPainting.class);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 =new Intent(Art.this,Collage.class);
                        startActivity(i7);
                        break;
                    case 8:
                        Intent i8 =new Intent(Art.this,Tattoomaking.class);
                        startActivity(i8);
                        break;
                    case 9:
                        Intent i9 =new Intent(Art.this,Mehandidesigning.class);
                        startActivity(i9);
                        break;
                    case 10:
                        Intent i10 =new Intent(Art.this,Puppet.class);
                        startActivity(i10);
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

