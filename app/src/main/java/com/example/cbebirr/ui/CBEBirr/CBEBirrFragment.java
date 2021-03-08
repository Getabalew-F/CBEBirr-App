package com.example.cbebirr.ui.CBEBirr;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cbebirr.R;
import com.example.cbebirr.ui.changelanguage.ChangeLanguageViewModel;

public class CBEBirrFragment extends Fragment {
    private CBEBirrViewModel cbeBirrViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        cbeBirrViewModel = new ViewModelProvider(this).get(CBEBirrViewModel.class);
        View root = inflater.inflate(R.layout.fragment_c_b_e_birr, container, false);
        final TextView textView = root.findViewById(R.id.text_CBEBirr);
        cbeBirrViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

