package com.hackaton.utp.hackatonutp.denuncia.domain;

public class Comisaria {
    public String id;
    public String direccion;
    public String nombre;
    public String encargado;

    public Comisaria(String id, String direccion, String nombre, String encargado) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.encargado = encargado;
    }
}
