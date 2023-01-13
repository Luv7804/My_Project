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

public class recyclerSakbhajiAdapter extends RecyclerView.Adapter<recyclerSakbhajiAdapter.ViewHolder> {
    Context context;
    ArrayList<SakbhajiModel> arraySakbhaji;
    int lastposition = -1;

    recyclerSakbhajiAdapter(Context context, ArrayList<SakbhajiModel> arraySakbhaji) {
        this.context = context;
        this.arraySakbhaji = arraySakbhaji;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sakbhaji_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.sakbhajiName.setText(arraySakbhaji.get(position).sakbhajiName);
        holder.lowPrice.setText(arraySakbhaji.get(position).low);
        holder.highPrice.setText(arraySakbhaji.get(position).high);
        setAnimation(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return arraySakbhaji.size();
    }

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastposition) {
            Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(slideIn);
            lastposition = position;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView sakbhajiName, lowPrice, highPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sakbhajiName = itemView.findViewById(R.id.sakbhajiName);
            lowPrice = itemView.findViewById(R.id.lowPrice);
            highPrice = itemView.findViewById(R.id.highPrice);
        }
    }
}

