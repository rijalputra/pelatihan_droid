package com.muhammad.rijal.falansyah.putra.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class LihatData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
    }

    protected void onResume(){
        super.onResume();

        ListView listData = (ListView) findViewById(R.id.lst1);
        TransaksiHelper dbHelper = new TransaksiHelper(this);
        final List<Transaksi> listTrans = dbHelper.getTransaksi();

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, listTrans);
        listData.setAdapter(adapter);

        int total = 0;
        for (int i = 0;i<listTrans.size();i++) {
            total += listTrans.get(i).total;
        }

        TextView txtTotal = (TextView) findViewById(R.id.txt2);
        txtTotal.setText("Total Penjualan : "+Integer.toString(total));

        listData.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?>parent, View view, int position, long id){
                Transaksi transaksi = listTrans.get(position);
                Intent intent = new Intent(parent.getContext(),DetailActivity.class);
                intent.putExtra("penjualan detail",transaksi);
                startActivity(intent);
            }
        });

    }
}
