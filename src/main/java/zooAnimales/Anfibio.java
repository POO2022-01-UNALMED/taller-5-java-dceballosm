package zooAnimales;

import gestion.*;
import java.util.ArrayList;

public class Anfibio extends Animal
{
    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    
    static {
        Anfibio.listado = new ArrayList<Anfibio>();
        Anfibio.ranas = 0;
        Anfibio.salamandras = 0;
    }
    
    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
        super.nombre = nombre;
        super.edad = edad;
        super.habitat = habitat;
        super.genero = genero;
        super.zona = zona;
        this.venenoso = venenoso;
        this.colorPiel = colorPiel;
        Anfibio.listado.add(this);
    }
    
    public Anfibio() {
        Anfibio.listado.add(this);
    }
    
    public int getRanas() {
        return Anfibio.ranas;
    }
    
    public int getSalamandras() {
        return Anfibio.salamandras;
    }
    
    public String getColorPiel() {
        return this.colorPiel;
    }
    
    public boolean getVenenoso() {
        return this.venenoso;
    }
    
    public ArrayList<Anfibio> getListado() {
        return Anfibio.listado;
    }
    
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    public void crearRana(String nombre, int edad, String genero, Zona zona) {
        ++Anfibio.ranas;
        Anfibio.listado.add(new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true));
    }
    
    public void crearSalamandra(String nombre, int edad, String genero, Zona zona) {
        ++Anfibio.salamandras;
        Anfibio.listado.add(new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false));
    }
    
    static int cantidadAnfibios() {
        return Anfibio.listado.size();
    }
    
    public String movimiento() {
        return "saltar";
    }
}