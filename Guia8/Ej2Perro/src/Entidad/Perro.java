
package Entidad;

public class Perro {
    private String raza;
    private String nombre;
    private String apellido;

    public Perro() {
    }

    public Perro(String raza, String nombre, String apellido) {
        this.raza = raza;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
