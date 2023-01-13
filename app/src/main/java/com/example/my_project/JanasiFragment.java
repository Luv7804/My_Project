package com.example.my_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class JanasiFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<JanasiModel> arrContact = new ArrayList<>();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_janasi, container, false);
        recyclerView = view.findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        arrContact.add(new JanasiModel(R.drawable.i11, "Chintan Viradiya", "99245634545"));
        arrContact.add(new JanasiModel(R.drawable.i12, "Chetan Patel", "96745634584"));
        arrContact.add(new JanasiModel(R.drawable.i22, "Manan Kapadiya", "77245634594"));
        arrContact.add(new JanasiModel(R.drawable.i21, "Kamal Zala", "77895634599"));
        RecyclerJanasiAdapter adapter = new RecyclerJanasiAdapter(getContext(), arrContact);
        recyclerView.setAdapter(adapter);
        return view;
    }
}