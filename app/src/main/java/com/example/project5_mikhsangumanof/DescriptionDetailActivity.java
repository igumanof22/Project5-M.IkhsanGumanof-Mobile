package com.example.project5_mikhsangumanof;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class DescriptionDetailActivity extends AppCompatActivity {
    ImageView img;
    TextView title,desc;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_detail);
        img = findViewById(R.id.detailImage);
        title = findViewById(R.id.detailTitle);
        desc = findViewById(R.id.detailDecs);
        toolbar = findViewById(R.id.tolbar1);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                toolbar.setTitle(bundle.getString("title"));
            }
            title.setText(bundle.getString("title"));
            img.setImageResource(bundle.getInt("img"));
            desc.setText(bundle.getString("desc"));
        }
    }
}
