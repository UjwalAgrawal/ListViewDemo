package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = findViewById(R.id.myListView);
        final ArrayList<String> friends = new ArrayList<>();
        friends.add("Raju");
        friends.add("Shyam");
        friends.add("Baburao");
        friends.add("Tiwari seth");
        ArrayAdapter<String> friendsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, friends);
        myListView.setAdapter(friendsAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Person selected is " + friends.get(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
}