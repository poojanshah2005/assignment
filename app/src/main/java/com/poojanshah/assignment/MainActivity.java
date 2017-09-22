package com.poojanshah.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.poojanshah.assignment.Adapter.JokesAdapter;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;


    public int[][] processList(int[] list){
        int[][] output = new int[14][16];
        int length = list[0];
        for(int i = 1; i < 12 ;i++){
            int[] newList =  new int[16];
            newList = Arrays.copyOfRange(list,((i*16)-15)+1,(i*16)+2);
            output[i] = newList;

        }

        return output;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] list = {12, 0, 1, 0, 0, 0, 40, 61, -67, 89, 72, 0, 0, 0, 0, 96, 0, 0, 2, 0,
                0, 0, -14, 61, -62, 89, 72, 0, 0, 0, 0, 96, 0, 0, 3, 0, 0, 0, -57, 65, 194, 89, 72, 0, 0,
                0, 0, 96, 0, 0, 4, 0, 0, 0, 80, 66, -62, 89, 72, 0, 0, 0, 0, 96, 0, 0, 5, 0, 0, 0, -29,
                75, -62, 89, 72, 0, 0, 0, 0, 96, 0, 0, 6, 0, 0, 0, -77, 121, -67, 89, 96, 0, 0, 0, 0,
                118, 0, 0, 7, 0, 0, 0, -92, -78, 82, 123, 24, 0, 0, 0, 0, 30, 0, 0, 8, 0, 0, 0, 111, 250,
                82, 123, 24, 0, 0, 0, 0, 28, 0, 0, 9, 0, 0, 0, -61, 120, -61, 89, 24, 0, 0, 0, 0, 30, 0,
                0, 10, 0, 0, 0, -24, 120, -61, 89, 24, 0, 0, 0, 0, 30, 0, 0, 11, 0, 0, 0, 48, 121, -61,
                89, 24, 0, 0, 0, 0, 30, 0, 0, 12, 0, 0, 0};
        int[][] output = processList(list);
        for(int[] line: output){
//            Log.i("lne", String.valueOf(line));
            for(int i: line){
//                Log.i("Line", String.valueOf(i));
            }
//            Log.i("NewLine","NewLine");
        }
        initializeRecyclerView(output);
    }

    public void initializeRecyclerView(int[][] input){
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        /**
         * Two important things required: layout, adapter
         */
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mRecyclerView.setAdapter(new JokesAdapter(input));
    }
}
