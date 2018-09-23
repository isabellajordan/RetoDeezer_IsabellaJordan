package com.example.isabellajordanb.retodeezer_isabellajordan;
public class Lista {

    private String nombreCancion;
    private String user;
    private String canciones;

    public Lista(String nombreCanciones, String user, String canciones) {
        this.nombreCancion = nombreCancion;
        this.user = user;
        this.canciones = canciones;
    }



    public String getUser() { return user;}
    public void setUsuario(String user) { this.user = user; }

    public String getCanciones() { return canciones; }
    public void setCanciones(String canciones) { this.canciones = canciones; }

    public String getNombre() {
        return nombreCancion;
    }
    public void setNombre(String nombreCanciones) {
        this.nombreCancion = nombreCanciones;
    }

}
