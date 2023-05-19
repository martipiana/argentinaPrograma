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
public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cantidad de * del cuadrado");
        int n;
        n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            //columna
            System.out.print("*");
            for (int j = 0; j < n - 1; j++) {
                //fila
                if (j == 0 || j == n-1) {
                  if (i == 0 || i == n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }    
                }
            }
           System.out.println("*"); 
        }
    }
}
        
