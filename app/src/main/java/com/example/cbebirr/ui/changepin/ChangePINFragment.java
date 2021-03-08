package com.example.cbebirr.ui.changepin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.cbebirr.R;

public class ChangePINFragment extends Fragment {

    private ChangePINViewModel changePINViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        changePINViewModel =
                new ViewModelProvider(this).get(ChangePINViewModel.class);
        View root = inflater.inflate(R.layout.fragment_change_pin, container, false);
        final TextView textView = root.findViewById(R.id.text_changepin);
        changePINViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}