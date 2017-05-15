package com.boombar.drjoshi.fragment.Firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.boombar.drjoshi.fragment.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Read extends AppCompatActivity {
Button readbtn;
    TextView tv,rampday1,rampday2,rampday3,atherosday1,cividay3,ecrisday1, cividay1,ecrisday3,cividay2,ecrisday2, genesisday3,genesisday2,atherosday2,atherosday3,softwday1,softwday2,softwday3,apolloday1, genesisday1,apolloday2,apolloday3;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        tv = (TextView) findViewById(R.id.readView);
        readbtn = (Button) findViewById(R.id.read);
        rampday1 = (TextView) findViewById(R.id.rampday1);
        rampday2 = (TextView) findViewById(R.id.rampday2);
        rampday3 = (TextView) findViewById(R.id.rampday3);
        atherosday1 = (TextView) findViewById(R.id.atherosday1);
        atherosday2 = (TextView) findViewById(R.id.atherosday2);
        atherosday3 = (TextView) findViewById(R.id.atherosday3);
        softwday1 = (TextView) findViewById(R.id.softwday1);
        softwday2 = (TextView) findViewById(R.id.softwday2);
        softwday3 = (TextView) findViewById(R.id.softwday3);
        apolloday1 = (TextView) findViewById(R.id.apolloday1);
        apolloday2 = (TextView) findViewById(R.id.apolloday2);
        apolloday3 = (TextView) findViewById(R.id.apolloday3);
        genesisday1 = (TextView) findViewById(R.id.genesisday1);
        genesisday2 = (TextView) findViewById(R.id.genesisday2);
        genesisday3 = (TextView) findViewById(R.id.genesisday3);
        cividay1 = (TextView) findViewById(R.id.civicusday1);
        cividay2 = (TextView) findViewById(R.id.civicusday2);
        cividay3 = (TextView) findViewById(R.id.civicusday3);
        ecrisday1= (TextView) findViewById(R.id.ecrisday1);
        ecrisday2 = (TextView) findViewById(R.id.ecrisday2);
        ecrisday3 = (TextView) findViewById(R.id.ecrisday3);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReferenceFromUrl("https://goonj-bad32.firebaseio.com/");
        readbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            DatabaseReference mchild = databaseReference.child("-KhwTuN570M4n6l1R5hh").child("name");
                DatabaseReference a1child = databaseReference.child("-KhwTtQZPcEBswr4KNZW").child("name");
                DatabaseReference a2child = databaseReference.child("-KhwTu7lg_YUIZcc3NJc").child("name");
                DatabaseReference a3child = databaseReference.child("-KhwTuGvMtUDOzHKGsfA").child("name");
                DatabaseReference r1child = databaseReference.child("-KhwTuKEu5QRoi3NY350").child("name");
                DatabaseReference r2child = databaseReference.child("-KhwTuN570M4n6l1R5hh").child("name");
                DatabaseReference r3child = databaseReference.child("-KhwTuQYfWSYcT2XHNfX").child("name");
                DatabaseReference s1child = databaseReference.child("-KhwUwCbSkw4IxfNvMcf").child("name");
                DatabaseReference s2child = databaseReference.child("-KhwcEqdiIgXgM48w471").child("name");
                DatabaseReference s3child = databaseReference.child("-KhwcFLymqpBUC2R4oYp").child("name");
                DatabaseReference ap1child = databaseReference.child("-Khwjd4ZSBIjFe2YJA-5").child("name");
                DatabaseReference ap2child = databaseReference.child("-KhwjeG_poL3Z_9nGCFe").child("name");
                DatabaseReference ap3child = databaseReference.child("-KhwjekmDhZ0NJJ_ZEAI").child("name");
                DatabaseReference g1child = databaseReference.child("-Khwjf-6Xndsmt-R-lso").child("name");
                DatabaseReference g2child = databaseReference.child("-KhwjfShu2kTWM5CrT6H").child("name");
                DatabaseReference g3child = databaseReference.child("-Khwjfewn5t-EKwqJMla").child("name");
                DatabaseReference c1child = databaseReference.child("-KhwjgLb4TDO6vKBfVjp").child("name");
                DatabaseReference c2child = databaseReference.child("-KhwjhGo6uIHcjUsrX6l").child("name");
                DatabaseReference c3child = databaseReference.child("-KhwjhRVk8RV6HKj5MYR").child("name");
                DatabaseReference e1child = databaseReference.child("-Khwji4_UOSbCiYjDMUq").child("name");
                DatabaseReference e2child = databaseReference.child("-KhwjvtESc5myYBzWnXt").child("name");
                DatabaseReference e3child = databaseReference.child("-KhwjwRGwdysWOoobvKo").child("name");
                a1child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        rampday1.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                a2child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        rampday2.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                a3child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        rampday3.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                r1child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        atherosday1.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                r2child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        atherosday2.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                r3child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        atherosday3.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                s1child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        softwday1.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                s2child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        softwday2.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                s3child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        softwday3.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                ap1child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        apolloday1.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                ap2child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        apolloday2.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                ap3child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        apolloday3.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                g1child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        genesisday1.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                g2child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        genesisday2.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                g3child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        genesisday3.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                c1child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        cividay1.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                c2child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        cividay2.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                c3child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        cividay3.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                e1child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        ecrisday1.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                e2child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name2 = dataSnapshot.getValue(String.class);
                        ecrisday2.setText(name2);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                e3child.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        ecrisday3.setText(name);

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                mchild.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.getValue(String.class);
                        tv.setText(name);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
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
