package com.cmejia.modelo;

/**
 * Created by amejia on 6/16/2016.
 */
public class clsEmpleado {
    private String Nombre;
    private String Apellido;
    private String Clave;
    private String ConfirmarClave;
    private String Cargo;
    private int Edad;
    private int Id;


    public clsEmpleado(String paramNombre, String paramApellido, String paramClave, String paramConfirmarClave, String paramCargo, int paramEdad, int paramID )
    {
        Id = paramID;
        Nombre = paramNombre;
        Apellido = paramApellido;
        Clave = paramClave;
        ConfirmarClave = paramConfirmarClave;
        Cargo = paramCargo;
        Edad = paramEdad;
    }

    public clsEmpleado()
    {

    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public String getConfirmarClave() {
        return ConfirmarClave;
    }

    public void setConfirmarClave(String confirmarClave) {
        ConfirmarClave = confirmarClave;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


}