
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
 * le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
 * se encuentra el numero y si se encuentra repetido

 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int tamaño = leer.nextInt() ;
        
        int[] vector = new int[tamaño];
        
        for (int i = 0; i < tamaño ; i++) {
           vector [i] = (int)(Math.random() * 11) ;
             System.out.print( vector[i] +  " " );       
        }
        System.out.println("");
        System.out.println("que numero queres buscar");
        int buscar = leer.nextInt() ;
        int aux=0;
        for (int i = 0; i < tamaño; i++) {
            if (aux == 0 && vector [i]== buscar ) {
                aux = 1 ;
               System.out.println( "el " + buscar + " se encuntra en " + (i+1));
            } else if (aux != 0 && vector [i]== buscar) {
              aux = aux + 1 ;  
                System.out.println(" Y se repite " + (aux - 1) + " veces mas");
            }

         
        }
       if (aux==0) {
                System.out.println("el numero no esta en el vector");
                
            }
    }
    
}
