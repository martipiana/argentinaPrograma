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
public class ej1 {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner(System.in);
        int uno ;
        System.out.println("ingrese un numero");
        uno = numero.nextInt() ; 
        Scanner num = new Scanner(System.in) ;
        int dos ;
        System.out.println("el segundo numero");
        dos = num.nextInt();
        int suma ;
        suma = uno + dos ;
        System.out.println("la suma es " + suma );
        
        
        
    }
    
    
    
            
        
}
