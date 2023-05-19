/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Martina
 */
public class manosAlaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase:");
        String frase = leer.nextLine();
        String frase2 = codigo(frase);
        System.out.println("La frase codificada es: ");
        System.out.println(frase2);
   
        

        
    }
    public static String codigo(String frase){
        int longitud = frase.length();
        String subfrase = "";
        for (int i = 0; i < longitud; i++){
            
            switch(frase.substring(i, i+1)){
                case "a":
//                   "a".equals("@");
                  subfrase = subfrase.concat("@");
                   break;
                case "e":
                 subfrase = subfrase.concat("#");
                   break;
                case "i":
                 subfrase = subfrase.concat("$");
                   break;
                case "o":
                 subfrase = subfrase.concat("%");
                   break;
                case "u":
                subfrase = subfrase.concat("*");
                   break;
                   default:
                 subfrase = subfrase.concat(frase.substring(i,i+1));
                   break;
            }
        }
        return subfrase;

}
    }
    

