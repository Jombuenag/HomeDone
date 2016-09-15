package com.example.taku.homedone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Entrada extends Activity implements View.OnClickListener {


    Button btnVolver;
    Button btnCocina;
    Button btnSalon;
    Button btnDormitorio;
    Button btnBaño;
    TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);
        btnVolver = (Button) findViewById(R.id.btnVolver);
        btnCocina = (Button) findViewById(R.id.btnCocina);
        btnSalon = (Button) findViewById(R.id.btnSalon);
        btnDormitorio = (Button) findViewById(R.id.btnDormitorio);
        btnBaño = (Button) findViewById(R.id.btnBaño);
        txtSaludo = (TextView) findViewById(R.id.txtSaludo);

        final Intent iEntrada = new Intent(getApplicationContext(), Entrada.class);

        btnVolver.setOnClickListener(this);
        btnCocina.setOnClickListener(this);
        btnSalon.setOnClickListener(this);
        btnDormitorio.setOnClickListener(this);
        btnBaño.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnVolver:
                finish();
                break;
            case R.id.btnCocina :
                Intent iCocina = new Intent(getApplicationContext(), Cocina.class);
                startActivity(iCocina);
                finish();
                break;
            case R.id.btnSalon :
                Intent iSalon = new Intent(getApplicationContext(), Salon.class);
                startActivity(iSalon);
                finish();
                break;
            case R.id.btnDormitorio :
                Intent iDormitorio = new Intent(getApplicationContext(), Dormitorio.class);
                startActivity(iDormitorio);
                finish();
                break;
            case R.id.btnBaño :
                Intent iBaño = new Intent(getApplicationContext(), Servicio.class);
                startActivity(iBaño);
                finish();
                break;
        }
    }
}
