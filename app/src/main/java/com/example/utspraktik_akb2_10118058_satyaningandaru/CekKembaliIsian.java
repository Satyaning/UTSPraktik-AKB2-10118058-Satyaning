package com.example.utspraktik_akb2_10118058_satyaningandaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * NIM: 10118058
 * Nama: Satyaning Andaru Bawalaksana
 * Kelas: IF-2
 */

public class CekKembaliIsian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_kembali_isian);
    }
    public void next(View view) {
        Intent intent = new Intent(this, FormBerhasil.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}