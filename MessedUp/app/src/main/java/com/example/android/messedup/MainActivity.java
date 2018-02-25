package com.example.android.messedup;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;

import static android.R.attr.bitmap;
import static android.R.attr.id;
import static android.R.attr.path;
import static com.example.android.messedup.R.id.imgView;


public class MainActivity extends AppCompatActivity {

    Context context;
    public File directory;
    public TextView textView;
    public ImageView imageView;
    Drawable image;
    Bitmap bitmap1;
    public Picasso.LoadedFrom f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.editText);
        imageView = (ImageView) findViewById(imgView);
        textView = (TextView) findViewById(R.id.text);


        /**
         * Setting the image from URL using Picasso
         */
        //Picasso.with(this).load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/220px-User_icon_2.svg.png").into(imageView);
        //Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(imageView);

        /**
         * Creating a folder in the phone
         */
        try {
            //directory = new File(Environment.getExternalStorageDirectory() + File.separator + "URLimages");
            //directory.mkdirs();

            Picasso.with(this)
                    .load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/220px-User_icon_2.svg.png")
                    .into(new Target() {
                        @Override
                        public void onBitmapLoaded(final Bitmap bitmap, Picasso.LoadedFrom from) {
                            bitmap1 = bitmap;
                            Picasso.LoadedFrom f = from;
                        }

                        @Override
                        public void onPrepareLoad(Drawable placeHolderDrawable) {
                        }

                        @Override
                        public void onBitmapFailed(Drawable errorDrawable) {
                        }
                    });

            SaveImage(bitmap1, imageView, f);

            /**
             *  Tried storing in external Storage....will come back to it
             */


            //textView.setText("SUCCESS");
        } catch (Exception e) {
            textView.setText("FAILED");
        }


    }


    /**
     * This method is to save the image in the external folder
     */
    private void SaveImage(Bitmap finalBitmap, View v, Picasso.LoadedFrom from) {

        /**
         * Creating the folder inside the external folder
         */
        directory = new File(Environment.getExternalStorageDirectory() + File.separator + "URLimages");
        directory.mkdirs();

        /**
         * This is the code to save in the specific location
         */
        String fname = "Image" +".jpg";
        File file = new File (directory, fname);
        String extStorageDirectory = file.toString();
        imageView.setImageBitmap(BitmapFactory.decodeFile(extStorageDirectory));
        try {
            File mypath=new File(file,"myfile.txt");
                FileOutputStream out = new FileOutputStream(file);
                finalBitmap.compress(Bitmap.CompressFormat.PNG, 90, out);

                out.flush();
                out.close();
            textView.setText("SUCCESS_IN_SAVING");
        }catch(Exception e){
            textView.setText("FAILED_HERE");
        }
//        try {
//            try {
//                FileOutputStream fos = getBaseContext().openFileOutput("file_name" + ".txt", Context.MODE_PRIVATE);
//                Writer out = new OutputStreamWriter(fos);
//                //out.write(mytext);
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (Exception e) {
//            textView.setText("FAILED_HERE");
//        }


//        ImageView mImage = (ImageView) findViewById(R.id.imgView);
//        mImage.setImageBitmap(decodeSampledBitmapFromFile(file.getAbsolutePath(), 100, 100));

    }











    /**
     *This method is to decode the image back to the imageView
     */
//    public static Bitmap decodeSampledBitmapFromFile(String path,
//                                                     int reqWidth, int reqHeight) { // BEST QUALITY MATCH
//
//        // First decode with inJustDecodeBounds=true to check dimensions
//        final BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inJustDecodeBounds = true;
//        BitmapFactory.decodeFile(path, options);
//
//        // Calculate inSampleSize
//        // Raw height and width of image
//        final int height = options.outHeight;
//        final int width = options.outWidth;
//        options.inPreferredConfig = Bitmap.Config.RGB_565;
//        int inSampleSize = 1;
//
//        if (height > reqHeight) {
//            inSampleSize = Math.round((float)height / (float)reqHeight);
//        }
//
//        int expectedWidth = width / inSampleSize;
//
//        if (expectedWidth > reqWidth) {
//            //if(Math.round((float)width / (float)reqWidth) > inSampleSize) // If bigger SampSize..
//            inSampleSize = Math.round((float)width / (float)reqWidth);
//        }
//
//
//        options.inSampleSize = inSampleSize;
//
//        // Decode bitmap with inSampleSize set
//        options.inJustDecodeBounds = false;
//
//        return BitmapFactory.decodeFile(path, options);
//    }


}




//package com.example.android.messedup;
//
//import android.content.Context;
//import android.content.ContextWrapper;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.drawable.Drawable;
//import android.os.AsyncTask;
//import android.os.Environment;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.example.android.messedup.R;
//import com.squareup.picasso.Picasso;
//import com.squareup.picasso.Target;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
//import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
//import static com.example.android.messedup.R.id.imgView;
////import static com.example.android.imageurl.MainActivity.SaveImage.imageDownload;
//
//public class MainActivity extends AppCompatActivity {
//
//    Context context;
//
//    private EditText editText;
//    private ImageView imageView;
//    private TextView textView;
//
//    File myImageFile;
//
//    String src = "http://www.qygjxz.com/data/out/36/4478898-boy-images.jpg";
//
//    public static final String s = "myfile.txt";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        editText = (EditText) findViewById(R.id.editText);
//        imageView = (ImageView) findViewById(R.id.imgView);
//        textView = (TextView) findViewById(R.id.text);
//
//        File mediaDir = new File("media");
//
//        if (!mediaDir.exists()){
//            try {
//                //mediaDir.createNewFile();
//                ContextWrapper cw1 = new ContextWrapper(context);
//                File directory1 = cw1.getDir("media", Context.MODE_PRIVATE);
//                mediaDir.createNewFile();
//            } catch (Exception e) {
//                e.printStackTrace();
//                Log.d("In catch of media", "In catch");
//            }
//            mediaDir.mkdir();
//
//        }
//
//        // Create a file in the Internal Storage
//        String fileName = "hello_file";
//        String content = "hello world";
//
//        File file = new File(s);
//
//        FileOutputStream outputStream = null;
//        try {
//            outputStream = openFileOutput(s, Context.MODE_PRIVATE);
//            outputStream.write(content.getBytes());
//            outputStream.close();
//            Toast.makeText(getApplicationContext(), "Message saved", Toast.LENGTH_SHORT).show();
//            Log.d("File created", "File is created");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        //File myDir = context.getFilesDir();
//
//        makenewFile(this.getBaseContext());
//
//
//        String rollString = editText.getText().toString().trim();
//
//
//        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(picassoImageTarget(getApplicationContext(), "imageDir", "my_image.jpeg"));
//
//        ContextWrapper cw = new ContextWrapper(getApplicationContext());
//        File directory = cw.getDir("imageDir", Context.MODE_PRIVATE);
//        File myImageFile = new File(directory, "my_image.jpeg");
//        Picasso.with(this).load(myImageFile).into(imageView);
//
//
//        textView.setText("image saved to");
//        textView.append(myImageFile.getAbsolutePath());
//    }
//
//
//    void makenewFile(Context context) {
//        File myDir = context.getFilesDir();
//        Log.d("Path of myDir:", myDir.toString());
//        String documents = "/Document/Image Folder";
//        File documentsFolder = new File(myDir, documents);
//        documentsFolder.mkdirs(); // this line creates data folder at documents directory
//
//    }
//
//    private Target picassoImageTarget(Context context, final String imageDir, final String imageName) {
//        Log.d("picassoImageTarget", " picassoImageTarget");
//        ContextWrapper cw = new ContextWrapper(context);
//        final File directory = cw.getDir(imageDir, Context.MODE_PRIVATE); // path to /data/data/yourapp/app_imageDir
//        return new Target() {
//            @Override
//            public void onBitmapLoaded(final Bitmap bitmap, Picasso.LoadedFrom from) {
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        final File myImageFile = new File(directory, imageName); // Create image file
//                        FileOutputStream fos = null;
//                        Log.d("Image file created", "Image file created");
//
//
//                        //if (isSDSupportedDevice && isSDPresent) {
//                        // yes SD-card is present
//                        try {
//                            fos = new FileOutputStream(myImageFile);
//                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
//                            Log.d("AAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAA");
//                        } catch (IOException e) {
//                            Log.d("in catch", "in catch");
//                            e.printStackTrace();
//                        } finally {
//                            try {
//                                fos.close();
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                        Log.d("image", "image saved to >>>" + myImageFile.getAbsolutePath());
//
//
//                    }
//                }).start();
//            }
//
//            @Override
//            public void onBitmapFailed(Drawable errorDrawable) {
//            }
//
//            @Override
//            public void onPrepareLoad(Drawable placeHolderDrawable) {
//                if (placeHolderDrawable != null) {
//                }
//            }
//        };
//    }
//}
