
import java.util.Scanner; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Realizar un algoritmo que calcule la suma de todos los elementos de un 
 * vector de tamaño N, con los valores ingresados por el usuario.

 */
public class ej1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);        
        
        System.out.println("cantidad de elementos");
        int[] vector = new int[leer.nextInt()];
        llenar(vector) ;
        System.out.println("la suma de todos los elementos es " + sumar(vector));
        
        
    }
  public static void llenar(int vector[]) {
     
      Scanner leer = new Scanner(System.in); 
      for (int i = 0; i < vector.length ; i++) {
          
          System.out.println("ingrese numero");         
          vector [i] = leer.nextInt() ;  
      }
  }
  
  public static int sumar (int vector[]) {
      int aux = 0 ;
          
      for (int i = 0; i < vector.length; i++) {
          aux = aux + vector[i] ;
      }
      return aux ;
  }
  
}
