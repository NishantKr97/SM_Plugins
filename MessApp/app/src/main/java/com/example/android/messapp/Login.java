package com.example.android.messapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.net.URL;

/**
 * Created by Suyash on 27-10-2017.
 */

public class Login extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.LoginActivity);
    }

    EditText editText = (EditText) findViewById(R.id.editText);

    String rollString = editText.getText().toString().trim();

    ImageView imageView = (ImageView) findViewById(R.id.imgView);

    public void callImage(View view)
    {
        try {
            URL url = new URL("https://cdn2.iconfinder.com/data/icons/ios-7-icons/50/user_male2-512.png");
            Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            imageView.setImageBitmap(bmp);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
