package com.tunahan.carsbooklistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.tunahan.carsbooklistview.databinding.ActivityCarsBinding;
import com.tunahan.carsbooklistview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

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
        cars bugatti = new cars("Bugatti","France",R.drawable.bugatti);
        cars mustang = new cars("Mustang","ABD",R.drawable.mustang);

        carsArrayList.add(lamborghini);
        carsArrayList.add(bugatti);
        carsArrayList.add(mustang);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                carsArrayList.stream().map(cars -> cars.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,CarsActivity.class);
                intent.putExtra("cars",carsArrayList.get(i));
                startActivity(intent);
            }
        });

    }
}