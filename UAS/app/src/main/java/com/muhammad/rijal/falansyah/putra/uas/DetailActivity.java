package com.muhammad.rijal.falansyah.putra.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Transaksi transaksi = (Transaksi) intent.getSerializableExtra("penjualan detail");

        ((TextView)findViewById(R.id.det_kode)).setText(transaksi.kode);
        ((TextView)findViewById(R.id.det_jenis)).setText(transaksi.getJenis());
        ((TextView)findViewById(R.id.det_harga)).setText(Integer.toString(transaksi.harga));
        ((TextView)findViewById(R.id.det_jumlah)).setText(Integer.toString(transaksi.jumlah));
        ((TextView)findViewById(R.id.det_total)).setText(Integer.toString(transaksi.total));
    }
}
