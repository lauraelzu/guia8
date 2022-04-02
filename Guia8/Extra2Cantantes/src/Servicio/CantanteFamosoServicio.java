
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoServicio {
    
    private ArrayList<CantanteFamoso> cantantes;
    private Scanner leer;

    public CantanteFamosoServicio() {
        this.cantantes = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    
    
    public CantanteFamoso crearCantante (){
        CantanteFamoso c = new CantanteFamoso();
        System.out.println("nombre");
        c.setNombre(leer.next());
        System.out.println("disco");
        c.setDiscoConMasVentas(leer.next());
        return c;
    }
    
    public void agregarCantanteALaLista(){
        System.out.println("ingrese cantidad de cantantes a agregar");
        int cantidad = leer.nextInt();
        System.out.println("-------------------------");
        System.out.println("crear lista de cantantes");
        for (int i = 0; i < cantidad; i++) {
            cantantes.add(crearCantante());
        }
    }
    
    public void mostrarLista(){
        for (CantanteFamoso aux : cantantes) {
            System.out.println(aux.getNombre()+ " | " + aux.getDiscoConMasVentas());
        }
    }
    
    public void eliminarCantante (){
        System.out.println("----------------------");
        System.out.println("Eliminar cantante");
        System.out.println("Ingrese nombre del cantante a eliminar");
        String cantanteAElimminar = leer.next();
        for (int i = 0; i < cantantes.size(); i++) {
            CantanteFamoso c = cantantes.get(i);
            if(c.getNombre().equals(cantanteAElimminar)){
                cantantes.remove(i);
            }
        }
    }
    
}
