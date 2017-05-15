package com.boombar.drjoshi.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.boombar.drjoshi.fragment.Days.Day1;
import com.boombar.drjoshi.fragment.Days.Day2;
import com.boombar.drjoshi.fragment.Days.Day3;
import com.boombar.drjoshi.fragment.Music.Music;

/**
 * Created by Dr.Joshi on 4/1/2017.
 */
public class Contact extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contact, container, false);
        ListView listview =(ListView) rootView .findViewById(R.id.listview);

        String[] items = new String[] {"Date-21/04/17","Date-22/04/17","Date-27/04/17","Date-28/04/17","Date-29/04/17"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

               switch (position){
                   case 0 :Intent i =new Intent(getActivity(), Day1.class);
                       startActivity(i);
                       break;
                   case 1 :Intent i1 =new Intent(getActivity(), Day2.class);
                       startActivity(i1);
                       break;
                   case 2 :Intent i2 =new Intent(getActivity(), Day3.class);
                       startActivity(i2);
                       break;
               }
            }
        });
        return rootView;
    }
}
