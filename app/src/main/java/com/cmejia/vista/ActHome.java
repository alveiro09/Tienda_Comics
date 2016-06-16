package com.cmejia.vista;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.cmejia.modelo.clsComic;
import com.cmejia.modelo.clsEmpleado;
import com.cmejia.tiendacomics.R;

import java.util.ArrayList;

public class ActHome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static ArrayList<clsEmpleado> ListaEmpleados = new ArrayList<clsEmpleado>();
    public static ArrayList<clsComic> ListaComics = new ArrayList<clsComic>();

    public static clsEmpleado EmpleadoActual = new clsEmpleado();
    public static clsComic ComicActual = new clsComic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the ActHome/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuLogout) {
            mLogout();
        } else {
            mLanzarActivity(item.getItemId());
        }

        // Handle navigation view item clicks here.


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void mLanzarActivity(int paramActivity) {
        try {
            Intent oIntent = null;
            switch (paramActivity) {
                case R.id.menuLogin:
                    oIntent = new Intent(this, ActLogin.class);
                    break;
                case R.id.menuCrearEmpleado:
                    oIntent = new Intent(this, ActCrearEmpleado.class);
                    break;
                case R.id.menuCrearComic:
                    oIntent = new Intent(this, ActCrearComic.class);
                    break;
                case R.id.menuVerComics:
                    oIntent = new Intent(this, ActVer.class);
                    break;
            }
            startActivity(oIntent);
        } catch (Exception exp) {
            Toast.makeText(this, "Ocurrió un error abriendo la pantalla solicitada", Toast.LENGTH_LONG).show();
        }
    }

    public void mLogout() {

    }

    public void setInstancia(clsEmpleado paramEmpleado)
    {
        EmpleadoActual = paramEmpleado;
    }
}
