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
 
     
    //===> eliminar según el valor de un atributo
    public void eliminarMascotaPorNombre(String nombre) {
        
        for (int i = 0; i < mascotas.size(); i++){
            
            Mascota m = mascotas.get(i);   //obtengo el objeto
            
            if (m.getNombre().equals(nombre)){  //extraigo el nombre y comparo
                mascotas.remove(i);             //si es igual lo elimina
            }
        }
    }
    
        //===> actualizar según el valor de un atributo
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo) {
        
        for (int i = 0; i < mascotas.size(); i++){
            
            Mascota m = mascotas.get(i);   //obtengo el objeto
            
            if (m.getNombre().equals(nombreViejo)){  //extraigo el nombre y comparo
                m.setNombre(nombreNuevo);             //si es igual lo actualizo
            }
        }
    }
    
}

