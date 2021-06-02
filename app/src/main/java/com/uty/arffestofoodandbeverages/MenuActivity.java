package com.uty.arffestofoodandbeverages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uty.arffestofoodandbeverages.fragment1.Fragment1;
import com.uty.arffestofoodandbeverages.fragment3.Fragment3;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button_menu_order = findViewById(R.id.button_menu_oder);
        Button button_menu_makanan = findViewById(R.id.button_menu_makananan);
        Button button_menu_minuman = findViewById(R.id.button_menu_minuman);
        Button button_menu_pesan = findViewById(R.id.button_menu_pesan);

        button_menu_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });

        button_menu_minuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivityMinum.class));
            }
        });

        button_menu_makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivityMakan.class));
            }
        });

        button_menu_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( MenuActivity.this, MainActivity.class));
            }
        });
    }
}