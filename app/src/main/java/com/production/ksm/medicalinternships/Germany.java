package com.production.ksm.medicalinternships;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;


public class Germany extends AppCompatActivity {

    // Declaring Your View and Variables

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapterGermany adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"Берлин","Гейдельберг"};
    int Numboftabs = 2;

    private FloatingActionMenu fam;
    private FloatingActionButton fabShare, fabMail, fabSkype;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany);
        setTitle(R.string.logo_germany);

        fabShare = (FloatingActionButton) findViewById(R.id.menu_item);
        fabMail = (FloatingActionButton) findViewById(R.id.menu_item1);
        fabSkype = (FloatingActionButton) findViewById(R.id.menu_item2);
        fam = (FloatingActionMenu) findViewById(R.id.menu);


        //handling each floating action button clicked
        fabShare.setOnClickListener(onButtonClick());
        fabMail.setOnClickListener(onButtonClick());
        fabSkype.setOnClickListener(onButtonClick());



        fam.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                if (fam.isOpened()) {
                    fam.close(true);
                }
            }
        });



        // Creating The Toolbar and setting it as the Toolbar for the activity

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white); // your drawable
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Implemented by activity
            }
        });

        toolbar.setTitleTextColor(getResources().getColor(R.color.text_white));


        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter =  new ViewPagerAdapterGermany(getSupportFragmentManager(),Titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollCover);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);



    }

    private View.OnClickListener onButtonClick() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == fabShare) {
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "\n" +
                            "Стажировки в Германии (Берлин, Хейдельберг) и другие возможности только в приложении Медицинские стажировки (Google Play),  узнать подробнее о стажировках - medicalinternshipsksm@gmail.com\n");
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);
                } else if (view == fabSkype) {
                    Intent skype = new Intent("android.intent.action.VIEW");
                    skype.setData(Uri.parse("skype:" + "alenpak333" + "?chat=true"));

                    try {
                        startActivity(Intent.createChooser(skype, "Выберите нужное приложение"));
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(Germany.this, "Пожалуйста загрузите подходящее приложение из Google Play", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                    emailIntent.setData(Uri.parse("mailto:" + "medicalinternshipsksm@gmail.com"));

                    try {
                        startActivity(Intent.createChooser(emailIntent, "Выберите нужное приложение"));
                    } catch (android.content.ActivityNotFoundException ex) {
                        Toast.makeText(Germany.this, "Пожалуйста загрузите подходящее приложение из Google Play", Toast.LENGTH_SHORT).show();
                    }

                }
                fam.close(true);
            }
        };
    }

    @Override
    public void onBackPressed() {
        Germany.super.onBackPressed();
        finish();
    }

}