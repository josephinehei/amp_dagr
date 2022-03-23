package com.example.dagr;


import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class JulianDateFrag extends Fragment {

    public JulianDateFrag(){}

    public static JulianDateFrag newInstance() {
        JulianDateFrag fragment = new JulianDateFrag();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Calendar cal = Calendar.getInstance();
        cal.get(Calendar.DAY_OF_YEAR);

        return view;
    }
}

