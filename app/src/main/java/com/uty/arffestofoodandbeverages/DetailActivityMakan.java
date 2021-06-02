package com.uty.arffestofoodandbeverages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uty.arffestofoodandbeverages.databinding.ActivityDetailMakanBinding;

public class DetailActivityMakan extends AppCompatActivity {
    private ActivityDetailMakanBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailMakanBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DataListMakan dataListMakan = getIntent().getParcelableExtra("datalistmakan");
        binding.imgDetailMakan.setImageResource(dataListMakan.getImageId());
        binding.titleDetailMakan.setText(dataListMakan.getTitle());
        binding.titlePriceMakan.setText(dataListMakan.getPrice());
        binding.bahanDetailMakan.setText(dataListMakan.getBahan());
        binding.manfaatDetailMakan.setText(dataListMakan.getManfaat());
    }
}