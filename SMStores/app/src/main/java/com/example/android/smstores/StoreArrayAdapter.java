package com.example.android.smstores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NISHANT on 29-01-2018.
 */

public class StoreArrayAdapter extends ArrayAdapter<Word>{

    Context context;
    String storeList[];
    String normalCashbackList[];
    String primeCashbackList[];
    LayoutInflater inflter;

    public StoreArrayAdapter( Activity context, ArrayList<Word> storeList) {
        super(context, 0, storeList);
    }

//    public StoreArrayAdapter(@NonNull Context context, int resourse, String[] storeList, String[] normalCashbackList, String[] primeCashbackList) {
//        super(context, resourse);
//        this.storeList = storeList;
//        this.normalCashbackList = normalCashbackList;
//        this.primeCashbackList = primeCashbackList;
//    }

//    public StoreArrayAdapter(@NonNull Context context, String[] storeList) {
//        this.context = context;
//        this.storeList = storeList;
//    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.store_name, parent, false);
        }

        Word currentWord = getItem(position);

        TextView TextView1 = (TextView) listItemView.findViewById(R.id.store_name);
        TextView1.setText(currentWord.getmStoreList());

        TextView TextView2 = (TextView) listItemView.findViewById(R.id.normal_cashback);
        TextView2.setText(currentWord.getmNormalCashback());

        TextView TextView3 = (TextView) listItemView.findViewById(R.id.prime_cashback);
        TextView3.setText(currentWord.getmPrimeCashback());

//        ImageView imageview = (ImageView) listItemView.findViewById(R.id.imageview);
//        imageview.setImageResource(currentWord.getImageResourceId());
//
//        View listContainer = listItemView.findViewById(R.id.list_container);
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//        listContainer.setBackgroundColor(color);

        return listItemView;
    }

}
