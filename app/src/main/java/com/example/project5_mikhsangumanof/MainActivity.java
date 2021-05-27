package com.example.project5_mikhsangumanof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String langList[] = {"JAVA","PHP","C","C++"};
    int imageLang[] = {R.drawable.java,R.drawable.php,R.drawable.c,R.drawable.cplus};
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listView);

        ProgrammingAdapter langAdapter = new ProgrammingAdapter(getApplicationContext(), langList, imageLang);
        list.setAdapter(langAdapter);
    }
}
