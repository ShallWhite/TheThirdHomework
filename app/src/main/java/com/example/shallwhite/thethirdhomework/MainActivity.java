package com.example.shallwhite.thethirdhomework;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    private Button mButton1;
    private Button mButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton1 = (Button)findViewById(R.id.Button1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.activity_main);
                if (fragment != null) {
                    fragment = new FirstFragment();
                    fragmentManager.beginTransaction().replace(R.id.activity_main, fragment).commit();
                }
                else{
                    fragment = new FirstFragment();
                    fragmentManager.beginTransaction().add(R.id.activity_main, fragment).commit();
                }
            }
        });
        Button mButton2 = (Button)findViewById(R.id.Button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.activity_main);
                if (fragment != null) {
                    fragment = new SecondFragment();
                    fragmentManager.beginTransaction().replace(R.id.activity_main, fragment).commit();
                }
                else{
                    fragment = new SecondFragment();
                    fragmentManager.beginTransaction().add(R.id.activity_main, fragment).commit();
                }
            }
        });

    }
}
