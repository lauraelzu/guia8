/*
 ***********Ordenar colecciones con COMPARATOR******************

 */
package ejemplocomparadores;

import Entidad.Mascota;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

public class EjemploComparadores {

    public static void main(String[] args) {
       
        //Creación de un arraylist de mascotas
       ArrayList<Mascota> mascotas = new ArrayList();
       
       //se crean 2 objetos y se añaden a la arraylist
       mascotas.add(new Mascota("Fer", "Chiquitiço", "perro"));
       mascotas.add(new Mascota("Pepa", "Lola", "gato"));
       mascotas.add(new Mascota("Alexa", "Al", "pez"));
       mascotas.add(new Mascota("Jacinta", "Jaz", "perro"));
       mascotas.add(new Mascota("Ana", "Anita", "pajaro"));
       
       //ordenar por nombre forma descendente
       Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
       
         //visualizar
        System.out.println("...................Colección ordenada forma descendente");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
        
        //ordenar por nombre forma ascendente
       Collections.sort(mascotas, Comparadores.ordenarPorNombreAsc);
       
         //visualizar
        System.out.println("...................Colección ordenada forma ascendente");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
       
       //desordenar aleatoriamente
       Collections.shuffle(mascotas);
       
       //visualizar
        System.out.println("...................Colección desordenada");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
       
    }
    
}
