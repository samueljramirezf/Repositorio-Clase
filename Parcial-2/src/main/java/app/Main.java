package app;

import model.Empresa;

public class Main {
    Empresa empresa= new Empresa("TechRepair", "Armenia Quindio");

    static void main() {

    }
}static void main() {
    cargarDatos();

    int opcion = -1;
    while (opcion != 0) {
        mostrarMenu();
        opcion = leerEntero("opcion: ");
        switch (opcion) {
            case 1:
                registrarCliente();
                break;
            case 2:
                registrarEquipo();
                break;
            case 3:
                registrarTecnico();
                break;
            case 4:
                registrarRepuesto();
                break;
            case 5:
                crearOrden();
                break;
            case 6:
                agregarDetalle();
                break;
            case 7:
                asignarTecnico();
                break;
            case 8:
                registrarRepuestoUtilizado();
                break;
            case 9:
                verValorDetalle();
                break;
            case 10:
                verValorOrden();
                break;
            case 11:
                actualizarEstadoDetalle();
                break;

            default:
                System.out.println("La opcion ni existe");
                break;
        }
    }
}