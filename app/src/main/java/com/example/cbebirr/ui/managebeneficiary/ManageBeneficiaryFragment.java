package com.example.cbebirr.ui.managebeneficiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.cbebirr.MainPage;
import com.example.cbebirr.R;

//public class ManageBeneficiaryFragment extends Fragment {
//
//    private ManageBeneficiaryViewModel manageBeneficiaryViewModel;
//
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
////        manageBeneficiaryViewModel = new ViewModelProvider(this).get(ManageBeneficiaryViewModel.class);
//        View root = inflater.inflate(R.layout.activity_login, container, false);
//        final TextView textView = root.findViewById(R.id.login);
////        manageBeneficiaryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
//    }
//}

public class ManageBeneficiaryFragment extends AppCompatActivity {
    Button callForMainMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_p_i_n);

        callForMainMenu = findViewById(R.id.change_pin);
        callForMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManageBeneficiaryFragment.this, MainPage.class);
                startActivity(intent);
            }
        });

    }
}