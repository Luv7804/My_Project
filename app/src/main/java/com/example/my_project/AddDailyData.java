package com.example.my_project;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AddDailyData extends Fragment {
    RecyclerView recyclerView;
    ArrayList<AddDailyDataModel> arrJanasi = new ArrayList<>();

    public AddDailyData() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_add_daily_data, container, false);
//
        recyclerView = view.findViewById(R.id.recyclerJanasi);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        arrJanasi.add(new AddDailyDataModel("ઘઉં લોકવાન"));
        arrJanasi.add(new AddDailyDataModel("ઘઉં ટુકડા"));
        arrJanasi.add(new AddDailyDataModel("કપાસ બી.ટી."));
        arrJanasi.add(new AddDailyDataModel("ઘઉં લોકવાન"));
        arrJanasi.add(new AddDailyDataModel("ઘઉં લોકવાન"));
        arrJanasi.add(new AddDailyDataModel("ઘઉં ટુકડા"));
        arrJanasi.add(new AddDailyDataModel("કપાસ બી.ટી."));
        arrJanasi.add(new AddDailyDataModel("ઘઉં લોકવાન"));
        arrJanasi.add(new AddDailyDataModel("ઘઉં લોકવાન"));
        arrJanasi.add(new AddDailyDataModel("ઘઉં ટુકડા"));
        arrJanasi.add(new AddDailyDataModel("કપાસ બી.ટી."));
        arrJanasi.add(new AddDailyDataModel("ઘઉં લોકવાન"));
        arrJanasi.add(new AddDailyDataModel("ઘઉં લોકવાન"));
        arrJanasi.add(new AddDailyDataModel("ઘઉં ટુકડા"));
        arrJanasi.add(new AddDailyDataModel("કપાસ બી.ટી."));
        arrJanasi.add(new AddDailyDataModel("ઘઉં લોકવાન"));
        RecyclerAddDailyDataAdpter adapter = new RecyclerAddDailyDataAdpter(getContext(), arrJanasi);
        recyclerView.setAdapter(adapter);
        return view;
    }
}