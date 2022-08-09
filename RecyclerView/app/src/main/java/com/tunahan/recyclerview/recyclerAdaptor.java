package com.tunahan.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tunahan.recyclerview.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class recyclerAdaptor extends RecyclerView.Adapter<recyclerAdaptor.recycleHolder> {

    ArrayList<animal> arrayList;

    public recyclerAdaptor(ArrayList<animal> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public recycleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new recycleHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull recycleHolder holder, int position) {

        holder.binding.recyclerViewTextView.setText(arrayList.get(position).name);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class recycleHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public recycleHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }


}
