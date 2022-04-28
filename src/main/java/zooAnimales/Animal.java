package zooAnimales;

import gestion.*;

public class Animal
{
    private int totalAnimales;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona zona;
    
    public Animal(final String nombre, final int edad, final String habitat, final String genero, final Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        ++this.totalAnimales;
    }
    
    public Animal() {
        ++this.totalAnimales;
    }
    
    public String movimiento() {
        return "desplazarse";
    }
    
    public String totalPorTipo() {
        final String formato = "Mamiferos:" + Mamifero.cantidadMamiferos() + "\nAves:" + Ave.cantidadAves() + "\nReptiles:" + Reptil.cantidadReptiles() + "\nPeces:" + Pez.cantidadPeces() + "\nAnfibios:" + Anfibio.cantidadAnfibios();
        return formato;
    }
    
    @Override
    public String toString() {
        if (this.zona == null) {
            return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + "habito en " + this.habitat + " y mi genero es " + this.genero;
        }
        return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + "habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es: " + this.zona.getNombre() + ", en el " + this.zona.getZoo().getNombre();
    }
}