
package extra2cantantes;

import Entidad.CantanteFamoso;
import Servicio.CantanteFamosoServicio;
import java.util.ArrayList;

public class Extra2Cantantes {

    public static void main(String[] args) {
      CantanteFamosoServicio cs = new CantanteFamosoServicio();
      ArrayList<CantanteFamoso> cantantes = new ArrayList();
      
      
      cs.agregarCantanteALaLista(cantantes);
      cs.mostrarLista(cantantes);
      cs.eliminarCantante(cantantes);
      cs.mostrarLista(cantantes);
    }
    
}
