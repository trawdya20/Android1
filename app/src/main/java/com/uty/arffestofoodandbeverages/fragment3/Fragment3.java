package com.uty.arffestofoodandbeverages.fragment3;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uty.arffestofoodandbeverages.R;
import com.uty.arffestofoodandbeverages.databinding.Fragment3Fragment3Binding;
import com.uty.arffestofoodandbeverages.fragment1.DetailFragment;


import java.util.Calendar;

public class Fragment3 extends Fragment {

    private Fragment3ViewModel mViewModel;
    private Fragment3Fragment3Binding binding;
    private  String nama, nilai, tanggal, waktu, keterangan;

    public static Fragment3 newInstance() {
        return new Fragment3();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = Fragment3Fragment3Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(Fragment3ViewModel.class);
        // TODO: Use the ViewModel

        binding.buttonMasukkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = binding.textNama.getText().toString();
                keterangan = binding.textPsnketerangan.getText().toString();
                tanggal = binding.textTgl.getText().toString();
                waktu = binding.txtWaktu.getText().toString();

                int nilaipsn = binding.rgMasukkan.getCheckedRadioButtonId();
                nilai = "";
                if (nilaipsn == R.id.rb_1) {
                    nilai = "Sangat Kurang";
                } else if (nilaipsn == R.id.rb_2) {
                    nilai = "Kurang";
                } else if (nilaipsn == R.id.rb_3) {
                    nilai = "Cukup";
                } else if (nilaipsn == R.id.rb_4) {
                    nilai = "Puas";
                } else if (nilaipsn == R.id.rb_5) {
                    nilai = "Sangat Puas";
                }

            String message = "Nama : " + nama + "\n"
                    + "Tanggal : " + tanggal + "\n"
                    + "Waktu : " + waktu + "\n"
                    + "Nilai : " + nilai + "\n"
                    + "Keterangan : " + keterangan;

                Log.d("LogFragment3->", "btnpesan : " + message);


                Intent intent = new Intent( getContext(), DetailFragment3.class);
                intent.putExtra("key_message", message);
                startActivity(intent);
            }
        });
    }

}