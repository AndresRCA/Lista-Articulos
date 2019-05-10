package com.example.articlelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView articleList;
    ArrayList<String> articles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        articles.add("uno");
        articles.add("dos");
        articles.add("uno");
        articles.add("dos");
        articles.add("uno");
        articles.add("dos");
        articles.add("uno");
        articles.add("dos");
        articles.add("uno");
        articles.add("dos");
        articles.add("uno");
        articles.add("dos");
        articles.add("uno");
        articles.add("dos");
        articles.add("uno");
        articles.add("dos");
        setContentView(R.layout.activity_main);
        articleList = findViewById(R.id.articleList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, articles);
        articleList.setAdapter(adapter);
    }

    /**
     * metodo que inicia la actividad que contiene la lista de articulos a agregar
     * @param view
     */
    public void startItemActivity(View view) {
        Intent intent = new Intent(this, Articles.class);
        startActivity(intent);
    }
}
