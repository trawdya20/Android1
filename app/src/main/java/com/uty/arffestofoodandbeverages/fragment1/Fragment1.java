package com.uty.arffestofoodandbeverages.fragment1;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.uty.arffestofoodandbeverages.R;
import com.uty.arffestofoodandbeverages.databinding.Fragment1Fragment1Binding;

public class Fragment1 extends Fragment {

    private Fragment1ViewModel mViewModel;
    private Fragment1Fragment1Binding binding;
    private String nama, alamat, rencanamakan, pilmakan, pilminum, makan, minum, keterangan;

    public static Fragment1 newInstance() {
        return new Fragment1();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = Fragment1Fragment1Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(Fragment1ViewModel.class);
        // TODO: Use the ViewModel

        binding.buttonPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = binding.textNama.getText().toString();
                alamat = binding.textAlamat.getText().toString();
                makan = binding.textPsnmakan.getText().toString();
                minum = binding.textPsnminum.getText().toString();
                keterangan = binding.textPsnketerangan.getText().toString();

                int statusMkn = binding.rgOrder.getCheckedRadioButtonId();
                rencanamakan = "";
                if (statusMkn == R.id.rb_delivery){
                    rencanamakan = "Delivery";
                } else if (statusMkn == R.id.rb_mkndtmpt){
                    rencanamakan = "Makan di Tempat";
                }

                pilmakan = binding.spPsnmakan.getSelectedItem().toString();

                pilminum = binding.spPsnminum.getSelectedItem().toString();

                String message = "Nama : " + nama + "\n"
                        + "Alamat : " + alamat + "\n"
                        + "Pilihan Makan : " + rencanamakan + "\n"
                        + "Makanan yang dipesan : " + makan + "\n"
                        + "Tambahan yang dipilih : " + pilmakan + "\n"
                        + "Minuman yang dipesan : " + minum + "\n"
                        + "Tambahan yang dipilih : " + pilminum + "\n"
                        + "Keterangan : " + keterangan;

                Log.d("LogFragment1->", "btnProsesOrder : " + message);


                Intent intent = new Intent( getContext(), DetailFragment.class);
                intent.putExtra("key_message", message);
                startActivity(intent);
            }
        });
    }

}