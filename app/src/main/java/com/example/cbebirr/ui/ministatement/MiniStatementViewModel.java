package com.example.cbebirr.ui.ministatement;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MiniStatementViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MiniStatementViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}