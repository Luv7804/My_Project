package com.example.my_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerJansiAdapter<JanasiModel> extends RecyclerView.Adapter<RecyclerJansiAdapter.ViewHolder> {
    Context context;
    ArrayList<JanasiModel> arrayContact;

    RecyclerJansiAdapter(Context context, ArrayList<JanasiModel> arrayContact) {
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
//            holder.imgContact.setImageResource(arrayContact.get(position).imgs);
        holder.txtName.setText((CharSequence) arrayContact.get(position));
//            holder.txtNumber.setText(arrayContact.get(position).number);

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
}

