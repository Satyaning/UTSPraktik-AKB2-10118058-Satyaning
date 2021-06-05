package com.example.utspraktik_akb2_10118058_satyaningandaru;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
/**
 * NIM: 10118058
 * Nama: Satyaning Andaru Bawalaksana
 * Kelas: IF-2
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next(View view) {
        Intent intent = new Intent(this, CekKembaliIsian.class);
        startActivity(intent);
    }
}