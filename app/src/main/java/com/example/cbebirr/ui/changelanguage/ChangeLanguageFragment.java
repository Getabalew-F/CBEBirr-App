package com.example.cbebirr.ui.changelanguage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cbebirr.R;
import com.example.cbebirr.ui.changepin.ChangePINViewModel;

public class ChangeLanguageFragment extends Fragment {
    private ChangeLanguageViewModel changeLanguageViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        changeLanguageViewModel = new ViewModelProvider(this).get(ChangeLanguageViewModel.class);
        View root = inflater.inflate(R.layout.fragment_change_language, container, false);
        final TextView textView = root.findViewById(R.id.text_changelanguage);
        changeLanguageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

    }
}

