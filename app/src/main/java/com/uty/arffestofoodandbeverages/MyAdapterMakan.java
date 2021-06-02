package com.uty.arffestofoodandbeverages;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uty.arffestofoodandbeverages.databinding.ItemListFoodBinding;

import java.util.ArrayList;

public class MyAdapterMakan extends RecyclerView.Adapter<MyAdapterMakan.ViewHolder> {
    private ArrayList<DataListMakan> dataListMakans;

    public MyAdapterMakan(ArrayList<DataListMakan> dataListMakans) {
        this.dataListMakans = dataListMakans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListFoodBinding binding = ItemListFoodBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ViewHolder viewHolder = new ViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    final DataListMakan dataListMakan = dataListMakans.get(position);
    final int image = dataListMakan.getImageId();
    final String tittle = dataListMakan.getTitle();
    final String price = dataListMakan.getPrice();
    final String bahan = dataListMakan.getBahan();
    final String manfaat = dataListMakan.getManfaat();

    holder.binding.listImgMakan.setImageResource(image);
    holder.binding.listTitleFood.setText(tittle);
    holder.binding.listPriceFood.setText(price);
    holder.binding.listBahanFood.setText(bahan);
    holder.binding.listManfaatFood.setText(manfaat);

    holder.binding.cardviewMakan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(),
                    image + "\n" +
                            tittle + "\n" +
                            price + "\n" +
                            bahan + "\n" +
                            manfaat,Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(view.getContext(), DetailActivityMakan.class);
            intent.putExtra("datalistmakan", dataListMakan);
            view.getContext().startActivity(intent);

        }
    });
    }


    @Override
    public int getItemCount() {
        return dataListMakans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemListFoodBinding binding;
        public ViewHolder(@NonNull ItemListFoodBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
