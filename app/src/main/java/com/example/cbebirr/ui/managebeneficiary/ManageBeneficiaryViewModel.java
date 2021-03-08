package com.example.cbebirr.ui.managebeneficiary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ManageBeneficiaryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ManageBeneficiaryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Manage Beneficiary fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}