package com.example.sample19_adapterview_exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<CustomDTO> list = new ArrayList<>();
        list.add(new CustomDTO(R.drawable.canada,"캐나다","@@"));
        list.add(new CustomDTO(R.drawable.france,"프랑스","@@"));
        list.add(new CustomDTO(R.drawable.korea,"한국","@@"));
        list.add(new CustomDTO(R.drawable.mexico,"멕시코","@@"));
        list.add(new CustomDTO(R.drawable.poland,"폴란드","@@"));

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(),R.layout.list_row,list);
         recyclerView.setAdapter(adapter);


    }
}
