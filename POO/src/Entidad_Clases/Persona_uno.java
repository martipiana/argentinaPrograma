/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad_Clases;

/**
 *
 * @author Martina
 */
public class Persona_uno {
    
    public Persona_uno() {
    
}
    
    public String nombre ;

 
    public int edad;
    public String ciudad;
    
    public Persona_uno (String nombre) {
    this.nombre= nombre ;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
}
