package com.example.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView txtHello, txtJgnklik;
    Button btnUbah, btnTetap, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello = findViewById(R.id.txtHello);
        btnUbah = findViewById(R.id.btnUbah);
        btnTetap = findViewById(R.id.btnTetap);
        txtJgnklik = findViewById(R.id.txtJgnklik);

        btnUbah.setOnClickListener(new View.OnClickListener() {
            boolean clicked = false;

            @Override
            public void onClick(View v) {
                if (!clicked){
                    txtHello.setText("Teks berhasil diubah!");
                    txtHello.setTextColor(Color.parseColor("#008000"));
                    clicked = true;
                } else {
                    txtHello.setText("Hello Mijann dari Java Android!");
                    txtHello.setTextColor(Color.parseColor("#000000"));
                    clicked = false;
                }
            });
        }
        btnTetap.setOnClickListener(new View.OnClickListener() {
            boolean clicked = false;

            @Override
            public void onClick(View v) {
                if (!clicked) {
                    txtJgnklik.setText("Kan dah dibilang jangan diklik");
                    txtJgnklik.setTextColor(Color.parseColor("#ff0021"));
                    txtJgnklik.setTypeface(null, Typeface.BOLD);
                    txtJgnklik.setTextSize(25);
                    clicked = true;
                } else {
                    txtJgnklik.setText("Jangan coba coba");
                    txtJgnklik.setTextColor(Color.parseColor("#000000"));
                    txtJgnklik.setTypeface(null, Typeface.NORMAL);
                    txtJgnklik.setTextSize(15);
                    clicked = false;
                }
            }
        });
    }
}