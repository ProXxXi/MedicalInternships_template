package com.production.ksm.medicalinternships;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class ChooseCountry extends AppCompatActivity {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_country);
        setTitle(R.string.logo_desc);

        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setTitleTextColor(getResources().getColor(R.color.text_white));
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        topToolBar.setNavigationIcon(R.drawable.ic_arrow_back_white); // your drawable
        topToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed(); // Implemented by activity
            }
        });


        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(ChooseCountry.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(ChooseCountry.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Стажировки в Австралии", R.drawable.australia1));
        allItems.add(new ItemObject("Стажировки в Австрии", R.drawable.austria));
        allItems.add(new ItemObject("Стажировки в Германии", R.drawable.germany));
        allItems.add(new ItemObject("Стажировки в США", R.drawable.usa));
        allItems.add(new ItemObject("Стажировки в Чешской Республике", R.drawable.czech));
        allItems.add(new ItemObject("Стажировки в Южной Корее", R.drawable.southkorea));
        allItems.add(new ItemObject("Стажировки в Израиле", R.drawable.israel));

        return allItems;
    }
}