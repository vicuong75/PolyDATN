package com.duan1.bee_market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.duan1.bee_market.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread=new Thread(){
            @Override
            public void run(){
                super.run();
                int waited = 0;
                while(waited < 2000){
                    try {
                        sleep(100);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    waited+=100;
                }

                Intent intent=new Intent(Splash.this, Dangnhap.class);

                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                finish();
            }
        };
        thread.start();
    }
}