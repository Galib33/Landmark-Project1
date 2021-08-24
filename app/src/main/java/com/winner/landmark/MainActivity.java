package com.winner.landmark;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.winner.landmark.databinding.ActivityDetailsBinding;
import com.winner.landmark.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList=new ArrayList<>();

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        BookAdapter bookAdapter=new BookAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(bookAdapter);


        Landmark bruce=new Landmark("Bruce Lee","China",R.drawable.brucelee);
        Landmark henry=new Landmark("Henry Cavill","England",R.drawable.henrycavill);
        Landmark jason=new Landmark("Jason Momoa","Hawaii",R.drawable.jason);

        landmarkArrayList.add(bruce);
        landmarkArrayList.add(henry);
        landmarkArrayList.add(jason);


    }
}