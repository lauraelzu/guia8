
package Servicio;

import ejercicio3.Entidad.Alumno;

import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoServicio {
  
    private Scanner sc;
    private ArrayList <Alumno> alumnos;

    public AlumnoServicio() {
        sc= new Scanner(System.in).useDelimiter("\n");
        alumnos= new ArrayList();
        
    }
    
    public Alumno crearAlumno(){
         Alumno a= new Alumno();
         System.out.println("nombre");
         a.setNombre(sc.next());
         
         System.out.println("Ingresà 3 notas");
         
         for (int i = 0; i < 3; i++) {
             
             a.getNotas().add(i, sc.nextInt());
            
        }
        
     return a;  
    }
    
    public void crearLista(){
        
        System.out.println("----------------------------------------------");
        do {
            alumnos.add(crearAlumno());
            System.out.println("querés ingresar otro alumno?S/N");
            
        } while (sc.next().equalsIgnoreCase("S"));
     
             
    }
    
    public void mostrarListaAlumnos(){
        for (Alumno alumno : alumnos) {
          
        System.out.println(alumno);
        }
        
    }
    
//    TODO public void eliminarAlmno
    
    
}
