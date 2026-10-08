package modelo.example;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String correo;
    private String telefono;
    private byte edad;
    List<Nota> listaNotas = new ArrayList<>();

    public Estudiante(String nombres, String apellidos, String identificacion, String correo, byte edad, String telefono, List<Nota> listaNotas) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.correo = correo;
        this.edad = edad;
        this.telefono = telefono;
        this.listaNotas = listaNotas;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
