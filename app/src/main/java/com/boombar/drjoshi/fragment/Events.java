package com.boombar.drjoshi.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.boombar.drjoshi.fragment.Art.Art;
import com.boombar.drjoshi.fragment.Contacts.Conveoer;
import com.boombar.drjoshi.fragment.Contacts.GoonjCulturalHead;
import com.boombar.drjoshi.fragment.Contacts.Studentcell.Studentcell;
import com.boombar.drjoshi.fragment.Dance.Dance;
import com.boombar.drjoshi.fragment.Dramatics.Dramatics;
import com.boombar.drjoshi.fragment.Litrary.Litrary;
import com.boombar.drjoshi.fragment.MissGOONJ.Missgoonj;
import com.boombar.drjoshi.fragment.Music.LokGeet;
import com.boombar.drjoshi.fragment.Music.Music;
import com.boombar.drjoshi.fragment.Photograph.Photo;

/**
 * Created by Dr.Joshi on 4/5/2017.
 */
public class Events extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.events, container, false);
        ListView listview =(ListView) rootView .findViewById(R.id.eventview);

//EDITED Code
        String[] items = new String[] {"Dance","Photography","Music","Art and Design","Dramatics","Litrary","Mr and Miss Goonj 2k17"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {

                    case 0: Intent co = new Intent(getActivity(), Dance.class);
                        startActivity(co);
                        break;
                    case 1:Intent gcu = new Intent(getActivity(), Photo.class);
                        startActivity(gcu);
                        break;
                    case 2:Intent gcu2 = new Intent(getActivity(), Music.class);
                        startActivity(gcu2);
                        break;
                    case 3:   Intent myIntent = new Intent(getActivity(), Art.class);
                        startActivity(myIntent);
                        break;
                    case 4: Intent co3 = new Intent(getActivity(), Dramatics.class);
                        startActivity(co3);
                        break;
                    case 5:Intent gcu4 = new Intent(getActivity(), Litrary.class);
                        startActivity(gcu4);
                        break;
                    case 6:   Intent myIntent5 = new Intent(getActivity(), Missgoonj.class);
                        startActivity(myIntent5);
                        break;

                }
            }
        });

        return rootView;
    }
}
