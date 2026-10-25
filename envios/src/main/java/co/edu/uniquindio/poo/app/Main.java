package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.EmpresaEnvios;
import co.edu.uniquindio.poo.model.EnvioNacional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        EmpresaEnvios empresaEnvios = new EmpresaEnvios("Envios UQ");
        EnvioNacional envioNacional= new EnvioNacional(6000, "10983453", 18, 3000, "Juan Pepito", empresaEnvios, "Pereira", true );

    }
}
