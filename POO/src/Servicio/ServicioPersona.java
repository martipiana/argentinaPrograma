/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad_Clases.Persona;
import java.util.Scanner;

/**
 *
 * @author Martina
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    // 1ER METODO 
    
    public Persona crearPersona(){
            System.out.println("Ingrese el nombre de su creacion ");
            String nombre = leer.next();
            System.out.println("Ingrese la edad de su individuo ");
            int edad = leer.nextInt();
            System.out.println("Ingrese el sexo de su bicho ");
            String sexo = leer.next();
            sexo = sexo.toUpperCase();
            
            while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")){
            System.out.println("No ha ingresado un caracter valido. " + "Por Favor H, M u O");
            
            sexo= leer.next();
            sexo = sexo.toUpperCase();
            
        }
            
            System.out.println("Ingrese la altura del homo sapiens");
            double alt = leer.nextDouble();
            
            System.out.println("Ingrese el peso del bipedo en cuestion ");
             double kg = leer.nextDouble();
            
             
           return new Persona (nombre, edad, sexo, alt, kg);

    }
    

    //METODO MAYOR DE EDAD
    public boolean esMayorDeEdad(Persona mayor){
        
        if (mayor.getEdad()>= 18) {
           return true;   
        } else {
            return false;
        }

    }
    //METODO CALCULARIMC
    
    public int calcularIMC(Persona p){
        
      double imc = p.getPeso()/Math.pow(p.getAltura(), 2);
      
        if (imc <= 20) {
            return -1;
            
        }else if(imc >= 25){
            
            return 1;
            
        }else{
            return   0;
            
        }
   
    }
  
}