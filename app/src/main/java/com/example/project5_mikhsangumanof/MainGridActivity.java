package com.example.project5_mikhsangumanof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainGridActivity extends AppCompatActivity {
    int imageList[] = {R.drawable.java,R.drawable.php,R.drawable.c,R.drawable.cplus,R.drawable.ere,R.drawable.ide,R.drawable.sata,
    R.drawable.tes,R.drawable.ture,R.drawable.two};
    GridView simpleGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);
        simpleGrid = findViewById(R.id.simpleGridView);

        GridAdapter adapter = new GridAdapter(getApplicationContext(), imageList);
        simpleGrid.setAdapter(adapter);

        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainGridActivity.this, SecondGridActivity.class);
                intent.putExtra("image",imageList[position]);
                startActivity(intent);
            }
        });
    }
}
