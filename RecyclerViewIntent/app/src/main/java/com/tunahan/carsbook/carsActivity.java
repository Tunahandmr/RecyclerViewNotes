package com.tunahan.carsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tunahan.carsbook.databinding.ActivityCarsBinding;
import com.tunahan.carsbook.databinding.ActivityMainBinding;

public class carsActivity extends AppCompatActivity {

    private ActivityCarsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        cars selectedCars = (cars) intent.getSerializableExtra("cars");
        binding.nameText.setText(selectedCars.name);
        binding.imageView.setImageResource(selectedCars.image);
    }
}