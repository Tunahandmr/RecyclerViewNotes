package com.tunahan.carsbooklistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tunahan.carsbooklistview.databinding.ActivityCarsBinding;

public class CarsActivity extends AppCompatActivity {


    private ActivityCarsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        cars selectedCars = (cars)intent.getSerializableExtra("cars");

        binding.nameText.setText(selectedCars.name);
        binding.countryText.setText(selectedCars.country);
        binding.imageView.setImageResource(selectedCars.image);
    }
}