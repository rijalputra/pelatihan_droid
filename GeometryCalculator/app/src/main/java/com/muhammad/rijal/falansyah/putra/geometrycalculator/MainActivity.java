package com.muhammad.rijal.falansyah.putra.geometrycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.geometry);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.geo_operator, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView text1=(TextView) findViewById(R.id.txt1);
        TextView text2=(TextView) findViewById(R.id.txt2);
        EditText input1=(EditText) findViewById(R.id.input1);
        EditText input2=(EditText) findViewById(R.id.input2);
        TextView result=(TextView) findViewById(R.id.result);
        String operator=parent.getItemAtPosition(position).toString();
        if(operator.equalsIgnoreCase("Lingkaran"))
        {
            text1.setText("Jari-jari");
            input1.setText("");
            input2.setText("");
            result.setText("");
            input2.setEnabled(false);
            text2.setText("");
        }
        else if(operator.equalsIgnoreCase("Segitiga"))
        {
            text1.setText("Alas");
            input1.setText("");
            input2.setText("");
            result.setText("");
            input2.setEnabled(true);
            text2.setText("Tinggi");
        } else
        {
            text1.setText("Panjang");
            input1.setText("");
            input2.setText("");
            result.setText("");
            input2.setEnabled(true);
            text2.setText("Lebar");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void calculate(View view)
    {
        EditText input1=(EditText) findViewById(R.id.input1);
        EditText input2=(EditText) findViewById(R.id.input2);
        Spinner spinner=(Spinner) findViewById(R.id.geometry);
        double inp2=0,inp1=0;

        String operator=spinner.getSelectedItem().toString();
        String hasil="";
        inp1=Double.parseDouble(input1.getText().toString());
        if(input2.isEnabled())
        {
         inp2=Double.parseDouble(input2.getText().toString());
        }
        if(operator.equalsIgnoreCase("Lingkaran"))
        {
           hasil = "Luas dari lingkaran adalah : "+(Math.PI*inp1*inp1)+"\n";
           hasil += "Keliling dari lingkaran adalah : "+(Math.PI*inp1)+"\n";
        }
        else if(operator.equalsIgnoreCase("Segitiga"))
        {
            hasil = "Luas dari segitiga adalah : "+(inp1*inp2/2)+"\n";
            double phy=Math.sqrt((inp1*inp1)+(inp2*inp2));
            hasil += "Keliling dari segitiga adalah : "+(inp1+inp2+phy)+"\n";
        } else
        {
            hasil = "Luas dari persegi panjang adalah : "+(inp1*inp2)+"\n";
            hasil += "Keliling dari persegi panjang adalah : "+(2*(inp1+inp2))+"\n";
        }

        TextView result=(TextView) findViewById(R.id.result);
        result.setText(hasil);
    }
}
