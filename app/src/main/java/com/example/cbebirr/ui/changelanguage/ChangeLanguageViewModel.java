package com.example.cbebirr.ui.changelanguage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChangeLanguageViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ChangeLanguageViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is Change Language");
    }
    public LiveData<String> getText(){
        return mText;
    }
}
