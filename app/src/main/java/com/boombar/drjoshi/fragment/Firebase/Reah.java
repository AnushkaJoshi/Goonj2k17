package com.boombar.drjoshi.fragment.Firebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.boombar.drjoshi.fragment.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Reah extends AppCompatActivity {
Button btn;
    TextView tv,rampday1;
    //firebase database instance
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reah);
        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.readView);
        rampday1 = (TextView) findViewById(R.id.rampday1);
        //get instance of database from url
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReferenceFromUrl("https://goonj-bad32.firebaseio.com/");
        //Button click listner
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild = databaseReference.child("-KhwTu7lg_YUIZcc3NJc").child("name");
                DatabaseReference m2child = databaseReference.child("-KhwTu7lg_YUIZcc3NJc").child("name");
                mchild.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        tv.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                m2child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        rampday1.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
