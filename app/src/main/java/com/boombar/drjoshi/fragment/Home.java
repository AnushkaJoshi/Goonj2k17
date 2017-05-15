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

import com.boombar.drjoshi.fragment.Contacts.Conveoer;
import com.boombar.drjoshi.fragment.Contacts.GoonjCulturalHead;
import com.boombar.drjoshi.fragment.Contacts.Studentcell.Studentcell;

public class Home extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ListView listview =(ListView) rootView .findViewById(R.id.listview);

//EDITED Code
        String[] items = new String[] {"Coordinator & Convenor", "Goonj Cultural Head", "Student Committee","ATHEROS coordinator",
        "RAMP Coordinator",
        "SOFT WARRIORS Coordinator",
        "APOLLO Coordinaor",
        "GENESIS Coordinator",
        "CIVICUS Coordinator",
        "ECRIS Coordinat"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            switch (position) {

                case 0: Intent co = new Intent(getActivity(), Conveoer.class);
                    startActivity(co);
                    break;
                case 1:Intent gcu = new Intent(getActivity(), GoonjCulturalHead.class);
                    startActivity(gcu);
                    break;
                case 2:   Intent myIntent = new Intent(getActivity(), Studentcell.class);
                startActivity(myIntent);
            }
            }
        });
        return rootView;

    }

}
