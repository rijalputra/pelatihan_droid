package com.rijal.muhammad.falansyah.putra.uts_a22201502454;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void calculate(View view) {
        EditText inp1 = (EditText) findViewById(R.id.input1);
        EditText inp2 = (EditText) findViewById(R.id.input2);
        EditText inp3 = (EditText) findViewById(R.id.input3);
        EditText inp4 = (EditText) findViewById(R.id.input4);
        EditText inp5 = (EditText) findViewById(R.id.input5);

        double inp11, inp111, inp22, inp222, inp33, inp333, inp44, inp444, inp55, inp555, tot;
        inp11 = Double.parseDouble(inp1.getText().toString());
        inp22 = Double.parseDouble(inp2.getText().toString());
        inp33 = Double.parseDouble(inp3.getText().toString());
        inp44 = Double.parseDouble(inp4.getText().toString());
        inp55 = Double.parseDouble(inp5.getText().toString());

        inp111 = inp11 * 1400000;
        inp222 = inp22 * 1300000;
        inp333 = inp33 * 2100000;
        inp444 = inp44 * 2250000;
        inp555 = inp55 * 5200000;
        tot = inp111 + inp222 + inp333 + inp444 + inp555;

        String result = "";
        result = ("Lenovo A6600\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + inp11 + "\t\t" + Double.toString(inp111) + "\n");
        result += ("Lenovo Vibe C\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + inp22 + "\t\t" + Double.toString(inp222) + "\n");
        result += ("Lenovo A7700\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + inp33 + "\t\t" + Double.toString(inp333) + "\n");
        result += ("Lenovo K5 Note\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + inp44 + "\t\t" + Double.toString(inp444) + "\n");
        result += ("Lenovo Zuk Z2\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + inp55 + "\t\t" + Double.toString(inp555) + "\n");
        result += ("______________________________________________________\n");
        result += ("Total pembelian\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + Double.toString(tot) + "\n");

        Intent intent = new Intent(getApplicationContext(), UTS_A221502454.class);

        //Menambahkan bundle intent
        intent.putExtra("com.rijal.muhammad.falansyah.putra.uts_a22201502454",result);

        //memulai Activity kedua
        startActivity(intent);
    }
}
