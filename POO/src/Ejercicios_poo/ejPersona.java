/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_poo;
import Entidad_Clases.Persona_uno;
/**
 *
 * @author Martina
 */
public class ejPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Persona_uno primeraPersona = new Persona_uno ("cristian");
       Persona_uno segundaPersona = new Persona_uno ("mariano") ;
       //defino
        System.out.println( segundaPersona.getNombre());
        //llamo
        System.out.println( primeraPersona.getNombre());
        //cambio
       primeraPersona.setNombre("mati");
        System.out.println( primeraPersona.getNombre());
       
    }
    
    
            
            
            
}
