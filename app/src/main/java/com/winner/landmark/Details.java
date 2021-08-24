package com.winner.landmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.winner.landmark.databinding.ActivityDetailsBinding;
import com.winner.landmark.databinding.ActivityMainBinding;

public class Details extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent=getIntent();
        Landmark landmark=(Landmark) intent.getSerializableExtra("landmark");

        binding.name.setText(landmark.name);
        binding.image.setImageResource(landmark.image);
        binding.country.setText(landmark.country);



    }
}