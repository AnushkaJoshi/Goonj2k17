package com.boombar.drjoshi.fragment.Contacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.boombar.drjoshi.fragment.DividerItemDecoration;
import com.boombar.drjoshi.fragment.R;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;



import java.util.ArrayList;
import java.util.List;
public class Contacts extends AppCompatActivity {
    private MainActivityAdapter mAdapter;
    private RecyclerView recyclerView;
    List<Action> actionList;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        actionList = new ArrayList<Action>();
        updateActionList();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mAdapter = new MainActivityAdapter(actionList, this);
        recyclerView.setAdapter(mAdapter);

    }
    void updateActionList() {
        Action action = new Action();
        action.englishAction = "TEACHERS";
        action.hindiAction = "teachers office contact list";
        action.profilePic = R.drawable.mypic;
        actionList.add(action);
        Action action2 = new Action();
        action2.englishAction = "STUDENT ACTIVITY CELL";
        action2.hindiAction = "SAC members contact list";
        action2.profilePic = R.drawable.mypic;
        actionList.add(action2);
        Action action21 = new Action();
        action21.englishAction = "COMPUTER SCIENCE AND APPLICATIONS";
        action21.hindiAction = "computer science department contact list";
        action21.profilePic = R.drawable.mypic;
        actionList.add(action21);
        Action action3 = new Action();
        action3.englishAction = "ELECTRONICS AND COMMUNICATION";
        action3.hindiAction = "electronics and communication department contact list";
        action3.profilePic = R.drawable.mypic;
        actionList.add(action3);
        Action action4 = new Action();
        action4.englishAction = "ELECTRICAL ENGINEERING";
        action4.hindiAction = "electrical engineering department contact list";
        action4.profilePic = R.drawable.mypic;
        actionList.add(action4);


    }

}
