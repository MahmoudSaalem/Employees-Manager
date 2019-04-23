package com.example.android.employeesmanagementapp.data.factories;

import com.example.android.employeesmanagementapp.data.AppDatabase;
import com.example.android.employeesmanagementapp.data.viewmodels.AddNewEmployeeViewModel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class EmpIdFact extends ViewModelProvider.NewInstanceFactory {
    private int mEmpId;
    private AppDatabase mDatabase;

    public EmpIdFact(AppDatabase database, int empId) {

        mDatabase = database;
        mEmpId = empId;

    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new AddNewEmployeeViewModel(mDatabase, mEmpId);
    }
}
