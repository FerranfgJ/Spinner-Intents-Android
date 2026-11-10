package com.example.correu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText nom = findViewById(R.id.nom);
        EditText correu = findViewById(R.id.correu);
        Spinner tipusCons = findViewById(R.id.consulta);
        EditText missatge = findViewById(R.id.body);
        Button btn = findViewById(R.id.envia);
        CheckBox cop = findViewById(R.id.copia);

        Map<String, String> prefixos = Map.of("Consulta", "Tinc una consulta","asistencia", "Necessito assistencia");

        btn.setOnClickListener(v->{
            String correuEt = correu.getText().toString();
            String tipusConsSP = tipusCons.getSelectedItem().toString();
            String missatgeEt = missatge.getText().toString();

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"e.oarnabatd@ies-sabadell.cat"});
            intent.putExtra(Intent.EXTRA_SUBJECT, prefixos.get(tipusConsSP));
            intent.putExtra(Intent.EXTRA_TEXT, missatgeEt);
            Intent intentt = Intent.createChooser(intent, null);


            if (cop.isChecked()){
                intent.putExtra(Intent.EXTRA_CC, new String[]{correuEt});
            }

            for (int i = 0; i < 10; i++) {
                startActivity(intentt);
            }

        });


    }
}