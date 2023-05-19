/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.

 */
package Entidad;

/**
 *
 * @author Martina
 */
public class CantanteFamoso {
    private String nombre;
    private String bestseller;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String bestseller) {
        this.nombre = nombre;
        this.bestseller = bestseller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBestseller() {
        return bestseller;
    }

    public void setBestseller(String bestseller) {
        this.bestseller = bestseller;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", bestseller=" + bestseller + '}';
    }
    
}
