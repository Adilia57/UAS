package com.example.hitunganadilia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LuasPersegi extends AppCompatActivity {
    EditText edPanjang, edLebar, edLuas;
    Button btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        edPanjang = findViewById(R.id.edPanjang);
        edLebar = findViewById(R.id.edLebar);
        edLuas = findViewById(R.id.edLuas);
        btHitung = findViewById(R.id.btnHitung);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double panjang = Double.parseDouble(edPanjang.getText().toString());
                double lebar = Double.parseDouble(edLebar.getText().toString());
                double luas = panjang * lebar;
                edLuas.setText(""+ luas);
            }
        });
    }
}