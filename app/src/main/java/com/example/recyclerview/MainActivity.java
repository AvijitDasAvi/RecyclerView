package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int[] images = {
            R.drawable.bangladesh,R.drawable.argentina,R.drawable.australia,R.drawable.america,
            R.drawable.brazil,R.drawable.germany,R.drawable.india,R.drawable.portugal,R.drawable.southafrica
    };
    Adapter adapter;
    String[] title,desc;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerViewId);

        title = getResources().getStringArray(R.array.Country_Name);
        desc = getResources().getStringArray(R.array.Country_desc);

        adapter = new Adapter(this,title,desc,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
