package com.duan1.bee_market;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;




public class TaiKhoanFragment extends Fragment {
    LinearLayout lnTin, lnLuu, lnVeChungToi,lnTroGiup, lnDangXuat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tai_khoan, container, false);
        lnDangXuat = view.findViewById(R.id.lnDangXuat);
        lnVeChungToi = view.findViewById(R.id.lnChungtoi);
        lnTin = view.findViewById(R.id.lnTintoi);
        lnLuu = view.findViewById(R.id.lntTenluu);
        lnTroGiup = view.findViewById(R.id.lnTrogiup);

        lnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        lnTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), TinCuaToi.class);
                startActivity(intent);
            }
        });

        lnVeChungToi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), VeChungToi.class);
                startActivity(intent);
            }
        });

        lnDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Dangnhap.class);
                startActivity(intent);
            }
        });

        lnTroGiup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), TroGiup.class);
                startActivity(intent);
            }
        });

        return view;

    }
}