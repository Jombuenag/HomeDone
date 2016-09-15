package com.example.taku.homedone;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class CocinaBotFragment extends Fragment {

    ListView lVCompra;
    TextView txtConfirmacion;
    FragmentActivity listener;



    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if (context instanceof Activity){
            this.listener = (FragmentActivity) context;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        /*AQUÍ IRÁ LA LISTA DE ELEMENTOS QUE CONFORMARÁN LA LISTA DE LA
         COMPRA*/
}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cocina_bot_fragment, container, false);
        lVCompra = (ListView)view.findViewById(R.id.lVCompra);
        txtConfirmacion = (TextView)view.findViewById(R.id.txtConfirmacion);
        txtConfirmacion.setText("Hola cocacola");
        return view;
    }
}
