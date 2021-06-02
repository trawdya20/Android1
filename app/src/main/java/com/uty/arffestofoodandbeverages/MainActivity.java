package com.uty.arffestofoodandbeverages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.uty.arffestofoodandbeverages.databinding.ActivityMainBinding;
import com.uty.arffestofoodandbeverages.databinding.ActivityMainMinumBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavController navController = Navigation.findNavController(this,R.id.activity_main_nav_host_fragment);
        BottomNavigationView bottomNavigationView = binding.activityMainBottomNav;

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}