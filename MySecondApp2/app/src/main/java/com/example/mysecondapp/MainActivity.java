package com.example.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    TextView txtHello, txtJgnklik, teksBaru;
    Button btnUbah, btnTetap, btnReset, btnSetCustom;
    EditText inputCustom;
    LinearLayout rootLayout;
    int[] warnaRandom = {
            Color.BLUE,
            Color.GREEN,
            Color.RED,
            Color.parseColor("#FFA500")
    };
    int counter = 0;
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
        btnSetCustom = findViewById(R.id.btnSetCustom);
        inputCustom = findViewById(R.id.inputCustom);
        teksBaru = findViewById(R.id.teksBaru);
        rootLayout = findViewById(R.id.rootLayout);

        btnUbah.setOnClickListener(new View.OnClickListener() {
            boolean clicked = false;

            @Override
            public void onClick(View v) {
                int indexRandom = (int)(Math.random() * kalimatRandom.length);
                int warnaAcak = warnaRandom[(int)(Math.random()* warnaRandom.length)];
                if (!clicked){
                    rootLayout.setBackgroundColor(warnaAcak);
                    txtHello.animate().rotationBy(360).setDuration(500);
                    txtHello.setText(kalimatRandom[indexRandom]);
                    txtHello.setTextColor(warnaAcak);
                    clicked = true;
                    counter++;
                    Toast.makeText(MainActivity.this, "Jumlah klik: " + counter, Toast.LENGTH_SHORT).show();
                } else {
                    txtHello.animate().rotationBy(360).setDuration(500);
                    txtHello.setText(kalimatRandom[indexRandom]);
                    txtHello.setTextColor(Color.parseColor("#000000"));
                    clicked = false;
                    counter++;
                    Toast.makeText(MainActivity.this, "Jumlah klik: " + counter, Toast.LENGTH_SHORT).show();
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
                    clicked = true;
                    counter++;
                    Toast.makeText(MainActivity.this, "Jumlah klik: " + counter, Toast.LENGTH_SHORT).show();
                } else {
                    txtJgnklik.setText("Jangan coba coba");
                    txtJgnklik.setTextColor(Color.parseColor("#000000"));
                    txtJgnklik.setTypeface(null, Typeface.NORMAL);
                    txtJgnklik.setTextSize(15);
                    clicked = false;
                    counter++;
                    Toast.makeText(MainActivity.this, "Jumlah klik: " + counter, Toast.LENGTH_SHORT).show();
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
                    counter = 0;
                    Toast.makeText(MainActivity.this, "Semua direset.", Toast.LENGTH_SHORT).show();
            }
        });
        btnSetCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputTeks = inputCustom.getText().toString();
                if (inputTeks.length() > 10) {
                    Toast.makeText(MainActivity.this, "Teks kepanjangan!", Toast.LENGTH_SHORT).show();
                } else if (!inputTeks.isEmpty()) {
                    int indexWarna = (int)(Math.random() * warnaRandom.length);
                    teksBaru.setTextColor(warnaRandom[indexWarna]);
                    teksBaru.setText("Inputan: " + inputTeks);
                    Toast.makeText(MainActivity.this, "Teks diinput!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Inputan Kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}