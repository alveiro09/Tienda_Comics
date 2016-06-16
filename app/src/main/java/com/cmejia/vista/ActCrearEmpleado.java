package com.cmejia.vista;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cmejia.modelo.clsEmpleado;
import com.cmejia.tiendacomics.R;

/**
 * Created by amejia on 6/15/2016.
 */
public class ActCrearEmpleado extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lytcrearempleado);

        final EditText EdtNombre = (EditText) findViewById(R.id.edtNombre);
        final EditText EdtApellido = (EditText) findViewById(R.id.edtApellido);
        final EditText EdtClave = (EditText) findViewById(R.id.edtClave);
        final EditText EdtCClave = (EditText) findViewById(R.id.edtCClave);
        final EditText EdtCargo = (EditText) findViewById(R.id.edtCargo);
        final EditText EdtEdad = (EditText) findViewById(R.id.edtEdad);

        Button BtnAceptar = (Button) findViewById(R.id.btnAceptar);
        BtnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clsEmpleado oEmpleado = new
                        clsEmpleado(EdtNombre.getText().toString(), EdtApellido.getText().toString(), EdtClave.getText().toString(), EdtCClave.getText().toString(),
                        EdtCargo.getText().toString(), Integer.parseInt(EdtEdad.getText().toString()), ActHome.ListaEmpleados.size()+1);
                if (!ActHome.ListaEmpleados.contains(oEmpleado))
                    ActHome.ListaEmpleados.add(oEmpleado);
                else
                    Toast.makeText(getBaseContext(), "El empledo ya existe", Toast.LENGTH_LONG).show();
            }
        });
    }
}

