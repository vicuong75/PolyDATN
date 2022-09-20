package com.duan1.bee_market;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class TrangChuFragment extends Fragment {
    ImageView all ,bai1,bai2;
    ViewFlipper flip;
    int[] arayAnh={R.drawable.tet,R.drawable.dd,R.drawable.gd,R.drawable.dich,R.drawable.maytinh};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trangchu, container, false);
        all = view.findViewById(R.id.imageView);
        flip=view.findViewById(R.id.flip);

        bai1 = view.findViewById(R.id.imgXuHuong1);
        bai2 = view.findViewById(R.id.imgXuHuong2);


        for(int i=0;i<arayAnh.length;i++){
            ImageView imageView = new ImageView(getActivity());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageResource(arayAnh[i]);
            flip.addView(imageView);

        }
        flip.setFlipInterval(1000);
        flip.setAutoStart(true);















        bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),GianHang.class);
                startActivity(intent);
            }
        });
        bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),XemChiTiet.class);
                startActivity(intent);
            }
        });













        return view;




    }
}