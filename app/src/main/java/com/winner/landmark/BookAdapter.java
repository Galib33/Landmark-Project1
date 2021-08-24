package com.winner.landmark;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.winner.landmark.databinding.RecyclerBinding;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookHolder>{

    ArrayList<Landmark> landmarkArrayList;

    public BookAdapter(ArrayList<Landmark> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        RecyclerBinding recyclerBinding=RecyclerBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new BookHolder(recyclerBinding);
    }

    @Override
    public void onBindViewHolder(BookAdapter.BookHolder holder, int position) {
        int myPosition = holder.getAdapterPosition();
        holder.binding.recyclerText.setText(landmarkArrayList.get(myPosition).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(holder.itemView.getContext(),Details.class);
                intent.putExtra("landmark",landmarkArrayList.get(myPosition));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }



    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    public class BookHolder extends RecyclerView.ViewHolder{
        private RecyclerBinding binding;

        public BookHolder(@NonNull RecyclerBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
