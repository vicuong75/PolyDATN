package com.duan1.bee_market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Dangnhap extends AppCompatActivity {
Button dn;
TextView dk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        dn=findViewById(R.id.btndn);
        dk=findViewById(R.id.tvDangky1);

        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( Dangnhap.this,MainActivity.class);

                startActivity(intent);
            }
        });

        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( Dangnhap.this,Dangki.class);

                startActivity(intent);
            }
        });
    }
}