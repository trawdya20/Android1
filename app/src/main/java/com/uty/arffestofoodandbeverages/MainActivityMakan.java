package com.uty.arffestofoodandbeverages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.uty.arffestofoodandbeverages.databinding.ActivityMainBinding;
import com.uty.arffestofoodandbeverages.databinding.ActivityMainMakanBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivityMakan extends AppCompatActivity {
    private ActivityMainMakanBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainMakanBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MyAdapterMakan adapter = new MyAdapterMakan(setData());

        binding.recylerviewFood.setHasFixedSize(true);
        binding.recylerviewFood.setLayoutManager(new LinearLayoutManager(this));
        binding.recylerviewFood.setItemAnimator(new DefaultItemAnimator());
        binding.recylerviewFood.setAdapter(adapter);
    }
    private ArrayList<DataListMakan> setData(){
        ArrayList<DataListMakan> datalistmakan = new ArrayList<>();
        DataListMakan[] myDataMakan = new DataListMakan[] {
                new DataListMakan(R.drawable.img1, "Soup Ayam Sayuran", "Rp.200.000","Sayuran, Ayam dan Bumbu","Sangat baik bagi tubuh"),
                new DataListMakan(R.drawable.img2, "Steak Beef", "Rp120.000,-","Daging Sapi, Saus","Sangat baik bagi tubuh"),
                new DataListMakan(R.drawable.img3, "Soup Ayam", "Rp220.000,-", "Sayuran, Ayam dan Bumbu","Sangat baik bagi tubuh"),
                new DataListMakan(R.drawable.img4, "Sphagetti Seafood", "Rp320.000,-", "Mie, Seafood, Bumbu","Sangat baik bagi tubuh"),
                new DataListMakan(R.drawable.img5, "Makaroni Spicy", "Rp120.000,-", "Makaroni, Tomat, Daging","Sangat baik bagi tubuh"),
                new DataListMakan(R.drawable.img6, "Pizza Daging", "Rp80.000,-", "Tepung, Daging, Saus","Sangat baik bagi tubuh"),
                new DataListMakan(R.drawable.img7, "Steak Sheap", "Rp230.000,-", "Daging Domba, Bumbu","Sangat baik bagi tubuh"),
                new DataListMakan(R.drawable.img8, "Soto Daging", "Rp9.000,-", "Saayuran, Ayam","Sangat baik bagi tubuh"),
                new DataListMakan(R.drawable.img9, "Ayam Bakar", "Rp10.000,-", "Ayam dan Bumbu","Sangat baik bagi tubuh"),
                new DataListMakan(R.drawable.img10, "Bakmie Tanpa Kuah", "Rp30.000,-", "Mie, Sayuran, Ayam dan Bumbu","Sangat baik bagi tubuh")

                };
        datalistmakan.addAll(Arrays.asList(myDataMakan));
        return datalistmakan;
        }
    }