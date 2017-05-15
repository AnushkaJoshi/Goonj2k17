package com.boombar.drjoshi.fragment.Firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.boombar.drjoshi.fragment.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Writeinto extends AppCompatActivity {
    EditText mSendData;
    Button btn,btn2;
    // Write a message to the database
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writeinto);
        btn = (Button) findViewById(R.id.enterdata);
        btn2 = (Button) findViewById(R.id.button2);
btn2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i =new Intent(Writeinto.this,Read.class);
        startActivity(i);
    }
});
        mSendData = (EditText) findViewById(R.id.fireentertext);
        //writing to realtime-database
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReferenceFromUrl("https://goonj-bad32.firebaseio.com/");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mchild = databaseReference.push();
                mchild.child("name").setValue(mSendData.getText().toString().trim());
            }
        });

    }
}
