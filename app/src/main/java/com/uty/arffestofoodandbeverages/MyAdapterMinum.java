package com.uty.arffestofoodandbeverages;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uty.arffestofoodandbeverages.databinding.ItemListMinumBinding;

import java.util.ArrayList;

public class MyAdapterMinum extends RecyclerView.Adapter<MyAdapterMinum.ViewHolder> {
    private ArrayList<DataListMinum> dataListMinums;

    public MyAdapterMinum(ArrayList<DataListMinum> dataListMinums){
        this.dataListMinums = dataListMinums;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListMinumBinding binding = ItemListMinumBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        ViewHolder viewHolder = new ViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataListMinum dataListMinum = dataListMinums.get(position);
        final int image = dataListMinum.getImageId();
        final String tittle = dataListMinum.getTitle();
        final String price = dataListMinum.getPrice();
        final String bahan = dataListMinum.getBahan();
        final String manfaat = dataListMinum.getManfaat();

        holder.binding.listImgMinum.setImageResource(image);
        holder.binding.listTitleDrink.setText(tittle);
        holder.binding.listPriceDrink.setText(price);
        holder.binding.listBahanDrink.setText(bahan);
        holder.binding.listManfaatDrink.setText(manfaat);

        holder.binding.cardviewMinum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),
                        image + "\n" +
                                tittle + "\n" +
                                price + "\n" +
                                bahan + "\n" +
                                manfaat, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), DetailActivityMinum.class);
                intent.putExtra("datalistminum", dataListMinum);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataListMinums.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemListMinumBinding binding;
        public ViewHolder(@NonNull ItemListMinumBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
