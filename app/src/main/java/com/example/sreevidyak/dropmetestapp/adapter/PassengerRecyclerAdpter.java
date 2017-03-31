package com.example.sreevidyak.dropmetestapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sreevidyak.dropmetestapp.R;
import com.example.sreevidyak.dropmetestapp.model.PassengerInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sreevidya K on 3/30/2017.
 */

public class PassengerRecyclerAdpter extends RecyclerView.Adapter<PassengerRecyclerAdpter.PassengerViewHolder>{


    private List<PassengerInfo> mList;
    public PassengerRecyclerAdpter(ArrayList<PassengerInfo> list){
        mList = list;
    }

    @Override
    public PassengerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.passenger_info_layout,parent, false);
        PassengerViewHolder viewHolder = new PassengerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PassengerViewHolder holder, int position) {
        PassengerInfo info = mList.get(position);
        holder.textName.setText(info.getName());
        holder.textAge.setText(Integer.toString(info.getAge()));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class PassengerViewHolder extends RecyclerView.ViewHolder{

        TextView textName;
        TextView textAge;
        public PassengerViewHolder(View itemView) {
            super(itemView);
            textName = (TextView)itemView.findViewById(R.id.text_passenger_name);
            textAge = (TextView)itemView.findViewById(R.id.text_passenger_age);
        }
    }
}
