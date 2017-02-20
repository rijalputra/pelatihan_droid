package com.muhammad.rijal.falansyah.putra.uas;

import android.provider.BaseColumns;

import java.io.Serializable;

/**
 * Created by D2J-00 on 13/02/2017.
 */
public class Transaksi implements BaseColumns,Serializable{
    public String kode; // nama transaksi
    public int jenis; // 1=pemasukkan 2= pengeluaran
    public int jumlah;
    public int total;
    public int harga;

    public Transaksi(String kode, int jenis, int jumlah, int total, int harga) {
        this.kode = kode;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.total = total;
        this.harga=harga;
    }

    public String getJenis() {
        if (this.jenis == 1) {
            return "Lenovo A6600";
        } else if (this.jenis == 2) {
            return "Lenovo Vibe C";
        } else if (this.jenis == 3) {
            return "Lenovo A7000 Turbo";
        } else if (this.jenis == 4) {
            return "Lenovo K5 Note";
        } else if (this.jenis == 5) {
            return "Lenovo Zuk Z2 Pro";
        } else if (this.jenis == 6) {
            return "Lenovo A7700";
        } else if (this.jenis == 7) {
            return "Lenovo Lemon 3";
        } else if (this.jenis == 8) {
            return "Lenovo K4 Note";
        } else if (this.jenis == 9)
            return "Lenovo Vibe P1 Turbo";
            return "Lenovo A1000";

    }

    @Override
    public String toString(){
        return this.kode+" - "+this.getJenis()+" : "+this.jumlah;
    }

    /* informasi properti tabel */
    public static final String TABLE_NAME = "penjualan";
    public static final String COL_KODE = "kode";
    public static final String COL_MERK = "merk";
    public static final String COL_HARGA = "harga";
    public static final String COL_JUMLAH = "jumlah";
    public static final String COL_TOTAL = "total";

    /*query pembuatan dan penghapusan tabel */
    public static final String SQL_CREATE = "create table "+TABLE_NAME
            +" ("+_ID+" integer primary_key,"
            +" "+COL_KODE+" text,"
            +" "+COL_MERK+" integer,"
            +" "+COL_HARGA+" integer,"
            +" "+COL_JUMLAH+" integer,"
            +" "+COL_TOTAL+" integer)";
    public static final String SQL_DELETE = "drop table if exists "+TABLE_NAME;
}
