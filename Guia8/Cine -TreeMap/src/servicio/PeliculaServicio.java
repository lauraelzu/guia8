package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import utilidades.Comparadores;

public class PeliculaServicio {

    private Scanner sc;
    private TreeMap<Integer, Pelicula> peliculas;  //llave y valor(objeto)

    public PeliculaServicio() {

        sc = new Scanner(System.in).useDelimiter("\n");
        peliculas = new TreeMap();

    }

    public Pelicula crearPelicula() {

        Pelicula peli = new Pelicula();
        System.out.println("Ingresá el título de la peli");
        peli.setTitulo(sc.next());
        System.out.println("Ingresá el director de la peli");
        peli.setDirector(sc.next());
        System.out.println("Ingresá la duración de la peli");
        peli.setDuracion(sc.nextDouble());

        return peli;

    }

    public void crearListaPeliculas() {
        int llave  = 1000;
        do {
            llave ++;

            peliculas.put(llave,crearPelicula());
            System.out.println("querés ingresar otra peli??S/N");

        } while (sc.next().equalsIgnoreCase("S"));

    }

    public void mostrarPeliculas() {
        // getKey trae la llave y getValue trae los valores del mapa
        System.out.println("Usando getKey y getValue");
        for (Map.Entry<Integer, Pelicula> pelicula : peliculas.entrySet()) {
        System.out.println(pelicula.getKey()+ "  " + pelicula.getValue().getTitulo() + "  " + pelicula.getValue().getDirector() + "  " + pelicula.getValue().getDuracion());
        }
       
        // toString
        System.out.println("Usando toString()");
        for (Map.Entry<Integer, Pelicula> pelicula : peliculas.entrySet()) {
        System.out.println(pelicula.getKey()+ "  " + pelicula.getValue());
        }
        
        
        //Sin Map.Entry:
        // mostrar solo las llaves
        for (Integer llave : peliculas.keySet()) {
        System.out.println("llave: " + llave);
        }


 

    }

//    TODO public void mostrarPelisLargas() {
//
//        for (Pelicula pelicula : peliculas) {
//
//            if (pelicula.getDuracion() > 1) {
//
//                System.out.println(pelicula);
//            }
//
//        }
//
//    }

    public void ordenar() {
        
        ArrayList<Pelicula> peliculasEnLista = new ArrayList(peliculas.values());  //convertir el mapa en arraylist
        
        int op;
                 
        do {

            System.out.println("Indica que queres hacer");
            System.out.println("1: Ordenar de forma descendente");
            System.out.println("2: Ordenar de forma ascendente");
            System.out.println("3: Ordenar de por titulo");
            System.out.println("4: Ordenar de por director");
            System.out.println("5: Salir");
            op =sc.nextInt();
            switch (op) {

                case 1:
                    Collections.sort(peliculasEnLista, Comparadores.duracionDescendente);
                    mostrarPeliculas();
                    break;
                case 2:
                    Collections.sort(peliculasEnLista, Comparadores.duracionAscendente);
                    mostrarPeliculas();
                    break;
                case 3:
                    Collections.sort(peliculasEnLista, Comparadores.porTitulo);
                    mostrarPeliculas();
                    break;
                case 4:
                    Collections.sort(peliculasEnLista, Comparadores.porDirector);
                    mostrarPeliculas();
                    break;
                
            }

        } while (op<5);

    }
}
