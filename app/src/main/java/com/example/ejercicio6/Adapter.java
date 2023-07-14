package com.example.ejercicio6;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ejercicio6.databinding.ItemBinding;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter  <Adapter.ViewHolder>{

        private ArrayList<Image> images =new ArrayList<>();
        @NonNull
        @Override
        public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()));
            return new ViewHolder(binding);
        }

        @Override
        public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
            Image item = images.get(position);
            holder.showData(item.toString());
        }

        @Override
        public int getItemCount() {
            return images.size();
        }
    public void setData(List<String> data) {
        this.images = images;
    }


       public class ViewHolder extends RecyclerView.ViewHolder {
           private  ItemBinding itemBinding;
           public ViewHolder(@NonNull ItemBinding binding) {
               super(binding.getRoot());
               itemBinding = binding;
           }
             public void showData(String image) {


                 Glide.with(itemBinding.getRoot()).load(image).into(itemBinding.imageView2);
             }


        }



}

