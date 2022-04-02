
package extra2cantantes;

import Servicio.CantanteFamosoServicio;

public class Extra2Cantantes {

    public static void main(String[] args) {
      CantanteFamosoServicio cs = new CantanteFamosoServicio();
      
      
      cs.agregarCantanteALaLista();
      cs.mostrarLista();
      cs.eliminarCantante();
      cs.mostrarLista();
    }
    
}
