/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_poo;

import Entidad_Clases.Circunferencia;

/**
 *
 * @author Martina
 */
public class ejCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Circunferencia primera = new Circunferencia();
       primera.crearCircunferencia();
        System.out.println("el valor del area es " + primera.area() );
        System.out.println("el valro del perimetro es " + primera.perimetro());
        
       
        
    }
    
}
