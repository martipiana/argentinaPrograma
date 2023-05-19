/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Ejercicios_poo;

import Entidad_Clases.Empleado;

public class ej_Empleado {

    public static void main(String[] args) {
     
        Empleado uno = new Empleado();
        uno.definirNombre();
        uno.calcularAumento();
        
        System.out.println(uno.getNombre() + ", tenes " + uno.getEdad() + " años y por eso tu aumento es de $" +
                uno.getSalario());
  
    }
    
}
