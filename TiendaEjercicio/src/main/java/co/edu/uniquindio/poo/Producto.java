package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Producto {
    private final String codigo;
    private final String nombre;
    private final String descripcion;
    private final float precio;
    private  int cantidadDisponible;
    private final Tienda ownedByTienda;
    private final Categoria categoria;

    public Producto(String codigo, String nombre, String descripcion, float precio, int cantidadDisponible, Tienda ownedByTienda, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.ownedByTienda = ownedByTienda;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public Tienda getOwnedByTienda() {
        return ownedByTienda;
    }
    boolean nombresVerificados(){
        return  nombre.equalsFoldCase("Iphone 16 Pro Max");
    }
}
