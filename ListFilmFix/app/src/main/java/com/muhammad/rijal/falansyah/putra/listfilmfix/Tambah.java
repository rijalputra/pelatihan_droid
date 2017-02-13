package com.muhammad.rijal.falansyah.putra.listfilmfix;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Tambah extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String [] rating = {"5.5","6.0","6.5","7.0","7.5","8.0","8.5"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        Spinner spn_rating = (Spinner) findViewById(R.id.rating);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, rating);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn_rating.setAdapter(adapter);


    }

    public void tambah(View view)
    {
        String title = ((EditText) findViewById(R.id.judul)).getText().toString();
        int year= Integer.parseInt(((EditText) findViewById(R.id.tahun)).getText().toString());
        double rating=Double.parseDouble(((Spinner) findViewById(R.id.rating)).getSelectedItem().toString());

        String description=((EditText) findViewById(R.id.deskripsi)).getText().toString();

        Movie movie= new Movie(title, description, rating, year);

        Intent intent=new Intent();
        intent.putExtra("filmlist.result",movie);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
