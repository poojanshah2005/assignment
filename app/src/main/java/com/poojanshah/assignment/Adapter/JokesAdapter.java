package com.poojanshah.assignment.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.poojanshah.assignment.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Poojan on 22/09/2017.
 */

public class JokesAdapter extends RecyclerView.Adapter<JokesAdapter.MyViewHolder> {
    int[][] list;

    public JokesAdapter(int[][] list) {
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        holder.tvJoke.setText(jokes.get(position).getMessage());
        String a = Arrays.toString(list[position]);
        Log.i("value",a);
        int[] id = Arrays.copyOfRange(list[position],0,2);
        int[] activity = Arrays.copyOfRange(list[position],2,4);
        int[] startTime = Arrays.copyOfRange(list[position],4,8);
        int[] duration = Arrays.copyOfRange(list[position],8,12);
        int[] memory = Arrays.copyOfRange(list[position],12,16);

        Log.i("id",Arrays.toString(id));
        Log.i("activity",Arrays.toString(activity));
        Log.i("startTime",Arrays.toString(startTime));
        Log.i("duration",Arrays.toString(duration));
        Log.i("memory",Arrays.toString(memory));
        holder.tvSessionID.setText("SessionID: " + Arrays.toString(id));
        holder.tvSessionAvitity.setText("Session Avitity: " + Arrays.toString(activity));
        holder.tvStartTime.setText("Start Time:" + Arrays.toString(startTime));
        holder.tvDuration.setText("Duration:" + Arrays.toString(duration));
        holder.tvMemory.setText("Memory: " + Arrays.toString(memory));
    }

    @Override
    public int getItemCount() {
        return list.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvSessionID;
        TextView tvSessionAvitity;
        TextView tvStartTime;
        TextView tvDuration;
        TextView tvMemory;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvSessionID = (TextView) itemView.findViewById(R.id.tvSessionID);
            tvSessionAvitity = (TextView) itemView.findViewById(R.id.tvSessionAvitity);
            tvStartTime = (TextView) itemView.findViewById(R.id.tvStartTime);
            tvDuration = (TextView) itemView.findViewById(R.id.tvDuration);
            tvMemory = (TextView) itemView.findViewById(R.id.tvMemory);
        }
    }


}