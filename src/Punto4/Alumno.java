package Punto4;

import java.util.Objects;

public class Alumno {
    private String nombreApellido;
    private Nacionalidad nacionalidad;

    //constructores
    public Alumno(String nombreApellido, Nacionalidad nacionalidad) {
        this.nombreApellido = nombreApellido;
        this.nacionalidad = nacionalidad;
    }

    public Alumno() {
    }

    //getters y setters
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    //metodos

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreApellido='" + nombreApellido + '\'' +
                ", nacionalidad=" + nacionalidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombreApellido, alumno.nombreApellido);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreApellido);
    }
}
