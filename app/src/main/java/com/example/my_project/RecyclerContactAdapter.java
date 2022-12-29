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

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    Context context;
    ArrayList<ContactModel> arrayContact;
    int lastposition = -1;

    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrayContact) {
        this.context = context;
        this.arrayContact = arrayContact;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
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

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastposition) {
            Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(slideIn);
            lastposition = position;
        }
    }
}

