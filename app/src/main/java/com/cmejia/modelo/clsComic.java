package com.cmejia.modelo;

/**
 * Created by amejia on 6/16/2016.
 */
public class clsComic {
    private String Id;
    private String Nombre;
    private String Descripcion;
    private String Comentario;

    public clsComic(String paramId, String paramNombre, String paramDescripcion, String paramComentario)
    {
        Id = paramId;
        Nombre = paramNombre;
        Descripcion =  paramDescripcion;
        Comentario = paramComentario;
    }

    public clsComic()
    {

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }
}
