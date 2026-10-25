package co.edu.uniquindio.poo.model;

public class EnvioExpress extends EnvioNacional {
private final double HORAS_MAXIMAS= 48;

    public EnvioExpress(float valorFijo, String codigo, float peso, float incremento, String destinatario, EmpresaEnvios empresaEnvios, String ciudadDestino, boolean domicilio) {
        super(valorFijo, codigo, peso, incremento, destinatario, empresaEnvios, ciudadDestino, domicilio);
    }

}
