package com.production.ksm.medicalinternships;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.production.ksm.medicalinternships.usa.About_us;


public class MainActivity extends Activity {

    int mPhotoWidth = 0;
    int mPhotoHeight = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.logo);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.logotype);
        mPhotoWidth = bitmap.getWidth();
        mPhotoHeight = bitmap.getHeight();
        imageView.setImageBitmap(bitmap);


        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseCountry.class);
                startActivity(intent);

            }
        });

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SelectLanguageCourses.class);
                startActivity(intent);

            }
        });

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, About_us.class);
                startActivity(intent);

            }
        });


    }


    @Override
    public void onBackPressed() {
        //displayInterstitial();
        new AlertDialog.Builder(this)
                .setTitle("Закрыть приложение")
                .setMessage("Вы точно хотите выйти из приложения?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {

                        MainActivity.super.onBackPressed();

                    }
                }).create().show();
    }

}