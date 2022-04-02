/*
 ***********Otro ejemplo recorrer y eliminar en un ArrayList ******************
Eliminar y actualizar según el valor de un atributo del objeto
 */
package ejemploarraylist;

import Servicio.MascotaServicio;

public class EjemploArrayList {

    public static void main(String[] args) {
       
        MascotaServicio servMasc = new MascotaServicio();
             
        servMasc.fabricaMascotas(2);  //crea mascotas ingresadas por teclado
        
        servMasc.mostrarMascotas();
        
        servMasc.actualizarMascotaPorNombre("Lola", "Pepona");
        
        servMasc.mostrarMascotas();
        
        servMasc.eliminarMascotaPorNombre("Pepona");
        
        servMasc.mostrarMascotas();
        
        
        
     
    }
    
}
