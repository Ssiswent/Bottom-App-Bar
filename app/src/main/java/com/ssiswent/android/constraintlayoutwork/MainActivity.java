package com.ssiswent.android.constraintlayoutwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BottomAppBar bar = findViewById(R.id.bar);
//        bar.setMenu();
    }
}
