package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.*;
public record Factura(String codigo, LocalDate fechaGeneracion, double total,
                      MetodoPago metodoPago, EstadoFactura estadoFactura,
                      Cliente cliente, Tienda ownedByTienda, ArrayList<DetalleFactura>listaDetallesFactura) {
    public double calcularTotal(ArrayList<DetalleFactura> detalles){
        double total = 0.0;

        for (int i = 0; i < detalles.size(); i++) {
            DetalleFactura detalle = detalles.get(i);
            int cantidad = detalle.getCantidadComprada();
            float precio = detalle.getProducto().getPrecio();
            total += (cantidad * precio);
        }

        return total;
    }
    public boolean tieneClienteConR() {

        boolean resultado = false;
        resultado = cliente.verificarNombreConR();
        return resultado;
    }
}
