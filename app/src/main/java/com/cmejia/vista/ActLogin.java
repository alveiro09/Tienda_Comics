package com.cmejia.vista;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cmejia.tiendacomics.R;

/**
 * Created by amejia on 6/15/2016.
 */
public class ActLogin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lytlogin);

        EditText EdtNombre = (EditText) findViewById(R.id.edtNombre);
        EditText EdtClave = (EditText) findViewById(R.id.edtClave);

        Button BtnAceptar = (Button) findViewById(R.id.btnAceptar);
        BtnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i< ActHome.ListaEmpleados.size()-1; i++)
                {
                    if (ActHome.ListaEmpleados.get(i).getId()==i+1)
                        ActHome.EmpleadoActual = ActHome.ListaEmpleados.get(i);
                    else
                        Toast.makeText(getBaseContext(), "El empleado no existe", Toast.LENGTH_LONG).show();
                }
            }
        });

    }



}
