package com.rijal.muhammad.falansyah.putra.uts_a22201502454;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UTS_A221502454 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts__a221502454);

        TextView textView=(TextView) findViewById(R.id.hasil);
        Intent intent=getIntent();
        textView.setText(intent.getStringExtra("com.rijal.muhammad.falansyah.putra.uts_a22201502454"));
    }
}
