package com.example.android.drawer_savemonk;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by NISHANT on 16-01-2018.
 */

public class NavHeaderCategory extends AppCompatActivity  {

    public NavigationView mainNavigationView, settingsNavigationView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_category);


    }


//    public void categoryBack(){
//        Log.v("Inner open", "Inner open");
//        DrawerLayout innerDrawerLayout = (DrawerLayout) findViewById(R.id.inner_drawer_layout);
//        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        innerDrawerLayout.closeDrawer(Gravity.LEFT);
//        drawerLayout.openDrawer(Gravity.LEFT);
//        Log.v("Inner open1", "Inner open1");
//    }

    public void categoryBack(View view) {
        onBackPressed();
    }


}

