/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad_Clases.Producto;
import java.util.Scanner;


public class ServicioTienda {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public void CrearTienda(Producto tienda[]){
        
        Producto p1 = new Producto("Shampoo", 500, 1000, "Perfumeria");
        Producto p2 = new Producto("Peine Fino", 2300, 40, "Perfumeria");
        Producto p3 = new Producto("Paracetamol", 250, 462, "Farmacia");
        Producto p4 = new Producto("Alcohol", 199, 542, "Farmacia");
        
        tienda[0] = p1;
        tienda[1] = p2;
        tienda[2] = p3;
        tienda[3] = p4;
    }
    
    public void cargarProducto(Producto c[]){
          
        for (int i = c.length-1; i >=0; i--) {
            if (c[i] != null) {
                System.out.println("El stock esta lleno");
            }
            else{
                c[i] = new Producto();
                System.out.println("Ingrese nombre del producto");
                c[i].setProducto(leer.next());
                System.out.println("Ingrese el precio");
                c[i].setPrecio(leer.nextDouble());
                System.out.println("ingrese el stock");
                c[i].setStock(leer.nextInt());
                System.out.println("Que categoria es?");
                c[i].setCategoria(leer.next());
                break;
            }
        } 
    }
    public void modificarStock(Producto[] c){
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (c[i]!= null) {
                System.out.println((i+1) + "." + c[i].getProducto());
            }
        }
        System.out.println("Que producto queres modificar?");
        int prod = leer.nextInt();
        
        System.out.println("Ingrese la cantidad a sumar o restar");
        int cantidad = leer.nextInt();
        
        if (c[prod -1].getStock() - cantidad < 0 ) {
            System.out.println("Stock insusficiente");
        } else
        c[prod - 1].setStock(c[prod -1].getStock() + cantidad );
        System.out.println("");
    }
    
}  

