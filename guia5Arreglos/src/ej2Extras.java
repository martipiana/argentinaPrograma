/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre 
 * los elementos).
 */
public class ej2Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);        
        System.out.println("cantidad de elementos para ambos vectores");
        int[] vector = new int[leer.nextInt()];
        int[] vector2 = new int[vector.length];
        llenar(vector);
        llenar(vector2);
        comparacion (vector, vector2) ;
        
        
    }
    public static void llenar (int vector[]) {
       
        for (int i = 0; i < vector.length ; i++) {
           vector [i] = (int)(Math.random() * 11) ; 
            System.out.print(vector[i] + "");
        } 
        System.out.println("");
    }
    
    public static void comparacion (int vector[], int vector2[]) {
        int aux = 0 ;
        
        for (int i = 0; i < vector.length ; i++) {
            
                    
            if (vector[i] == vector2[i]) {
                aux ++;
            }  
            
        }
        if ( aux == vector.length ) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }
            
    } 
}
