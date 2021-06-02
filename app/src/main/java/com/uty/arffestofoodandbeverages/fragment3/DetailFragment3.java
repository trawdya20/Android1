package com.uty.arffestofoodandbeverages.fragment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uty.arffestofoodandbeverages.databinding.ActivityDetailFragment3Binding;

public class DetailFragment3 extends AppCompatActivity {
    private ActivityDetailFragment3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailFragment3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String message = getIntent().getStringExtra("key_message");
        binding.detailactTextMessage.setText(message);
    }
}