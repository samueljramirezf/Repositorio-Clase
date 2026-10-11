package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class DetalleFactura {
    private final int cantidadComprada;
    private final float subTotal;
    private final Producto producto;
    private final Factura ownedByFactura;

    public DetalleFactura(int cantidadComprada, float subTotal, Producto producto, Factura ownedByFactura) {
        this.cantidadComprada = cantidadComprada;
        this.subTotal = subTotal;
        this.producto = producto;
        this.ownedByFactura = ownedByFactura;

    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public Producto getProducto() {
        return producto;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public Factura getOwnedByFactura() {
        return ownedByFactura;
    }

}
