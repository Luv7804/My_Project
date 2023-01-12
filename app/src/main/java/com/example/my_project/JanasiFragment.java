package com.example.my_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class JanasiFragment<ContactModel> extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ContactModel> arrContact = new ArrayList<>();
    recyclerView =
    RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContact);
        recyclerView.setLayoutManager(new

    findViewById(R.id.recyclerContact););
        arrContact.add(new

    LinearLayoutManager(this));
        arrContact.add(new

    ContactModel(R.drawable.a, "Chintan Viradiya","99245634545"));
        arrContact.add(new

    ContactModel(R.drawable.b, "Chetan Patel","96745634584"));
        arrContact.add(new

    ContactModel(R.drawable.c, "Manan Kapadiya","77245634594"));
        arrContact.add(new

    ContactModel(R.drawable.d, "Kamal Zala","77895634599"));
        arrContact.add(new

    ContactModel(R.drawable.e, "Jesal Rak","97289634512"));
        arrContact.add(new

    ContactModel(R.drawable.f, "Miral Tank","67165634550"));
        arrContact.add(new

    ContactModel(R.drawable.g, "Kiran Vara","99845634599"));
        arrContact.add(new

    ContactModel(R.drawable.h, "Hemali Viradiya","87245634580"));
        arrContact.add(new

    ContactModel(R.drawable.i, "Shital Kareliya","77245634577"));
        arrContact.add(new

    ContactModel(R.drawable.j, "Sunena Korat","96245634501"));
        arrContact.add(new

    ContactModel(R.drawable.a, "Karan Chhabariya","99245634545"));
        arrContact.add(new

    ContactModel(R.drawable.b, "Chhagan Ramani","96745634584"));
        arrContact.add(new

    ContactModel(R.drawable.c, "Akshay Dhanani","77245634594"));
        arrContact.add(new

    ContactModel(R.drawable.d, "Krupal Jadeja","77895634599"));
        arrContact.add(new

    ContactModel(R.drawable.e, "Nishant Timbadiya","97289634512"));
        arrContact.add(new

    ContactModel(R.drawable.f, "Hemanshi Vekariya","67165634550"));
        arrContact.add(new

    ContactModel(R.drawable.g, "Denshi Raina","99845634599"));
        arrContact.add(new

    ContactModel(R.drawable.h, "Kavya Chaudhary","87245634580"));
        arrContact.add(new

    ContactModel(R.drawable.i, "Drashti Desani","77245634577"));

    ContactModel(R.drawable.j, "Shivani Patodiya","96245634501")
        recyclerView.setAdapter(adapter);


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public JanasiFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static JanasiFragment newInstance(String param1, String param2) {
        JanasiFragment fragment = new JanasiFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_janasi, container, false);
    }
}

