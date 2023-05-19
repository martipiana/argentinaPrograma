/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad_Clases.Estudiante;

/**
 *
 * @author Martina
 */
public class Servicio_Estudiante {
    public void generarEstudiantes(Estudiante a[]){
    
        Estudiante e1 = new Estudiante("Marcos", 7);
        Estudiante e2 = new Estudiante("Juana", 5);
        Estudiante e3 = new Estudiante("Juan", 3);
        Estudiante e4 = new Estudiante("Sofia", 6);
        Estudiante e5 = new Estudiante("Martina", 10);
        Estudiante e6 = new Estudiante("Mariano", 10);
        Estudiante e7 = new Estudiante("Julieta", 6);
        Estudiante e8 = new Estudiante("Julian", 6);
        a[0] = e1;
        a[1] = e2;
        a[2] = e3;
        a[3] = e4;
        a[4] = e5;
        a[5] = e6;
        a[6] = e7;
        a[7] = e8;
        
    }
    
public int generarPromedio(Estudiante a[]){
    int aux=0;
    for (int i = 0; i < 8; i++) {
      
       aux = a[i].getNota() + aux ;
    }
    return (aux/8);
}

public void inteligentes(Estudiante a[]){
    int aux = generarPromedio(a);
    int contador = 0;
    for (int i = 0; i < 8; i++) {
        if (aux<a[i].getNota()) {
           contador ++;
        }   
    }
    String mayorespromedios[] = new String[contador];
    int j = 0 ;
    for (int i = 0; i < 8; i++) {
        if (aux<a[i].getNota()) {
       mayorespromedios[j]= a[i].getNombre() ;
       j++;
        }   
    }
     for (int i = 0; i < mayorespromedios.length ; i++) {
        
        System.out.println(mayorespromedios[i]);
           
    } 
}
    
}
