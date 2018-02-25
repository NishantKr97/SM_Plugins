package com.example.android.internalfolder;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    TextView textView = (TextView) findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String s = "hello world \nThis is internal folder app";
        try{
            File mydir = getBaseContext().getDir("mydir", Context.MODE_PRIVATE);
            File fileWithinMyDir = new File(mydir,"myFile");
            FileOutputStream out = new FileOutputStream(fileWithinMyDir);


//
//            FileOutputStream  fileOutputStream = openFileOutput("mytext.txt", MODE_PRIVATE);
//            fileOutputStream.write(s.getBytes());
//            fileOutputStream.close();
//            Toast.makeText(getApplicationContext(),"file_saved",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            e.printStackTrace();
        }

//        try{
//            FileInputStream fileInputStream = openFileInput("myText.txt");
//            InputStreamReader  inputStreamReader = new InputStreamReader(fileInputStream);
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//            StringBuffer stringBuffer = new StringBuffer();
//            String lines;
//            while ((lines=bufferedReader.readLine())!= null){
//                stringBuffer.append(lines+"\n");
//            }
//
//            textView.setText(stringBuffer.toString());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
