package com.salesianos.jose.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    //Creamos los objetos
    private EditText mNum1 = null;
    private EditText mNum2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        //Damos valor a las variables.
        mNum1 = (EditText) findViewById(R.id.numOne);
        mNum2 = (EditText) findViewById(R.id.numTwo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int num1 = 0, num2 = 0;
        if (item.getItemId() == R.id.plus || item.getItemId() == R.id.minus) {
            String num1Cad = mNum1.getText().toString();
            if (TextUtils.isEmpty(num1Cad)) {
                mNum1.setError("Este campo no puede quedar vacío");
                return false;
            }
            num1 = Integer.parseInt(num1Cad);

            String num2Cad = mNum2.getText().toString();
            if (TextUtils.isEmpty(num2Cad)) {
                mNum2.setError("Este campo no puede quedar vacío");
                return false;
            }
            num2 = Integer.parseInt(num2Cad);
        }
        String signo;

        switch (item.getItemId()) {
            case R.id.plus:
                //check(num1Cad, num2Cad);
                signo = "+";
                devolver(num1, num2, signo);
                return true;
            case R.id.minus:
                //check(num1Cad, num2Cad);
                signo = "-";
                devolver(num1, num2, signo);
                return true;
            case R.id.about:
                Toast.makeText(getApplicationContext(), "Toast con cualquier mensaje", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    /*public boolean check(String num1, String num2) {
        if(TextUtils.isEmpty(num1)) {
            mNum1.setError("Este campo no puede quedar vacío");
            return false;
        }
        if(TextUtils.isEmpty(num2)) {
            mNum2.setError("Este campo no puede quedar vacío");
            return false;
        }
        return true;
    }*/

    public void devolver(int num1, int num2, String signo) {
        Intent myIntent = new Intent(this, Resultado.class);
        myIntent.putExtra("num1", num1).putExtra("num2", num2).putExtra("signo", signo);
        startActivity(myIntent);
    }

}
