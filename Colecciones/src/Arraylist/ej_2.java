/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se
 * encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada.
 */
public class ej_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList<>();
        boolean opcion = true;
        while (opcion) {
            System.out.println("Ingrese una raza de perro");
            perros.add(leer.next());
            System.out.println("Desea agregar otro perro? S/N");
            if (leer.next().equals("N")) {
                opcion = false;
            }
        }
        System.out.println("Los perros ingresados en lista son");
        perros.forEach((perro) -> {
            System.out.println(perro);
        });

        Collections.sort(perros);
        Iterator it = perros.iterator();
        System.out.println("ingrese un perro para eliminar");
        String ejecutado = leer.next();

        if (perros.contains(ejecutado)) {
            while (it.hasNext()) {
                if (it.next().equals(ejecutado)) {
                    it.remove();
                }
            }
        } else {
            System.out.println("no lo pudimos ejecitar, no está x(");
        }
        System.out.println("Los perros que quqedaron son:");
        perros.forEach((perro) -> {
            System.out.println(perro);
        });
    }
}
