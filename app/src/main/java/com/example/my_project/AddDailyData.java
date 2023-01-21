package com.example.my_project;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AddDailyData extends AppCompatActivity {

    private static ArrayList<AddDailyDataModel> data;
    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    AddDailyDataModel itemDatamodel;
    // list of janasiName
    String[] janasiName = {"ઘઉ લોકવન", "ઘઉ ટુકડા", "કપાસ બી. ટી. ", "મગફળી જીણી ", "મગફળી જાડી ", "સિંગ ફાડીયા", "એરંડા/એરંડી ", "તલ-તલી", "તલ કાળા ", "જીરૂ", "ધાણા ", "મરચા સૂકો પટ્ટો ", "ડુંગળી લાલ ", "ડુંગડી સફેદ", "ગુવાર બી", "મગ", "ચણા ", "વાલ ", "અળદ ", "તુવેર ", "સોયાબીન"};
    private RecyclerView.LayoutManager layoutManager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_daily_data);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_expenses);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<>();

        // generate ArrayList and store in data model
        for (int i = 0; i < janasiName.length; i++) {
            itemDatamodel = new AddDailyDataModel(
                    i,
                    janasiName[i]
            );
            data.add(itemDatamodel);
        }

        // call Adapter class by passing ArrayList data
        adapter = new RecyclerAddDailyDataAdpter(data);
        // set adapter to recyclerview
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}