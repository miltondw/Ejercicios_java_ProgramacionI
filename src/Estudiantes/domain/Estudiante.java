package Estudiantes.domain;

public class Estudiante {

    private String nombre;
    private String codigo;
    private int edad;

    public Estudiante(String nombre, String codigo, int edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getEdad() {
        return edad;
    }

}
