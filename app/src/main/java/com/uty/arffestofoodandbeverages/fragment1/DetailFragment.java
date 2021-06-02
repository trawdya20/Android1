package com.uty.arffestofoodandbeverages.fragment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uty.arffestofoodandbeverages.databinding.ActivityDetailFragmentBinding;

public class DetailFragment extends AppCompatActivity {
    private ActivityDetailFragmentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailFragmentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String message = getIntent().getStringExtra("key_message");
        binding.detailactTextMessage.setText(message);
    }
}