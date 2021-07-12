package com.example.animaldetails;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder{
    private ImageView image;
    private TextView name, sound;
    public AnimalViewHolder(@NonNull  View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        image = itemView.findViewById(R.id.ivLion);
        name = itemView.findViewById(R.id.tvName);
        sound = itemView.findViewById(R.id.tvSound);
    }
    public void setData(Animal animal){
        image.setImageResource(animal.getmImage());
        name.setText(animal.getmName());
        sound.setText(animal.getmSound());
    }
}
