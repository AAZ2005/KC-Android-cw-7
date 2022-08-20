package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Items> itemsArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     Items cheese = new Items("cheese", R.drawable.cheese,2.0);
     Items chocolate = new Items("chocolate",R.drawable.chocolate,3.5);

     Items coffee = new Items("coffee",R.drawable.coffee,5.0);
     Items donut = new Items("chocolate",R.drawable.donut,4.5);

     Items fries = new Items("chocolate",R.drawable.fries,2.5);
     Items me = new Items("honey",R.drawable.honey,6.0);

        itemsArrayList.add(cheese);
        itemsArrayList.add(chocolate);

        itemsArrayList.add(coffee);
        itemsArrayList.add(donut);

        itemsArrayList.add(fries);
        itemsArrayList.add(me);

        ItemAdapter itemAdapter = new ItemAdapter(this,0,itemsArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemAdapter);
    }
}