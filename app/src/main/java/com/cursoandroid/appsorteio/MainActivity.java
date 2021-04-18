package com.cursoandroid.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {
        n = rand.nextInt(11);
        TextView resultado = findViewById(R.id.resultado);
        resultado.setText("O número sorteado: " + n);
    }
}