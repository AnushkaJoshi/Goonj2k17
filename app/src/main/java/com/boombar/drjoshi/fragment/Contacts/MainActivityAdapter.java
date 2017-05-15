package com.boombar.drjoshi.fragment.Contacts;

/**
 * Created by User on 26-01-2017.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.boombar.drjoshi.fragment.Contacts.Studentcell.Studentcell;
import com.boombar.drjoshi.fragment.Contacts.Teachers.Teachers;
import com.boombar.drjoshi.fragment.MainActivity;
import com.boombar.drjoshi.fragment.R;

import java.util.List;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.MyViewHolder> {

    public static final String ACTION_NO = "action_no";
    private List<Action> actionsList;
    private Context context;

    public MainActivityAdapter(List<Action> actionsList, Context context){
        this.actionsList = actionsList;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView  hindiTitle, engTitle;
        public ImageView pic;
        public MyViewHolder(View view) {
            super(view);
            pic = (ImageView) view.findViewById(R.id.profile_image);
            engTitle = (TextView) view.findViewById(R.id.english_action);
            hindiTitle = (TextView) view.findViewById(R.id.hindi_action);
        }

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.department_view_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position){
        Action action = actionsList.get(position);
        holder.engTitle.setText(action.englishAction);
        holder.hindiTitle.setText(action.hindiAction);
        holder.pic.setImageResource(action.profilePic);
        holder.pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 0: Intent intent = new Intent(context,Teachers.class);
                        context.startActivity(intent);
                        break;
                    case 1:Intent sac = new Intent(context,Studentcell.class);
                        context.startActivity(sac);
                        break;


                }
            }
        });
    }

    @Override
    public int getItemCount(){
        return actionsList.size();
    }

}