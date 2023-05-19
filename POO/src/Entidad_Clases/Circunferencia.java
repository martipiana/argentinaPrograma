/*
 
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Entidad_Clases;

import java.util.Scanner;

/**
 *
 * @author Martina
 */
public class Circunferencia {
    
    private double radio ;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
//metodo constructor

    public Circunferencia() {
    }
    
    
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }
//get y set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public void crearCircunferencia() {
        System.out.println("ingrese radio");
        radio = leer.nextDouble();
    }
    
    public double area() {
    return ((Math.PI) * Math.pow(radio, 2)) ;
}
    
    public double perimetro() {
        return (Math.PI*radio*2) ;
    }
    
}
