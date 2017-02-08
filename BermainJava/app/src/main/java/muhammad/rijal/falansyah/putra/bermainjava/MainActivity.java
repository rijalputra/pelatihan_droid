package muhammad.rijal.falansyah.putra.bermainjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String theText;
    TextView showtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showtext= (TextView) findViewById(R.id.show_text);

        theText="Aplikasi percobaan java android";
        addseparator();
        theText+="Aplikasi yang dibuat di android mengguakan java";
        addseparator();
        addseparator();
        addseparator();
        showtext.setText(theText);

    }

    private void addseparator(){
        this.theText+=("\n-------------------------\n");
    }
}
