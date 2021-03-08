package com.example.cbebirr.ui.managebill;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ManagBillViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public ManagBillViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is Manage Bill");
    }
    public LiveData<String> getText(){
        return mText;
    }
}
