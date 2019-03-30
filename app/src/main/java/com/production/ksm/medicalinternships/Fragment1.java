package com.production.ksm.medicalinternships;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_fragment1,container,false);

        ImageView imageView = (ImageView)v.findViewById(R.id.photo_sydney);
        Glide.with(this).load(R.drawable.sydney_photo).override(720,370).into(imageView);

        return v;
    }
}
