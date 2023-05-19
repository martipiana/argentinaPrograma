/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_poo;

import Entidad_Clases.Estudiante;
import Servicio.Servicio_Estudiante;
import java.util.Arrays;

/**
 *
 * @author Martina
 */
public class ej_Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicio_Estudiante s1 = new Servicio_Estudiante();
        Estudiante curso[]= new Estudiante[8];
        s1.generarEstudiantes(curso);
        System.out.println(Arrays.toString(curso));
        System.out.println("el primedio es " + s1.generarPromedio(curso)); 
        s1.inteligentes(curso);
    }
  
}
