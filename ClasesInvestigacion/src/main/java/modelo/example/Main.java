package modelo.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Nota notavariable = new Nota("quiz1", 1);
        Nota notavariable2 = new Nota("quiz1", 1);
        List<Nota> listaNotas = new ArrayList<>();


        listaNotas.add(notavariable);
        listaNotas.add(notavariable2);

        Estudiante estudiante = new Estudiante("Fulanito", "Funez", "198726354", "ejemplo.si@xd",(byte) 17,"349856032", listaNotas);
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante);
        Curso curso= new Curso("ProgramacionI", "01D", listaEstudiantes);


    }
}
