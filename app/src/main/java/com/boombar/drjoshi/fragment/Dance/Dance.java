package com.boombar.drjoshi.fragment.Dance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.boombar.drjoshi.fragment.R;

public class Dance extends AppCompatActivity {
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Just Dance (Solo Dance)",
                "Thumak – Thumak ( Oppo Couple)" ,
                "Reverse Gear",
                "Nritya (Folk dance)",
                "2 ka Dhamaal",
                "NachBaliye (Couple)",
                "Footloose (GROUP DANCE)",
               
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.dancelist, R.id.text, values);


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
                        Intent i =new Intent(Dance.this,Justdance.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 =new Intent(Dance.this,Thumak.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 =new Intent(Dance.this,ReverseGear.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 =new Intent(Dance.this,Nritya.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 =new Intent(Dance.this,Dhamaal.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 =new Intent(Dance.this,NachBaliye.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 =new Intent(Dance.this,Footloose.class);
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
