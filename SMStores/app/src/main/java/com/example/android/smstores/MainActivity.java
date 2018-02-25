package com.example.android.smstores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Taking string of store name
        ListView listviewA = (ListView) findViewById(R.id.listViewA);
        ListView listviewB = (ListView) findViewById(R.id.listViewB);

//        String[] storeList = new String[] { "Android", "IPhone", "WindowsMobile",
//                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
//                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
//                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
//                "Android", "IPhone", "WindowsMobile" };
//
//        String[] normalCashbackList = new String[] { "+ 7% Normal Cashback", "+ 8% Normal Cashback", "+ 2% Normal Cashback",
//                "+ 1% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback",
//                "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback",
//                "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback",
//                "+ 7% Normal Cashback", "+ 7% Normal Cashback", "+ 7% Normal Cashback" };
//
//        String[] primeCashbackList = new String[] { "+ 7% Prime Cashback", "+ 8% Prime Cashback", "+ 2% Prime Cashback",
//                "+ 1% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback",
//                "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback",
//                "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback",
//                "+ 7% Prime Cashback", "+ 7% Prime Cashback", "+ 7% Prime Cashback" };

        final ArrayList<Word> storelistA = new ArrayList<Word>();
        final ArrayList<Word> storelistB = new ArrayList<Word>();
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
//        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistA.add(new Word("Android", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistB.add(new Word("Windows7", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistB.add(new Word("Windows7", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistB.add(new Word("Linux", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistB.add(new Word("Linux", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistB.add(new Word("Max OS X", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistB.add(new Word("WindowsMobile", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));
        storelistB.add(new Word("Max OS X", "+ 7% Normal Cashback", "+ 7% Prime Cashback"));


        StoreArrayAdapter storeArrayAdapter = new StoreArrayAdapter(this, storelistA);
        listviewA.setAdapter(storeArrayAdapter);

        storeArrayAdapter = new StoreArrayAdapter(this, storelistB);
        listviewB.setAdapter(storeArrayAdapter);
    }
}
