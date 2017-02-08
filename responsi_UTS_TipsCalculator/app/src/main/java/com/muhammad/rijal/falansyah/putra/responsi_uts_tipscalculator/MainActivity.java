package com.muhammad.rijal.falansyah.putra.responsi_uts_tipscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view)
    {
        EditText inp1 = (EditText) findViewById(R.id.input1);
        EditText inp2 = (EditText) findViewById(R.id.input2);
        EditText inp3 = (EditText) findViewById(R.id.input3);
        TextView hsl = (TextView) findViewById(R.id.result);

        double tagihan,tip,jmlorg,tip2,total,org2;
        tagihan=Double.parseDouble(inp1.getText().toString());
        tip=Double.parseDouble(inp2.getText().toString());
        jmlorg=Double.parseDouble(inp3.getText().toString());

        tip2=tagihan*tip/100;
        total=tagihan+tip2;
        org2=total/jmlorg;

        hsl.setText("Tips      :"+Double.toString(tip2)+"\n"+
                    "Total     :"+Double.toString(total)+"\n"+
                    "Per Orang :"+Double.toString(org2));
    }
}
