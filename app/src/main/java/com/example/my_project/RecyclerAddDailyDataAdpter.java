package com.example.my_project;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAddDailyDataAdpter extends RecyclerView.Adapter<RecyclerAddDailyDataAdpter.MyViewHolder> {


    View rootView;

    Context context;
    // Usered Entered Expense amt will be stored in ExpAmtArray
    ArrayList<String> ExpAmtArray = new ArrayList<String>();
    boolean isOnTextChanged = false;
    int ExpenseFinalTotal = 0;
    TextView textviewTotalExpense;
    private ArrayList<AddDailyDataModel> dataSet;

    //constructor with dataSet passed from MainActivity when Adapter is called
    public RecyclerAddDailyDataAdpter(ArrayList<AddDailyDataModel> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Initialize view for recyclerview
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.add_daily_data_row, parent, false);

        context = parent.getContext();
        rootView = ((Activity) context).getWindow().getDecorView().findViewById(android.R.id.content);

        textviewTotalExpense = (TextView) rootView.findViewById(R.id.totalExpense);
        //attach view to MyViewHolder
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        //initialize the view with view holder
        TextView janasiName = holder.janasiName;
        EditText expHeld = holder.expHeld;
        EditText expHeld2 = holder.expHeld2;
        Button imageButton = holder.imageButton;

        janasiName.setText(dataSet.get(position).getjanasiName());

        // EditText with TextWatcher Listens each time when user enter value in edittext in recyclerview
        expHeld.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //using this boolean because sometime when user enter value in edittxt
                //afterTextchanged runs twice to prevent this, i m making use of this variable.
                isOnTextChanged = true;
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //so this will trigger each time user enter value in editText box
                ExpenseFinalTotal = 0;
                if (isOnTextChanged) {
                    isOnTextChanged = false;

                    try {
                        ExpenseFinalTotal = 0;


                        for (int i = 0; i <= position; i++) {

                            int inposition1 = position;
                            if (i != position) {
                                //store 0  where user select position in not equal/
                                ExpAmtArray.add("0");

                            } else {

                                // store user entered value to Array list (ExpAmtArray) at particular position
                                ExpAmtArray.add("0");
                                ExpAmtArray.set(inposition1, editable.toString());

                                break;
                            }

                        }

                        // for statement to loop to the array, to calculate the Expense total.
                        for (int i = 0; i <= ExpAmtArray.size() - 1; i++) {

                            int tempTotalExpenase = Integer.parseInt(ExpAmtArray.get(i));
                            ExpenseFinalTotal = ExpenseFinalTotal + tempTotalExpenase;

                        }

                        textviewTotalExpense.setText("Total Expenses: ₹ " + String.valueOf(ExpenseFinalTotal));
                    } catch (NumberFormatException e) {
                        // catch is used because, when used enter value in editText and remove the value it
                        // it will trigger NumberFormatException, so to prevent it and remove data value from array ExpAmtArray
                        //then
                        // re-perform loop total expense calculation and display the total.

                        ExpenseFinalTotal = 0;
                        for (int i = 0; i <= position; i++) {
                            Log.d("TimesRemoved", " : " + i);
                            int newposition = position;
                            if (i == newposition) {
                                ExpAmtArray.set(newposition, "0");

                            }

                        }
                        for (int i = 0; i <= ExpAmtArray.size() - 1; i++) {

                            int tempTotalExpenase = Integer.parseInt(ExpAmtArray.get(i));
                            ExpenseFinalTotal = ExpenseFinalTotal + tempTotalExpenase;

                        }
                        textviewTotalExpense.setText("Total Expenses: ₹ " + String.valueOf(ExpenseFinalTotal));
                    }

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    //Recyclerview ViewHolder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView janasiName;
        EditText expHeld, expHeld2;
        Button imageButton;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            // finding view by view id.
            janasiName = (TextView) itemView.findViewById(R.id.textViewExpName);
            expHeld = (EditText) itemView.findViewById(R.id.ExpHeld);
            expHeld2 = (EditText) itemView.findViewById(R.id.ExpHeld2);
            imageButton = (Button) itemView.findViewById(R.id.ExpBimageSelect);
        }
    }


}