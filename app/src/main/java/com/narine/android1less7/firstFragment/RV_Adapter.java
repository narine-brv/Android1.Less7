package com.narine.android1less7.firstFragment;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.narine.android1less7.R;

import java.util.ArrayList;

public class RV_Adapter extends RecyclerView.Adapter <RV_Holder> {

    ArrayList <ItemModel> list = new ArrayList <>();


    @NonNull
    @Override
    public RV_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new RV_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RV_Holder holder, int position) {
        holder.onBind(list.get(position), holder.itemView.getContext());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addText (ArrayList <ItemModel> data) {
        list = data;
        notifyDataSetChanged();
    }
}
