/*
 
 */
package Utilidades;

import Entidad.Mascota;
import java.util.Comparator;

public class Comparadores {
   
    //variable global o atributo de la clase
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota> (){
        
        //Comparadores
        @Override
        public int compare(Mascota o1, Mascota o2) {
            return o2.getNombre().compareTo(o1.getNombre());
        }
    };
    
    
        public static Comparator<Mascota> ordenarPorNombreAsc = new Comparator<Mascota> (){
        
        //Comparadores
        @Override
        public int compare(Mascota o1, Mascota o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
    
    
    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota> (){
        @Override
        public int compare(Mascota o1, Mascota o2) {
            return o2.getEdad().compareTo(o1.getEdad());
        }
    };
}
