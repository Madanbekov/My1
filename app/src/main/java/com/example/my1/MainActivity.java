package com.example.my1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<String> persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        loadData();
        adapter = new Adapter(persons);
        recyclerView.setAdapter(adapter);

    }
    private void  loadData(){
        persons = new ArrayList<>();
        persons.add("Ajay Kumar");
        persons.add("Radhe Syam");
        persons.add("Arun Kumar");
        persons.add("Amit Kumar");
        persons.add("Sachin Kapoor");
        persons.add("Beka Madanbekov");
        persons.add("Leonardo Di Kaprio");
        persons.add("James Bond");
        persons.add("Bradd Pit");
        persons.add("Tom Cruze");
        persons.add("Robert Thomas");

    }
}