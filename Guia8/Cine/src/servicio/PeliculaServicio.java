package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

public class PeliculaServicio {

    private Scanner sc;
    private ArrayList<Pelicula> peliculas;

    public PeliculaServicio() {

        sc = new Scanner(System.in).useDelimiter("\n");
        peliculas = new ArrayList();

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

        do {

            peliculas.add(crearPelicula());
            System.out.println("querés ingresar otra peli??S/N");

        } while (sc.next().equalsIgnoreCase("S"));

    }

    public void mostrarPeliculas() {

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }

    }

    public void mostrarPelisLargas() {

        for (Pelicula pelicula : peliculas) {

            if (pelicula.getDuracion() > 1) {

                System.out.println(pelicula);
            }

        }

    }

    public void ordenar() {
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
                    Collections.sort(peliculas, Comparadores.duracionDescendente);
                    mostrarPeliculas();
                    break;
                case 2:
                    Collections.sort(peliculas, Comparadores.duracionAscendente);
                    mostrarPeliculas();
                    break;
                case 3:
                    Collections.sort(peliculas, Comparadores.porTitulo);
                    mostrarPeliculas();
                    break;
                case 4:
                    Collections.sort(peliculas, Comparadores.porDirector);
                    mostrarPeliculas();
                    break;

                
            }

        } while (op<5);

    }
}
