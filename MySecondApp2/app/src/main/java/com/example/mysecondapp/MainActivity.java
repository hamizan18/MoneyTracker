package com.example.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputUang;
    Button btnSimpan;
    TextView txtHasil;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUang = findViewById(R.id.inputUang);
        btnSimpan = findViewById(R.id.btnSimpan);
        txtHasil = findViewById(R.id.txtHasil);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputUang.getText().toString();
                if (!input.isEmpty()) {
                    int uang = Integer.parseInt(input);
                    total += uang;
                    txtHasil.setText("Total: " + total);
                    inputUang.setText(""); // kosongkan input lagi
                }
            }
        });
    }
}