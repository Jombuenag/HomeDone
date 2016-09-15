package com.example.taku.homedone;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

public class Cocina extends FragmentActivity {

    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocina);
        btnVolver = (Button)findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGoBack = new Intent(getApplicationContext(), Entrada.class);
                startActivity(iGoBack);
                finish();
            }
        });


        FragmentManager fragManager = getFragmentManager();
        FragmentTransaction fragTransaction = fragManager.beginTransaction();

        CocinaTopFragment cocinaTopFragment;
        cocinaTopFragment = new CocinaTopFragment();
        fragTransaction.add(android.R.id.content, cocinaTopFragment);

        CocinaBotFragment cocinaBotFragment;
        cocinaBotFragment = new CocinaBotFragment();
        fragTransaction.add(android.R.id.content, cocinaBotFragment);

        fragTransaction.commit();
    }
}
