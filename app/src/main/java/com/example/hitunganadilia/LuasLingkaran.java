package com.example.hitunganadilia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LuasLingkaran extends AppCompatActivity {
    EditText edJari, edHasil;
    Button btnLingkaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);
        edJari = findViewById(R.id.edJari);
        edHasil = findViewById(R.id.edHasil);
        btnLingkaran = findViewById(R.id.btnLingkaran);
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Jari = Double.parseDouble(edJari.getText().toString());
                double Hasil = 2*3.14*Jari;
                edHasil.setText(""+ Hasil);
            }
        });

    }
}