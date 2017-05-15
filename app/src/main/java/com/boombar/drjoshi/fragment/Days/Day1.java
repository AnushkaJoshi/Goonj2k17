package com.boombar.drjoshi.fragment.Days;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.boombar.drjoshi.fragment.R;

public class Day1 extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);
        listView = (ListView) findViewById(R.id.day1list);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Event1",
                "Event1" ,
                "Event1",
                "Event1",
                "Event1",
                "Event1",
                "Event1"


        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.day1list, R.id.day1View, values);
        listView.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
