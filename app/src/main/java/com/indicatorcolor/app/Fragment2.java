package com.indicatorcolor.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        FragmentManager Cmanager = getChildFragmentManager();
        FragmentTransaction Ctx = Cmanager.beginTransaction();

        Ctx.add(R.id.layout_d, new Fragment4(), "fragment_d");
        Ctx.add(R.id.layout_e, new Fragment5(), "fragment_e");
        Ctx.commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View rootView = inflater.inflate(R.layout.fragment2, container, false);
        return rootView;

    }

/*
    public void addFrag(){


        FragmentManager manager = getChildFragmentManager();
        manager.beginTransaction().add(R.id.layout_d, new Fragment4()).commit();
        getChildFragmentManager().executePendingTransactions();
    }
    */
}



