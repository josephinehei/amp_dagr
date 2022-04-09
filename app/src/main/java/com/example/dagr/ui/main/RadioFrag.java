package com.example.dagr.ui.main;

import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.dagr.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RadioFrag extends Fragment {

    TextView julianDate;

    public RadioFrag(){}

    public static RadioFrag newInstance() {
        RadioFrag fragment = new RadioFrag();
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

        View view = inflater.inflate(R.layout.fragment_radio, container, false);

        julianDate = (TextView) view.findViewById(R.id.julianDate);
        Calendar cal = Calendar.getInstance();
        String date = String.valueOf(cal.get(Calendar.DAY_OF_YEAR));
        julianDate.setText(date);

        return view;
    }
}
