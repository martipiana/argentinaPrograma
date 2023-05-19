/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martina;

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
        
        System.out.println("cual es tu nombre");
        Scanner leer = new Scanner(System.in);
        String nombre ;
        nombre = leer.next() ;
        System.out.println("tu nombre es " + nombre);
                
        
    }
    
}
