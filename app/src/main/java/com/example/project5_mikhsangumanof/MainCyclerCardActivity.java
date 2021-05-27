package com.example.project5_mikhsangumanof;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainCyclerCardActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Toolbar toolbar;
    List<ProductStoreData> dataList;
    ProductStoreData storeData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cycler_card);
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerview2);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setTitle(getResources().getString(R.string.app_name));
        }

        dataList = new ArrayList<>();

        storeData = new ProductStoreData(R.drawable.ayambakar,"Ayam Bakar",getString(R.string.Descayambakar));
        dataList.add(storeData);
        storeData = new ProductStoreData(R.drawable.ayamkrispi,"Ayam Krispi",getString(R.string.Descayamkrispi));
        dataList.add(storeData);
        storeData = new ProductStoreData(R.drawable.baksogulung,"Bakso Gulung",getString(R.string.Descbaksogulung));
        dataList.add(storeData);
        storeData = new ProductStoreData(R.drawable.chips,"Chips",getString(R.string.Descchips));
        dataList.add(storeData);
        storeData = new ProductStoreData(R.drawable.kebab,"Kebab",getString(R.string.Desckebab));
        dataList.add(storeData);
        storeData = new ProductStoreData(R.drawable.soto,"Soto",getString(R.string.Descsoto));
        dataList.add(storeData);
        storeData = new ProductStoreData(R.drawable.steak,"Steak",getString(R.string.Descsteak));
        dataList.add(storeData);
        storeData = new ProductStoreData(R.drawable.sup,"Sup",getString(R.string.Descsup));
        dataList.add(storeData);

        RecyclerCardAdapter adapter = new RecyclerCardAdapter(this, dataList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }
}
