package com.example.my_project;
public class AddDailyDataModel {

    int ExpenseId;
    String janasiName;

    public AddDailyDataModel(int expenseId, String expenseName) {
        ExpenseId = expenseId;
        janasiName = expenseName;
    }

    public int getExpenseId() {
        return ExpenseId;
    }

    public String getjanasiName() {
        return janasiName;
    }
}