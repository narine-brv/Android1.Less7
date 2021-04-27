package com.narine.android1less7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SecondFragment extends Fragment {


    TextView date;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        date = view.findViewById(R.id.tv_date);

        String currentDate = new SimpleDateFormat("hh:mm dd/MM/yyyy", Locale.getDefault()).format(new Date());
        date.setText(currentDate);

        return view;
    }

}