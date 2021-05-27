package com.example.project5_mikhsangumanof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SecondGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_grid);
        ImageView imageView = findViewById(R.id.selectedImage);

        imageView.setImageResource(getIntent().getIntExtra("image",0));
    }
}
