package com.example.articlelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Articles extends AppCompatActivity {

    public static final String EXTRA_ARTICLE = "com.example.android.articlelist.extra.ARTICLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);
    }
}
