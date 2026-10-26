package co.edu.uniquindio.poo.model;

public class EnvioExpress extends EnvioNacional {
    private int horasMaximas;

    public EnvioExpress(float valorFijo, String codigo, float peso, float incremento, String destinatario, EmpresaEnvios empresaEnvios, String ciudadDestino, boolean domicilio, int horasMaximas) {
        super(valorFijo, codigo, peso, incremento, destinatario, empresaEnvios, ciudadDestino, domicilio);
        this.horasMaximas= horasMaximas;
    }

    public int getHorasMaximas() {
        return horasMaximas;
    }

    public void setHorasMaximas(int horasMaximas) {
        this.horasMaximas = horasMaximas;
    }

    public double calcularCostoNuevo() {
        return calcularCostoFijo() * 1.3;
    }

    public double agregarCincomil() {
        if (horasMaximas <= 24) {
            return calcularCostoNuevo() + 5000;
        }
        return calcularCostoNuevo();
    }
}
