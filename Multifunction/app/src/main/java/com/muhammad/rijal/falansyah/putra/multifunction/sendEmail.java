package com.muhammad.rijal.falansyah.putra.multifunction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class sendEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
    }

    public void sendEmail (View view)
    {
        EditText txtPenerima=(EditText) findViewById(R.id.penerima);
        EditText txtJudul=(EditText) findViewById(R.id.judul);
        EditText txtKonten=(EditText) findViewById(R.id.konten);

        Intent emailIntent=new Intent(Intent.ACTION_SEND);
    }
}
