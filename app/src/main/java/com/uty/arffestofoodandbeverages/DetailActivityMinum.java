package com.uty.arffestofoodandbeverages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uty.arffestofoodandbeverages.databinding.ActivityDetailMinumBinding;
import com.uty.arffestofoodandbeverages.databinding.ActivityMainMinumBinding;

public class DetailActivityMinum extends AppCompatActivity {
    private ActivityDetailMinumBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailMinumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DataListMinum dataListMinum = getIntent().getParcelableExtra("datalistminum");
        binding.imgDetailMinum.setImageResource(dataListMinum.getImageId());
        binding.titleDetailMinum.setText(dataListMinum.getTitle());
        binding.priceDetailMinum.setText(dataListMinum.getPrice());
        binding.bahanDetailMinum.setText(dataListMinum.getBahan());
        binding.manfaatDetailMinum.setText(dataListMinum.getManfaat());
    }
}