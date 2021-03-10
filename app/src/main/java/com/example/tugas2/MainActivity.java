package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void move(View view) {
        Intent a = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(a);
    }

    public void pindah(View view) {
        Intent b = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(b);
    }
}