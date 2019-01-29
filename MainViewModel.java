package com.example.hwangdahyeon.mvvm_project_01;

import android.databinding.ObservableField;
import android.view.View;

public class MainViewModel implements BaseViewModel {

    public final ObservableField<String> helloText = new ObservableField<>();

    @Override
    public void onCreate() {
        helloText.set("hello");
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onDestroy() {

    }
    public void showCurrentTime(){
        helloText.set((System.currentTimeMillis() / 1000) + "초");
    }
}
