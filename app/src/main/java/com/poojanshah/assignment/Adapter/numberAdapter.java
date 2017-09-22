package com.poojanshah.assignment.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.poojanshah.assignment.R;

import java.util.Arrays;

/**
 * Created by Poojan on 22/09/2017.
 */

public class numberAdapter extends RecyclerView.Adapter<numberAdapter.MyViewHolder> {
    byte[][] list;

    public numberAdapter(byte[][] list) {
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
        byte[] id = Arrays.copyOfRange(list[position],0,2);
        byte[] activity = Arrays.copyOfRange(list[position],2,4);
        byte[] startTime = Arrays.copyOfRange(list[position],4,8);
        byte[] duration = Arrays.copyOfRange(list[position],8,12);
        byte[] memory = Arrays.copyOfRange(list[position],12,16);

        Log.i("id",Arrays.toString(id));
        Log.i("activity",Arrays.toString(activity));
        Log.i("startTime",Arrays.toString(startTime));
        Log.i("duration",Arrays.toString(duration));
        Log.i("memory",Arrays.toString(memory));
        holder.tvSessionID.setText("SessionID: " + covertToString(id));
        holder.tvSessionAvitity.setText("Session Avitity: " + covertToString(activity));
        holder.tvStartTime.setText("Start Time:" + covertToString(startTime));
        holder.tvDuration.setText("Duration:" + covertToString(duration));
        holder.tvMemory.setText("Memory: " + covertToString(memory));
    }

    private String covertToString(byte[] input){
        int[] output = new int[input.length];
        int pointer = 0;
        for(int i: input){
            output[pointer++] = i & 0xff;
        }
        return Arrays.toString(output);
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