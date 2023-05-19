/* 
Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidad_Clases.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
  
    Scanner leer = new Scanner(System.in).useDelimiter("\n");  
    //crear cafetera
    public Cafetera llenarCafetera() {
        System.out.println("Cual es la capacidad maxima"); 
        int yum = leer.nextInt();
    return new Cafetera(yum ,yum) ;
    }
    
    //llamando cafetera
  public void servirTaza(Cafetera cafe) { 
      System.out.println("tamaño de la taza:");
      int taza = leer.nextInt();
      
      if ( taza <= cafe.getCantidadActual() ) {
         cafe.setCantidadActual( cafe.getCapacidadMaxima() - taza); 
         System.out.println("Se llenó la taza y quedan en capacidad " + cafe.getCantidadActual() + "ml");
      } else {
          cafe.setCantidadActual(0);
          System.out.println("no alcanza, la taza se llenó con " + cafe.getCantidadActual() + "ml" );
      }  
  }
  
  public void vaciarCafetera(Cafetera cafe) {
      cafe.setCantidadActual(0);
  }
  
  public void AgregarCafe(Cafetera cafe) {
      System.out.println("cantidad de café:");
      int cantidad = leer.nextInt();
      if ((cantidad + cafe.getCantidadActual()) < cafe.getCapacidadMaxima()) {
          cafe.setCantidadActual((cantidad + cafe.getCantidadActual()));
          System.out.println( cafe.getCantidadActual() + " es la cantidad actual");
      } else {
          System.out.println("Se cargó hasta " + cafe.getCapacidadMaxima() 
                  + "ml, sobraron " + ( cantidad - cafe.getCapacidadMaxima() ));
      }
  }
  
}
