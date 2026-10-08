package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.*;

public class Tienda {
    private final String Nombre;
    private final String Nit;
    private String Telefono= "telefono";

    private final ArrayList<Cliente> listaClientes = new ArrayList<>();
    private final List<Factura> listaFacturas= new LinkedList<>();
    private Map<String, Producto> hashMaplistaProductos = new HashMap<>();

    public Tienda(String Nombre, String Nit, String Telefono) {
        this.Nombre = Nombre;
        this.Nit = Nit;
        this.Telefono = Telefono;
    }
    public double obtenerTotalVendido(LocalDate fecha){
        double total=0;
        for(int i=0; i<listaFacturas.size(); i++ ){
            Factura factura= listaFacturas.get(i);
            if (factura.fechaGeneracion().equals(fecha) && factura.estadoFactura() != EstadoFactura.CANCELADA) {
                total+= factura.total();
            }
        }
        return total;
    }
       public Optional<Cliente>buscarCliente(String documentoIdentidad){
        for(Cliente cliente: listaClientes){
            if(cliente.getDocumentoIdentidad().equals(documentoIdentidad)){
                return Optional.of(cliente);
            }
        }
        return Optional.empty();
       }
        public String registrarCliente(Cliente cliente){
           Optional<Cliente>clienteEncontrado= buscarCliente(cliente.getDocumentoIdentidad());
            if (clienteEncontrado.isEmpty()){
                listaClientes.add(cliente);
                return "El cliente fue registrado de forma exitoso";

            }else  return "El cliente no se puede registrar, su información es igual a uno ya registrado";

        }
        public ArrayList<Cliente> consultarFechaClientes(List <Factura>listaFacturas){
        ArrayList<Cliente> listaClientes= new ArrayList<>();
        LocalDate fechaConsulta= LocalDate.of(2026,10,7);

        for(Factura factura: listaFacturas){
            if (factura.fechaGeneracion().isEqual(fechaConsulta)){
                listaClientes.add(factura.cliente());

            }
        }
        return listaClientes;
        }

    public ArrayList<Factura> consultarfacturasDeClientesConR(String nombreCompleto) {
        ArrayList<Factura> listaClientes = new ArrayList<>();
        for (Factura factura : listaFacturas) {
            if (factura.tieneClienteConR()) {
               listaClientes.add (factura);
            }
        }
        return listaClientes;
    }

        public List<Factura> consultarFactura(String documentoIdentidad){
        List<Factura> facturasDelCliente= new ArrayList<>();
        for (Factura factura: listaFacturas){
        if(factura.cliente().getDocumentoIdentidad().equals(documentoIdentidad)){
            facturasDelCliente.add(factura);
        }
        }
            return facturasDelCliente;
        }
        public List<Producto>obtenerMayoresDiez() {
            List<Producto> productosAdecuado = new ArrayList<>();
            for (Producto productosBuenos : hashMaplistaProductos.values()) {
                if (productosBuenos.getCantidadDisponible()>=10) {
                    productosAdecuado.add(productosBuenos);
                    }
                }
            return productosAdecuado;
            }
         public ArrayList<String>obtenerEntre10Y50(){
           ArrayList<String> resultado= new ArrayList<>();
           for(String codigo: hashMaplistaProductos.keySet()){
               Producto producto= hashMaplistaProductos.get(codigo);
               if(producto.getCantidadDisponible()>=10 && producto.getCantidadDisponible()<50){
                   resultado.add (codigo);
               }

           }
             return resultado;
         }
    public String getNombre() {
        return Nombre;
    }

    public String getNit() {
        return Nit;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public Map<String, Producto> getHashMaplistaProductos() {
        return hashMaplistaProductos;
    }

    public void setHashMaplistaProductos(Map<String, Producto> hashMaplistaProductos) {
        this.hashMaplistaProductos = hashMaplistaProductos;
    }

}


