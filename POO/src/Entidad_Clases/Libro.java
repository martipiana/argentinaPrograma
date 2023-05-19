/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un 
libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas.
 */
package Entidad_Clases;

import java.util.Scanner;

/**
 *
 * @author Martina
 */
public class Libro {
    
    int isbn;
    String titulo;
    String autor;
    int paginas;

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
         
    }
    
   Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
   
   public Libro() {
    }
    
    public void escribirLibro() {
        System.out.println("Ingrese ISBN");
        isbn = leer.nextInt() ;
        System.out.println("ingrese el autor");
        autor = leer.next();
        System.out.println("cantidad de paginas");
        paginas = leer.nextInt() ; 
        System.out.println("Ingrese titulo del libro");
        titulo = leer.next() ;
        
}

    @Override
    public String toString() {
        return "Libro" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas ;
    }
   

}
