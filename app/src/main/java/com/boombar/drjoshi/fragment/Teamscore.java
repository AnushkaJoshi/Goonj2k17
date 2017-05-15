package com.boombar.drjoshi.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.boombar.drjoshi.fragment.Firebase.Read;

/**
 * Created by Dr.Joshi on 4/1/2017.
 */
public class Teamscore extends Fragment {
    Button score;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.teamscore, container, false);
        score = (Button) rootView.findViewById(R.id.score);
        score.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(getActivity(), Read.class);
        startActivity(i);
    }
});
        return rootView;
    }
}
