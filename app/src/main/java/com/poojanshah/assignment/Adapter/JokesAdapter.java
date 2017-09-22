package com.poojanshah.assignment.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.poojanshah.assignment.R;

import java.util.ArrayList;

/**
 * Created by Poojan on 22/09/2017.
 */

public class JokesAdapter extends RecyclerView.Adapter<JokesAdapter.MyViewHolder> {
    ArrayList<String> jokes = new ArrayList<>();

    public JokesAdapter(ArrayList<String> jokes) {
        this.jokes = jokes;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        holder.tvJoke.setText(jokes.get(position).getMessage());
        holder.tvSessionID.setText("");
        holder.tvSessionAvitity.setText("");
        holder.tvStartTime.setText("");
        holder.tvDuration.setText("");
        holder.tvMemory.setText("");
    }

    @Override
    public int getItemCount() {
        return 0;
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