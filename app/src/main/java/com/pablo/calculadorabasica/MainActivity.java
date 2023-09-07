package com.pablo.calculadorabasica;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText val1,val2;
    Button BtnSumar, BtnRestar, BtnDividir, BtnMultiplicar;

    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        val1 = findViewById(R.id.primerval);
        val2 = findViewById(R.id.segundoval);
        BtnSumar = findViewById(R.id.btn_sumar);
        BtnRestar = findViewById(R.id.btn_restar);
        BtnDividir= findViewById(R.id.btn_dividir);
        BtnMultiplicar = findViewById(R.id.btn_multiplicar);
        resultado = findViewById(R.id.txt_resultado);

    }
    public void sumar(View view){
        String primerval = val1.getText().toString();
        String segundoval = val2.getText().toString();
        double v1 = Double.parseDouble(primerval);
        double v2 = Double.parseDouble(segundoval);
        resultado.setText("" + (v1+v2));



    }
    public void restar(View view){
        String primerval = val1.getText().toString();
        String segundoval = val2.getText().toString();
        double v1 = Double.parseDouble(primerval);
        double v2 = Double.parseDouble(segundoval);
        resultado.setText("" + (v1-v2));



    }
    public void multiplicar(View view){
        String primerval = val1.getText().toString();
        String segundoval = val2.getText().toString();
        double v1 = Double.parseDouble(primerval);
        double v2 = Double.parseDouble(segundoval);
        resultado.setText("" + (v1*v2));



    }

    public void dividir(View view){
        String primerval = val1.getText().toString();
        String segundoval = val2.getText().toString();
        double v1 = Double.parseDouble(primerval);
        double v2 = Double.parseDouble(segundoval);
        resultado.setText("" + (v1/v2));



    }

    public void resetear(View view){
        val1.setText(null);
        val2.setText(null);
        resultado.setText(null);



    }




}
