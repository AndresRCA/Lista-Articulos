package com.example.articlelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Articles extends AppCompatActivity {

    public static final String EXTRA_ARTICLE = "com.example.android.articlelist.extra.ARTICLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);
    }

    /**
     * metodo que recupera la descripcion del articulo y lo manda a la actividad principal
     * @param view vista que al que se le hizo click
     */
    public void compraArticulo(View view) {
        Toast.makeText(this, "Articulo Agregado", Toast.LENGTH_SHORT).show();
        String descripcion = view.getContentDescription().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_ARTICLE,descripcion);
        setResult(RESULT_OK,addintent);
        finish();
    }
}
