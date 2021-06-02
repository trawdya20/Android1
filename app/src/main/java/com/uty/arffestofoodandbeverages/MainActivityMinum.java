package com.uty.arffestofoodandbeverages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.uty.arffestofoodandbeverages.databinding.ActivityMainMinumBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivityMinum extends AppCompatActivity {
    private ActivityMainMinumBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainMinumBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MyAdapterMinum adapter = new MyAdapterMinum(setData());

        binding.recylerviewDrink.setHasFixedSize(true);
        binding.recylerviewDrink.setLayoutManager(new LinearLayoutManager(this));
        binding.recylerviewDrink.setItemAnimator(new DefaultItemAnimator());
        binding.recylerviewDrink.setAdapter(adapter);

    }
    private ArrayList<DataListMinum> setData(){
        ArrayList<DataListMinum> datalistminum = new ArrayList<>();
        DataListMinum[] myDataMinum = new DataListMinum[] {
                new DataListMinum(R.drawable.drk, "Lemon Ice with Mint", "Rp.10.000", "Air, Es, Lemon, Daun Mint","Meningkatkan imun dalam tubuh, " +
                        "baik untuk kinerja jantung dan sangat menyehatkan"),
                new DataListMinum(R.drawable.drk1, "Kopi Hitam", "Rp.30.000", "Air Hangat, Kopi, Gula (Bisa Request)","Menahan kantuk, cocok sebagai " +
                        "teman bergadang mengerjakan deadline"),
                new DataListMinum(R.drawable.drk14, "Juice Mango", "Rp.8.000","Air, Mangga, Es, Gula","Mengandung banyak Vitamin C, baik untuk tubuh karena sangat menyehatkan"),
                new DataListMinum(R.drawable.drk2, "Cola", "Rp.10.000","Air, Es, Cola", "Variasi minuman yang menarik dan sangat menyegarkan "),
                new DataListMinum(R.drawable.drk6, "Coffee Latte", "Rp.40.000","Air, Susu, Kopi, Gula", "Dapat menahan kantuk, bisa dijadikan patner untuk bergadang"),
                new DataListMinum(R.drawable.drk8, "Green Apple Drink Water", "Rp.20.000", "Apel Hijau, Air, Gula", "Menurunkan berat badan, meningkatkan metabolisme dalam tubuh"),
                new DataListMinum(R.drawable.drk9, "Strawberry Lemonade Water", "Rp.30.000", "Strawberry, Lemon, Es Batu, Gula (Bisa Request)", "Meningkatkan metabolisme dalam tubuh, menjaga asupan vitamin"),
                new DataListMinum(R.drawable.drk10, "Jus Alpukat", "Rp.10.000", "Alpukat, Air, Gula, Susu","Baik untuk kesehatan tubuh, sangat menyehatkan"),
                new DataListMinum(R.drawable.drk11, "Ice Cream 4 Variant", "Rp.30.000", "Ice Cream","Menyegarkan, menambah asupan gula dalam tubuh"),
                new DataListMinum(R.drawable.drk12, "Juice Healthy", "Rp.6.000", "Sayuran Hijau", "Sebagai Detox alami, sangat menyehatkan dan dapat menurunkan berat badan"),
                new DataListMinum(R.drawable.drk13, "Es Cerry", "Rp.90.000", " Buah Chery, Air, Lemon", "Melindungi tubuh dari radikal bebas, meningkatkan fungsi kekebalan tubuh dan mengatasi insonmnia")
        };
        datalistminum.addAll(Arrays.asList(myDataMinum));
        return datalistminum;
    }
}