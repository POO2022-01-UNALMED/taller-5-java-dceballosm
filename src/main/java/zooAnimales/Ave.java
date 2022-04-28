package zooAnimales;

import gestion.*;
import java.util.ArrayList;

public class Ave extends Animal
{
    private static ArrayList<Ave> listado;
    public static int aguilas;
    public static int halcones;
    private String colorPlumas;
    
    static {
        Ave.listado = new ArrayList<Ave>();
        Ave.aguilas = 0;
        Ave.halcones = 0;
    }
    
    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
        super.nombre = nombre;
        super.edad = edad;
        super.habitat = habitat;
        super.genero = genero;
        super.zona = zona;
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);
    }
    
    public Ave() {
        Ave.listado.add(this);
    }
    
    public String getColorPlumas() {
        return this.colorPlumas;
    }
    
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    
    public ArrayList<Ave> getListado() {
        return Ave.listado;
    }
    
    public void crearHalcon(String nombre, int edad, String genero, Zona zona) {
        ++Ave.halcones;
        Ave.listado.add(new Ave(nombre, edad, "monta\u00f1as", genero, zona, "cafe glorioso"));
    }
    
    public void crearAguila(String nombre, int edad, String genero, Zona zona) {
        ++Ave.aguilas;
        Ave.listado.add(new Ave(nombre, edad, "monta\u00f1as", genero, zona, "blanco y amarillo"));
    }
    
    static int cantidadAves() {
        return Ave.listado.size();
    }
    
    @Override
    public String movimiento() {
        return "volar";
    }
}