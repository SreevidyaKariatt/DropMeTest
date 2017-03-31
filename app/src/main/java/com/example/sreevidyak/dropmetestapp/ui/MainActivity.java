package com.example.sreevidyak.dropmetestapp.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sreevidyak.dropmetestapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment();
    }

    private void loadFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PassengerListFragment fragment = new PassengerListFragment();
        fragmentTransaction.replace(R.id.container,fragment);
        fragmentTransaction.commit();
    }
}
