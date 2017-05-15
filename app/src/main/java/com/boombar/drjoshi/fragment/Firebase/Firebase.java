package com.boombar.drjoshi.fragment.Firebase;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Dr.Joshi on 4/17/2017.
 */
public class Firebase extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        if(!FirebaseApp.getApps(this).isEmpty()){
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }
    }
}
