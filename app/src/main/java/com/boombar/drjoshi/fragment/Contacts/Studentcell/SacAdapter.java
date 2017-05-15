package com.boombar.drjoshi.fragment.Contacts.Studentcell;

/**
 * Created by User on 26-01-2017.
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.boombar.drjoshi.fragment.Contacts.Action;
import com.boombar.drjoshi.fragment.MainActivity;
import com.boombar.drjoshi.fragment.R;

import java.util.List;

public class SacAdapter extends RecyclerView.Adapter<SacAdapter.MyViewHolder> {

    public static final String ACTION_NO = "action_no";
    private List<Actioncontacts> actionsList;
    private Context context;

    public SacAdapter(List<Actioncontacts> actionsList, Context context){
        this.actionsList = actionsList;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView  hindiTitle, engTitle;
        public ImageView pic,dial,email;
        public MyViewHolder(View view) {
            super(view);
            pic = (ImageView) view.findViewById(R.id.profile_image);
            engTitle = (TextView) view.findViewById(R.id.english_action);
            hindiTitle = (TextView) view.findViewById(R.id.hindi_action);
            dial = (ImageView) view.findViewById(R.id.dial);

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
        Actioncontacts action = actionsList.get(position);
        holder.engTitle.setText(action.englishAction);
        holder.hindiTitle.setText(action.hindiAction);
        holder.pic.setImageResource(action.profilePic);
        holder.dial.setImageResource(action.dial);

        holder.dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone(actionsList.get(position).contactno);
            }
        });
    }
    private void dialContactPhone(final String phoneNumber) {
        context.startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
    @Override
    public int getItemCount(){
        return actionsList.size();
    }

}