package com.example.hwangdahyeon.mvvm_project_01;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hwangdahyeon.mvvm_project_01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MainViewModel model = new MainViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this , R.layout.activity_main);
        binding.setModel(model);

        model.onCreate();
    }

    @Override
    public void onResume() {
        super.onResume();
        model.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        model.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        model.onDestroy();
    }


}
