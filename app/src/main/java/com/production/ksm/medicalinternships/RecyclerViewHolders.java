package com.production.ksm.medicalinternships;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView countryName;
    public ImageView countryPhoto;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        countryName = (TextView)itemView.findViewById(R.id.country_name);
        countryPhoto = (ImageView)itemView.findViewById(R.id.country_photo);
    }

    @Override
    public void onClick(View view) {
        switch (getPosition()) {
            case 0:
                Context context = view.getContext();
                Intent intent = new Intent(context, Australia.class);
                context.startActivity(intent);
                break;
            default:
                break;
        }


        //Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}