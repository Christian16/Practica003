package com.hermesis.christian.practica003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtNum2;
    TextView txtResultado;
    RadioButton radioSuma, radioResta;
    Button botonOperacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1= (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);

        radioSuma = (RadioButton) findViewById(R.id.radioSuma);
        radioResta = (RadioButton) findViewById(R.id.radioResta);

        botonOperacion = (Button) findViewById(R.id.botonOperacion);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        botonOperacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultado = 0;
                int num1 = Integer.parseInt(txtNum1.getText().toString());
                int num2 = Integer.parseInt(txtNum2.getText().toString());
                if (radioSuma.isChecked())
                    resultado = num1 + num2;
                else
                    resultado = num1 - num2;
                txtResultado.setText("El resultado es " + resultado);
            }
        });

    }
}
