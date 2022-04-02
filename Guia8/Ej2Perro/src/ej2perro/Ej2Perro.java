/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada
 */
package ej2perro;

import Servicio.PerroServicio;
import java.util.Scanner;


public class Ej2Perro {  
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        PerroServicio ps = new PerroServicio();
        
        System.out.println("cuantos perritos quiere agregar?");
        
        ps.fabricaPerros(leer.nextInt());
        
        ps.mostrarPerro();
        
        
    }
    
}
