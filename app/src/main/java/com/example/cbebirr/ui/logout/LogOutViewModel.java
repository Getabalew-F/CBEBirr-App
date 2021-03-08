package com.example.cbebirr.ui.logout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LogOutViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public LogOutViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is Log Out");
    }
    public  LiveData<String> getText(){
        return mText;
    }
}


