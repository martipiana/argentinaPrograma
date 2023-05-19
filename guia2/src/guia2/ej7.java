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
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int largo;
        largo = 0;
        int correcto;
        correcto = 0;
        int incorrecto;
        incorrecto = 0;

        do {
            System.out.println("ingrese una frase que empeice con X y termione con O de hasta 5 caracteres");
            frase = leer.nextLine();
            largo = frase.length();
             
            if ( !"&&&&&".equals(frase) ) {
                if (largo <= 5) {
                if ("x".equalsIgnoreCase(frase.substring(0, 1)) && "o".equalsIgnoreCase(frase.substring(largo -1 , largo))) {
                    correcto++;
                } else {
                incorrecto++;
            }

            } else {
                incorrecto++;

            }
                
            }
        } while (!"&&&&&".equals(frase));

        System.out.println("hubieron " + correcto + " ingresos correctos y " + incorrecto + " incorrectas" );
            
                
    }
}
