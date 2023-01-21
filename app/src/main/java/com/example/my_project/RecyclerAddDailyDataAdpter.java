package com.example.my_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAddDailyDataAdpter extends RecyclerView.Adapter<RecyclerAddDailyDataAdpter.ViewHolder> {
    Context context;
    ArrayList<AddDailyDataModel> arrayAddData;
    int lastposition = -1;

    RecyclerAddDailyDataAdpter(Context context, ArrayList<AddDailyDataModel> arrayAddData) {
        this.context = context;
        this.arrayAddData = arrayAddData;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.add_daily_data_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.janasiName.setText(arrayAddData.get(position).janasiname);
//        holder.lowPrice.setText(arrayAddData.get(position).low);
//        holder.highPrice.setText(arrayAddData.get(position).high);
        setAnimation(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return arrayAddData.size();
    }

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastposition) {
            Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(slideIn);
            lastposition = position;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView janasiName, lowPrice, highPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            janasiName = itemView.findViewById(R.id.janasiName);
//            lowPrice = itemView.findViewById(R.id.lowPrice);
//            highPrice = itemView.findViewById(R.id.highPrice);
        }
    }
}

