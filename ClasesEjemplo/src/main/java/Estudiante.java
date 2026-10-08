import java.util.ArrayList;
import java.util.Arrays;

public class Estudiante {
private String nombre;
private String apellidos;
private String identificacion;
private String correo;
private String telefono;
private byte edad;
private Curso ownedByCurso;
private Nota [] listaNotas ;

    public Estudiante(String telefono, byte edad, Curso ownedByCurso, String correo, String nombre, String identificacion, String apellidos) {
        this.telefono = telefono;
        this.edad = edad;
        this.correo = correo;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.apellidos = apellidos;
        this.ownedByCurso = ownedByCurso;
        this.listaNotas = new Nota [5] ;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Curso getOwnedByCurso() {
        return ownedByCurso;
    }

    public void setOwnedByCurso(Curso ownedByCurso) {
        this.ownedByCurso = ownedByCurso;
    }

    public Nota[] getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(Nota[] listaNotas) {
        this.listaNotas = listaNotas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", ownedByCurso=" + ownedByCurso +
                ", listaNotas=" + Arrays.toString(listaNotas) +
                '}';
    }
}
