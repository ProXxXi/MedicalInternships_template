package com.production.ksm.medicalinternships.usa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.production.ksm.medicalinternships.R;

public class About_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Button btn = (Button) findViewById(R.id.button1);
        assert btn != null;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + "medicalinternshipsksm@gmail.com"));

                try {
                    startActivity(Intent.createChooser(emailIntent, "Выберите нужное приложение"));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(About_us.this, "Пожалуйста загрузите подходящее приложение из Google Play", Toast.LENGTH_SHORT).show();
                }

            }
        });
        Button btn2 = (Button) findViewById(R.id.button2);
        assert btn2 != null;
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "\n" +
                        "Еще больше возможностей для образования с приложением Медицинские cтажировки! Установить из Google Play https://play.google.com/store/apps/details?id=com.production.ksm.medicalinternships\n");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });
        Button btn3 = (Button) findViewById(R.id.button3);
        assert btn3 != null;
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent skype = new Intent("android.intent.action.VIEW");
                skype.setData(Uri.parse("skype:" + "alenpak333" + "?chat=true"));

                try {
                    startActivity(Intent.createChooser(skype, "Выберите нужное приложение"));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(About_us.this, "Пожалуйста загрузите подходящее приложение из Google Play", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public void onBackPressed() {
        About_us.super.onBackPressed();
        //overridePendingTransition(R.anim.fade_in1, R.anim.fade_out1);
        finish();

    }
}
