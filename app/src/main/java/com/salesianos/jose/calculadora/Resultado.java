package com.salesianos.jose.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    //Declaramos las variables
    private TextView mTexto = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Rellenamos variable
        mTexto = (TextView) findViewById(R.id.texto);

        //Recogemos datos de actividad 1
        Intent mIntent = getIntent();
        int mNum1 = mIntent.getIntExtra("num1", 0);
        int mNum2 = mIntent.getIntExtra("num2", 0);
        String signo = mIntent.getStringExtra("signo");
        float suma = mNum1 + mNum2;
        float resta = mNum1 - mNum2;

        //Cambiamos el tamaño en función a la longitud de los números
        if (mNum1 > 9 || mNum2 > 9 || suma > 9 || resta > 9)
            mTexto.setTextSize(40);
        else if (mNum1 > 99 || mNum2 > 99 || suma > 99 || resta > 99)
            mTexto.setTextSize(20);

        //Definimos texto
        if (signo.equalsIgnoreCase("+"))
            mTexto.setText(mNum1 + " " + signo + " " + mNum2 + " = " + suma);
        else if (signo.equalsIgnoreCase("-"))
            mTexto.setText(mNum1 + " " + signo + " " + mNum2 + " = " + resta);



    }
}
