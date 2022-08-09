package com.tunahan.carsbooksingleton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.tunahan.carsbooksingleton.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<cars> carsArrayList;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        carsArrayList = new ArrayList<>();

        cars lamborghini = new cars("Lamborghini","Italy",R.drawable.lamborghini);
        cars bugatti = new cars ("Bugatti","France",R.drawable.bugatti);
        cars mustang = new cars ("Mustang","ABD",R.drawable.mustang);

        carsArrayList.add(lamborghini);
        carsArrayList.add(bugatti);
        carsArrayList.add(mustang);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        carsAdapter carsAdapter = new carsAdapter(carsArrayList);
        binding.recyclerView.setAdapter(carsAdapter);
    }
}