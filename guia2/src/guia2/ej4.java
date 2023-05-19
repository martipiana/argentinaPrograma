/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la funcion Substring y equals()
de Java.

 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Martina
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in) ;
        System.out.println("ingrese una frase o palabra que comience con A");
        String texto ;
          texto = leer.nextLine();
          
          if ( "A".equalsIgnoreCase(texto.substring(0, 1))) {
              System.out.println("Correcto");
              }else {  
              System.out.println("incorrecto");
            
        } 
    } 
}
