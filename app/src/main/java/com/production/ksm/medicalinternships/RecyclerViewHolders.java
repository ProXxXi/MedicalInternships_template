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
            case 1:
                Context context1 = view.getContext();
                Intent intent1 = new Intent(context1, Austria.class);
                context1.startActivity(intent1);
                break;
            case 2:
                Context context2 = view.getContext();
                Intent intent2 = new Intent(context2, Germany.class);
                context2.startActivity(intent2);
                break;
            case 3:
                Context context3 = view.getContext();
                Intent intent3 = new Intent(context3, Usa.class);
                context3.startActivity(intent3);
                break;
            case 4:
                Context context4 = view.getContext();
                Intent intent4 = new Intent(context4, Czech.class);
                context4.startActivity(intent4);
                break;
            case 5:
                Context context5 = view.getContext();
                Intent intent5 = new Intent(context5, SouthKorea.class);
                context5.startActivity(intent5);
                break;
            case 6:
                Context context6 = view.getContext();
                Intent intent6 = new Intent(context6, Israel.class);
                context6.startActivity(intent6);
                break;
            default:
                break;
        }


        //Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}