package com.example.cbebirr.ui.managebill;

import androidx.annotation.NonNull;
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
import com.example.cbebirr.ui.logout.LogOutViewModel;

public class ManagBillFragment extends Fragment {
    ManagBillViewModel managBillViewModel;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        managBillViewModel = new ViewModelProvider(this).get(ManagBillViewModel.class);

        View root = inflater.inflate(R.layout.fragment_manag_bill, container, false);
        final TextView textView = root.findViewById(R.id.text_managebill);
        managBillViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@NonNull String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
