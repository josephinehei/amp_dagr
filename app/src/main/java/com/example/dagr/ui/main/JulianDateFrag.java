package com.example.dagr.ui.main;


import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.dagr.MainActivity;
import com.example.dagr.R;


public class JulianDateFrag extends Fragment {
    TextView julianDate;

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

        View view = inflater.inflate(R.layout.fragment_julian, container, false);
        julianDate = (TextView) view.findViewById(R.id.julianDate);
        Calendar cal = Calendar.getInstance();
        String date = String.valueOf(cal.get(Calendar.DAY_OF_YEAR));
        julianDate.setText(date);

        return view;
    }
}

