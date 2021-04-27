package com.narine.android1less7.firstFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.narine.android1less7.R;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    RecyclerView recyclerView;
    RV_Adapter adapterRV;
    ArrayList <ItemModel> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = view.findViewById(R.id.rv1);

        setupRV();


        return view;
    }

    private void setupRV () {
       adapterRV = new RV_Adapter();
       recyclerView.setAdapter(adapterRV);
       RecyclerView.LayoutManager manager = new LinearLayoutManager(requireContext());
       recyclerView.setLayoutManager(manager);

       list = new ArrayList<>();

       list.add(0,new ItemModel(R.drawable.dollar,"Dollar", "USD", 88.40));
       list.add(1,new ItemModel(R.drawable.dollar,"Dollar", "USD", 89.00));
       list.add(2,new ItemModel(R.drawable.dollar,"Dollar", "USD", 88.20));
       list.add(3,new ItemModel(R.drawable.dollar,"Dollar", "USD", 88.30));
       list.add(4,new ItemModel(R.drawable.dollar,"Dollar", "USD", 84.20));
       list.add(5,new ItemModel(R.drawable.dollar,"Dollar", "USD", 83.90));
       list.add(6,new ItemModel(R.drawable.dollar,"Dollar", "USD", 82.60));
       list.add(7,new ItemModel(R.drawable.dollar,"Dollar", "USD", 85.00));

       adapterRV.addText(list);

    }
}