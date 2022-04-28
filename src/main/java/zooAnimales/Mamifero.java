package zooAnimales;

import gestion.*;
import java.util.ArrayList;

public class Mamifero extends Animal
{
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    
    static {
        Mamifero.listado = new ArrayList<Mamifero>();
        Mamifero.caballos = 0;
        Mamifero.leones = 0;
    }
    
    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
        super.nombre = nombre;
        super.edad = edad;
        super.habitat = habitat;
        super.genero = genero;
        super.zona = zona;
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);
    }
    
    public Mamifero() {
        Mamifero.listado.add(this);
    }
    
    public int getCaballos() {
        return Mamifero.caballos;
    }
    
    public int getLeones() {
        return Mamifero.leones;
    }
    
    public boolean getPelaje() {
        return this.pelaje;
    }
    
    public int getPatas() {
        return this.patas;
    }
    
    public ArrayList<Mamifero> getListado() {
        return Mamifero.listado;
    }
    
    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    
    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    public void crearCaballo(String nombre, int edad, String genero, Zona zona) {
        ++Mamifero.caballos;
        Mamifero.listado.add(new Mamifero(nombre, edad, "pardera", genero, zona, true, 4));
    }
    
    public void crearLeon(String nombre, int edad, String genero, Zona zona) {
        ++Mamifero.leones;
        Mamifero.listado.add(new Mamifero(nombre, edad, "selva", genero, zona, true, 4));
    }
    
    static int cantidadMamiferos() {
        return Mamifero.listado.size();
    }
    
    @Override
    public String movimiento() {
        return "desplazarse";
    }
}