import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String codigo;

   private ArrayList <Estudiante> ListaEstudantes;

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        ListaEstudantes = new ArrayList<>();
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

    public ArrayList<Estudiante> getListaEstudantes() {
        return ListaEstudantes;
    }

    public void setListaEstudantes(ArrayList<Estudiante> listaEstudantes) {
        ListaEstudantes = listaEstudantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", ListaEstudantes=" + ListaEstudantes +
                '}';
    }
}
