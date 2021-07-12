package com.example.animaldetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Animal> AnimalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildData();
        setAnimalAdaptor();


    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }


    private void buildData() {
        AnimalList.add(new Animal(R.drawable.lion, "Name: Lion", "Sound: Roar"));
        AnimalList.add(new Animal(R.drawable.buffalo, "Name: Buffalo", "Sound: Grunting"));
        AnimalList.add(new Animal(R.drawable.cow, "Name: Cow", "Sound: Moo"));
        AnimalList.add(new Animal(R.drawable.duck, "Name: Duck", "Sound: Quack Quack"));
        AnimalList.add(new Animal(R.drawable.zebra,"Name: Zebra","Sound: Whinny"));
        AnimalList.add(new Animal(R.drawable.giraffe,"Name: Giraffe","Sound: Hum"));
        AnimalList.add(new Animal(R.drawable.panda,"Name: Panda","Sound: Huff"));
        AnimalList.add(new Animal(R.drawable.tiger,"Name: Tiger","Sound: Roar"));
        AnimalList.add(new Animal(R.drawable.elephant,"Name: Elephant","Sound: Trumpet"));
        AnimalList.add(new Animal(R.drawable.raindeer,"Name: Cow","Sound: Moo"));
        AnimalList.add(new Animal(R.drawable.lion, "Name: Lion", "Sound: Roar"));
        AnimalList.add(new Animal(R.drawable.buffalo, "Name: Buffalo", "Sound: Grunting"));
        AnimalList.add(new Animal(R.drawable.cow, "Name: Cow", "Sound: Moo"));
        AnimalList.add(new Animal(R.drawable.duck, "Name: Duck", "Sound: Quack Quack"));
        AnimalList.add(new Animal(R.drawable.zebra,"Name: Zebra","Sound: Whinny"));
        AnimalList.add(new Animal(R.drawable.giraffe,"Name: Giraffe","Sound: Hum"));
        AnimalList.add(new Animal(R.drawable.panda,"Name: Panda","Sound: Huff"));
        AnimalList.add(new Animal(R.drawable.tiger,"Name: Tiger","Sound: Roar"));
        AnimalList.add(new Animal(R.drawable.elephant,"Name: Elephant","Sound: Trumpet"));
        AnimalList.add(new Animal(R.drawable.raindeer,"Name: Cow","Sound: Moo"));


    }
    private void setAnimalAdaptor() {
        AnimalAdaptor animalAdaptor = new AnimalAdaptor(AnimalList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(animalAdaptor);
    }
}