/*
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package Service;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Martina
 */
public class Cantante_Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarLista(ArrayList<CantanteFamoso> cant) {
        System.out.println("Ingrese un 5 cantantes famosos para la lista y su bestseller");
        for (int i = 0; i <= 4; i++) {
            System.out.println("Cantante " + (i + 1));
            cant.add(new CantanteFamoso(leer.next(), leer.next()));
        }

        System.out.println(cant.toString());

    }
    //crear un menú que le de la opción al usuario de agregar un cantante más, mostrar todos los cantantes,
    //eliminar un cantante que el usuario elija o de salir del programa.

    public void eterno(ArrayList<CantanteFamoso> cant) {
        boolean opcion = true;

        do {
            System.out.println("==== Menú ====");
            System.out.println("1. Agregar cantante");
            System.out.println("2. Mostrar los cantantes");
            System.out.println("3. Eliminar cantante");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");

            int eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    agregarCantante(cant);
                    break;
                case 2:
                    mostrarCantante(cant);
                    break;
                case 3:
                    ejecutarCantante(cant);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    opcion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println();

        } while (opcion);

    }

    public void agregarCantante(ArrayList<CantanteFamoso> cant) {
        boolean opcion = true;

        do {
            System.out.println("Ingrese el nombre del canatnte famoso y su best seller:");

            cant.add(new CantanteFamoso(leer.next(), leer.next()));
            System.out.println("Quisieras agregar otra producto canctante? S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                opcion = false;
            }
        } while (opcion);
    }

    public void mostrarCantante(ArrayList<CantanteFamoso> cant) {
        Iterator it = cant.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public void ejecutarCantante(ArrayList<CantanteFamoso> cant) {
        Iterator it = cant.iterator();
        int cont = 0;
        System.out.println("\nQue cantante queres ejecutar?");
        String ejecutado = leer.next();
        
        while (it.hasNext()) {
            CantanteFamoso fito = (CantanteFamoso) it.next();
            if (fito.getNombre().equals(ejecutado)) {
                it.remove();
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("más suerte para la proxima! No estaba en la lista y no matamos a nadie:(");

        }

    }

}
