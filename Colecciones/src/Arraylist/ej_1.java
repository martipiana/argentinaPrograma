/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class ej_1 {

   
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
        for (String perro : perros) {
            System.out.println(perro);
        }
    }
    
}
