package com.example.recycleviewapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    List<Model> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler1);
        list=new ArrayList<>();
        list.add(new Model(R.drawable.img1,"Title 1"));
        list.add(new Model(R.drawable.img2,"Title 2"));
        list.add(new Model(R.drawable.img3,"Title 3"));
        list.add(new Model(R.drawable.img4,"Title 4"));
        list.add(new Model(R.drawable.img5,"Title 5"));
        list.add(new Model(R.drawable.img6,"Title 6"));
        list.add(new Model(R.drawable.img7,"Title 7"));
        list.add(new Model(R.drawable.img8,"Title 8"));
        list.add(new Model(R.drawable.img9,"Title 9"));
        list.add(new Model(R.drawable.img10,"Title 10"));
        list.add(new Model(R.drawable.img11,"Title 11"));
        list.add(new Model(R.drawable.img12,"Title 12"));


        adapter=new Adapter(MainActivity.this,list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);


    }
}