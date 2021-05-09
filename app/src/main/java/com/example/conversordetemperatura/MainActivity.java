package com.example.conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText temperatura;
    Button botaoConverter;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temperatura = (EditText) findViewById(R.id.editTextTextPersonName3);
        botaoConverter = (Button) findViewById(R.id.button);
        resultado = (TextView) findViewById(R.id.textView);

        botaoConverter.setOnClickListener(v->{
            double tempC = Double.parseDouble(temperatura.getText().toString());
            double tempF = tempC * 1.8 + 32;
            resultado.setText("Temperatura em Fahrenheit = " + String.valueOf(tempF));
        });
    }
}