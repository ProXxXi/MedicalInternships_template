package com.production.ksm.medicalinternships.medeng;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.production.ksm.medicalinternships.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LondonMedEng extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_london_med_eng, container, false);

        ImageView imageView = (ImageView)v.findViewById(R.id.photo_london_medeng);
        Glide.with(this).load(R.drawable.london_photo).override(720,370).into(imageView);

        return v;
    }
}