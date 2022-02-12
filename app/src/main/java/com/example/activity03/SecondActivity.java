package com.example.activity03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FirstFragment firstFragment = new FirstFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.firstLayout, firstFragment, firstFragment.getTag())
                .commit();



        SecondFragment secondFragment = new SecondFragment();
        FragmentManager manager1 = getSupportFragmentManager();
        manager1.beginTransaction()
                .replace(R.id.secondLayout, secondFragment, secondFragment.getTag())
                .commit();
    }
}