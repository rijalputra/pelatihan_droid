package com.muhammad.rijal.falansyah.putra.uas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by D2J-00 on 13/02/2017.
 */
public class TransaksiHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "uas.db";
    public static final int DB_VERSION = 3;

    SQLiteDatabase db;

    public TransaksiHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Transaksi.SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Transaksi.SQL_DELETE);
        onCreate(db);
    }

    public void insertTransaksi(String nama, int jenis, int jumlah, int total, int harga){
        db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Transaksi.COL_KODE, nama);
        values.put(Transaksi.COL_MERK, jenis);
        values.put(Transaksi.COL_JUMLAH, jumlah);
        values.put(Transaksi.COL_TOTAL, total);
        values.put(Transaksi.COL_HARGA, harga);
        db.insert(Transaksi.TABLE_NAME,null ,values);
    }

    public List<Transaksi>getTransaksi() {
        db = getReadableDatabase();
        List<Transaksi> transaksi = new ArrayList<>();
        String[] projection = {Transaksi._ID,Transaksi.COL_KODE,Transaksi.COL_MERK,Transaksi.COL_JUMLAH,Transaksi.COL_TOTAL,Transaksi.COL_HARGA};
        String sortOrder = Transaksi._ID;

        Cursor cursor = db.query(Transaksi.TABLE_NAME,projection,null,null,null,null,sortOrder);
        Transaksi newTrans;
        while (cursor.moveToNext()) {
            newTrans = new Transaksi(
                    cursor.getString(cursor.getColumnIndex(Transaksi.COL_KODE)),
                    cursor.getInt(cursor.getColumnIndex(Transaksi.COL_MERK)),
                    cursor.getInt(cursor.getColumnIndex(Transaksi.COL_JUMLAH)),
                    cursor.getInt(cursor.getColumnIndex(Transaksi.COL_TOTAL)),
                    cursor.getInt(cursor.getColumnIndex(Transaksi.COL_HARGA))
            );
            transaksi.add(newTrans);
        }
        cursor.close();
        return transaksi;
    }
}
