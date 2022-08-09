package com.tunahan.carsbooksingleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tunahan.carsbooksingleton.databinding.ActivityCarsBinding;
import com.tunahan.carsbooksingleton.databinding.ActivityMainBinding;

public class CarsActivity extends AppCompatActivity {

    private ActivityCarsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Singleton singleton = Singleton.getInstance();
        cars selectedCars= singleton.getSentCars();

        binding.nameText.setText(selectedCars.name);
        binding.countryText.setText(selectedCars.country);
        binding.imageView.setImageResource(selectedCars.image);
    }
}