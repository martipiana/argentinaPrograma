/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que
la suma de los números introducidos supere el límite inicial.
.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Martina
 */
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in) ;
        System.out.println("ingrese un tope");
        int tope ;
        int i ;
        i = 0 ;
        int num ;
        tope = leer.nextInt() ;
        
        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt() ;
            
            i = num + i ;
            
        } while (i <= tope );
        
        System.out.println("llegaste a la suma total de " + tope );
        
        
        
        
        
                
        
    }
    
}
