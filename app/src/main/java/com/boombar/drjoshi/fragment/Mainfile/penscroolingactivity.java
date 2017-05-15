package com.boombar.drjoshi.fragment.Mainfile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.boombar.drjoshi.fragment.Contact;
import com.boombar.drjoshi.fragment.Contacts.Contacts;

import com.boombar.drjoshi.fragment.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class penscroolingactivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";
    Button contact,day;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penscroolingactivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(getDataSet(),this);
        mRecyclerView.setAdapter(mAdapter);
        contact = (Button) findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(penscroolingactivity.this, Contacts.class);
                startActivity(i);
            }
        });

    }
    @Override
    protected void onResume() {
        super.onResume();
        ((MyRecyclerViewAdapter) mAdapter).setOnItemClickListener(new MyRecyclerViewAdapter
                .MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.i(LOG_TAG, " Clicked on Item " + position);
            }
        });
    }

    private ArrayList<DataObject> getDataSet() {
        ArrayList results = new ArrayList<DataObject>();

        DataObject obj = new DataObject("DRAMATICS",
                "task before an hour of event" ,R.drawable.mypic);
        results.add(obj);
        DataObject obj2 = new DataObject("MUSIC",
                "bringing out vocalists in you ",R.drawable.mypic);
        results.add(obj2);
        DataObject obj3 = new DataObject("DANCE",
                "rock the stage",R.drawable.mypic);
        results.add(obj3);
        DataObject obj4 = new DataObject("Mr. & Miss GOONJ",
                "Select Mr. & Miss GOONJ",R.drawable.mypic);
        results.add(obj4);
        DataObject obj5 = new DataObject("DRESS TO IMPRESS (RAMP)",
                "rock the ramp",R.drawable.mypic);
        results.add(obj5);
        DataObject obj6 = new DataObject("ARTS & DESIGNING",
                "Face painting and design",R.drawable.mypic);
        results.add(obj6);
        DataObject obj7 = new DataObject("PHOTOGRAPHY",
                "Working on the tip",R.drawable.mypic);
        results.add(obj7);
        DataObject obj8 = new DataObject("LITERARY",
                "decorum of language",R.drawable.mypic);
        results.add(obj8);
        DataObject obj9 = new DataObject("Quiz",
                "Show your knowledge",R.drawable.mypic);
        results.add(obj9);

        return results;
    }
}
