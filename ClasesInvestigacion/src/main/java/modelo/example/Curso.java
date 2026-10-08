package modelo.example;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String codigo;
    List<Estudiante> listaEstudiantes = new ArrayList<>();

    public Curso(String nombre, String codigo, List<Estudiante> listaEstudiantes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEstudiantes = listaEstudiantes; //se inicializa en el constructor
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
