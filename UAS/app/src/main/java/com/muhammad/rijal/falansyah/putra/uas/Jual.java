package com.muhammad.rijal.falansyah.putra.uas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Jual extends AppCompatActivity {
    private String [] jenisnama = {"Lenovo A6600","Lenovo Vibe C","Lenovo A7000 Turbo","Lenovo K5 Note","Lenovo Zuk Z2 Pro"
            ,"Lenovo A7700","Lenovo Lemon 3","Lenovo K4 Note","Lenovo Vibe P1 Turbo","Lenovo A1000"};
    private EditText kode,jumlah,total,harga;
    private Spinner jenis;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jual);
        jenis = (Spinner) findViewById(R.id.jenis);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,jenisnama);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jenis.setAdapter(adapter);

        kode = (EditText)findViewById(R.id.kode);
        jumlah = (EditText)findViewById(R.id.jumlah);
        total = (EditText) findViewById(R.id.total);
        harga = (EditText) findViewById(R.id.harga);
    }

    public void hitung_total()
    {
        jenis = (Spinner) findViewById(R.id.jenis);
        jumlah = (EditText)findViewById(R.id.jumlah);
        total = (EditText) findViewById(R.id.total);
        int result=0;
        double jumlahh;
        jumlahh=Double.parseDouble(jumlah.getText().toString());

        if(jenis.getSelectedItem()=="Lenovo A6600")
        {

            result+=jumlahh*1400000;
        }
        else if(jenis.getSelectedItem()=="Lenovo Vibe C")
        {

            result+=jumlahh*1300000;
        }
        else if(jenis.getSelectedItem()=="Lenovo A7000 Turbo")
        {

            result+=jumlahh*2100000;
        }
        else if(jenis.getSelectedItem()=="Lenovo K5 Note")
        {

            result+=jumlahh*2250000;
        }
        else if(jenis.getSelectedItem()=="Lenovo Zuk Z2 Pro")
        {

            result+=jumlahh*5200000;
        }
        else if(jenis.getSelectedItem()=="Lenovo A7700")
        {

            result+=jumlahh*1600000;
        }
        else if(jenis.getSelectedItem()=="Lenovo Lemon 3")
        {

            result+=jumlahh*1500000;
        }
        else if(jenis.getSelectedItem()=="Lenovo K4 Note")
        {

            result+=jumlahh*2500000;
        }
        else if(jenis.getSelectedItem()=="Lenovo Vibe P1 Turbo")
        {

            result+=jumlahh*3900000;
        }
        else

            result+=jumlahh*1400000;

            EditText tot= (EditText) findViewById(R.id.total);
            tot.setText(Integer.toString(result));

    }

    public void view_harga()
    {
        jenis = (Spinner) findViewById(R.id.jenis);

        int hargaa;
        if(jenis.getSelectedItem()=="Lenovo A6600")
        {
            hargaa=1400000;

        }
        else if(jenis.getSelectedItem()=="Lenovo Vibe C")
        {
            hargaa=1300000;

        }
        else if(jenis.getSelectedItem()=="Lenovo A7000 Turbo")
        {
            hargaa=2100000;

        }
        else if(jenis.getSelectedItem()=="Lenovo K5 Note")
        {
            hargaa=2250000;

        }
        else if(jenis.getSelectedItem()=="Lenovo Zuk Z2 Pro")
        {
            hargaa=5200000;

        }
        else if(jenis.getSelectedItem()=="Lenovo A7700")
        {
            hargaa=1600000;
        }
        else if(jenis.getSelectedItem()=="Lenovo Lemon 3")
        {
            hargaa=1500000;

        }
        else if(jenis.getSelectedItem()=="Lenovo K4 Note")
        {
            hargaa=2500000;
        }
        else if(jenis.getSelectedItem()=="Lenovo Vibe P1 Turbo")
        {
            hargaa=3900000;
        }
        else
            hargaa=1400000;
        EditText hargax= (EditText) findViewById(R.id.harga);
        hargax.setText(Integer.toString(hargaa));

    }

    public void jenis(View view)
    {
       view_harga();
    }

    public void total(View view)
    {
        hitung_total();
    }
    public void tambah(View view){
        TransaksiHelper dbHelper = new TransaksiHelper(this);
        String kodee = kode.getText().toString();
        int jeniss = jenis.getSelectedItemPosition()+1;
        int jumlahh = Integer.parseInt(jumlah.getText().toString());
        int totall = Integer.parseInt(total.getText().toString());
        int hargaa = Integer.parseInt(harga.getText().toString());

        dbHelper.insertTransaksi(kodee,jeniss,jumlahh,totall,hargaa);
        Log.d("form jual",kodee+"-"+Integer.toString(jeniss)+" - "+Integer.toString(jumlahh)+" - "+Integer.toString(totall)+" - "+Integer.toString(hargaa));
        Toast.makeText(this, "Transaksi"+kodee+"Berhasil disimpan",Toast.LENGTH_SHORT).show();
        finish();
    }
}
