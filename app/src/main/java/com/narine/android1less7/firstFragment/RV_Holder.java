package com.narine.android1less7.firstFragment;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.narine.android1less7.R;

public class RV_Holder extends RecyclerView.ViewHolder {

    ImageView iv;
    TextView tv1;
    TextView tv2;
    TextView tv3;

    public RV_Holder(@NonNull View itemView) {
        super(itemView);
        iv = itemView.findViewById(R.id.iv_icon);
        tv1 = itemView.findViewById(R.id.tv_name);
        tv2 = itemView.findViewById(R.id.tv_currency);
        tv3 = itemView.findViewById(R.id.tv_count);
    }

    public void onBind (ItemModel itemModel, Context context) {

        Glide.with(context).load(itemModel.icon).circleCrop().into(iv);

        tv1.setText(itemModel.name);
        tv2.setText(itemModel.currency);
        tv3.setText(String.valueOf(itemModel.count));

    }

}
