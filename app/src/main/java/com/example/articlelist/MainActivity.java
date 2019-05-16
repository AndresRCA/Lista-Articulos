package com.example.articlelist;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView article_list;
    ArrayList<String> articles = new ArrayList<>();
    ArrayAdapter<String> article_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null) { // articles queda vacio cuando cierra la aplicacion con back
            articles = savedInstanceState.getStringArrayList("articles");
        }
        setContentView(R.layout.activity_main);
        article_list = findViewById(R.id.articleList);
        article_adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, articles);
        article_list.setAdapter(article_adapter);
    }

    @Override
    protected void onActivityResult(int request_code, int result_code, Intent data) {
    	if(request_code == 1) {
    		if(result_code == Activity.RESULT_OK) {
    			addArticle(data.getStringExtra(Articles.EXTRA_ARTICLE));
    		}
    	}
    }

    /**
     * metodo que agrega un articlo y actualiza la lista
     * @param article es el string del articulo
     */
    private void addArticle(String article) {
        articles.add(article);
        article_adapter.notifyDataSetChanged();
    }

    /**
     * metodo que inicia la actividad que contiene la lista de articulos a agregar y espera el resultado
     * @param view
     */
    public void startItemActivity(View view) {
        Intent intent = new Intent(this, Articles.class);
        startActivityForResult(intent, 1); // request_code = 1
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArrayList("articles", articles);
    }
}
