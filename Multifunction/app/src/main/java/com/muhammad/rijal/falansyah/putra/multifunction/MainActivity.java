package com.muhammad.rijal.falansyah.putra.multifunction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA="bakhtiaryus.multifunction.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMessage(View view){
    Intent inten = new Intent(this, ShowMessage.class);
        TextView txtMessage = (TextView) findViewById(R.id.txt_message);
        inten.putExtra(EXTRA, txtMessage.getText().toString());
        startActivity(inten);
    }

    public void openBrowser(View view){
    Intent intent = new Intent(this, IntenExecutor.class);
        intent.putExtra(EXTRA,"Browser");
        startActivity(intent);

    }

    public void openPhone(View view){
        Intent intent = new Intent(this, IntenExecutor.class);
        intent.putExtra(EXTRA,"Phone");
        startActivity(intent);
    }
    public void openMap(View view){
        Intent intent = new Intent(this, IntenExecutor.class);
        intent.putExtra(EXTRA,"Map");
        startActivity(intent);
    }

}
