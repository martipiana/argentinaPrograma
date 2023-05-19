/*

El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Martina
 */
public class FechaService {
    
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Para setear una fecha le resto 1900 al año y 1 al mes
   public Date fechaNacimiento(){
       System.out.println("Ingrese día, mes y año de su nacimiento");
       int dia = leer.nextInt();
        int mes = leer.nextInt() -1;
         int año = leer.nextInt() - 1900;
         System.out.println("");
       return new Date(año, mes, dia);  
   }
   
   public Date fechaActual(){
      return new  Date(); 
   }
   
   public void diferencia(Date cumple, Date hoy){
    Date aux = new Date( hoy.getYear(), cumple.getMonth(), cumple.getDate()) ;
       if ( aux.before(hoy)) {
           System.out.println((hoy.getYear() - cumple.getYear()));
          
       } else {
       System.out.println((hoy.getYear() - cumple.getYear() -1 ));   
       }      
   }
   }
           
   

