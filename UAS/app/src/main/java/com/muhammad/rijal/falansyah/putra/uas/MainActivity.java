package com.muhammad.rijal.falansyah.putra.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void lihat_data(View view)
    {
        Intent intent = new Intent(this, LihatData.class);
        startActivity(intent);
    }
    public void jual(View view)
    {
        Intent intent = new Intent(this, Jual.class);
        startActivity(intent);
    }

    public void List_Harga(View view)
    {
        Intent intent = new Intent(this, ListHarga.class);
        startActivity(intent);
    }

}
