package Servicio;

import Entidad.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

public class MascotaServicio {

//////////////////////////VARIABLES    
    private Scanner leer;
    //**************agrego Atributo global del servicio llamado mascotas del tipo ArrayList***************
    //**************donde el tipo de dato será la clase Mascota*******************************************
    private ArrayList<Mascota> mascotas;


////////////////////////////CONSTRUCTOR
    //***********inicializo a través del CONSTRUCTOR de la clase servicio***********
    //cada vez que se llame al servicio se crea el nuevo ArrayList
    public MascotaServicio() {
        this.leer  = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    

/////////////////////////////METODOS
    
    //====>Método crear Mascota nos solicita los datos  
    //devuelve un objeto del tipo Mascota
      public Mascota crearMascota(){
        
        System.out.println("Introduzca el nombre");
        String nombre = leer.next();
        System.out.println("Introduzca el apodo");
        String apodo = leer.next();
        System.out.println("Introduzca el tipo de mascota");
        String tipo = leer.next();
        
        //devuelvo el objeto creado
       return new Mascota(nombre, apodo, tipo);
      }
   
   //====>Método que recibe Mascota y la agregar a la lista
      public void agregarMascota(Mascota m){
          mascotas.add(m);
      }
      
    //====>Visualización   
      public void mostrarMascotas(){
          
          System.out.println("Las mascotas en la lista de mascotas son:");
          // la variable auxiliar será del tipo Mascota, ya que los elementos del ArrayList son de ese tipo
          for(Mascota aux : mascotas){
              System.out.println(aux.toString());  //para mostrar usa toString(), que devuelve la cadena con la info concatenada 
          }
          System.out.println("Cantidad: " + mascotas.size());
      }
         
    //====>método "fabricaTobys" recibe la cantidad de objetos idénticos a crear y añadir a la lista
      
//para automatizar la creación de varias mascotas a la vez en lugar de hacer de a 1
//con valores predefinidos...
public void fabricaTobys (int cantidad){
    
    for (int i = 0; i < cantidad; i++) {
/* la forma de agregar al ArrayList sería crear una variable del tipo Mascota y pasarla como parámetro al "add"
                Mascota aux = new Mascota("Tobias", "Toby", "caniche");
                mascotas.add(aux);
    pero más sencilla es...
*/
                mascotas.add(new Mascota("Tobias", "Toby", "caniche"));     
    }
} 

    //====>Metodo que fabricará mascotas pidiendo los datos por teclado (1 x 1)
//agregará a la lista
//y la muestra por pantalla
public void fabricaMascotas (int cantidad){
    for (int i = 0; i < cantidad; i++) {
        Mascota mascotaCreada = crearMascota();
        agregarMascota(mascotaCreada);
        System.out.println(mascotaCreada.toString());
    }       
}
    
    //====>Método para actualizar objetos que recibe el índice del elemento a actualizar de la lista

//***forma 1******* usar el metodo GET de la lista para traer el objeto y modificar su atributo con el SETTER
//    public void actualizarMascota(int index){
//        Mascota m = mascotas.get(index); //método GET de la lista trae el objeto en la posición index
//                                          // se la asigna a la variable local "m"
//        m.setApodo("Perrito");   //se modifica el atributo deseado del objeto extraido, no es necesario volver a guardarlo
//                                 // ya que es un pasaje POR REFERENCIA                             
//    }

//***forma 2******* crear objeto y con el método SET de la lista se modifica el objeto en la posición index (pisando el anterior)
    public void actualizarMascota(int index){
        if (index<=(mascotas.size()-1)){    //si el index tiene un valor válido
            System.out.println("-------------Actualizar mascota " + index);
            Mascota m = crearMascota();
            mascotas.set(index, m);   
        } else {
            System.out.println("Índice no válido");
        }                    
    }
    
    
    //====>Método para eliminar con indice
    public void eliminarMascota(int index){
        
        if (index<=(mascotas.size()-1)){    //si el index tiene un valor válido
            System.out.println("-------------Eliminar mascota " + index);
            mascotas.remove(index); 
        } else {
            System.out.println("Índice no válido");
        }              
    }
}

