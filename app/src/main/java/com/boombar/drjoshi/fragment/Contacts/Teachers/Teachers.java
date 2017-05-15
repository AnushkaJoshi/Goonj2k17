package com.boombar.drjoshi.fragment.Contacts.Teachers;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.boombar.drjoshi.fragment.Contacts.Studentcell.Actioncontacts;
import com.boombar.drjoshi.fragment.Contacts.Studentcell.SacAdapter;
import com.boombar.drjoshi.fragment.DividerItemDecoration;
import com.boombar.drjoshi.fragment.R;

import java.util.ArrayList;
import java.util.List;

public class Teachers extends AppCompatActivity {
    private TeacherAdapter mAdapter;
    private RecyclerView recyclerView;
    List<Actioncteach> actionList;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        actionList = new ArrayList<Actioncteach>();
        updateActionList();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mAdapter = new TeacherAdapter(actionList, this);
        recyclerView.setAdapter(mAdapter);


    }
    void updateActionList() {
        Actioncteach action = new Actioncteach();
        action.englishAction = "ADMINISTRATION";
        action.hindiAction = "administration office contact list";
        action.profilePic = R.drawable.mypic;
        actionList.add(action);
        Actioncteach action2 = new Actioncteach();
        action2.englishAction = "STUDENT ACTIVITY CELL";
        action2.hindiAction = "SAC members contact list";
        action2.profilePic = R.drawable.mypic;
        actionList.add(action2);
        Actioncteach action21 = new Actioncteach();
        action21.englishAction = "COMPUTER SCIENCE AND APPLICATIONS";
        action21.hindiAction = "computer science department contact list";
        action21.profilePic = R.drawable.mypic;
        actionList.add(action21);
        Actioncteach action3 = new Actioncteach();
        action3.englishAction = "ELECTRONICS AND COMMUNICATION";
        action3.hindiAction = "electronics and communication department contact list";
        action3.profilePic = R.drawable.mypic;
        actionList.add(action3);
        Actioncteach action4 = new Actioncteach();
        action4.englishAction = "ELECTRICAL ENGINEERING";
        action4.hindiAction = "electrical engineering department contact list";
        action4.profilePic = R.drawable.mypic;
        actionList.add(action4);


    }

}
