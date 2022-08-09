package com.tunahan.recyclerview;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.tunahan.recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<animal> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        arrayList = new ArrayList<animal>();
        animal dog = new animal("dog",2);
        animal cat = new animal("cat",6);
        animal bird = new animal("bird",9);
        arrayList.add(dog);
        arrayList.add(cat);
        arrayList.add(bird);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdaptor recyclerAdaptor = new recyclerAdaptor(arrayList);
        binding.recyclerView.setAdapter(recyclerAdaptor);

    }
}