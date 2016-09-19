package com.github.act262.repossample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.MyLib;
import com.github.act262.aar_lib.AppUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // java lib
        MyLib.show();

        // android lib
        AppUtil.show();
    }
}
