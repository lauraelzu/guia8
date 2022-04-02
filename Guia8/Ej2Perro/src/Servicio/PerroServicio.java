
package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerroServicio {
    
    Scanner leer;
    private List<Perro> perros;
    
    
    public PerroServicio(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.perros = new ArrayList();
    }
    
    
    public Perro crearPerro(){
        Perro p = new Perro();
        System.out.println("Ingrese raza, nombre y apellido de su mascota");
        p.setRaza(leer.next());
        p.setNombre(leer.next());
        p.setApellido(leer.next());
        return p;
    }
    
   
    
    
    public void mostrarPerro(){
        System.out.println("La lista de perros es");
        for (Perro perro : perros) {
            System.out.println(perro);
        }
        System.out.println("Cantidad de perros " + perros.size());
    }
    
    
    public void fabricaPerros(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Perro perroCreado = crearPerro();
            agregarPerro(perroCreado);
            System.out.println(perroCreado);
        }
    }
    
    public void agregarPerro(Perro p){
        perros.add(p);
    }
    
    public void eliminarPerro (String nombre){
        
       
    }
    
         
}
