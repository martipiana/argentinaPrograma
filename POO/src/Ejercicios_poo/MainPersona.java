/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_poo;

import Entidad_Clases.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author Martina
 */
       public class MainPersona {
    public static void main(String[] args) {

        // Instancia del servicio
        //PersonaServicio per = new PersonaServicio();
        ServicioPersona personaServicio = new ServicioPersona();

        // Vector Persona
        Persona[] vectorP = new Persona[4];

        //Vector Resultados
        double[] vector = new double[5];

        for (int i = 0; i < 4; i++) {
            vectorP[i] = personaServicio.crearPersona();

            if (personaServicio.esMayorDeEdad(vectorP[i])) {
                vector[0] += 1;
            } //Se guerda Mayor de Edad
            else {
                vector[1] += 1;
                //Se guarda Menores de Edad    
            }
            switch (personaServicio.calcularIMC(vectorP[i])) {
                case -1:
                    vector[2] += 1;
                    //Se guarda Bajo Peso
                    break;
                case 0:
                    vector[3] += 1;
                    //Se guarda Peso Normal
                    break;
                default:
                    vector[4] += 1;
                    //Se guarda Sobrepeso
                    break;
            }

        }

        System.out.println("Cantidad de personas Mayores " + "de Edad " +
                vector[0] / 4 * 100 + "%");
        System.out.println("Cantidad de personas Menores " + "de Edad " +
                vector[1] / 4 * 100 + "%");
        System.out.println("Cantidad de personas de Bajo Peso " + vector[2] / 4 * 100 + 
                "%");
        System.out.println("Cantidad de personas de Peso Normal " + vector[3] / 4 * 100 +
                "%");
        System.out.println("Cantidad de personas con Sobre Peso " + "de Edad " + 
                vector[4] / 4 * 100 + "%");
         
  

        
        
        
    }
}
   
    

