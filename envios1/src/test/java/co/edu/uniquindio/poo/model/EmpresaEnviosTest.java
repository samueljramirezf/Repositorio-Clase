package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class EmpresaEnviosTest {
    EmpresaEnvios empresaEnvios;
    EnvioNacional nacional;
    EnvioInternacional internacional;

    @BeforeEach
    public void setUp(){
        empresaEnvios = new EmpresaEnvios("Envios UQ");
        nacional = new EnvioNacional(10000,"001",10,2000,"Juan",
                empresaEnvios,"Pereira",true);
        internacional= new EnvioInternacional(20000,"001",10,2000,"Juan",
                empresaEnvios,"Pereira",true);
    }
    @Test
    public void registrarEnvio() {

       String actual = empresaEnvios.registrarEnvio(nacional);

       String esperado = "Registrado exitosamente";

       assertEquals(esperado,actual);
    }
    @Test
    public void calcularCostoFijoNacional(){
        double resultado= nacional.calcularCostoTotal();

        assertEquals(10000, resultado);
    }
    @Test
    public void calcularCostoFijoInternacional(){
        double resultado;
    }
    @Test
    public void buscarEnvioTest(){
        empresaEnvios.registrarEnvio(nacional);
        Optional<Envio> envio =  empresaEnvios.buscarEnvio("001");
        boolean esperado= true;
        boolean actual= envio.isPresent();

        assertTrue(actual);
    }
    @Test
    public void buscarEnvioMayores(){
        empresaEnvios= new EmpresaEnvios("Envios UQ");
        Envio nacional2 = new EnvioNacional(10000,"001",19,2000,"Juan",
                empresaEnvios,"Pereira",true);
        Envio internacional2= new EnvioInternacional(20000,"001",19,2000,"Juan",
                empresaEnvios,"Pereira",true);
        empresaEnvios.registrarEnvio(nacional);
        empresaEnvios.registrarEnvio(internacional);
        List<Envio> enviosMayores= empresaEnvios.obtenerEnviosMayoresDeclarativo(17);
        boolean actual= enviosMayores.isEmpty();
       assertFalse(actual);
    }

}