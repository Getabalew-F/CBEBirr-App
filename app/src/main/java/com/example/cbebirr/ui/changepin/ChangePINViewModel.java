package com.example.cbebirr.ui.changepin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChangePINViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChangePINViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is change PIN fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}