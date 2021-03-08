package com.example.cbebirr.ui.CBEBirr;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CBEBirrViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CBEBirrViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("");
    }
    public LiveData<String> getText(){
        return mText;
    }
}

