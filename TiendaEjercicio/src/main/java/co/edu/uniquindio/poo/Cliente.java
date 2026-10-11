package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Cliente {
    private final String documentoIdentidad;
    private final String nombreCompleto;
    private final String telefono;
    private final String correo;
    private final String ciudadResidencia;
    private final List<Factura> listaFacturas;
    private final Tienda ownedByTienda;

    public Cliente(String documentoIdentidad, String nombreCompleto, String telefono, String correo, String ciudadResidencia, List<Factura> listaFacturas, Tienda ownedByTienda) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.ciudadResidencia = ciudadResidencia;
        this.listaFacturas = listaFacturas;
        this.ownedByTienda = ownedByTienda;


    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public Tienda getOwnedByTienda() {
        return ownedByTienda;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public List<Factura> getListaFacturas() {
        return Collections.unmodifiableList (listaFacturas);
    }
    public boolean verificarNombreConR() {
        return nombreCompleto.startsWith("R");

    }
}
