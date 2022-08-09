package com.tunahan.carsbooksingleton;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tunahan.carsbooksingleton.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class carsAdapter extends RecyclerView.Adapter<carsAdapter.carsHolder> {

    ArrayList<cars> carsArrayList;

    public carsAdapter(ArrayList<cars> carsArrayList) {
        this.carsArrayList = carsArrayList;
    }

    @NonNull
    @Override
    //xml bağlama işlemi burada yapılacak
    public carsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new carsHolder(recyclerRowBinding);
    }

    //viewholder bağlandığında neler olacak
    @Override
    public void onBindViewHolder(@NonNull carsHolder holder, int position) {

        holder.binding.textViewRecyclerView.setText(carsArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),CarsActivity.class);
                Singleton singleton= Singleton.getInstance();
                singleton.setSentCars(carsArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    //xml kaç kez oluşturulacak
    @Override
    public int getItemCount() {
        return carsArrayList.size();
    }

    public class  carsHolder extends RecyclerView.ViewHolder{

       private RecyclerRowBinding binding;

        public carsHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
