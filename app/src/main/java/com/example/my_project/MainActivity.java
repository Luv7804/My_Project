package com.example.my_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ContactModel> arrContact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrContact.add(new ContactModel(R.drawable.a, "Chintan Viradiya", "99245634545"));
        arrContact.add(new ContactModel(R.drawable.b, "Chetan Patel", "96745634584"));
        arrContact.add(new ContactModel(R.drawable.c, "Manan Kapadiya", "77245634594"));
        arrContact.add(new ContactModel(R.drawable.d, "Kamal Zala", "77895634599"));
        arrContact.add(new ContactModel(R.drawable.e, "Jesal Rak", "97289634512"));
        arrContact.add(new ContactModel(R.drawable.f, "Miral Tank", "67165634550"));
        arrContact.add(new ContactModel(R.drawable.g, "Kiran Vara", "99845634599"));
        arrContact.add(new ContactModel(R.drawable.h, "Hemali Viradiya", "87245634580"));
        arrContact.add(new ContactModel(R.drawable.i, "Shital Kareliya", "77245634577"));
        arrContact.add(new ContactModel(R.drawable.j, "Sunena Korat", "96245634501"));
        arrContact.add(new ContactModel(R.drawable.a, "Karan Chhabariya", "99245634545"));
        arrContact.add(new ContactModel(R.drawable.b, "Chhagan Ramani", "96745634584"));
        arrContact.add(new ContactModel(R.drawable.c, "Akshay Dhanani", "77245634594"));
        arrContact.add(new ContactModel(R.drawable.d, "Krupal Jadeja", "77895634599"));
        arrContact.add(new ContactModel(R.drawable.e, "Nishant Timbadiya", "97289634512"));
        arrContact.add(new ContactModel(R.drawable.f, "Hemanshi Vekariya", "67165634550"));
        arrContact.add(new ContactModel(R.drawable.g, "Denshi Raina", "99845634599"));
        arrContact.add(new ContactModel(R.drawable.h, "Kavya Chaudhary", "87245634580"));
        arrContact.add(new ContactModel(R.drawable.i, "Drashti Desani", "77245634577"));
        arrContact.add(new ContactModel(R.drawable.j, "Shivani Patodiya", "96245634501"));
        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContact);
        recyclerView.setAdapter(adapter);

    }
}