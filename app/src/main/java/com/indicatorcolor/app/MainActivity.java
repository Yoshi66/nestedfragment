package com.indicatorcolor.app;



import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.indicatorcolor.app.Fragment1;
import com.indicatorcolor.app.Fragment2;
import com.indicatorcolor.app.Fragment3;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction tx = manager.beginTransaction();

        tx.add(R.id.layout_a, new Fragment1(), "fragment_a");
        tx.add(R.id.layout_b, new Fragment2(), "fragment_b");
        tx.add(R.id.layout_c, new Fragment3(), "fragment_c");
        tx.commit();

    }

}