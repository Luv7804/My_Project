package com.example.my_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerJanasiAdapter extends RecyclerView.Adapter<RecyclerJanasiAdapter.ViewHolder> {
    Context context;
    ArrayList<JanasiModel> arrayContact;
    int lastposition = -1;

    RecyclerJanasiAdapter(Context context, ArrayList<JanasiModel> arrayContact) {
        this.context = context;
        this.arrayContact = arrayContact;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_dainik_bhav, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgContact.setImageResource(arrayContact.get(position).img);
        holder.txtName.setText(arrayContact.get(position).name);
        holder.txtNumber.setText(arrayContact.get(position).number);
        setAnimation(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return arrayContact.size();
    }

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastposition) {
            Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(slideIn);
            lastposition = position;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtNumber;
        ImageView imgContact;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtNumber = itemView.findViewById(R.id.txtNumber);
            imgContact = itemView.findViewById(R.id.imgContact);
        }
    }
}

