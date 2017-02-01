package muhammad.rijal.falansyah.putra.a2_javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showstring;
    public TextView showtext;
    public barang[] arrbarang=new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showtext =(TextView) findViewById(R.id.show_text);

        showstring="Manipulasi class java android";
        addseparator();

        initbarang();
<<<<<<< HEAD
        showstring+=arrbarang[5].toString();
        addseparator();
        showstring+=arrbarang[1].toString();
=======
    //    showstring+=arrbarang[5].toString();
     //   addseparator();
  //      showstring+=arrbarang[1].toString();

        transaksi trans1=new transaksi();
        trans1.addBarang(arrbarang[3]);
        trans1.addBarang(arrbarang[7]);
        trans1.addBarang(arrbarang[1]);
        trans1.addBarang(arrbarang[2]);
        showstring+=trans1.printTransaksi();
        showstring+="Rata-rata barang yang dibeli adalah : "+trans1.averageTransaksi();
        showstring+="\n"+trans1.maxBarang();
>>>>>>> Pertemuan 3
        showtext.setText(showstring);
    }

    public void addseparator(){
        showstring+="\n------------------------------------\n";
    }

    public void initbarang(){
        arrbarang [0]=new barang("Laptop",barang.elektronik,7000000);
        arrbarang [1]=new barang("Printer",barang.elektronik,2500000);
        arrbarang [2]=new barang("Monitor",barang.elektronik,1500000);
        arrbarang [3]=new barang("Scanner",barang.elektronik,1000000);
        arrbarang [4]=new barang("Meja",barang.non_elektronik,1500000);
        arrbarang [5]=new barang("Kursi",barang.non_elektronik,7000000);
        arrbarang [6]=new barang("Lemari",barang.non_elektronik,2000000);
        arrbarang [7]=new barang("Handphone",barang.elektronik,5000000);
        arrbarang [8]=new barang("Softcase",barang.non_elektronik,750000);
        arrbarang [9]=new barang("Sound system",barang.elektronik,5500000);
    }
}
