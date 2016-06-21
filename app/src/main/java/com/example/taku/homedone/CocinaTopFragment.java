package com.example.taku.homedone;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class CocinaTopFragment extends Fragment implements View.OnClickListener{

    private View view;

    ImageView btnCompra;
    ImageView btnMenu;
    ImageView btnHorarios;

    public CocinaTopFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cocina_top_fragment, container, false);
        btnCompra = (ImageView)view.findViewById(R.id.btnListaCompra);
        btnMenu = (ImageView)view.findViewById(R.id.btnMenu);
        btnHorarios = (ImageView)view.findViewById(R.id.btnHorarios);

        btnCompra.setOnClickListener(this);
        btnMenu.setOnClickListener(this);
        btnHorarios.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnListaCompra:
                Toast.makeText(getActivity(), "BOTON ACTIVADO", Toast.LENGTH_SHORT).show();
            break;
            case R.id.btnMenu:
                Toast.makeText(getActivity(), "BOTON MENÚ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHorarios:
                Toast.makeText(getActivity(), "BOTON HORARIOS", Toast.LENGTH_SHORT).show();
                break;
        }

    }







    /** public void verListaCompra(String Title, String Message){
        AlertDialog.Builder verListaCompra = new AlertDialog.Builder(getActivity());
        verListaCompra.setNegativeButton(R.string.close_lista_compra, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "O NO", Toast.LENGTH_SHORT).show();

            }
        });
        verListaCompra.setPositiveButton(R.string.ok_lista_compra, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "POS OK", Toast.LENGTH_SHORT).show();
            }
        });

        verListaCompra.setCancelable(true);
        verListaCompra.setTitle(Title);
        verListaCompra.setMessage(Message);
        verListaCompra.show();

    }
**/
}


