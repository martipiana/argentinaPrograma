/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Martina
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        
        System.out.println("ingrese una frase");
        Scanner leer = new Scanner(System.in) ;
        String frase = leer.nextLine() ;
        if (!frase.equals("eureka") )System.out.println("incorrecto"); else {
            System.out.println("correcto");
        }
                
        
    }
    
}
