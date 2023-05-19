
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martina
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo, debe devolver
 * true si es primo, sino false.

 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese un numero para saber si es primo");
        int num = leer.nextInt() ;
        boolean rta ;
        rta = primo (num) ;
                
        System.out.println("Lacondicion es " + rta );
        
    }
    
    public static boolean primo(int num) {

        int contador = 0;
        boolean condi;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        condi = contador<=2 ;
        return condi ;
  }
}


