package com.example.taku.homedone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends Activity {

    EditText nomLog;
    EditText passLog;
    Button btnLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DATOS TAKU
        final String nomTest = "Taku";
        final String passTest = "1234";
        //DATOS NYM
        final String nomTestN = "Nym";
        final String passTestN = "1313";

        nomLog = (EditText)findViewById(R.id.editName);
        passLog = (EditText)findViewById(R.id.editPass);
        btnLog = (Button)findViewById(R.id.btnLogin);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nomLog.getText().toString().equalsIgnoreCase(nomTest) && passLog.getText().toString().equalsIgnoreCase(passTest)
                || nomLog.getText().toString().equalsIgnoreCase(nomTestN) && passLog.getText().toString().equalsIgnoreCase(passTestN)){
                    Toast.makeText(Main.this, "Los datos coinciden", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),Entrada.class);
                    startActivity(i);
                }else{
                    Toast.makeText(Main.this, "Los datos no coinciden", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}