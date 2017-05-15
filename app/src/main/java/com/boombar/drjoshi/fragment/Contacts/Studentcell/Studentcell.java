package com.boombar.drjoshi.fragment.Contacts.Studentcell;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

import com.boombar.drjoshi.fragment.Contacts.Action;
import com.boombar.drjoshi.fragment.Contacts.MainActivityAdapter;
import com.boombar.drjoshi.fragment.DividerItemDecoration;
import com.boombar.drjoshi.fragment.Home;
import com.boombar.drjoshi.fragment.R;

import java.util.ArrayList;
import java.util.List;

public class Studentcell extends AppCompatActivity {
    private SacAdapter mAdapter;
    private RecyclerView recyclerView;
    List<Actioncontacts> actionList;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentcell);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        actionList = new ArrayList<Actioncontacts>();
        updateActionList();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mAdapter = new SacAdapter(actionList, this);
        recyclerView.setAdapter(mAdapter);


    }
    void updateActionList() {
        Actioncontacts action = new Actioncontacts();
        action.englishAction = "Gurjot Singh";
        action.hindiAction = "Administrating Commitee";

        action.contactno = "";
        actionList.add(action);

        Actioncontacts action2 = new Actioncontacts();
        action2.englishAction = "Ashwani Rana";
        action2.hindiAction = "Administrating Commitee";
        actionList.add(action2);

        Actioncontacts action21 = new Actioncontacts();
        action21.englishAction = "Umang Goel";
        action21.hindiAction = "Administrating Commitee";
        actionList.add(action21);

        Actioncontacts action3 = new Actioncontacts();
        action3.englishAction = "Priyanka Mishra";
        action3.hindiAction = "Administrating Commitee";
        actionList.add(action3);

        Actioncontacts action4 = new Actioncontacts();
        action4.englishAction = "Ashish Chaube";
        action4.hindiAction = "Finance Commitee";
        actionList.add(action4);

        Actioncontacts action5 = new Actioncontacts();
        action5.englishAction = "Piyush Pant";
        action5.hindiAction = "Finance Commitee";
        actionList.add(action5);

        Actioncontacts action6 = new Actioncontacts();
        action6.englishAction = "Kirti Agarwal";
        action6.hindiAction = "Cultural Commitee";
        actionList.add(action6);

        Actioncontacts action7 = new Actioncontacts();
        action7.englishAction = "Vishal Kumar Gautam";
        action7.hindiAction = "Cultural Commitee";
        actionList.add(action7);

        Actioncontacts action8 = new Actioncontacts();
        action8.englishAction = "Ashish Chaube";
        action8.hindiAction = "Literary Commitee";
        actionList.add(action8);

        Actioncontacts action9 = new Actioncontacts();
        action9.englishAction = "Manisha Khati";
        action9.hindiAction = "Literary Commitee";
        actionList.add(action9);

        Actioncontacts action10 = new Actioncontacts();
        action10.englishAction = "Pranshu Chandra Bhushan Singh Negi";
        action10.hindiAction = "Literary Commitee";
        actionList.add(action10);

        Actioncontacts action11 = new Actioncontacts();
        action11.englishAction = "Piyush Pant";
        action11.hindiAction = "Arts and Designing";
        actionList.add(action11);

        Actioncontacts action12 = new Actioncontacts();
        action12.englishAction = "Nidhi Garg";
        action12.hindiAction = "Arts and Designing";
        actionList.add(action12);

        Actioncontacts action13 = new Actioncontacts();
        action13.englishAction = "Vinod Singh";
        action13.hindiAction = "Technical Commitee";
        actionList.add(action13);

        Actioncontacts action14 = new Actioncontacts();
        action14.englishAction = "Suraj Chauhan";
        action14.hindiAction = "Technical Commitee";
        actionList.add(action14);

        Actioncontacts action15 = new Actioncontacts();
        action15.englishAction = "Mohit Pal";
        action15.hindiAction = "Discipline Commitee";
        actionList.add(action15);

        Actioncontacts action16 = new Actioncontacts();
        action16.englishAction = "Deepak Kumar Dhanjuwalia";
        action16.hindiAction = "Discipline Commitee";
        actionList.add(action16);

        Actioncontacts action17 = new Actioncontacts();
        action17.englishAction = "Jagdeep Arya";
        action17.hindiAction = "Discipline Commitee";
        actionList.add(action17);

        Actioncontacts action18 = new Actioncontacts();
        action18.englishAction = "Akash Chaudhary";
        action18.hindiAction = "Discipline Commitee";
        actionList.add(action18);

        Actioncontacts action19 = new Actioncontacts();
        action19.englishAction = "Ashish Chaube";
        action19.hindiAction = "Stage Management";
        actionList.add(action19);

        Actioncontacts action20 = new Actioncontacts();
        action20.englishAction = "Abhilash Jadli";
        action20.hindiAction = "Stage Management";
        actionList.add(action20);

        Actioncontacts action22 = new Actioncontacts();
        action22.englishAction = "Nidhi Garg";
        action22.hindiAction = "Hospitality";
        actionList.add(action22);

        Actioncontacts action23 = new Actioncontacts();
        action23.englishAction = "Shubham Dua";
        action23.hindiAction = "Hospitality";
        actionList.add(action23);

        Actioncontacts action24 = new Actioncontacts();
        action24.englishAction = "Vikas Mandal";
        action24.hindiAction = "Hospitality";
        actionList.add(action24);

        Actioncontacts action25 = new Actioncontacts();
        action25.englishAction = "Vishant Diman";
        action25.hindiAction = "Photography";
        actionList.add(action25);

        Actioncontacts action26 = new Actioncontacts();
        action26.englishAction = "Praveen Arya";
        action26.hindiAction = "Photography";
        actionList.add(action26);

        Actioncontacts action27 = new Actioncontacts();
        action27.englishAction = "Shubham Dua";
        action27.hindiAction = "Social Media Managers";
        actionList.add(action27);

        Actioncontacts action28 = new Actioncontacts();
        action28.englishAction = "Vishant Dhiman";
        action28.hindiAction = "Social Media Managers";
        actionList.add(action28);

        Actioncontacts action29 = new Actioncontacts();
        action29.englishAction = "Piyush Pant";
        action29.hindiAction = "Social Media Managers";
        actionList.add(action29);

    }

}
