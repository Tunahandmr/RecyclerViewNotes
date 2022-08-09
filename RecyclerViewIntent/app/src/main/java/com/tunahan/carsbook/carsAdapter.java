package com.tunahan.carsbook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tunahan.carsbook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class carsAdapter extends RecyclerView.Adapter<carsAdapter.carsHolder> {

    ArrayList<cars> arrayList;

    public carsAdapter(ArrayList<cars> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public carsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new carsHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull carsHolder holder,int position) {

        holder.binding.textViewRecyclerView.setText(arrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),carsActivity.class);
                intent.putExtra("cars",arrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
             }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class carsHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public carsHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
