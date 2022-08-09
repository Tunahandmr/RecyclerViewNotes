package com.tunahan.carsbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.tunahan.carsbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<cars> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        arrayList = new ArrayList<cars>();

        cars lamborghini = new cars("Lamborghini",R.drawable.lamborghini);
        cars bugatti = new cars("bugatti",R.drawable.bugatti);
        cars mustang = new cars("mustang",R.drawable.mustang);
        arrayList.add(lamborghini);
        arrayList.add(bugatti);
        arrayList.add(mustang);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        carsAdapter carsAdapter = new carsAdapter(arrayList);
        binding.recyclerView.setAdapter(carsAdapter);
    }
}