/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_poo;



import Entidad_Clases.Producto;
import Servicio.ServicioTienda;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author emanu
 */
public class MainProducto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioTienda t1 = new ServicioTienda();
        Producto[] tienda = new Producto[10];
        
        t1.CrearTienda(tienda);
        
        System.out.println(Arrays.toString(tienda));
 
        System.out.println("Elija una opcion" );
            System.out.println("1-CARGAR PRODUCTO");
                System.out.println("2-Modificar Stock");
        int opcion = leer.nextInt();
 
        
        switch (opcion) {
            case 1:
                t1.cargarProducto(tienda);
                
                break;
            case 2: 
                t1.modificarStock(tienda);
                break;
            default: System.out.println("no.");
        }
    }
}

