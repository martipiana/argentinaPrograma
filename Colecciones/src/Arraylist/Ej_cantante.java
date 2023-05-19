/*

Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package Arraylist;

import Entidad.CantanteFamoso;
import Service.Cantante_Service;
import java.util.ArrayList;

/**
 *
 * @author Martina
 */
public class Ej_cantante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <CantanteFamoso> Cantantes = new ArrayList();
        Cantante_Service s = new Cantante_Service();
        
        s.llenarLista(Cantantes);
        s.eterno(Cantantes);
   
    }
    
}
