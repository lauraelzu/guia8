package Entidad;

public class Mascota {
      //para encapsular los atributos la accesibilidad debe ser "private"
    private String nombre;
    private String apodo;
    private String tipo;      //Conejo, Gato, Perro, Loro, Carpincho
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

//Get de nombre, apodo y tipo
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }
 
//Set de nombre, apodo y tipo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

//toString    
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
   
    
    
    
}

