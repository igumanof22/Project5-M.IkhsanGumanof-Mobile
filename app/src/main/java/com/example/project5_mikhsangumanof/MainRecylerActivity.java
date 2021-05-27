package com.example.project5_mikhsangumanof;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainRecylerActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recyler);
        recyclerView = findViewById(R.id.recyclerView);

        ListDataMenu[] listDataMenu = new ListDataMenu[]{
                new ListDataMenu("Gambar 1",R.drawable.satu),
                new ListDataMenu("Gambar 2",R.drawable.dua),
                new ListDataMenu("Gambar 3",R.drawable.tiga),
                new ListDataMenu("Gambar 4",R.drawable.empat),
                new ListDataMenu("Gambar 5",R.drawable.lima),
                new ListDataMenu("Gambar 6",R.drawable.enam),
                new ListDataMenu("Gambar 7",R.drawable.tujuh),
                new ListDataMenu("Gambar 8",R.drawable.delpaan),
                new ListDataMenu("Gambar 9",R.drawable.sembilan),
                new ListDataMenu("Gambar 10",R.drawable.sepuluh),
                new ListDataMenu("Gambar 11",R.drawable.sebelas),
                new ListDataMenu("Gambar 12",R.drawable.two)
        };

        ListMenuAdapter adapter  = new ListMenuAdapter(listDataMenu);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
