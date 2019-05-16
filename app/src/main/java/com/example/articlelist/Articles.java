package com.example.articlelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Articles extends AppCompatActivity {

    //TextViews correspondientes a los articulos
    public static final String EXTRA_MESSAGE = "android.example.articlelist1.extra.MESSAGE";
    private TextView iph;
    private TextView air;
    private TextView iphchar;
    private TextView appwat;
    private TextView s10;
    private TextView cargarsam;
    private TextView wirlesssam;
    private TextView ps4;
    private TextView conps4;
    private TextView xbox;
    private TextView conxbox;
    private TextView tv;
    private TextView jbl;
    private TextView lap;
    private TextView gar;
    private TextView hua;
    private TextView tar;
    private TextView gop;
    private TextView mac;
    private TextView asu;

    public Articles() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        iph = (TextView) findViewById(R.id.iphone);
        air = (TextView) findViewById(R.id.airpods);
        iphchar = (TextView) findViewById(R.id.cargador_iphone);
        appwat = (TextView) findViewById(R.id.apple_watch);
        s10 = (TextView) findViewById(R.id.S10);
        cargarsam = (TextView) findViewById(R.id.cargador_samsung);
        wirlesssam = (TextView) findViewById(R.id.wirelesscargador);
        ps4 = (TextView) findViewById(R.id.ps4);
        conps4 = (TextView) findViewById(R.id.controlps4);
        xbox = (TextView) findViewById(R.id.xbox);
        conxbox = (TextView) findViewById(R.id.controlxbox);
        tv = (TextView) findViewById(R.id.tv);
        jbl = (TextView) findViewById(R.id.corneta);
        lap = (TextView) findViewById(R.id.laptop);
        gar = (TextView) findViewById(R.id.garmin);
        hua = (TextView) findViewById(R.id.huawei);
        tar = (TextView) findViewById(R.id.tarjeta);
        gop = (TextView) findViewById(R.id.gopro);
        mac = (TextView) findViewById(R.id.macbook);
        asu = (TextView) findViewById(R.id.asus);
    }

    //Metodo de seleccion para cada articulo. Pasa a la actividad principal y lo muestra
    public void compraIph(View view) {
        Toast.makeText(Articles.this, "Articulo Agregado", Toast.LENGTH_SHORT).show();
        String addart1 = iph.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart1);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraAir(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart2 = air.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart2);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraIpCh(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart3 = iphchar.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart3);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraAw(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart4 = appwat.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart4);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraS10(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart5 = s10.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart5);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraCar(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart6 = cargarsam.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart6);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraWir(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart7 = wirlesssam.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart7);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraPs4(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart8 = ps4.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart8);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraConps4(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart9 = conps4.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart9);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraXbox(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart10 = xbox.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart10);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraConXb(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart11 = conxbox.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart11);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraTv(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart12 = tv.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart12);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraCor(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart13 = jbl.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart13);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraLap(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart14 = lap.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart14);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraGar(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart15 = gar.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart15);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraHua(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart16 = hua.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart16);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraTar(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart17 = tar.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart17);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraGo(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart18 = gop.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart18);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraMac(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart19 = mac.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart19);
        setResult(RESULT_OK,addintent);
        finish();
    }

    public void compraAsus(View view) {
        Toast.makeText(Articles.this,   "Artículo agregado", Toast.LENGTH_SHORT).show();
        String addart20 = asu.getText().toString();
        Intent addintent = new Intent();
        addintent.putExtra(EXTRA_MESSAGE,addart20);
        setResult(RESULT_OK,addintent);
        finish();
    }
}
