package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.EmpresaEnvios;
import co.edu.uniquindio.poo.model.EnvioNacional;
import co.edu.uniquindio.poo.model.EnvioExpress;
import co.edu.uniquindio.poo.model.EnvioInternacional;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        EmpresaEnvios empresaEnvios = new EmpresaEnvios("Envios UQ");
        EnvioNacional envioNacional= new EnvioNacional(6000, "10983453", 18, 3000, "Juan Pepito", empresaEnvios, "Pereira", true );

    static void main() {
        String menu= "=~=~=~=~= Menu Envios UQ =~=~=~=~=\n\n"
                + "1. Registrar envio\n"
                + "2. Mostrar el valor total del envio\n"
                + "3. Buscar envio\n"
                + "4. Salir\n\n"
                + "Seleccione una opción:";


        int opcion=0;
        do{
            String entrada = JOptionPane.showInputDialog(null, menu, "Menú principal", JOptionPane.QUESTION_MESSAGE);
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "¡¡¡Gracias por usar el menu!!!");
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "La opción no es valida");
                    break;


            }

        }while (opcion!=0);
    }

}
