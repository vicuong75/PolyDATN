package com.duan1.bee_market;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_Nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new TrangChuFragment() ).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId()){
                case R.id.nav_trangchu:
                    fragment = new TrangChuFragment();
                    break;
                case R.id.nav_tinluu:
                    fragment = new TinLuuFragment();
                    break;
                case R.id.nav_dangtin:
                    fragment = new DangTinFragment();

                    break;
                case R.id.nav_tinnhan:
                    fragment = new TinNhanFragment();
                    break;
                case R.id.nav_taikhoan:
                    fragment = new TaiKhoanFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
            return true;
        }

    };
}