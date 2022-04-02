
package cine;

import servicio.PeliculaServicio;


public class Cine {

    
    public static void main(String[] args) {
        
        
        PeliculaServicio ps= new PeliculaServicio();
        
        ps.crearListaPeliculas();
        
        ps.mostrarPeliculas();
        
        ps.mostrarPelisLargas();
        
        ps.ordenar();
        
    }
        
}
