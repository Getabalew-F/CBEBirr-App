package com.example.cbebirr.ui.ministatement;

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

public class MiniStatementFragment extends Fragment {

    private MiniStatementViewModel miniStatementViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        miniStatementViewModel =
                new ViewModelProvider(this).get(MiniStatementViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mini_statement, container, false);
        final TextView textView = root.findViewById(R.id.text_ministatement);
        miniStatementViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}