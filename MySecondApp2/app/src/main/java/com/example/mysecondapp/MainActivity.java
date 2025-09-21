package com.example.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtHello, txtJgnklik;
    Button btnUbah, btnTetap, btnReset;
    String[] kalimatRandom = {
            "HAY TAYO",
            "ALAMAWG",
            "OPSEEHHH",
            "MengSHIBALKAN",
            "IYH",
            "DIEM DIG",
            "XiXIXI",
            "RAWR",
            "Aduhaaii"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello = findViewById(R.id.txtHello);
        btnUbah = findViewById(R.id.btnUbah);
        btnTetap = findViewById(R.id.btnTetap);
        btnReset = findViewById(R.id.btnReset);
        txtJgnklik = findViewById(R.id.txtJgnklik);

        btnUbah.setOnClickListener(new View.OnClickListener() {
            boolean clicked = false;

            @Override
            public void onClick(View v) {
                if (!clicked){
                    int indexRandom = (int)(Math.random() * kalimatRandom.length);
                    txtHello.setText(kalimatRandom[indexRandom]);
                    txtHello.setTextColor(getResources().getColor(R.color.pink));
                    Toast.makeText(MainActivity.this, "Teks Berubah YEY!", Toast.LENGTH_SHORT).show();
                    clicked = true;
                } else {
                    int indexRandom = (int)(Math.random() * kalimatRandom.length);
                    txtHello.setText(kalimatRandom[indexRandom]);
                    txtHello.setTextColor(Color.parseColor("#000000"));
                    Toast.makeText(MainActivity.this, "Teks Berubah YEY!", Toast.LENGTH_SHORT).show();
                    clicked = false;
                }
            }
        });
        btnTetap.setOnClickListener(new View.OnClickListener() {
            boolean clicked = false;

            @Override
            public void onClick(View v) {
                if (!clicked) {
                    txtJgnklik.setText("Kan dah dibilang jangan diklik");
                    txtJgnklik.setTextColor(getResources().getColor(R.color.merah));
                    txtJgnklik.setTypeface(null, Typeface.BOLD);
                    txtJgnklik.setTextSize(25);
                    Toast.makeText(MainActivity.this, "Teks Berubah YEY!", Toast.LENGTH_SHORT).show();
                    clicked = true;
                } else {
                    txtJgnklik.setText("Jangan coba coba");
                    txtJgnklik.setTextColor(Color.parseColor("#000000"));
                    txtJgnklik.setTypeface(null, Typeface.NORMAL);
                    txtJgnklik.setTextSize(15);
                    Toast.makeText(MainActivity.this, "Teks Berubah YEY!", Toast.LENGTH_SHORT).show();
                    clicked = false;
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    txtHello.setText("Hello Mijann dari Java Android!");
                    txtHello.setTextColor(Color.parseColor("#000000"));
                    txtJgnklik.setText("Jangan coba coba");
                    txtJgnklik.setTextSize(15);
                    txtJgnklik.setTextColor(Color.parseColor("#000000"));
                    txtJgnklik.setTypeface(null, Typeface.NORMAL);
                    Toast.makeText(MainActivity.this, "Direset.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}