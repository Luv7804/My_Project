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

public class RecyclerJanasiAdapter extends RecyclerView.Adapter<RecyclerJanasiAdapter.ViewHolder> {
    Context context;
    ArrayList<JanasiModel> arrayJanasi;
    int lastposition = -1;

    RecyclerJanasiAdapter(Context context, ArrayList<JanasiModel> arrayJanasi) {
        this.context = context;
        this.arrayJanasi = arrayJanasi;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.janasi_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.janasiName.setText(arrayJanasi.get(position).janasiname);
        holder.lowPrice.setText(arrayJanasi.get(position).low);
        holder.highPrice.setText(arrayJanasi.get(position).high);
        setAnimation(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return arrayJanasi.size();
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
            lowPrice = itemView.findViewById(R.id.lowPrice);
            highPrice = itemView.findViewById(R.id.highPrice);
        }
    }
}

